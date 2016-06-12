package org.michaelss.models;

import java.util.List;

public class Entity {
	
	private String className;
	
	private String classNamePlural;
	
	private List<String> properties;

	public Entity(String className, String classNamePlural) {
		this.className = className;
		this.classNamePlural = classNamePlural;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassNamePlural() {
		return classNamePlural;
	}

	public void setClassNamePlural(String classNamePlural) {
		this.classNamePlural = classNamePlural;
	}

	public List<String> getProperties() {
		return properties;
	}

	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
	

}
