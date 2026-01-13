public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Barking~ Woof!");
    }

    @Override
    public void eat() {
        System.out.println("This dog eats meat");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed + " (Dog)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        Dog dog = (Dog) o;
        return breed.equals(dog.breed);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + breed.hashCode();
        return result;
    }
}
