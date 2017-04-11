package com.example.domain;

/**
 * Created by admin on 4/11/17.
 */
public class Bar {
    Foo foo;


    public Bar() {
        foo = new Foo();

        foo.packageString = "Changed the package String";
        foo.publicString = "Changed the public String";
        foo.protectedString = "Changed the protected String";

        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Bar{" +
                "foo=" + foo +
                '}';
    }

}


