package com.epam.rd.autocode.startegy.cards.dealing_impl;

import com.epam.rd.autocode.startegy.cards.Card;
import com.epam.rd.autocode.startegy.cards.CardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.Deck;
import com.epam.rd.autocode.startegy.cards.dealing_impl.util.CardDealingAlgorithmUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FoolCardDealingStrategy implements CardDealingStrategy {
    private final int cardAmountForOnePlayer = 6;
    private final List<String> additional = List.of("Trump card");
    private final CardDealingAlgorithmUtil algorithmUtil = new CardDealingAlgorithmUtil();
    private final int cardAmountForAdditional = 1;


    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> result = new TreeMap<>();

        algorithmUtil.formDecksForPlayers(players, result);
        algorithmUtil.cardDealing(players, result, deck, cardAmountForOnePlayer);
        algorithmUtil.getAdditionalList(deck, result, additional, cardAmountForAdditional);
        algorithmUtil.getRemainingList(deck, result);
        return result;
    }

}
