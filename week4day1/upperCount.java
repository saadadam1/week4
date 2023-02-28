class Try {
 
  public static void main(String args[]) {
    String str = "hi Hello 123 ^&&3 welcome 923%$# to bitLabs";
 int count=0;
    for (int i = 0; i < str.length(); i++) {
 
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
       count++;
      }
    }
     System.out.print("Number of upper case characters are " + count);
  }
}