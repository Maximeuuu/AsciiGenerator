package asciigenerator.commun;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class OutilsFichier
{
	private OutilsFichier(){}

	public static void stringToFile( String contenu, File fichier )
	{
		try
		{
			PrintWriter writer = new PrintWriter(fichier, "UTF-8");
			writer.print(contenu);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
