package Interviews;

public class Snippets {
    public static void main(String[] args) {
        String s= "Test I am";
        String s1 ="";
        for(int ch = s.length(); ch>0; ch--){
            s1 += s1.charAt(ch);
        }
        System.out.println(s1);
        char[] ch1 = s.toCharArray();
        char[] ch2 = new char[ch1.length];
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]==' '){
                ch2[i]=' ';
            }
        }
        int j =ch2.length-1;
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]!=' '){
                ch2[j]--;
            }
        }
    }
}
