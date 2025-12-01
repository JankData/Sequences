import exceptions.CantDecomposeException;
import sequences.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IntegerPrinter printerFile = new IntegerPrinter("sequences.txt");
        IntegerPrinter printerStdOut = new IntegerPrinter();

        //Integers
        Sequence sq=new Integers();
        printerStdOut.print(sq);
        printerFile.print(sq);

        //Squares
        sq=new Squares();
        printerStdOut.print(sq);
        printerFile.print(sq);
        try{
            System.out.println(sq.decompose(500));
        } catch (CantDecomposeException ex) {
            System.out.println(ex.getMessage());
        }
        //Primes
        sq=new Primes();
        printerStdOut.print(sq);
        printerFile.print(sq);
        try{
            System.out.println(sq.decompose(500));
        } catch (CantDecomposeException ex){
            System.out.println(ex.getMessage());
        }

        //Fibonacci numbers starting with (1,5)
        sq=new Fibonacci(1,5);
        sq.setMax(999999999);
        printerStdOut.print(sq);
        printerFile.print(sq);
    }
}