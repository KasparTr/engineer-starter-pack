package pattern.behavioral.visitor;

public interface ShoppingCartVisitor {

    // overloaded methods
    int visit(Book book);
    int visit(Fruit fruit);
}