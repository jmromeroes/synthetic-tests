package com.java17.lift.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public abstract sealed class Shape {
        abstract String f();
        final class Circle extends Shape {
            String f() {
                int a[] = new int[1];
                int b[] = new int[2];
                int c[] = new int[2];
                if(a.equals(b)) {
                    return "";
                }
                return "x";
            }
        }
        final class Square extends Shape { String f() { return null; } }
    }
}
