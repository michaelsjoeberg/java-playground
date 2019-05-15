package abstractdecorator;

public class MoreText extends Decorator {
    
    private String moreText;

    public MoreText(Card card, String moreText) {
        super(card);
        this.moreText = moreText;
    }

    @Override
    public void print() {
        card.print();
        System.out.println(moreText);
    }
}
