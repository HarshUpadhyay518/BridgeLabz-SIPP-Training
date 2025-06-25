package ClassesAndObjects;

public class PalindromeString {
    String text;

    public PalindromeString(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if(cleanedText.charAt(left) != cleanedText.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void displayResult(){
        System.out.println("Text: " + text);
        if(isPalindrome()){
            System.out.println("The text is a palindrome");
        }
        else{
            System.out.println("The text is not a palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeString pc1 = new PalindromeString("Madam");
        PalindromeString pc2 = new PalindromeString("Hello");
        PalindromeString pc3 = new PalindromeString("A man a plan a canal Panama");

        pc1.displayResult();
        pc2.displayResult();
        pc3.displayResult();
    }
}
