package asciigenerator.arborescence;

import java.util.List;

public class TreeStyleFactory
{
	public static TreeStyle defaultStyle(){
		return new TreeStyle("├── ", "└── ", "│   ", "    ", "", "");
	}

	public static TreeStyle defaultIcons() {
		return new TreeStyle("├── ", "└── ", "│   ", "    ", "📁 ", "📄 ");
	}

	public static TreeStyle simple() {
		return new TreeStyle("|-- ", "`-- ", "|   ", "    ", "", "");
	}

	public static TreeStyle vscode() {
		return new TreeStyle("  ", "  ", "  ", "  ", "v ", "* ");
	}

	public static TreeStyle asciiDouble() {
		return new TreeStyle("╠═ ", "╚═ ", "║  ", "   ", "", "");
	}

	public static TreeStyle asciiDoubleHorizontal() {
		return new TreeStyle("╞═ ", "╘═ ", "│  ", "   ", "", "");
	}

	public static TreeStyle asciiDoubleVertical() {
		return new TreeStyle("╟─ ", "╙─ ", "║  ", "   ", "", "");
	}

	public static TreeStyle listStyle() {
		return new TreeStyle("", "", "", "", "- ", "- ");
	}

	public static TreeStyle getByName( String name )
	{
		return switch (name.toLowerCase()) {
			case "default" -> defaultStyle();
			case "default_icons" -> defaultIcons();
			case "simple" -> simple();
			case "vscode" -> vscode();
			case "ascii_double" -> asciiDouble();
			case "ascii_horizontal" -> asciiDoubleHorizontal();
			case "ascii_vertical" -> asciiDoubleVertical();
			case "list" -> listStyle();
			default -> defaultStyle();
		};
	}

	public static List<String> listAvailableStyles()
	{
		return List.of(
			"default",
			"default_icons",
			"simple",
			"vscode",
			"ascii_double",
			"ascii_horizontal",
			"ascii_vertical",
			"list"
		);
	}
}
