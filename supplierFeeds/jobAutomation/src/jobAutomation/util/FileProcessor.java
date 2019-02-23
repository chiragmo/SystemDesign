package jobAutomation.util;


   /*
    * This class is responsible for file reading
    */
protected class FileProcessor {

   private File file; private Scanner sc; private Boolean fileEnd;

   protected FileProcessor(File file) throws AllException {
    this.file = file;
   this.fileEnd = false;
   this.sc = null;
    try {
     sc = new Scanner(file); 
    } catch (IOException e) {
      throw new AllException(e.getMessage(),"IO_EXCEPTION");
   }
 }
    /**
    * int return type
    */
  @Override
  protected synchronized List<String> getBatchLines() {  
   /*
   * Reads a batch of lines from file and returns it in a List
   * If end of file reached: set fileEnd = true and return
   */
}

 protected Boolean isFileEndReached() {
  /*
  * Returns the status of end of file
  */
 }

    /**
    * String return type
    */
  @Override
  protected String toString() {

  }

}

