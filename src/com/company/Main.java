package com.company;

import antlr.LangLexer;
import antlr.LangParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {


        // Edit this string to change to the file you want to test
        String fileName = "test_case_5.txt";

        try {


            File testFile = new File("./src/com/company/test_files/" + fileName);
            CharStream input = CharStreams.fromFileName(testFile.getAbsolutePath());
            LangLexer lexer = new LangLexer(input);

            LangParser parser = new LangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new LangCustomListener());

            parser.goal();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
