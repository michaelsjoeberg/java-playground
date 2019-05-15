
package basicdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        Card card = new Card("Happy Birthday!");
        FancyBorderCard decoratedCard = new FancyBorderCard(card);
        decoratedCard.print();
    }
    
}
