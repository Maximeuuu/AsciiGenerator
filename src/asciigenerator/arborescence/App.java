package asciigenerator.arborescence;

public class App
{
	public static void main(String[] args)
	{
		FileTree tree = new FileTree( "root");
		tree.addPath("src/utils/helpers.java");
		tree.addPath("src/utils/parser.java");
		tree.addPath("src/core/Main.java");
		tree.addPath("assets/images/logo.png");
		tree.addPath("assets/styles/style.css");

		TreeStyle customStyle = TreeStyleFactory.simple();
		customStyle.fileIcon = "* ";

		System.out.println(tree.toString(customStyle));
	}
}
