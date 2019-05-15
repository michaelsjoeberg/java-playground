package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class FancyBorderCard extends Decorator {

    public FancyBorderCard(Card card) {
        super(card);
    }

    @Override
    public void print() {
        System.out.println("Fancy border.");
        card.print();
    }
}
