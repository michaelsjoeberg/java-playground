package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class Card {

    private String text;

    public Card() {
    }

    public Card(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }
}
