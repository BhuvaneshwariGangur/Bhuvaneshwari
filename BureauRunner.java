class BureauRunner{

 public static void main(String[] args)
 {
  Bureau bureau = new Bureau("abc", 500, 50000, "pink");
  Bureau.printstatic();
  bureau.printInstance();
  
  Bureau bureau1 = new Bureau("xyz", 100, 500, "Blue");
  Bureau.printstatic();
  bureau1.printInstance();
  }
 }