package org.apche.method;

public class DemoSale {
    //打折方法
    public double sale(double price){
        double salePrice = price;
        if(price>=100 && price<199){
            salePrice = price * 0.95;
        }
        else if(price>=200){
            salePrice = price * 0.85;
        }
        return  salePrice;
    }

    public static void main(String[] args) {
        DemoSale demoSale = new DemoSale();
        double price = 150.0;
        System.out.println("原价"+price+"元的商品，打完折后是："+demoSale.sale(price)+"元");
    }
}
