package com.example.domain;

public class Foo {
    public String publicString = "public string";
    protected String protectedString = "protected string";
    String packageString = "package string";
    private String privateString = "private string";

    public Foo() {
        System.out.println("In Foo constructor " + this.toString());
    }

    @Override
    public String toString() {
        return "Foo{" +
                "publicString='" + publicString + '\'' +
                ", protectedString='" + protectedString + '\'' +
                ", packageString='" + packageString + '\'' +
                ", privateString='" + privateString + '\'' +
                '}';
    }
}
