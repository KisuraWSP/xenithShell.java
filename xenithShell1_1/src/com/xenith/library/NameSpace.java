package com.xenith.library;

/**
 * @author Kisura W.S.P
 */

/*
 * @Class Namespace
 * @Implements Syntax
 */
public class NameSpace implements Syntax{
	/*
	 * Variables
	 */
	private String nameSpace = defaultNamespace;
	
	/**
	 * @Function setNameSpace
	 * @param name {String}
	 * @return {void}
	 */
	public void setNameSpace(String name) {
		this.nameSpace= name;
	}
	
	/**
	 * @Function getNameSpace
	 * @return {String}
	 */
	public String getNameSpace() {
		return nameSpace;
	}
}
