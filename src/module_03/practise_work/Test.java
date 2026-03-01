package module_03.practise_work;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new OrderItem("Компютер", 1, 300000));
        order.addItem(new OrderItem("Мышка", 2, 5000));

        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.addRule(new PercentageDiscount(10));

        IPayment payment = new CreditCardPayment();
        IDelivery delivery = new CourierDelivery();
        INotification notification = new EmailNotification();

        OrderService service = new OrderService(payment, delivery, notification, discountCalculator);
        service.checkout(order);
    }
}
