package jobAutomation.multithreading;

protected interface ThreadPool {
  protected void createThreads();
  protected Thread borrow();

}