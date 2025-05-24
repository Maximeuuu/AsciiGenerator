package asciigenerator.image;

/*
 * Chaîne de caractères du plus foncé au plus clair
 */
public class AsciiChars
{
	/* Configurations par défaut */

	public static String CLASSIQUE_5 = "@#:. ";
	public static String CLASSIQUE_6 = "@#*:. ";
	public static String CLASSIQUE_10 = "@#&o+=-:. ";
	public static String CLASSIQUE2_10 = "@%#*+=-:. ";
	public static String CLASSIQUE_14 = "@%§#Oo*+=/-:. ";
	public static String CLASSIQUE_15 = "$@B%8&WM#*=-:. ";

	public static String DETAILLE_70 = "@$B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/|()1{}[]?-_+~<>i!lI;:,\"^`'. ";
	public static String LISSE_20 = "@@@%%%##*+=-::...   ";

	public static String FIGURE_12 = "▲☻●◘▪•☺□○▫◦ ";
	public static String FIGURE_5 = "●•○◦ ";
	public static String FIGURE_4 = "⬛⚫⬜⚪";

	public static String TEINTE_5 = "█▓▒░ ";

	/* Attributs */

	private char[] ensCaractere;

	public AsciiChars( String chaine )
	{
		this.ensCaractere = new char[chaine.length()];
		chaine.getChars(0, chaine.length(), this.ensCaractere, 0);
	}

	public void reverse()
	{
		int gauche = 0;
		int droite = this.ensCaractere.length - 1;

		while (gauche < droite)
		{
			char temp = this.ensCaractere[gauche];
			this.ensCaractere[gauche] = this.ensCaractere[droite];
			this.ensCaractere[droite] = temp;
			gauche++;
			droite--;
		}
	}

	public char charAt( int position )
	{
		return this.ensCaractere[position];
	}

	public int size()
	{
		return this.ensCaractere.length;
	}

	public String getPattern()
	{
		StringBuffer sb = new StringBuffer();
		for( char cara : this.ensCaractere )
		{
			sb.append(cara);
		}
		return sb.toString();
	}
}
