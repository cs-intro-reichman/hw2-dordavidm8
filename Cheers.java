//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String word = (args[0]);
        int NumCheers = Integer.parseInt(args[1]);
        word = word.toUpperCase();
        int WordSize = word.length();

        for (int i = 0 ; i < WordSize ; i ++){
                char Letter = word.charAt(i);
                if (Letter == 'A' || Letter == 'E' || Letter == 'F' || Letter == 'H' ||
    Letter == 'I' || Letter == 'L' || Letter == 'M' || Letter == 'N' ||
    Letter == 'O' || Letter == 'R' || Letter == 'S' || Letter == 'X') {
System.out.printf("Give me an %c: %c!\n", Letter, Letter);
} else {
   System.out.printf("Give me a %c: %c!\n", Letter, Letter);
     
}

        }
        System.out.printf("What does that spell?\n");
        
        for (int j = 0; j < NumCheers ; j++)
        System.out.printf("%s!!!\n", word);

        }
}
