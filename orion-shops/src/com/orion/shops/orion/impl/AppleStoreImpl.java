package com.orion.shops.orion.impl;

import com.orion.shops.orion.Orion;

public class AppleStoreImpl implements Orion {

    @Override
    public void doBusiness() {
        System.out.println("Apple Store sells premium electronic devices.");
    }
}