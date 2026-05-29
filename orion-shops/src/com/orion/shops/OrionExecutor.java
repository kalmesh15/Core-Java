package com.orion.shops;

import com.orion.shops.orion.Orion;
import com.orion.shops.orion.impl.*;

public class OrionExecutor {
    public static void main(String[] args) {

        Orion adidas = new AdidasImpl();
        adidas.doBusiness();

        Orion allenSolly = new AllenSollyImpl();
        allenSolly.doBusiness();

        Orion appleStore = new AppleStoreImpl();
        appleStore.doBusiness();

        Orion bata = new BataImpl();
        bata.doBusiness();

        Orion biba = new BibaImpl();
        biba.doBusiness();

        Orion fabIndia = new FabIndiaImpl();
        fabIndia.doBusiness();

        Orion hm = new HMImpl();
        hm.doBusiness();

        Orion landMark = new LandMarkImpl();
        landMark.doBusiness();

        Orion levis = new LevisImpl();
        levis.doBusiness();

        Orion lifestyle = new LifestyleImpl();
        lifestyle.doBusiness();

        Orion louisPhilippe = new LouisPhilippeImpl();
        louisPhilippe.doBusiness();

        Orion manyavar = new ManyavarImpl();
        manyavar.doBusiness();

        Orion max = new MaxImpl();
        max.doBusiness();

        Orion metro = new MetroImpl();
        metro.doBusiness();

        Orion nike = new NikeImpl();
        nike.doBusiness();

        Orion pantaloons = new PantaloonsImpl();
        pantaloons.doBusiness();

        Orion peterEngland = new PeterEnglandImpl();
        peterEngland.doBusiness();

        Orion puma = new PumaImpl();
        puma.doBusiness();

        Orion rareRabbit = new RareRabbitImpl();
        rareRabbit.doBusiness();

        Orion reebok = new ReebokImpl();
        reebok.doBusiness();

        Orion samsung = new SamsungImpl();
        samsung.doBusiness();

        Orion superdry = new SuperdryImpl();
        superdry.doBusiness();

        Orion trends = new TrendsImpl();
        trends.doBusiness();

        Orion uspa = new USPAImpl();
        uspa.doBusiness();

        Orion vanHeusen = new VanHeusenImpl();
        vanHeusen.doBusiness();

        Orion westside = new WestsideImpl();
        westside.doBusiness();

        Orion woodland = new WoodlandImpl();
        woodland.doBusiness();

        Orion zudio = new ZudioImpl();
        zudio.doBusiness();
    }
}
