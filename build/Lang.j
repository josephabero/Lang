.class public Lang
.super java/lang/Object

.method public <init>()V
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava.lang.String;)V
.limit stack 10
.limit locals 10

; Assembly Code to Print: ID a

getstatic java/lang/System/out Ljava/io/PrintStream;
bipush 8
invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

; Assembly Code to Print: ID b

getstatic java/lang/System/out Ljava/io/PrintStream;
bipush 25
invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

; Assembly Code to Print: INT 120

getstatic java/lang/System/out Ljava/io/PrintStream;
bipush 120
invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

; Assembly Code to Print: ID a

getstatic java/lang/System/out Ljava/io/PrintStream;
bipush 9
invokestatic java/lang/String/valueOf(I)Ljava/lang/String;
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

return
.end method
