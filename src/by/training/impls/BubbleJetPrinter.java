package by.training.impls;

import by.training.interfaces.Printer;

public class BubbleJetPrinter implements Printer {
    private final String image;

    public BubbleJetPrinter(String image) {
        this.image = image;
    }

    @Override
    public void print() {
        System.out.print(image);
    }
}
