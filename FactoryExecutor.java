class FactoryExecutor {

    public static void main(String[] args) {

        Factory f1 = new Factory();
        Machine m1 = new Machine();
        f1.factoryId = 1;
        f1.factoryName = "Tata Motors";
        m1.machineId = 101;
        m1.machineName = "CNC";
        m1.type = "Cutting";
        f1.machine = m1;
        f1.getFactoryDetail();


        Factory f2 = new Factory();
        Machine m2 = new Machine();
        f2.factoryId = 2;
        f2.factoryName = "Mahindra";
        m2.machineId = 102;
        m2.machineName = "Drill";
        m2.type = "Drilling";
        f2.machine = m2;
        f2.getFactoryDetail();


        Factory f3 = new Factory();
        Machine m3 = new Machine();
        f3.factoryId = 3;
        f3.factoryName = "Bosch";
        m3.machineId = 103;
        m3.machineName = "Lathe";
        m3.type = "Turning";
        f3.machine = m3;
        f3.getFactoryDetail();


        Factory f4 = new Factory();
        Machine m4 = new Machine();
        f4.factoryId = 4;
        f4.factoryName = "Toyota";
        m4.machineId = 104;
        m4.machineName = "Press";
        m4.type = "Forming";
        f4.machine = m4;
        f4.getFactoryDetail();


        Factory f5 = new Factory();
        Machine m5 = new Machine();
        f5.factoryId = 5;
        f5.factoryName = "Honda";
        m5.machineId = 105;
        m5.machineName = "Robot Arm";
        m5.type = "Assembly";
        f5.machine = m5;
        f5.getFactoryDetail();


        Factory f6 = new Factory();
        Machine m6 = new Machine();
        f6.factoryId = 6;
        f6.factoryName = "Hyundai";
        m6.machineId = 106;
        m6.machineName = "Welder";
        m6.type = "Welding";
        f6.machine = m6;
        f6.getFactoryDetail();


        Factory f7 = new Factory();
        Machine m7 = new Machine();
        f7.factoryId = 7;
        f7.factoryName = "LG Factory";
        m7.machineId = 107;
        m7.machineName = "Molder";
        m7.type = "Plastic";
        f7.machine = m7;
        f7.getFactoryDetail();


        Factory f8 = new Factory();
        Machine m8 = new Machine();
        f8.factoryId = 8;
        f8.factoryName = "Samsung Plant";
        m8.machineId = 108;
        m8.machineName = "Assembler";
        m8.type = "Electronics";
        f8.machine = m8;
        f8.getFactoryDetail();


        Factory f9 = new Factory();
        Machine m9 = new Machine();
        f9.factoryId = 9;
        f9.factoryName = "Apple Plant";
        m9.machineId = 109;
        m9.machineName = "Chip Cutter";
        m9.type = "Precision";
        f9.machine = m9;
        f9.getFactoryDetail();


        Factory f10 = new Factory();
        Machine m10 = new Machine();
        f10.factoryId = 10;
        f10.factoryName = "Intel Plant";
        m10.machineId = 110;
        m10.machineName = "Nano Cutter";
        m10.type = "Micro";
        f10.machine = m10;
        f10.getFactoryDetail();


        Factory f11 = new Factory();
        Machine m11 = new Machine();
        f11.factoryId = 11;
        f11.factoryName = "Dell Plant";
        m11.machineId = 111;
        m11.machineName = "PCB Machine";
        m11.type = "Electronics";
        f11.machine = m11;
        f11.getFactoryDetail();


        Factory f12 = new Factory();
        Machine m12 = new Machine();
        f12.factoryId = 12;
        f12.factoryName = "HP Plant";
        m12.machineId = 112;
        m12.machineName = "Printer Machine";
        m12.type = "Assembly";
        f12.machine = m12;
        f12.getFactoryDetail();


        Factory f13 = new Factory();
        Machine m13 = new Machine();
        f13.factoryId = 13;
        f13.factoryName = "Lenovo Plant";
        m13.machineId = 113;
        m13.machineName = "Board Machine";
        m13.type = "Electronics";
        f13.machine = m13;
        f13.getFactoryDetail();


        Factory f14 = new Factory();
        Machine m14 = new Machine();
        f14.factoryId = 14;
        f14.factoryName = "Asus Plant";
        m14.machineId = 114;
        m14.machineName = "Chip Setter";
        m14.type = "Assembly";
        f14.machine = m14;
        f14.getFactoryDetail();


        Factory f15 = new Factory();
        Machine m15 = new Machine();
        f15.factoryId = 15;
        f15.factoryName = "Sony Factory";
        m15.machineId = 115;
        m15.machineName = "Screen Maker";
        m15.type = "Display";
        f15.machine = m15;
        f15.getFactoryDetail();


        Factory f16 = new Factory();
        Machine m16 = new Machine();
        f16.factoryId = 16;
        f16.factoryName = "Panasonic";
        m16.machineId = 116;
        m16.machineName = "Motor Machine";
        m16.type = "Assembly";
        f16.machine = m16;
        f16.getFactoryDetail();


        Factory f17 = new Factory();
        Machine m17 = new Machine();
        f17.factoryId = 17;
        f17.factoryName = "Philips";
        m17.machineId = 117;
        m17.machineName = "Lamp Maker";
        m17.type = "Production";
        f17.machine = m17;
        f17.getFactoryDetail();


        Factory f18 = new Factory();
        Machine m18 = new Machine();
        f18.factoryId = 18;
        f18.factoryName = "Volvo";
        m18.machineId = 118;
        m18.machineName = "Engine Maker";
        m18.type = "Assembly";
        f18.machine = m18;
        f18.getFactoryDetail();


        Factory f19 = new Factory();
        Machine m19 = new Machine();
        f19.factoryId = 19;
        f19.factoryName = "Ford";
        m19.machineId = 119;
        m19.machineName = "Body Press";
        m19.type = "Metal";
        f19.machine = m19;
        f19.getFactoryDetail();


        Factory f20 = new Factory();
        Machine m20 = new Machine();
        f20.factoryId = 20;
        f20.factoryName = "Tesla Plant";
        m20.machineId = 120;
        m20.machineName = "Auto Robot";
        m20.type = "Automation";
        f20.machine = m20;
        f20.getFactoryDetail();

    }
}