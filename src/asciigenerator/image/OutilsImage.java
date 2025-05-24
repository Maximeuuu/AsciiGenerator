package asciigenerator.image;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class OutilsImage
{
	private OutilsImage(){}

	public static BufferedImage adapterImage(BufferedImage image, int largeurMax, int hauteurMax, boolean redimProportionnel)
	{
		Dimension dimension = getDimensionAdaptee( image.getWidth(), image.getHeight(), largeurMax, hauteurMax, redimProportionnel );
		int largeurAdaptee = (int)dimension.getWidth();
		int hauteurAdaptee = (int)dimension.getHeight() / 2; // un caractere est plus haut que large

		Image newImage = image.getScaledInstance(largeurAdaptee, hauteurAdaptee, Image.SCALE_SMOOTH);
		image = OutilsImage.imageToBufferedImage(newImage);
		return image;
	}

	public static Dimension getDimensionAdaptee( int largeur, int hauteur, int largeurMax, int hauteurMax, boolean redimProportionnel )
	{
		int widthDest = largeur;
		int heightDest = hauteur;

		if (redimProportionnel)
		{
			double scaleWidth = largeurMax > 0 ? (double) largeurMax / largeur : Double.POSITIVE_INFINITY;
			double scaleHeight = hauteurMax > 0 ? (double) hauteurMax / hauteur : Double.POSITIVE_INFINITY;
			double scale = Math.min(scaleWidth, scaleHeight);

			if( scale != Double.POSITIVE_INFINITY )
			{
				widthDest = (int) Math.round(largeur * scale);
				heightDest = (int) Math.round(hauteur * scale);
			}
		}
		else
		{
			widthDest = largeurMax > 0 ? largeurMax : largeur;
			heightDest = hauteurMax > 0 ? hauteurMax : hauteur;
		}

		return new Dimension( widthDest, heightDest );
	}

	public static BufferedImage imageToBufferedImage(Image image) throws IllegalArgumentException
	{
		int width = image.getWidth(null);
		int height = image.getHeight(null);
		if (width <= 0 || height <= 0)
		{
			throw new IllegalArgumentException("Image dimensions are invalid");
		}

		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		bufferedImage.getGraphics().setColor(Color.WHITE);
		bufferedImage.getGraphics().fillRect(0, 0, width, height);
		bufferedImage.getGraphics().drawImage(image, 0, 0, null);
		return bufferedImage;
	}
}
