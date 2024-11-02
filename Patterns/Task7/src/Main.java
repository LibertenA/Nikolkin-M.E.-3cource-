public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        director.setBuilder(new GamerPc());
        PersonalComputer pc = director.buildPc();

        System.out.println(pc);
    }
}