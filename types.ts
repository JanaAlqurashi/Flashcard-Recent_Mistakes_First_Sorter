export interface Card {
  id: string;
  wasIncorrectInLastRound: boolean;
}

export interface CardOrganizer {
  organize(cards: Card[]): Card[];
}