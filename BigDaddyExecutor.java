class BigDaddyExecutor {

    public static void main(String[] args) {
        
		Casino c1 = new Casino(101,"Royal Casino","Poker",1000);
        BigDaddy b1 = new BigDaddy(1,"BigDaddy Cruise",c1);
        
		b1.casino = c1;
        b1.getBigDaddyDetail();
        /*b1.shipId = 1;
        b1.shipName = "BigDaddy Cruise";
        c1.casinoId = 101;
        c1.casinoName = "Royal Casino";
        c1.gameType = "Poker";
        c1.entryFee = 1000;
       */

		Casino c2 = new Casino(102, "Lucky Spin","Roulette",1774);
        BigDaddy b2 = new BigDaddy(2,"BigDaddy Cruise",c2);
        
       /* b2.shipId = 2;
        b2.shipName = "BigDaddy Cruise";
        c2.casinoId = 102;
        c2.casinoName = "Lucky Spin";
        c2.gameType = "Roulette";
        c2.entryFee = 1500;*/
        b2.casino = c2;
        b2.getBigDaddyDetail();


        /*BigDaddy b3 = new BigDaddy();
        Casino c3 = new Casino();
        b3.shipId = 3;
        b3.shipName = "BigDaddy Cruise";
        c3.casinoId = 103;
        c3.casinoName = "Golden Table";
        c3.gameType = "Blackjack";
        c3.entryFee = 1200;
        b3.casino = c3;
        b3.getBigDaddyDetail();


        BigDaddy b4 = new BigDaddy();
        Casino c4 = new Casino();
        b4.shipId = 4;
        b4.shipName = "BigDaddy Cruise";
        c4.casinoId = 104;
        c4.casinoName = "Vegas Zone";
        c4.gameType = "Slot";
        c4.entryFee = 800;
        b4.casino = c4;
        b4.getBigDaddyDetail();


        BigDaddy b5 = new BigDaddy();
        Casino c5 = new Casino();
        b5.shipId = 5;
        b5.shipName = "BigDaddy Cruise";
        c5.casinoId = 105;
        c5.casinoName = "Diamond Play";
        c5.gameType = "Poker";
        c5.entryFee = 2000;
        b5.casino = c5;
        b5.getBigDaddyDetail();


        BigDaddy b6 = new BigDaddy();
        Casino c6 = new Casino();
        b6.shipId = 6;
        b6.shipName = "BigDaddy Cruise";
        c6.casinoId = 106;
        c6.casinoName = "Lucky Cards";
        c6.gameType = "Teen Patti";
        c6.entryFee = 900;
        b6.casino = c6;
        b6.getBigDaddyDetail();


        BigDaddy b7 = new BigDaddy();
        Casino c7 = new Casino();
        b7.shipId = 7;
        b7.shipName = "BigDaddy Cruise";
        c7.casinoId = 107;
        c7.casinoName = "Royal Poker";
        c7.gameType = "Poker";
        c7.entryFee = 1800;
        b7.casino = c7;
        b7.getBigDaddyDetail();


        BigDaddy b8 = new BigDaddy();
        Casino c8 = new Casino();
        b8.shipId = 8;
        b8.shipName = "BigDaddy Cruise";
        c8.casinoId = 108;
        c8.casinoName = "Vegas Table";
        c8.gameType = "Blackjack";
        c8.entryFee = 1100;
        b8.casino = c8;
        b8.getBigDaddyDetail();


        BigDaddy b9 = new BigDaddy();
        Casino c9 = new Casino();
        b9.shipId = 9;
        b9.shipName = "BigDaddy Cruise";
        c9.casinoId = 109;
        c9.casinoName = "Golden Dice";
        c9.gameType = "Dice";
        c9.entryFee = 700;
        b9.casino = c9;
        b9.getBigDaddyDetail();


        BigDaddy b10 = new BigDaddy();
        Casino c10 = new Casino();
        b10.shipId = 10;
        b10.shipName = "BigDaddy Cruise";
        c10.casinoId = 110;
        c10.casinoName = "Fortune Spin";
        c10.gameType = "Roulette";
        c10.entryFee = 1600;
        b10.casino = c10;
        b10.getBigDaddyDetail();


        BigDaddy b11 = new BigDaddy();
        Casino c11 = new Casino();
        b11.shipId = 11;
        b11.shipName = "BigDaddy Cruise";
        c11.casinoId = 111;
        c11.casinoName = "Casino Star";
        c11.gameType = "Slot";
        c11.entryFee = 600;
        b11.casino = c11;
        b11.getBigDaddyDetail();


        BigDaddy b12 = new BigDaddy();
        Casino c12 = new Casino();
        b12.shipId = 12;
        b12.shipName = "BigDaddy Cruise";
        c12.casinoId = 112;
        c12.casinoName = "King Poker";
        c12.gameType = "Poker";
        c12.entryFee = 1900;
        b12.casino = c12;
        b12.getBigDaddyDetail();


        BigDaddy b13 = new BigDaddy();
        Casino c13 = new Casino();
        b13.shipId = 13;
        b13.shipName = "BigDaddy Cruise";
        c13.casinoId = 113;
        c13.casinoName = "Diamond Spin";
        c13.gameType = "Roulette";
        c13.entryFee = 1500;
        b13.casino = c13;
        b13.getBigDaddyDetail();


        BigDaddy b14 = new BigDaddy();
        Casino c14 = new Casino();
        b14.shipId = 14;
        b14.shipName = "BigDaddy Cruise";
        c14.casinoId = 114;
        c14.casinoName = "Lucky Table";
        c14.gameType = "Blackjack";
        c14.entryFee = 1300;
        b14.casino = c14;
        b14.getBigDaddyDetail();


        BigDaddy b15 = new BigDaddy();
        Casino c15 = new Casino();
        b15.shipId = 15;
        b15.shipName = "BigDaddy Cruise";
        c15.casinoId = 115;
        c15.casinoName = "Gold Casino";
        c15.gameType = "Poker";
        c15.entryFee = 2100;
        b15.casino = c15;
        b15.getBigDaddyDetail();


        BigDaddy b16 = new BigDaddy();
        Casino c16 = new Casino();
        b16.shipId = 16;
        b16.shipName = "BigDaddy Cruise";
        c16.casinoId = 116;
        c16.casinoName = "Spin World";
        c16.gameType = "Slot";
        c16.entryFee = 700;
        b16.casino = c16;
        b16.getBigDaddyDetail();


        BigDaddy b17 = new BigDaddy();
        Casino c17 = new Casino();
        b17.shipId = 17;
        b17.shipName = "BigDaddy Cruise";
        c17.casinoId = 117;
        c17.casinoName = "Royal Dice";
        c17.gameType = "Dice";
        c17.entryFee = 850;
        b17.casino = c17;
        b17.getBigDaddyDetail();


        BigDaddy b18 = new BigDaddy();
        Casino c18 = new Casino();
        b18.shipId = 18;
        b18.shipName = "BigDaddy Cruise";
        c18.casinoId = 118;
        c18.casinoName = "Elite Poker";
        c18.gameType = "Poker";
        c18.entryFee = 1700;
        b18.casino = c18;
        b18.getBigDaddyDetail();


        BigDaddy b19 = new BigDaddy();
        Casino c19 = new Casino();
        b19.shipId = 19;
        b19.shipName = "BigDaddy Cruise";
        c19.casinoId = 119;
        c19.casinoName = "Vegas King";
        c19.gameType = "Blackjack";
        c19.entryFee = 1400;
        b19.casino = c19;
        b19.getBigDaddyDetail();


        BigDaddy b20 = new BigDaddy();
        Casino c20 = new Casino();
        b20.shipId = 20;
        b20.shipName = "BigDaddy Cruise";
        c20.casinoId = 120;
        c20.casinoName = "Ultimate Casino";
        c20.gameType = "Roulette";
        c20.entryFee = 2000;
        b20.casino = c20;
        b20.getBigDaddyDetail();*/

    }
}