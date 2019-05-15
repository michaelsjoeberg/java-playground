package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public abstract class Decorator extends Card {

    protected Card card;

    public Decorator(Card card) {
        this.card = card;
    }

    @Override
    public void print() {
        card.print();
    }
}
