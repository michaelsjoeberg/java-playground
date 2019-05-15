
package abstractdecorator;

/**
 *
 * @author richardwalker
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        // Interaction shown in Figure Figure 4 of TMA03  
        Card c = new Card("Get well soon!");
        Decorator ic = new ImageCard(c);
        Decorator fbc = new FancyBorderCard(ic);
        fbc.print();
        
        // Add code to generate
        // (i) a c with an image, a background,    
        // and the message "Good luck in your new job!"
        Card c_i = new Card("Good luck in your new job!");
        Decorator ic_i = new ImageCard(c_i);
        Decorator bc_i = new BackgroundCard(ic_i);
        bc_i.print();
        
        // (ii) a c with an image, a fancy border, a background,
        // and the message "I saw this and I thought of you!"
        Card c_ii = new Card("I saw this and I thought of you!");
        Decorator ic_ii = new ImageCard(c_ii);
        Decorator fbc_ii = new FancyBorderCard(ic_ii);
        Decorator bc_ii = new BackgroundCard(fbc_ii);
        bc_ii.print();
        
        // test
        Card c_test = new Card();
        Decorator mt = new MoreText(c_test, "Some more text.");
        mt.print();
        
    }
    
}
