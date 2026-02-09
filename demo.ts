import { Card } from "./types";
import { newRecentMistakesFirstSorter } from "./newRecentMistakesFirstSorter";

const cards: Card[] = [
  { id: "A", wasIncorrectInLastRound: false },
  { id: "B", wasIncorrectInLastRound: true },
  { id: "C", wasIncorrectInLastRound: false },
  { id: "D", wasIncorrectInLastRound: true },
  { id: "E", wasIncorrectInLastRound: false },
];

console.log("Before:");
for (const c of cards) {
  console.log(`${c.id} (${c.wasIncorrectInLastRound ? "Incorrect" : "Correct"})`);
}

const sorter = newRecentMistakesFirstSorter();
const out = sorter.organize(cards);

console.log("\nAfter:");
for (const c of out) {
  console.log(`${c.id} (${c.wasIncorrectInLastRound ? "Incorrect" : "Correct"})`);
}