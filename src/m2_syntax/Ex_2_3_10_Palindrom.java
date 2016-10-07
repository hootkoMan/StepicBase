package m2_syntax;

public class Ex_2_3_10_Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
    public static boolean isPalindrome(String text) {
        return new StringBuilder(text.replaceAll("\\W", "")).reverse().toString()
            .equalsIgnoreCase(text.replaceAll("\\W", ""));
    }

    public static boolean isPalindrome2(String text) {
        StringBuilder sb = new StringBuilder(text.replaceAll("\\W", "").toLowerCase());
        return sb.reverse().toString().equals(sb.toString());
    }

    public static boolean isPalindromeGood(String text) {
        StringBuilder sb = new StringBuilder(text.replaceAll("\\W", ""));
        StringBuilder sb2 = new StringBuilder(text.replaceAll("\\W", ""));
        sb2.reverse();
        return sb2.toString().equalsIgnoreCase(sb.toString());
    }
}
