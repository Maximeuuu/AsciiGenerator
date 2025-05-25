package asciigenerator.image;

import java.io.File;

import asciigenerator.commun.OutilsFichier;

public class App
{
	public static void main(String[] args)
	{
		final String CHEMIN_IMAGE = "data/exemple-image-texte.png";
		final String CHEMIN_RESULTAT = "data/resultat.txt";

		ImageToAscii imageToAscii = new ImageToAscii( new File(CHEMIN_IMAGE) );
		imageToAscii.setAsciiChars( new AsciiChars( AsciiChars.CLASSIQUE_5) );
		imageToAscii.setLargeurMax(200);
		imageToAscii.setHauteurMax(200);
		imageToAscii.setRedimProportionnel(true);

		String resultat = imageToAscii.genererResultat();
		OutilsFichier.stringToFile( resultat, new File(CHEMIN_RESULTAT) );
	}
}