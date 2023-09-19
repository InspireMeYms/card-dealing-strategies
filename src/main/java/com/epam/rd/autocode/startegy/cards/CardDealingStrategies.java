package com.epam.rd.autocode.startegy.cards;

import com.epam.rd.autocode.startegy.cards.dealing_impl.BridgeCardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.dealing_impl.ClassicPokerCardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.dealing_impl.FoolCardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.dealing_impl.TexasHoldemCardDealingStrategy;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasHoldemCardDealingStrategy();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPokerCardDealingStrategy();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy() {
        return new BridgeCardDealingStrategy();
    }

    public static CardDealingStrategy foolCardDealingStrategy() {
        return new FoolCardDealingStrategy();
    }

}
