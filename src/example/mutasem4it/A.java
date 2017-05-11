/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.mutasem4it;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mutasem
 */
public final class A {

    final int y;
    //or final int y = 0;

    final File file = new File("file.txt");

    public A() {
        y = 0;
        //y++; error
        file.setLastModified(10);
        file.setReadable(true);
        //file=new File("file.txt"); error
    }

    public final void m() {
        System.out.println("A.m()");
    }
}

//class B extends A { error
//
////    @Override
////    public void m() {
////        System.out.println("B.m()");
////    } error
//}
