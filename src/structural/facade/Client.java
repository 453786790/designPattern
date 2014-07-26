package structural.facade;

// the components of a computer

class CPU {
    public void processData() {
        System.out.println("CPU is processing data.");
    }
}


class Memory {
    public void load() {
        System.out.println("Memory is loading data.");
    }
}


class HardDrive {
    public void readdata() {
        System.out.println("HardDrive is reading data.");
    }
}


/**
 * 将client对CPU，Memory，Hardrive的依赖转移到了Computer中，此时，client只需要和computer打交道，
 * 不需要知道具体细节实现
 */
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        cpu.processData();
        memory.load();
        hardDrive.readdata();
    }
}


public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
    }
}
