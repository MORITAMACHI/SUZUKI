package bean;

public class Item {

	private String productregistrationid;
	private String sellerid;
	private int kinds;
	private String description;
	private int statusoftheitem;
	private int itemcondition;
	private int sendstate;
	private int paymentstate;
	private int price;
	private String datelisted;
	private String completeddate;

	public Item() {
		this.productregistrationid = null;
		this.sellerid = null;
		this.kinds = 0;
		this.description = null;
		this.statusoftheitem = 0;
		this.itemcondition = 0;
		this.sendstate = 0;
		this.paymentstate = 0;
		this.price = 0;
		this.datelisted = null;
		this.completeddate = null;

	}

	public String getProductregistrationid() {
		return productregistrationid;
	}

	public void setProductregistrationid(String productregistrationid) {
		this.productregistrationid = productregistrationid;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public int getKinds() {
		return kinds;
	}

	public void setKinds(int kinds) {
		this.kinds = kinds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatusoftheitem() {
		return statusoftheitem;
	}

	public void setStatusoftheitem(int statusoftheitem) {
		this.statusoftheitem = statusoftheitem;
	}

	public int getItemcondition() {
		return itemcondition;
	}

	public void setItemcondition(int itemcondition) {
		this.itemcondition = itemcondition;
	}

	public int getSendstate() {
		return sendstate;
	}

	public void setSendstate(int sendstate) {
		this.sendstate = sendstate;
	}

	public int getPaymentstate() {
		return paymentstate;
	}

	public void setPaymentstate(int paymentstate) {
		this.paymentstate = paymentstate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDatelisted() {
		return datelisted;
	}

	public void setDatelisted(String datelisted) {
		this.datelisted = datelisted;
	}

	public String getCompleteddate() {
		return completeddate;
	}

	public void setCompleteddate(String completeddate) {
		this.completeddate = completeddate;
	}


}

