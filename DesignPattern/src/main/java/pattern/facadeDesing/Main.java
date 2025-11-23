package pattern.facadeDesing;

class CPU{
    public void start(){
        System.out.println("cpu has stared");
    }
}

class CoolingFans{
    public void start(){
        System.out.println("cooling fans has stared");
    }
}

class Bios{
    CPU cpu = new CPU();
    CoolingFans coolingFans = new CoolingFans();
    public void start(){
        cpu.start();
        coolingFans.start();
        System.out.println("bios has stared");
    }
}

class Facade{
    Bios bios = new Bios();
    public void start(){
        bios.start();
        System.out.println("facade has stared");
    }
}

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.start();
    }
}

