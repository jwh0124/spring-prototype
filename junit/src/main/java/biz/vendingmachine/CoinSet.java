package biz.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class CoinSet {

    private List<Integer> coinSets = new ArrayList<Integer>();

    public void add(int coin){
        this.coinSets.add(coin);
    }

    @Override
    public boolean equals(Object coinSet) {
        if (!(coinSet instanceof CoinSet)) {
            return false;
        }

        return this.toString().equals( coinSet.toString() );
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Integer coin : this.coinSets){
            builder.append(coin);
        }
        return builder.toString();
    }
}
