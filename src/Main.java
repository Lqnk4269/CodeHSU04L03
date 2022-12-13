public class Main {
    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls");
        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        int count = 0;

        for(char c : input.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
            
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    public static String VowelRemover(String input){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){

        return input.contains(target);
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){

        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Determines if a given string is palindrome
     * @param i int
     * @param j int
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     *
     * i and j point to first and last character
     *
     */
    public static boolean PalindromeChecker(int i, int j, String input){
        

        {
        if (i >= j) {
            return true;
        }

        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }
 
        return isPalindrome(i + 1, j - 1, A);
    }
    }
}
