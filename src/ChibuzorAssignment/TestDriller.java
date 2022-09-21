package ChibuzorAssignment;

public class TestDriller {


    public int PricePerCopy(int copy) {
        int price = 0;
        if (copy >= 1 && copy <= 4) {
        price = 2000 * copy;

    }
        return price;
    }

    public int PriceFor1_4Copies(int copy) {
        int price = 0;
        if (copy >= 1 && copy <= 4) {
            price = 2000 * copy;

        }
        return price;
    }

    public int PriceFor5_9Copies(int copy) {
        int price = 0;
        if (copy >= 5 && copy <= 9) {
            price = 1800 * copy;

        }
        return price;
    }

    public int PriceFor10_29Copies(int copy) {
        int price = 0;
        if (copy >= 10 && copy <= 29) {
            price = 1600 * copy;

        }
        return price;
    }

    public int PriceFor30_49Copies(int copy) {
        int price = 0;
        if (copy >= 30 && copy <= 49) {
            price = 1500 * copy;

        }
        return price;
    }

    public int PriceFor50_99Copies(int copy) {
        int price = 0;
        if (copy >= 50 && copy <= 99) {
            price = 1300 * copy;

        }
        return price;
    }

    public int PriceFor100_199Copies(int copy) {
        int price = 0;
        if (copy >= 100 && copy <=199) {
            price = 1200 * copy;

        }
        return price;
    }

    public int PriceFor200_499Copies(int copy) {
        int price = 0;
        if (copy >= 200 && copy <=499) {
            price = 1100 * copy;

        }
        return price;
    }

    public int PriceFor500Copies(int copy) {
        int price = 0;
        if (copy >= 500) {
            price = 1000 * copy;

        }
        return price;
    }
}
