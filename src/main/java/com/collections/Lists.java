package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String color, List<String> colors) {
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String color, List<String> colors, int index) {
        for (int i = index; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> colors) {
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals("")) {
                return i;
            }
        }
        return -1;
    }

    public static int put(String color, List<String> colors) {
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals("")) {
                colors.set(i, color);
                return i;
            }
        }
        // If no empty slot is found, return -1
        return -1;
    }

    public static int remove(String color, List<String> colors) {
        int removedCounter = 0;

        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                removedCounter++;
                colors.set(i, "");
            }
        }
        return removedCounter;
    }
}