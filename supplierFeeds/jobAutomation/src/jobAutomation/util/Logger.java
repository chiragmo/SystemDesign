package jobAutomation.Util;

/*
* Producer-Consumer Model
* This class receives values using
* method.writeToLoggerdriver by parent thread and child threads from Object Pool
* There is continuous running Consumer thread of method.writeToFile() which writes
* to logFile synchronously
*/
protected class Logger {
	private Queue<String> list;
		protected Logger() {
        /*
        * Create a child thread and run writeToFile on it 
        */
		}  

        // producer: is writeToLogger
        protected void writeToLogger(String logs) throws InterruptedException {
        	/* 
        	* Updates the list by adding through Head
        	*/
        } 
  
        // consumer: used as consumer  
        protected void writeToFile() throws InterruptedException { 
          /* 
		   * Removes the Message from Tail and writes to a ../resources/logFile
		   *
           * while (true) 
           * { 
           *     synchronized (this) 
           *     { 
           *        
           *     } 
           * }
           */ 
        }  
}