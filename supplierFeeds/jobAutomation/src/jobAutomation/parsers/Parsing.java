package jobAutomation.parsers;

public class Parsing {
  private FileProcessor fp;

  protected Parsing(FileProcessor fp) {
  	/*
  	* Initilize instance variables
  	*/
  }

 /*
 * Returns FileReader Interface type
 */
  protected FileReader startParsing(String filename) {
  	String ext = getExten(String filename);
  	switch(ext) {
  		case "xlsx": return new ExcelReader();
  		case "txt" : return new TabReader();
  		case "csv" : return new CSVReader();
  		default : //do something
  	}
  }

  protected String getExten(String filename) {
  	/*
  	* split and get extension of file names
  	*/
  }  
  }

