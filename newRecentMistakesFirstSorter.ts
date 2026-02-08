export function newRecentMistakesFirstSorter(): CardOrganizer {
  return {
    organize(cards: Card[]): Card[] {
      const incorrect: Card[] = [];
      const others: Card[] = [];

      for (const c of cards) {
        if ((c as any).wasIncorrectInLastRound?.() ?? (c as any).wasIncorrectInLastRound) {
          incorrect.push(c);
        } else {
          others.push(c);
        }
      }

      return [...incorrect, ...others];
    },
  };
}
