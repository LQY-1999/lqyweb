package vo;

public class PageViewInfo {
    private String browserName;//浏览器名字
    private float percent;//浏览商品占比

    public PageViewInfo() {
    }

    public PageViewInfo(String broswerName, float percent) {
        this.browserName = broswerName;
        this.percent = percent;
    }

    public String getBroswerName() {
        return browserName;
    }

    public void setBroswerName(String broswerName) {
        this.browserName = broswerName;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
}
