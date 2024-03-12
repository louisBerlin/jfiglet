package org.example;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        // using default font standard.flf, obtained from maven artifact
        String asciiArt1 = FigletFont.convertOneLine("hello World");
        System.out.println(asciiArt1);






    }
}