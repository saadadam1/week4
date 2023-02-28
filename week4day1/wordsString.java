class stringWordCount {
    public static void main(String[] args) {
        String str = "hi hello123 how why !@#$ are you 12344";
        String words[] = str.split(" ");

 
int count=0;
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            System.out.println("Alphabets in word " +word +" are");
            for(int j=0;j<word.length();j++){
                if (word.charAt(j)>='A' && word.charAt(j)                   
                <='Z'||word.charAt(j)>='a' &&  word.charAt(j)<='z') {
                  count++;
                    //System.out.println(word.charAt(j));

                }
                                  
            }
          System.out.println(count);
          count=0;
        }
    }
}