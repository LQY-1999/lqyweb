package vo;

public class Number {
    private String merchandise;//商品
    private float numberArray[];//商品数量

    public Number() {
    }

    public Number(String merchandise, float[] number) {
        this.merchandise = merchandise;
        this.numberArray = number;
    }

    public String getmerchandise() {
        return merchandise;
    }

    public void setmerchandise(String merchandise) {
        this.merchandise = merchandise;
    }

    public float[] getNumber() {
        return numberArray;
    }

    public void setNumber(float[] number) {
        this.numberArray = number;
    }
}
