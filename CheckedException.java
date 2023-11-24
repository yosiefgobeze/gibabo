public  class CheckedException {
  // how to handle a checked exception
  public static void main(String[] args)throws InterruptedException{
    System.out.println("Starting ......");
    System.out.println("Progressing .......");
    System.out.println("Sleeping .....");
    // compiler has identified an exception, and is called a checked exception
    Thread.sleep(7000);
    System.out.println("Resuming .......");
    System.out.println("Sleeping again .....");
    try{
      Thread.sleep(8000);
    }catch(InterruptedException e){

    }
    System.out.println("Ending ......");
  }
}
