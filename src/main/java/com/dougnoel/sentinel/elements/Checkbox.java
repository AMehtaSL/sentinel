package com.dougnoel.sentinel.elements;

import java.util.Map;

/**
 * Checkbox: alias of an Element.
 */
public class Checkbox extends Element {

	/**
	 * Implementation of a Checkbox element
	 * 
	 * @param elementName String the name of the element
	 * @param selectors Map&lt;String,String&gt; the list of selectors to use to find the element
	 */
	public Checkbox(String elementName, Map<String,String> selectors) {
		super(elementName, selectors);
	}

}
