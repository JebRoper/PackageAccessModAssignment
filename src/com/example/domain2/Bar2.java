package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by admin on 4/11/17.
 */
public class Bar2 {
    Foo foo;


    public Bar2() {
        foo = new Foo();



        foo.publicString = "Bar2 changed the public String";
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "foo=" + foo +
                '}';
    }
}

