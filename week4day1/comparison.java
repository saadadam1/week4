class Example1
  {
    public static void main(String args[]){
 
      String str1=new String("hi");
      String str2=new String("hello");
      String str3=new String("hi");
      
      System.out.println(str1==str2);
      System.out.println(str1==str3);
      System.out.println(str2==str3);
      
      
    }
  }