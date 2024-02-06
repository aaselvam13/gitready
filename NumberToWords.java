import java.util.*;

public class NumberToWords {
    public static String digitToWord(int a) {
        switch(a) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "error";           
        }

    }

    public static String tensDigitToWord(int a) {
        switch(a) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "error";
    }
}

    public static String twoDigitNumToWords(int b) {
        if(b<20 || b>99)
            return "error";
        if(b%10 == 0)
            return tensDigitToWord(b/10);
        else
            return tensDigitToWord(b/10).concat(" "+digitToWord(b%10));

    }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println(twoDigitNumToWords(s.nextInt()));
        }
}