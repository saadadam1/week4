class strinCounts {
 
  public static void main(String args[]) {
    String str = "UPPER CASE @lower case heh 123";
 int uCount=0,lCount=0,digCount=0,symbCount=0,spaceCount=0;
    for (int i = 0; i < str.length(); i++) {
 
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
       uCount++;
      }
      else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ){
        lCount++;
      }
      else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
        digCount++;
      }
      else if(str.charAt(i)==' '){
        spaceCount++;
      }
      else {
        symbCount++;
      }
    }
     System.out.println("Number of Upper case characters are " + uCount);
     System.out.println("Number of lower case characters are " + lCount);
     System.out.println("Number of digits are " + digCount);
     System.out.println("Number of White spaces are " + spaceCount);
     System.out.println("Number of special characters are " + symbCount);




  }
}