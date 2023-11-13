public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood() {
        System.out.println("Hunden logrer.");
    }
}
