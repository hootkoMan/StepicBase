package m3_obgect_class_packege.ex_3_5_8_AsciiCharSequence;

public class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] bytes1 = new byte[end - start];
        for (int i = 0; start < end; start++) {
            bytes1[i] = this.bytes[start];
            i++;
        }
        return new AsciiCharSequence(bytes1);
    }

    @Override
    public String toString() {
        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            chars.append((char) bytes[i]);
        }
        return chars.toString();
    }
}

class Test {
    public static void main(String[] args) {
        CharSequence charSequence = new AsciiCharSequence(new byte[]{90, 66, 65, 120, 56, 87});
        System.out.println(charSequence);
        System.out.println(charSequence.subSequence(0, 3));
        System.out.println(charSequence.charAt(0));
    }
}
