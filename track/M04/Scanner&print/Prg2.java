import java.util.Scanner;

public class Prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int vowelCount = 0;

        // Traverse the text and update vowelCount.
        for(int i=0;i<text.length();i++){
            char current=Character.toLowerCase(text.charAt(i));
            if(current=='a'|| current=='e'||current=='i'||current=='o'||current=='u'){
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
    }
}
