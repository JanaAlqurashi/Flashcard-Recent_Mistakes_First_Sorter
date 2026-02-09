import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();
        cards.add(new Card("A", false));
        cards.add(new Card("B", true));
        cards.add(new Card("C", false));
        cards.add(new Card("D", true));
        cards.add(new Card("E", false));

        CardOrganizer sorter = new RecentMistakesFirstSorter();

        System.out.println("Before:");
        for (Card c : cards) System.out.println(c);

        List<Card> after = sorter.organize(cards);

        System.out.println("\nAfter:");
        for (Card c : after) System.out.println(c);
    }
}