package jobAutomation.multithreading;

/*
* This class is native implementation of thread pool
*/
protected class ObjectPool implements ThreadPool {
FileProcessor file; Results res; int numThreads;
List<WorkerThread> arli;


	protected ObjectPool(FileProcessor file, SqlHandler sql, int numThreads) {
		/*
		* Initilize all instance variables
		* call createThreads()
		*/
	}

	/**
    * void return type
    */
	protected void createThreads() {	
	/*
	* Create initial threads with NUM_THREADS for class.WorkerThread
	*/	
	}

   	/**
    * Thread return type
    */
	protected Thread borrow() {
     /*
     * Used to borrow threads
     */
	}

}