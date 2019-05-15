package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class ImageCard extends Decorator {

    public ImageCard(Card card) {
        super(card);
    }

    @Override
    public void print() {
        System.out.println("Image.");
        card.print();
    }
}
