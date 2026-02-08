import java.util.ArrayList;
import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {

    @Override
    public List<Card> organize(List<Card> cards) {
        List<Card> incorrect = new ArrayList<>();
        List<Card> others = new ArrayList<>();

        for (Card c : cards) {
            if (c.wasIncorrectInLastRound()) {
                incorrect.add(c);
            } else {
                others.add(c);
            }
        }

        List<Card> result = new ArrayList<>(cards.size());
        result.addAll(incorrect);
        result.addAll(others);
        return result;
    }
}
