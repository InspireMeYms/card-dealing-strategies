package com.epam.rd.autocode.startegy.cards.dealing_impl.util;

import com.epam.rd.autocode.startegy.cards.Card;
import com.epam.rd.autocode.startegy.cards.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CardDealingAlgorithmUtil {

    public void formDecksForPlayers(int players, Map<String, List<Card>> map) {
        for (int i = 0; i < players; i++) {
            map.put("Player " + (i + 1), new ArrayList<>());
        }
    }

    public void getRemainingList(Deck deck, Map<String, List<Card>> result) {
        List<Card> remaining = new ArrayList<>();
        while (deck.size() > 0) {
            remaining.add(deck.dealCard());
        }
        result.put("Remaining", remaining);
    }

    public void cardDealing(int players, Map<String, List<Card>> result, Deck deck, int cardAmountForOnePlayer) {
        for (int i = 0; i < cardAmountForOnePlayer; i++) {
            for (int x = 0; x < players; x++) {
                String currentPlayer = "Player " + (x + 1);
                List<Card> storage = result.get(currentPlayer);
                storage.add(deck.dealCard());
                result.put(currentPlayer, storage);
            }
        }
    }

    public void getAdditionalList(Deck deck, Map<String, List<Card>> result, List<String> additional, int cardNeeded) {
        List<Card> storage = new ArrayList<>();
        for (int i = 0; i < cardNeeded; i++) {
            storage.add(deck.dealCard());
        }
        for (String el : additional) {
            result.put(el, storage);
        }
    }

}
