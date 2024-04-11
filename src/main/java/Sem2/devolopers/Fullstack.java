package Sem2.devolopers;

public class Fullstack extends Developer implements Backendable, Frontendable {
    @Override
    public void doBackendWork() {
        System.out.println("Good backend work!!!");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good frontend work!!!");
    }

    @Override
    public void developGUI() {
        System.out.println("Frontender " + name + " is developing GUI");
    }

    public Fullstack(String name, int age) {
        super(name, age);
    }
}
