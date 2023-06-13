import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      
        String result = "";
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            
            if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }else {
                result += Character.toLowerCase(c);
            }
        }
        System.out.println(result);
    }
}