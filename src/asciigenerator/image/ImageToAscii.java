package asciigenerator.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageToAscii
{
	private File fichierImage;
	private AsciiChars asciiChars;
	private int largeurMax;
	private int hauteurMax;
	private boolean redimProportionnel;

	public ImageToAscii( File fichierImage )
	{
		this.fichierImage = fichierImage;
		this.asciiChars = new AsciiChars( AsciiChars.CLASSIQUE_10 );
		this.largeurMax = 0;
		this.hauteurMax = 0;
		this.redimProportionnel = true;
	}

	public void setAsciiChars( AsciiChars asciiChars )
	{
		this.asciiChars = asciiChars;
	}

	public void setLargeurMax( int largeurMax )
	{
		this.largeurMax = largeurMax;
	}

	public void setHauteurMax( int hauteurMax )
	{
		this.hauteurMax = hauteurMax;
	}
	
	public void setRedimProportionnel( boolean redimProportionnel )
	{
		this.redimProportionnel = redimProportionnel;
	}
	
	public String genererResultat()
	{
		String resultat = "";
		try
		{
			// 1. Charger l'image
			BufferedImage image = ImageIO.read(this.fichierImage);
			image = OutilsImage.adapterImage( image, this.largeurMax, this.hauteurMax, this.redimProportionnel );

			// 2. Parcourir l'image
			resultat = this.imageToString(image);
		}
		catch (Exception e)
		{
			System.err.println("Erreur lors du traitement de l'image : " + e.getMessage());
		}
		return resultat;
	}

	private String imageToString( BufferedImage image )
	{
		StringBuffer sb = new StringBuffer();

		for (int y = 0; y < image.getHeight(); y++)
		{
			for (int x = 0; x < image.getWidth(); x++)
			{
				Color couleur = new Color(image.getRGB(x, y));
				int gris = OutilsCouleur.getLuminence(couleur);

				// Mapper sur les caractères ASCII
				int index = (gris * (this.asciiChars.size() - 1)) / 255;
				char asciiChar = this.asciiChars.charAt(index);

				sb.append(asciiChar);
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}
