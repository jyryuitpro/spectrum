package gamelevel;

import java.util.ArrayList;

public class MainBoardPlay {

    public static void main(String[] args) {
/*
        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
*/

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);

//        ArrayList<Integer> arrayList2 = arrayList1;
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList1);
        arrayList2.set(2, 5);

        for (Integer i : arrayList1) {
            System.out.println(i);
        }

        System.out.println("===========================");

        for (Integer i : arrayList2) {
            System.out.println(i);
        }
    }
}
