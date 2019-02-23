package jobAutomation.driver;

/**
 * @author Chirag M. Onkarappa
 *
 */
public class Driver {
  private ReadConfigurationFile conf; private Logger loger;
	/**
    * Following are the Design Patterns used in the project:
    * 1. Object Pool pattern
    * 2. Single Dynamic Dispatch pattern
    * 3. Producer-Consumer pattern
    */	
	public static void main(String[] args) {
    // Write to logger file is implemented with Producer-Consumer pattern
    loger = new Logger();

    if (args.length != 0)
      //write to logger and exit
      // jobAutomation/resources/config.properties is used as configuration file
    }   

      try {
        conf = new ConfigurationFile();
        } catch (AllException e) {
          processErrorConfig(e,loger);
       }

       File folder = new File(prop.get("serverFileDirectory"));
       File[] listOfFiles = folder.listFiles();
       listOfFiles.stream().map(supplier-> processFile(supplier));
	}

  /*
  * 
  */
  private static void processFile(File supplierFile) {
    try {
    FileProcessor fp = new FileProcessor(supplierFile, logger);
    } catch (AllException e) {
      logger.writeToLogger(e.toString());
      // returns if IOexception; without processing the file
      return;
    }
    SqlHandler sql = new SqlHandler(conf,logger); 
    Parsing prs = new Parsing(fp);
    // Dynamic Dispatch is implemented for parsing with interface.FileReader
    FileReader frr= prs.selectParser();

    /*
     * Reads a file batch wise and SQL operations are performed in multithreaded env
    */
    while(fp.isFileEndReached()) {
    List<HashMap<String,String>> listOfRows = frr.getBatch();
    // Object Pool pattern is implemented for writing to table in multithreaded env
    CreationOfThreadsInterface obj = new CreateWorkers(listOfRows,sql);
    obj.startWorkers(conf.get("NUM_THREADS"));
    }

  }

  /*
  * If Exception is FILE_CLOSE -> Simply Write log error
  *                 Else Write log error and exit the system
  */
  private static void processErrorConfig(AllException e, Logger loger) {

  }

}
