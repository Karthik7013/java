public class Switch {
    public static void main(String[] args) {
        char ch = 'a';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': {
                    System.out.println(ch + " is a vowel");
                    break;
                }
                default: {
                    System.out.println(ch + " is not a vowel");
                }
            }

        } else {
            System.out.println(ch + " not a alphabet");
        }
    }
}
