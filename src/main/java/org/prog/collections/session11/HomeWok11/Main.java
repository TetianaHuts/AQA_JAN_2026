package org.prog.collections.session11.HomeWok11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //TODO: Create list of Android phones and list of Apple Phones (10 each)
//TODO: One Android must be pink, NO PINK APPLES
//TODO: One Apple must be gold, NO GOLD ANDROIDS
//TODO: 1. confirm pink android is in the list of androids
//TODO: 2. confirm gold android is NOT in the list of androids
//TODO: 3. Same of pink/gold Apple

    public static void main (String[] args) {
        List<Android> android = new ArrayList<>();
        List<Apple> apple = new ArrayList<>();
        android.add(new Android("green"));
        android.add(new Android("pink"));
        android.add(new Android("orange"));
        android.add(new Android("white"));
        android.add(new Android("black"));
        android.add(new Android("blue"));
        android.add(new Android("grey"));
        android.add(new Android("red"));
        android.add(new Android("purple"));
        android.add(new Android("brown"));

        apple.add(new Apple("green"));
        apple.add(new Apple("gold"));
        apple.add(new Apple("orange"));
        apple.add(new Apple("white"));
        apple.add(new Apple("black"));
        apple.add(new Apple("blue"));
        apple.add(new Apple("grey"));
        apple.add(new Apple("red"));
        apple.add(new Apple("purple"));
        apple.add(new Apple("brown"));


        System.out.println("========Android=========");
        System.out.println("Is pink phone in the list of androids?");
        System.out.println(android.contains(new Android("pink")));
        System.out.println("Is gold phone in the list of androids?");
        System.out.println(android.contains(new Android("gold")));

        System.out.println();

        System.out.println("========Apple=========");
        System.out.println("Is pink phone in the list of apples?");
        System.out.println(android.contains(new Android("pink")));
        System.out.println("Is gold phone in the list of apples?");
        System.out.println(android.contains(new Android("gold")));


    }
}
