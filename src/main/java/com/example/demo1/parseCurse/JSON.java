package com.example.demo1.parseCurse;

public class JSON {
public String ccy;
public String base_ccy;
public double buy;
public double sale;
public JSON() {
}

@Override
public String toString() {
	return "JSON{" +
			"ccy='" + ccy + '\'' +
			", base_ccy='" + base_ccy + '\'' +
			", buy=" + buy +
			", sale=" + sale +
			'}';
}

public JSON(String ccy, String base_ccy, double buy, double sale) {
	this.ccy = ccy;
	this.base_ccy = base_ccy;
	this.buy = buy;
	this.sale = sale;
}


}
