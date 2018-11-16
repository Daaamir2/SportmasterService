package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int previousPurchasesAmount) {
        int result;
        int previousPurchasesAmountMin = 1;
        int previousPurchasesAmountBlue = 15_000;
        int previousPurchasesAmountSilver = 150_000;
        int totalSum = 1000;
        int bonusBlue = 50;
        int bonusSilver = 70;
        int bonusGold = 100;

        int fullThousandRub = purchaseAmount / totalSum;

        if (previousPurchasesAmount < previousPurchasesAmountMin){
            result = 0;
        } else if (previousPurchasesAmount <= previousPurchasesAmountBlue) {
            result = fullThousandRub * bonusBlue;
        } else if (previousPurchasesAmount <= previousPurchasesAmountSilver) {
            result = fullThousandRub * bonusSilver;
        } else {
            result = fullThousandRub * bonusGold;
        }

        return result;
    }
}
