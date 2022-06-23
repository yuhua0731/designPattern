/*
 * Copyright 2022 hcrobots.com, Inc. All rights reserved. 
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package commands;

/**
 * @author huayu
 *
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Invoker invoker = new Invoker("R01", "C01");
        invoker.runStart();
        System.out.println("...\nrunning for a while, time to stop");
        invoker.runStop();
    }
}
