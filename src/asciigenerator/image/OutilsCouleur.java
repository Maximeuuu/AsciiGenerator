package asciigenerator.image;

import java.awt.Color;

public class OutilsCouleur
{
	private OutilsCouleur(){}

	/**
	 * Niveau de gris (luminosité)
	 */
	public static int getLuminence( Color color )
	{
		return (int)(0.3 * color.getRed() + 0.59 * color.getGreen() + 0.11 * color.getBlue());
	}
}
