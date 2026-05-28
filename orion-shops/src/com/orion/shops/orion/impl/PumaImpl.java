package com.orion.shops.orion.impl;

import com.orion.shops.orion.Orion;

public class PumaImpl implements Orion {

    @Override
    public void doBusiness() {
        System.out.println("Puma provides stylish athletic collections.");
    }
}