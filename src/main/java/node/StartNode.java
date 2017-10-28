/*
 * Copyright 2017 (C)  Christian Garbs <mitch@cgarbs.de>
 * Licensed under GNU GPL 3 (or later)
 */
package node;

public class StartNode extends Node
{

	@Override
	protected String getNodeContent()
	{
		return "START";
	}

	@Override
	protected String getNodeShape()
	{
		return "doublecircle";
	}
}
