import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

public class Bracket {

    static List<Character> openingParentheses = List.of('[', '{', '(', '<');
    static Map<Character, Character> parenthesesMap = Map.of(
            '[', ']',
            '{', '}',
            '(', ')',
            '<', '>'
    );

    public boolean correctBracketsPosition(String expression) {
        ArrayDeque<Character> dequeOpeningParentheses = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (openingParentheses.contains(character)) {
                dequeOpeningParentheses.add(character);
            } else {
                Character lastCharacter = dequeOpeningParentheses.removeLast();
                if (!parenthesesMap.get(lastCharacter).equals(character)) {
                    return false;
                }
            }
        }
        return true;
    }
}
