package jobAutomation.sql;
/*
* This class is responsible for creating SQL connection and inserting to the tables
*/
protected SqlHandler {
private ReadConfigurationFile conf; private Logger loger;
	
	protected SqlHandler(ReadConfigurationFile conf, Logger loger) {
      /*
      * con is not initialzed here
      * conf and loger is initilized
      * The configuartion file is read for sql server and authenctican details 
      */
	}


	protected Connection createAndGetConn() {
		/*
		* Return a new SQL connection
		*/
	}

	protected void insertIntoTable(List<HashMap<String,String>> listOfRows, Connection conLocal) {
     /*
     * Use connection conLocal Not 
     * Each element in a list is a row. Each row contains an HashMap<ColumnName,ColumnValue>
     * Update the table if the column is not present in the table add that column to the table 
     * The result set is logged.
     * Error Handling: proceed to processErrorCodes(); Similar to class.FileProcessor
     */
	}

	/*
	* Close the connection
	*/
	protected void close(Connection conLocal) {

	}

  /*
  * Retry logic: If in case some inserts or network exceptions reached its allowed to retry three times
  */
  private static void processError(AllException e, Logger loger) {

  }
}