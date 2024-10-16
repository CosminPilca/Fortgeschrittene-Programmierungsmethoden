public class Aufgabe4 {

    public static int findCheapestKeyboard(int[] keyboardPrices) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboardPrices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice == Integer.MAX_VALUE ? 0 : minPrice;
    }

    public static int findMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int maxKeyboardPrice = Integer.MIN_VALUE;
        for (int price : keyboardPrices) {
            if (price > maxKeyboardPrice) {
                maxKeyboardPrice = price;
            }
        }

        int maxUsbPrice = Integer.MIN_VALUE;
        for (int price : usbPrices) {
            if (price > maxUsbPrice) {
                maxUsbPrice = price;
            }
        }

        return Math.max(maxKeyboardPrice, maxUsbPrice);
    }

    public static int findMostExpensiveUsb(int[] usbPrices, int budget) {
        int maxUsbPrice = 0;
        for (int price : usbPrices) {
            if (price <= budget && price > maxUsbPrice) {
                maxUsbPrice = price;
            }
        }
        return maxUsbPrice;
    }

    public static int calculateMaxSpending(int[] keyboardPrices, int[] usbPrices, int budget) {
        int cheapestKeyboard = findCheapestKeyboard(keyboardPrices);
        int mostExpensiveUsb = findMostExpensiveUsb(usbPrices, budget - cheapestKeyboard);

        if (mostExpensiveUsb == 0) {
            return -1;
        }

        return cheapestKeyboard + mostExpensiveUsb;
    }

    public static void main(String[] args) {
        int[] keyboardPrices = {40, 50, 60};
        int[] usbPrices = {8, 12};
        int budget = 60;

        System.out.println("Cheapest keyboard: " + findCheapestKeyboard(keyboardPrices));
        System.out.println("Most expensive item: " + findMostExpensiveItem(keyboardPrices, usbPrices));
        System.out.println("Most expensive USB Markus can afford: " + findMostExpensiveUsb(usbPrices, budget));
        System.out.println("Max spending: " + calculateMaxSpending(keyboardPrices, usbPrices, budget));
    }
}
