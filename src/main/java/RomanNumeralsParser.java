import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsParser {

    private final Map<Integer, String> romanNumerals = new LinkedHashMap();

    public RomanNumeralsParser() {
        romanNumerals.put( 1000, "M");
        romanNumerals.put( 900, "CM");
        romanNumerals.put( 500, "D");
        romanNumerals.put( 400, "CD");
        romanNumerals.put( 100, "C");
        romanNumerals.put( 90, "XC");
        romanNumerals.put( 50, "L");
        romanNumerals.put( 40, "XL");
        romanNumerals.put( 10, "X");
        romanNumerals.put( 9, "IX");
        romanNumerals.put( 5, "V");
        romanNumerals.put( 4, "IV");
        romanNumerals.put( 1, "I");
    }
    public String fromArabicNumber(int arabicNumber) {
        String result = "";
        while(arabicNumber != 0){
            for (Map.Entry<Integer, String> romanNumeral : romanNumerals.entrySet()) {
                if(arabicNumber >= romanNumeral.getKey()){
                    result += romanNumeral.getValue();
                    arabicNumber -= romanNumeral.getKey();
                    break;
                }
            }
        }
        return result;
    }
}
