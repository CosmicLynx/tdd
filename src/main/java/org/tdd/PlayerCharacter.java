package org.tdd;

import java.util.Scanner;

public class PlayerCharacter {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        boolean isRunning = true;
        Scanner in = new Scanner(System.in);

        while (isRunning) {
            System.out.println("current location: " + "[" + x + "," + y + "]");
            System.out.println("enter q to quit");
            System.out.println("move with w, a, s, d: ");
            String input = in.nextLine();

            int[] newLocation = move(input.toLowerCase(), x, y);
            x = getX(newLocation);
            y = getY(newLocation);

            isRunning = !input.equalsIgnoreCase("q");
            if (!isRunning)
                in.close();
        }

    }

    public static int getX(int[] location) {
        return location[0];
    }

    public static int getY(int[] location) {
        return location[1];
    }

    public static int[] move(String input, int currentX, int currentY) {

        switch (input) {
            case "w":
                currentY = currentY + 1;
                break;
            case "a":
                currentX = currentX - 1;
                break;
            case "s":
                currentY = currentY - 1;
                break;
            case "d":
                currentX = currentX + 1;
                break;
        }

        int[] newLocation = {currentX, currentY};

        return newLocation;
    }
}
