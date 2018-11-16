package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int previousPurchasesAmount) {
        int previousPurchasesAmountMin = 1;
        int previousPurchasesAmountBlue = 15_000;
        int previousPurchasesAmountSilver = 150_000;
        int totalSum = 1000;
        int bonusBlue = 50;
        int bonusSilver = 70;
        int bonusGold = 100;

        int fullThousandsRub = purchaseAmount / totalSum;

        if (previousPurchasesAmount < previousPurchasesAmountMin) {
            return 0;
        } else if (previousPurchasesAmount <= previousPurchasesAmountBlue) {
            return fullThousandsRub * bonusBlue;
        } else if (previousPurchasesAmount <= previousPurchasesAmountSilver) {
            return fullThousandsRub * bonusSilver;
        }
        return fullThousandsRub * bonusGold;
    }
}