package io.gdfbarbosa.patterns.structural.flyweight;

import io.gdfbarbosa.patterns.structural.flyweight.forest.Forest;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FlyweightClient {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000000;
    static int TREE_TYPES = 10;

    public static void main(String[] args) {
        Forest forest = new Forest();
        double n = Math.floor(TREES_TO_DRAW / TREE_TYPES);
        System.out.println("Loop count: " + n);
        for (int i = 0; i < n; i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak 1", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak 2", Color.ORANGE, "Autumn Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak 3", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak 4", Color.ORANGE, "Autumn Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak 5", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak 6", Color.ORANGE, "Autumn Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak 7", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak 8", Color.ORANGE, "Autumn Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak 9", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak 10", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        double optimizedSize = (TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024.0 / 1024.0;
        double realSize = (TREES_TO_DRAW * 38) / 1024.0 / 1024.0;
        System.out.println("Total: " + optimizedSize +
                "MB (instead of " + realSize + "MB)");
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Memory reduction: " + formatter.format(100.0 - (optimizedSize*100.0/realSize)) + "%");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}