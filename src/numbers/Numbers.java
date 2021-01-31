/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author 37067
 */
public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String s = sc.nextLine();
        double d = Double.parseDouble(s);
        System.out.println(d);
//        int ska = Integer.parseInt(s);
//        System.out.println(ska);
        
        Integer ino = 7;
        Integer k = 10;
//        k = null;
        
        
        int kk = 10;
        
        Integer r = k * ino;
        //          k.intValue() => 10
        //              ino.intValue() => 7
        //          7 * 10 => 70
        //          new Integer(70)
        System.out.println(r);
        
        
        Integer io = new Integer(7);
        io = io * 3;
        //   ^^ => io.intValue() => 7
        //      21
        //   new Integer(21)
        System.out.println(io);
        
        Long lo = new Long(15616516);
        int i = 10;
        long l = 1569999;
        MyList ml = new MyList();
        ml.add(io);
        ml.add(lo);
        ml.add(i);
        ml.add(l);
        ml.add(5);
        ml.add(new Integer(5));
        ml.add(new Boolean(true));
        
        Object sk0 = ml.get(2);
        int sk = ((Integer) sk0).intValue();
        System.out.println(ml);
        System.out.println(sk);
        /*
        byte     Byte
        short    Short
        int      Integer
        long     Long
        float    Float
        double   Double
        char     Character
        boolean  Boolean
        */   
    }
    
}
