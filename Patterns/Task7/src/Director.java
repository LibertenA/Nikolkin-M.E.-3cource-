public class Director {
    PcBuilder builder;

    public void setBuilder(PcBuilder builder) {
        this.builder = builder;
    }

    PersonalComputer buildPc() {
        builder.createPC();
        builder.setCpu();
        builder.setGpu();
        builder.setHd();
        builder.setRam();

        PersonalComputer pc = builder.getPc();

        return pc;
    }

}
