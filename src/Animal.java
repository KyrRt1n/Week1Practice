public class Animal {
    private String name;

    public void feed(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog thisDog = (Dog) animal;
            thisDog.bark();
        }
        else{
            System.out.println("*Happy eating cat sounds*");
        }
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating general animal food.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Animal animal = (Animal) obj;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
