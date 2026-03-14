import java.util.Scanner;
public class VowelConsonant2{
    static String type(char c){
        if(c>='A' && c<='Z'){
			c=(char)(c+32);
		}
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		return "Vowel";
		}
        else if(c>='a' && c<='z'){
		return "Consonant";
		}
        else{
            return "Not Letter";
    }
}
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String s=input.nextLine();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch+" "+type(ch));
        }
    }
}
