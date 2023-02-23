public class Milli2 {
    public static void main(String[] args) {
        int ticketCost = 3000;
        int bonusScale = 20;
        int bonusMile = ticketCost / bonusScale;

        System.out.println("Стоимость билета " + ticketCost + " руб., Ваш бонус " + bonusMile + " бонусных миль.");
    }
}
