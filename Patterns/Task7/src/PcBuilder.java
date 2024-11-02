public abstract class PcBuilder {
    PersonalComputer pc;
    public void createPC() {
        pc = new PersonalComputer();
    }

    abstract void setCpu();
    abstract void setGpu();
    abstract void setRam();
    abstract void setHd();

    PersonalComputer getPc() {
        return pc;
    }
}
