package asciigenerator.arborescence;

public class FileTree
{
	private Node root;

	public FileTree( String racine )
	{
		this.root = new Node(racine, false);
	}

	/**
	 * Ajoute un chemin du style "dir1/dir2/file.ext"
	 * @param chemin
	 */
	public void addPath(String chemin)
	{
		String[] parts = chemin.split("/");
		this.root.addPath(parts, 0);
	}

	public String toString(TreeStyle style)
	{
		return this.root.toString(style);
	}

	@Override
	public String toString()
	{
		return this.toString(new TreeStyle());
	}
}
