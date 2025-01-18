public class Order {
    public double orderAmount;
    private int  orderNo;
    private String orderDate;

    public Order(int orderNo, String orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

}
