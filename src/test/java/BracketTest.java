import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BracketTest {

    @ParameterizedTest
    @CsvSource({
            "{}",
            "(){}[]",
            "<()>{}",
            "([{}])"
    })
    void correctBracketsPosition(String expression) {
//        given
        Bracket bracket = new Bracket();
//        when
        boolean correctExpression = bracket.correctBracketsPosition(expression);
//        then
        Assertions.assertTrue(correctExpression);
    }

    @ParameterizedTest
    @CsvSource({
            "(}",
            "[(])",
            "[({})](]",
            "(({}]()"
    })
    void incorrectBracketsPosition(String expression) {
//        given
        Bracket bracket = new Bracket();
//        when
        boolean correctExpression = bracket.correctBracketsPosition(expression);
//        then
        Assertions.assertFalse(correctExpression);
    }
}