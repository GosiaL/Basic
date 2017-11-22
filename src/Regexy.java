import java.util.regex.Pattern;

public class Regexy {

    public static void main(String[] args) {
        //- Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
        System.out.println(Pattern.matches(".{3}\\d{3}", "S2c1p5"));
        System.out.println(Pattern.matches(".{3}[0-9]{3}", "S2c1p5"));

        //- Czy string zawiera tylko cyfry?
        System.out.println(Pattern.matches("\\d+", "01"));
        System.out.println(Pattern.matches("[0-9]+", "01"));

        //- Czy string zawiera tylko litery?
        System.out.println(Pattern.matches("[a-zA-Z]+", "Scp"));
        System.out.println(Pattern.matches("[^0-9]+", "Scp"));
        System.out.println(Pattern.matches("\\D+", "Scp"));

        //- Czy string zawiera tylko cyfry i litery?
        System.out.println(Pattern.matches("[a-zA-Z_0-9]+", "Sc6p"));
        System.out.println(Pattern.matches("\\w+", "Scp"));

        //- Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
        System.out.println(Pattern.matches("[0-9]{5}", "123e")); //?
        System.out.println(Pattern.matches("\\d{5}", "123e"));

        //- Czy string rozpoczyna się od "J",  a potem dowolna ilość, dowolnych znaków?
        System.out.println(Pattern.matches("J.*", "Jq:U"));

        //- Czy string rozpoczyna się od "J" i kończy na "U", a pomiędzy dowolna ilość, dowolnych znaków
        System.out.println(Pattern.matches("J.*U", "Jq:U"));

        //- Czy string rozpoczyna się od wielkiej litery?
        System.out.println(Pattern.matches("[A-Z].*", "U"));
        System.out.println(Pattern.matches("\\p{Upper}.*", "U"));

        //- Czy string zawiera spację? (biały znak)?
        System.out.println(Pattern.matches(".*\\s.*", "	")); // wpisanie \\[spacja] też działa
        System.out.println(Pattern.matches(".*\\p{Blank}.*", " "));

        //- Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
        System.out.println(Pattern.matches("[789][0-9]{8}", "234"));
        System.out.println(Pattern.matches("[7-9]\\d{8}", "234"));
        System.out.println(Pattern.matches("[7-9]\\d{2}[\\-]?\\d{3}[\\-]?\\d{3}", "234"));

        // Czy string jest numerem bankowym? (założenie: zaczyna się od 2 liter, następnie 4 grupy po 4 cyfry)
        System.out.println(Pattern.matches("[a-zA-Z]{2,3}(\\s?[0-9]{4}){4}", "AB 12341234 1234 1234"));
        System.out.println(Pattern.matches("[a-zA-Z]{2}[a-zA-Z]?(\\s?\\d{4}){4}","AB 1234 123412341234"));

        // Czy string jest kodem pocztowym?
        System.out.println(Pattern.matches("[0-9]{2}\\-[0-9]{3}", "12-000"));
        System.out.println(Pattern.matches("\\d{2}-\\d{3}", ""));
    }
}