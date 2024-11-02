public class GamerPc extends  PcBuilder{

    @Override
    void setCpu() {
        pc.setCPU("Ryzen 7");
    }

    @Override
    void setGpu() {
        pc.setGPU("GeForce 4060");
    }

    @Override
    void setRam() {
        pc.setRAM("Patriot 4Gb");
    }

    @Override
    void setHd() {
        pc.setHD("Kingston 1000 Gb");
    }
}
