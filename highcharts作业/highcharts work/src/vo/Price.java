package vo;

public class Price {

	private String merchandise; //商品
	private float salesAmount; //销售额

	public Price() {
	}

	public Price(String merchandise, float salesAmount) {
		this.merchandise = merchandise;
		this.salesAmount = salesAmount;
	}

	public String getGoodsName() {
		return merchandise;
	}

	public void setGoodsName(String merchandise) {
		this.merchandise = merchandise;
	}

	public float getsalesAmount() {
		return salesAmount;
	}

	public void setsalesAmount(float salesAmount) {
		this.salesAmount = salesAmount;
	}
}