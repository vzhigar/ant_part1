package by.training.runner;

import by.training.decorators.BracketsDecorator;
import by.training.decorators.PrinterTypeDecorator;
import by.training.decorators.QuotesDecorator;
import by.training.impls.BubbleJetPrinter;
import by.training.impls.LaserPrinter;
import by.training.impls.MatrixPrinter;
import by.training.impls.SublimePrinter;
import by.training.interfaces.Printer;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final String TEXT = "Printing text";
    private static final String IMAGE = "Printing image";
    private static final String CASH_VOUCHER = "Printing cash voucher";
    private static final String POSTER = "Printing poster";

    public static void main(String[] args) {
        List<Printer> printersList = new ArrayList<>();

        Printer laser = new LaserPrinter(TEXT);
        printersList.add(laser);

        Printer bubbleJetPrinter = new PrinterTypeDecorator(new BubbleJetPrinter(IMAGE));
        printersList.add(bubbleJetPrinter);

        Printer matrixPrinter = new QuotesDecorator(new PrinterTypeDecorator(new MatrixPrinter(CASH_VOUCHER)));
        printersList.add(matrixPrinter);

        Printer sublimePrinter = new QuotesDecorator(new BracketsDecorator(new PrinterTypeDecorator(new SublimePrinter(POSTER))));
        printersList.add(sublimePrinter);

        printersList.forEach(printer -> { printer.print();
                                        System.out.println();
        });
    }
}
