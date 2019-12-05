package com.company;

import antlr.*;

import java.io.*;
import java.util.HashMap;

public class LangCustomListener extends LangBaseListener {
    HashMap<String, Integer> variableMap = new HashMap();
    File file;

    @Override
    public void enterGoal(LangParser.GoalContext ctx) {
        System.out.println("enterGoal");


        file = new File("./build/Lang.j");
        System.out.println(file.getAbsolutePath());
    }

    @Override
    public void exitGoal(LangParser.GoalContext ctx) {
        System.out.println("exitGoal");
    }

    @Override
    public void enterMainClassName(LangParser.MainClassNameContext ctx) {
        System.out.println("enterMainClassName");
    }

    @Override
    public void exitMainClassName(LangParser.MainClassNameContext ctx) {
        System.out.println("exitMainClassName");
    }

    @Override
    public void enterMainClass(LangParser.MainClassContext ctx) throws IOException {
        System.out.println("enterMainClass");

        
        PrintWriter out = new PrintWriter(new FileWriter(file, false));

        // Set up .class and .super
        out.append(".class public Lang");
        out.append("\n");
        out.append(".super java/lang/Object");
        out.append("\n\n");

        // Init Assembly Code
        out.append(".method public <init>()V");
        out.append("\n");
        out.append("aload_0");
        out.append("\n");
        out.append("invokespecial java/lang/Object/<init>()V");
        out.append("\n");
        out.append("return");
        out.append("\n");
        out.append(".end method");
        out.append("\n\n");

        // Start of main() Assembly Code
        out.append(".method public static main([Ljava.lang.String;)V");
        out.append("\n");
        out.append(".limit stack 10");
        out.append("\n");
        out.append(".limit locals 10");
        out.append("\n\n");
        out.close();
    }

    @Override
    public void exitMainClass(LangParser.MainClassContext ctx) throws IOException {
        System.out.println("exitMainClass");
        
        PrintWriter out = new PrintWriter(new FileWriter(file, true));
        out.append("return");
        out.append("\n");
        out.append(".end method");
        out.append("\n");
        out.close();
    }


    @Override
    public void exitPrint(LangParser.PrintContext ctx) throws IOException {
        if(ctx.INT() != null){
            System.out.println("Trying PrintWriter: INT");
            
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.append("; Assembly Code to Print: INT " + ctx.INT().getText().toString());
            out.append("\n\ngetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            out.append("bipush " + ctx.INT().getText().toString());
            out.append("\ninvokestatic java/lang/String/valueOf(I)Ljava/lang/String;\n");
            out.append("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            out.append("\n\n");
            out.close();

        }
        else if(ctx.ID() != null){
            System.out.println("Trying PrintWriter: ID");
            PrintWriter out = new PrintWriter(new FileWriter(file, true));

            out.append("; Assembly Code to Print: ID " + ctx.ID().getText().toString());
            out.append("\n\ngetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            out.append("bipush " + this.variableMap.get(ctx.ID().getText()));
            out.append("\ninvokestatic java/lang/String/valueOf(I)Ljava/lang/String;\n");
            out.append("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
            out.append("\n\n");
            out.close();
        }
    }

    @Override
    public void exitLet(LangParser.LetContext ctx) {
        this.variableMap.put(ctx.ID().getText(),
                Integer.parseInt(ctx.INT().getText()));
    }
}
