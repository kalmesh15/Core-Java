package com.orion.shops.orion.impl;

import com.orion.shops.orion.Orion;

public class VanHeusenImpl implements Orion {

    @Override
    public void doBusiness() {
        System.out.println("Van Heusen focuses on premium office wear.");
    }
}