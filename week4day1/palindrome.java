class Try {
 
  public static void main(String args[]) {
    String str = "madam";
 int firstCount=0,lastCount=0,i,j;

  
    for (i = 0; i < str.length()/2; i++) {
      firstCount++;
    }
      for (j = str.length()-1; j > str.length()/2; j--){
        lastCount++;
      }
    
 if(firstCount==lastCount && str.charAt(i)==str.charAt(j)){
     
     System.out.println("palindrome");


 }
      else{
            System.out.println("Not palindrome");

 
      }

  }
}