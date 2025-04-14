package Trading;

import java.util.HashMap;
import java.util.Map;

public class Trade {
    private Player player1;
    private Player player2;
    private Map<String, Integer> player1Items;
    private Map<String, Integer> player2Items;
    private boolean isCompleted;

    public Trade(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Items = new HashMap<>();
        this.player2Items = new HashMap<>();
        this.isCompleted = false;
    }

    // اضافه کردن آیتم به طرف اول معامله
    public void addItemToPlayer1(String item, int quantity) {
        player1Items.put(item, quantity);
        System.out.println(quantity + " " + item + " added to " + player1.getName() + "'s side.");
    }

    // اضافه کردن آیتم به طرف دوم معامله
    public void addItemToPlayer2(String item, int quantity) {
        player2Items.put(item, quantity);
        System.out.println(quantity + " " + item + " added to " + player2.getName() + "'s side.");
    }

    public void completeTrade() {
        if (!player1Items.isEmpty() && !player2Items.isEmpty()) {
            isCompleted = true;
            System.out.println("Trade completed between " + player1.getName() + " and " + player2.getName());
           //Transfer items between players
            for (Map.Entry<String, Integer> entry : player1Items.entrySet()) {
                player2.addItem(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, Integer> entry : player2Items.entrySet()) {
                player1.addItem(entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("Trade cannot be completed, please add items.");
        }
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
