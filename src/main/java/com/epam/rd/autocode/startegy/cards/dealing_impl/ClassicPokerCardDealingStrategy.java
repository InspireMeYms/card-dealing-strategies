package com.epam.rd.autocode.startegy.cards.dealing_impl;

import com.epam.rd.autocode.startegy.cards.Card;
import com.epam.rd.autocode.startegy.cards.CardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.Deck;
import com.epam.rd.autocode.startegy.cards.dealing_impl.util.CardDealingAlgorithmUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassicPokerCardDealingStrategy implements CardDealingStrategy {
    private final int cardAmountForOnePlayer = 5;
    private final CardDealingAlgorithmUtil algorithmUtil = new CardDealingAlgorithmUtil();

    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> result = new TreeMap<>();

        algorithmUtil.formDecksForPlayers(players, result);
        algorithmUtil.cardDealing(players, result, deck, cardAmountForOnePlayer);
        algorithmUtil.getRemainingList(deck, result);
        return result;
    }

}
