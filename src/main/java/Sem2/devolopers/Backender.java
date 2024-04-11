package Sem2.devolopers;

public class Backender extends Developer implements Backendable, Frontendable {
    @Override
    public void doBackendWork() {
        System.out.println("Good backend work!!!");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Can't do frontend work!");
    }

    @Override
    public void developGUI() {
        System.out.println("Frontender " + name + " is developing GUI");
    }


    public Backender(String name, int age) {
        super(name, age);
    }
}
