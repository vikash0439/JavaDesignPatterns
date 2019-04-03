package com.patterns.behaviour.template;

public class TempletePatternTest {
	
	public static void main(String args[]){
		
		FileProcessorTemplatePattern pdfProcessing = new PdfFile();		
		pdfProcessing.fileProcessing();
		
		FileProcessorTemplatePattern pdfProcessing2 = new WordFile();		
		pdfProcessing2.fileProcessing();
	}
}
