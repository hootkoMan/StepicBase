package m6_generics_collections_streams;

public class Lec_6_4_streamPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder leftToRight = new StringBuilder();

        s.chars()
            .filter(Character::isLetterOrDigit)
            .map(Character::toLowerCase)
            .forEach(leftToRight::appendCodePoint);

        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();

        return leftToRight.toString().equals(rightToLeft.toString());
    }
}
