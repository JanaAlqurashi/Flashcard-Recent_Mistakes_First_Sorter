import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {
   public RecentMistakesFirstSorter() {
   }

   public List<Card> organize(List<Card> var1) {
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         Card var5 = (Card)var4.next();
         if (var5.wasIncorrectInLastRound()) {
            var2.add(var5);
         } else {
            var3.add(var5);
         }
      }

      ArrayList var6 = new ArrayList(var1.size());
      var6.addAll(var2);
      var6.addAll(var3);
      return var6;
   }
}
