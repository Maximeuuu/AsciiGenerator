package asciigenerator.arborescence;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Node
{
	String name;
	boolean isFile;
	Map<String, Node> children = new TreeMap<>();

	Node(String name, boolean isFile)
	{
		this.name = name;
		this.isFile = isFile;
	}

	void addPath(String[] parts, int index)
	{
		if (index >= parts.length) return;

		String part = parts[index];
		boolean isFile = index == parts.length - 1 && part.contains(".");

		Node child = children.get(part);
		if (child == null)
		{
			child = new Node(part, isFile);
			children.put(part, child);
		}
		child.addPath(parts, index + 1);
	}

	void toString(StringBuilder sb, String prefix, String childPrefix, TreeStyle style)
	{
		String icon = isFile ? style.fileIcon : style.folderIcon;
		sb.append(prefix).append(icon).append(name).append("\n");

		for (Iterator<Node> it = children.values().iterator(); it.hasNext(); )
		{
			Node child = it.next();
			boolean isLast = !it.hasNext();
			String newPrefix = isLast ? style.branchLast : style.branchMid;
			String newChildPrefix = childPrefix + (isLast ? style.empty : style.vertical);
			child.toString(sb, childPrefix + newPrefix, newChildPrefix, style);
		}
	}

	public String toString(TreeStyle style)
	{
		StringBuilder sb = new StringBuilder();
		toString(sb, "", "", style);
		return sb.toString();
	}
}
