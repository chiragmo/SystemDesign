package jobAutomation.multithreading;

   /**
    * This class is responsible for maintaining the threads and starting each thread
    */
protected class CreateWorkers implements CreationOfThreadsInterface {
	/*
	* Note: Each listOfRows is broken down and sent to each child threads
	*/
	private FileProcessor file; private List<HashMap<String,String>> listOfRows;
    
	protected CreateWorkers(SqlHandler sql, List<HashMap<String,String>> listOfRows) {
		/*
		* Initilize all instance variables
		*/
	}

	/**
    * void return type
    */
	protected void startWorkers(int numThreads) {
		/*
		 * Creates Object pool with numThreads
		 * Break down listOfRows into multiple lists-> listOfRows/numThreads
		 * Pass the above each broken down list to a thread
		 * Loop: start
		 * pool.borrow() -> Borrows the required a thread 
		 * thread.start() is performed on each thread
		 * end
		 * Wait for the join on each threads to complete
		*/
	}

	/**
    * String return type
    */
 @Override
  protected String toString() {
  }
}