class CPU {
    int price;

    class Processor {
        int no_of_cores;
        String manufacturer;
    }

    static class RAM {
        int memory;
        String manufacturer; 
    }

    public static void main(String[] args) {
        CPU c1 = new CPU();
        c1.price = 1000;

        CPU.Processor p1 = c1.new Processor();
        p1.no_of_cores = 8;
        p1.manufacturer = "Intel";

        CPU.RAM r1 = new CPU.RAM();
        r1.memory = 16;
        r1.manufacturer = "CX";

        System.out.println("Computer Details\n----------------");
        System.out.println("CPU Price: " + c1.price + "\nNo. of cores: " + p1.no_of_cores + "\nProcessor Manufacturer: " + p1.manufacturer + "\nRAM Memory: " + r1.memory + "\nRAM Manufacturer: " + r1.manufacturer);
    }
}
