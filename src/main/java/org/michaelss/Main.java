package org.michaelss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.michaelss.models.Entity;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class Main {
	
	public static final String CLASS_NAME = "Usuario";
	public static final String CLASS_NAME_PLURAL = "Usuarios";
	public static final String FOLDER = "src/main/webapp/" + CLASS_NAME;
	

	public static void main(String[] args) throws IOException, TemplateException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);

		cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
		
		cfg.setDefaultEncoding("UTF-8");

		// Sets how errors will appear.
		// During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
		Entity entity = new Entity(CLASS_NAME, CLASS_NAME_PLURAL);
		
		Template temp = cfg.getTemplate("list.ftl");
				
		new File(FOLDER).mkdirs();
		Writer outFile = new OutputStreamWriter(new FileOutputStream(String.format("%s/list.html", FOLDER)), "utf-8");
		temp.process(entity, outFile);
		
		
		Writer out = new OutputStreamWriter(System.out);
		temp.process(entity, out);
	}
	
}
