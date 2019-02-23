package jobAutomation.multithreading;

   /**
    * This class is responsible working on the threads which is inserting to table use SQL handler
    */
protected class WorkerThread implements Runnable {
  /*
  * Note: Each thread receives a partial data to be inserted from class.CreateWorkers
  */
FileProcessor file; SqlHandler sql;  List<HashMap<String,String>> listOfRowsPartial;

	WorkerThread(FileProcessor file, SqlHandler sql,  List<HashMap<String,String>> listOfRowsPartial;) {
		/*
		* Initilize all instance variables
		*/
	}

   /**
    * void return type
    */
	protected void run() {
	 /*
	 * Create an sql connection since same connection dont work in multithreaded env
	 * Each connection for a thread-> sql.createAndGetConn();
	 * sql.insertIntoTable(li,connection);
	 */

	}

   	/**
    * String return type
    */
   @Override
  protected String toString() {
   /*
   * Returns Thread name
   */
  }

}
