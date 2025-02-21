package Sem2.devolopers;

public class Frontender extends Developer implements Backendable, Frontendable {
    @Override
    public void doBackendWork() {
        System.out.println("Very bad backend work!!!");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good frontend work!!!");
    }

    @Override
    public void developGUI() {
        System.out.println("Frontender " + name + " is developing GUI very good");
    }

    Frontender(String name, int age) {
        super(name, age);
    }
}
