class PsFiveExecutor{
    public static void main(String[] args){

        boolean isPsCreate;

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive(null,"Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000",null,"White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("","","","","","","","","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive(null,null,null,null,null,null,null,null,null,null);
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","","","50000","","White","AMD","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","","825GB","4K","","DualSense","","AMD","16GB","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive(null,"Sony","825GB","","50000",null,"White","AMD","","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony",null,"4K","50000","DualSense","White",null,"16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("","","825GB","4K","","","","","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive(null,"","","",null,"","","","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); }
		else{ 
		System.out.println("wrong credentials............"); 
		}

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","","4K","","DualSense","","AMD","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","","825GB","","50000","","White","","16GB","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive(null,null,"","","",null,"","","","");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

        isPsCreate = PsFive.createPsFive("PS5","Sony","825GB","4K","50000","DualSense","White","AMD","16GB","1Y");
        if(isPsCreate){ PsFive.getPsFiveDetails(); } else{ System.out.println("wrong credentials............"); }

    }
}