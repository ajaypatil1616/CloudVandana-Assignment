import java.util.Scanner;
public class pangram {
    
                                    // Java Task-3

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        sc.close();

        if (isPangram(input))
         {
            System.out.println("This Sentence is a pangram.");
        } 
        else 
        {
            System.out.println("This Sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String input)
     {
        boolean[] alphabetCheck = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++)
         {
            char currentChar = input.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z')
             {
                alphabetCheck[currentChar - 'a'] = true;
            }
        }

        for (boolean isPresent : alphabetCheck) 
        {
            if (!isPresent)
             {
                return false;
            }
        }
        return true;
        

           

    }
}

