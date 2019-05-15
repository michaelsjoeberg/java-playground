package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class BackgroundCard extends Decorator
{

    public BackgroundCard(Card card)
    {
       super(card);
    }

    @Override
    public void print()
    {
        System.out.println("Background.");
        card.print();
    }
}
