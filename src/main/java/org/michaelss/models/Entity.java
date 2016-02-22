package org.michaelss.models;

public class Entity {
	
	private String className;
	
	private String classNamePlural;

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
	

}
