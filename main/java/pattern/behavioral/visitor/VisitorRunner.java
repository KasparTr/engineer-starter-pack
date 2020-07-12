package pattern.behavioral.visitor;

public class VisitorRunner {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "isbn1234"),
                new Book(100, "isbn9876"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

    /*
    item.accept(visitor) -> visitor.accept(item) -> item.getCost()
     */
}
