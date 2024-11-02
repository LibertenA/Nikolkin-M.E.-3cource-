public class OfficePc extends  PcBuilder{
    @Override
    void setCpu() {
        pc.setCPU("Pentium");
    }

    @Override
    void setGpu() {
        pc.setGPU("none");
    }

    @Override
    void setRam() {
        pc.setRAM("Patriot 4Gb");
    }

    @Override
    void setHd() {
        pc.setHD("Kingston 256Gb");
    }
}
