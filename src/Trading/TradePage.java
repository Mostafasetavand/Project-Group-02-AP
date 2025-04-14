package Trading;

public class TradePage {

    public void displayTradePage(Player player1, Player player2, Trade trade) {
        System.out.println("Trade Page between " + player1.getName() + " and " + player2.getName());
        player1.displayInventory();
        player2.displayInventory();

        if (!trade.isCompleted()) {
            System.out.println("You can add items to trade.");
        } else {
            System.out.println("The trade has been completed.");
        }
    }

    public void confirmTrade(Trade trade) {
        if (!trade.isCompleted()) {
            trade.completeTrade();
        } else {
            System.out.println("This trade has already been completed.");
        }
    }
}
