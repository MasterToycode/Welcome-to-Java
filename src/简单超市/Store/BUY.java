package Store;

import java.time.LocalDateTime;

public class BUY {
    public static void main(String []args){
        Thing milk = new Thing(12, "milk", "2024-12-30");
        Thing tissue = new Thing(5, "Tissue", "2026-12-30");
        Thing cirger = new Thing(53, "Yuhuashi", "");

        System.out.println(milk.toString());
        System.out.println(tissue.toString());
        System.out.println(cirger.toString());

    }
}
