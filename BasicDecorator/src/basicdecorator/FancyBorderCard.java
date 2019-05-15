
package basicdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class FancyBorderCard extends Card
{
    private Card card;

    public FancyBorderCard(Card card)
    {
        this.card = card;
    }
    
    @Override
    public void print() {
        System.out.println("Fancy border.");
        card.print();
    }
}
