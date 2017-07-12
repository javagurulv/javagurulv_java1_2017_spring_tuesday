package lesson6;

public class CurrencyRate {

    private String pair;
    private String date;
    private String time;
    private float open;
    private float high;
    private float low;
    private float close;

    public CurrencyRate(String pair,
                        String date,
                        String time,
                        float open,
                        float high,
                        float low,
                        float close) {
        this.pair = pair;
        this.date = date;
        this.time = time;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }

    public String getPair() {
        return this.pair;
    }

    public String getDate() {
        return this.date;
    }

    public float getHigh() {
        return this.high;
    }

    public String getTime() {
        return this.time;
    }
}
