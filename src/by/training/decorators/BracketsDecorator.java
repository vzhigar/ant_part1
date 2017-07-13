package by.training.decorators;

import by.training.interfaces.Printer;

public class BracketsDecorator implements Printer {
    private final Printer printer;

    private final String LEFT_BRACKET = "(";
    private final String RIGHT_BRACKET = ")";

    public BracketsDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print(LEFT_BRACKET);
        printer.print();
        System.out.print(RIGHT_BRACKET);
    }
}
