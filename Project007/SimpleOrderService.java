package Project007;

public class SimpleOrderService implements OrderService {
    @Override
    public void placedOrder(MenuItem menuItem) {
        System.out.println( " for " + menuItem.getPrice());
    }
}
