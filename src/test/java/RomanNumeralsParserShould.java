import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
public class RomanNumeralsParserShould {

    private RomanNumeralsParser romanNumeralsParser;

    @BeforeEach
    public void setup(){
        romanNumeralsParser = new RomanNumeralsParser();
    }

    @ParameterizedTest
    @CsvSource({"1,I", "2,II", "3,III", "4,IV", "5,V", "6,VI", "7,VII",
            "8,VIII", "9,IX", "10,X", "11, XI", "19,XIX", "20,XX",
            "40,XL", "45,XLV", "50,L", "60,LX", "80,LXXX", "90,XC",
            "300,CCC", "400,CD", "800,DCCC", "900,CM", "1000,M",
            "846,DCCCXLVI", "1999,MCMXCIX", "2008,MMVIII"})
    public void parse_arabic_number_one_to_roman_numeral(int arabicNumber, String expected){
        String result = romanNumeralsParser.fromArabicNumber(arabicNumber);
        assertThat(result).isEqualTo(expected);
    }
}
