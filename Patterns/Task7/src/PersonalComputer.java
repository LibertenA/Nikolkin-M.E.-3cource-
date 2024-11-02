public class PersonalComputer {
    private String CPU;
    private String GPU;
    private String RAM;
    private String HD;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String toString() {
        return "PC{" +
                "CPU" + CPU +
                ", GPU=" + GPU +
                ", RAM=" + RAM +
                ", HD=" + HD + '\'' +
                '}';
    }
}
