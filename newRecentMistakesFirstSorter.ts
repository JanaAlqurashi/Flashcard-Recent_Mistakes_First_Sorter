import { Card, CardOrganizer } from "./types";

export function newRecentMistakesFirstSorter(): CardOrganizer {
  return {
    organize(cards: Card[]): Card[] {
      const incorrect: Card[] = [];
      const correct: Card[] = [];

      for (const c of cards) {
        if (c.wasIncorrectInLastRound) incorrect.push(c);
        else correct.push(c);
      }

      
      return [...incorrect, ...correct];
    },
  };
}
