package chap9;

public enum Type {
    CHEAP(200000),
    EXECUTIVE(1000),
    AWOYAYA(2500);

    private final int price;
    Type(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }


}
