package homeworkSix;

public class Computer {
    private int priceComputer;
    private String modelComputer;
    private RAM ram;
    private HDD hdd;

    public Computer(int priceComputer, String nameComputer) {
        this.priceComputer = priceComputer;
        this.modelComputer = nameComputer;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int priceComputer, String nameComputer, RAM ram, HDD hdd) {
        this.priceComputer = priceComputer;
        this.modelComputer = nameComputer;
        this.ram = ram;
        this.hdd = hdd;
    }

    public static class RAM {
        private String modelRam;
        private int capacityRam;

        public RAM() {
        }

        public RAM(String modelRam, int capacityRam) {
            this.modelRam = modelRam;
            this.capacityRam = capacityRam;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "modelRam='" + modelRam + '\'' +
                    ", capacityRam=" + capacityRam +
                    '}';
        }
    }

    public static class HDD {
        private String modelHDD;
        private int capacityHDD;
        private boolean type;

        public HDD() {
        }

        public HDD(String modelHDD, int capacityHDD, boolean type) {
            this.modelHDD = modelHDD;
            this.capacityHDD = capacityHDD;
            this.type = type;
        }

        @Override
        public String toString() {
            return "HDD{" +
                    "modelHDD='" + modelHDD + '\'' +
                    ", capacityHDD=" + capacityHDD +
                    ", type=" + (type ? "internal" : "external") +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "priceComputer=" + priceComputer +
                ", modelComputer='" + modelComputer + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}