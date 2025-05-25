package asciigenerator.arborescence;

public class TreeStyle
{
	public String branchMid;
	public String branchLast;
	public String vertical;
	public String empty;
	public String folderIcon;
	public String fileIcon;

	public TreeStyle(String branchMid, String branchLast, String vertical, String empty, String folderIcon, String fileIcon)
	{
		this.branchMid = branchMid;
		this.branchLast = branchLast;
		this.vertical = vertical;
		this.empty = empty;
		this.folderIcon = folderIcon;
		this.fileIcon = fileIcon;
	}

	public TreeStyle()
	{
		this("","","","","","");
	}
}
