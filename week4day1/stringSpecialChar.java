class Special {
 
    public static void main(String args[]){
      String str="hi hello 123 ^&&3 welcome 923%$# to bitLabs";
 
      for(int i=0;i<str.length();i++){
 
            if(!(str.charAt(i)>='A' && str.charAt(i)<='Z' ||str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)==' ' || str.charAt(i)>='0' && str.charAt(i)<='9')) {
              System.out.print(str.charAt(i));
            }
      }
    }
}