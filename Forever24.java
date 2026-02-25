class Forever24{

    static String clothName;
    static String brand;
    static String size;
    static String color;
    static String type;
    static String material;
    static String price;
    static String gender;
    static String pattern;
    static String fit;
    static String season;
    static String availability;

    public static boolean createCloth(String n, String b, String s, String c, String t, String m, String p, String g, String pat, String f, String sea, String avail){

        boolean isCreateCloth = false;

        boolean isNameValid = false;
        boolean isBrandValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isTypeValid = false;
        boolean isMaterialValid = false;
        boolean isPriceValid = false;
        boolean isGenderValid = false;
        boolean isPatternValid = false;
        boolean isFitValid = false;
        boolean isSeasonValid = false;
        boolean isAvailabilityValid = false;

        if(n != null && !n.isEmpty()){
            System.out.println("Cloth name is valid....");
            clothName = n;
            isNameValid = true;
        }else{
            System.out.println("Cloth name is not valid....");
        }

        if(b != null && !b.isEmpty()){
            System.out.println("Brand is valid....");
            brand = b;
            isBrandValid = true;
        }else{
            System.out.println("Brand is not valid....");
        }

        if(s != null && !s.isEmpty()){
            System.out.println("Size is valid....");
            size = s;
            isSizeValid = true;
        }else{
            System.out.println("Size is not valid....");
        }

        if(c != null && !c.isEmpty()){
            System.out.println("Color is valid....");
            color = c;
            isColorValid = true;
        }else{
            System.out.println("Color is not valid....");
        }

        if(t != null && !t.isEmpty()){
            System.out.println("Type is valid....");
            type = t;
            isTypeValid = true;
        }else{
            System.out.println("Type is not valid....");
        }

        if(m != null && !m.isEmpty()){
            System.out.println("Material is valid....");
            material = m;
            isMaterialValid = true;
        }else{
            System.out.println("Material is not valid....");
        }

        if(p != null && !p.isEmpty()){
            System.out.println("Price is valid....");
            price = p;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(g != null && !g.isEmpty()){
            System.out.println("Gender is valid....");
            gender = g;
            isGenderValid = true;
        }else{
            System.out.println("Gender is not valid....");
        }

        if(pat != null && !pat.isEmpty()){
            System.out.println("Pattern is valid....");
            pattern = pat;
            isPatternValid = true;
        }else{
            System.out.println("Pattern is not valid....");
        }

        if(f != null && !f.isEmpty()){
            System.out.println("Fit is valid....");
            fit = f;
            isFitValid = true;
        }else{
            System.out.println("Fit is not valid....");
        }

        if(sea != null && !sea.isEmpty()){
            System.out.println("Season is valid....");
            season = sea;
            isSeasonValid = true;
        }else{
            System.out.println("Season is not valid....");
        }

        if(avail != null && !avail.isEmpty()){
            System.out.println("Availability is valid....");
            availability = avail;
            isAvailabilityValid = true;
        }else{
            System.out.println("Availability is not valid....");
        }

        if(isNameValid && isBrandValid && isSizeValid && isColorValid && isTypeValid && isMaterialValid && isPriceValid && isGenderValid && isPatternValid && isFitValid && isSeasonValid && isAvailabilityValid){
            isCreateCloth = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateCloth;
    }

    public static void getCloth(){
        System.out.println("......................................................");
        System.out.println("Cloth details are.....");
        System.out.println("Name: " + clothName);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Gender: " + gender);
        System.out.println("Pattern: " + pattern);
        System.out.println("Fit: " + fit);
        System.out.println("Season: " + season);
        System.out.println("Availability: " + availability);
        System.out.println("......................................................");
    }
}