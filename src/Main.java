public class Main {
    public static void main(String[] args) {
        Cat Vlad = new Cat("Vlad","Ovcharka");
        System.out.println(Vlad);

        Dog Oleg1 = new Dog("Oleg", "Sopsan");
        System.out.println(Oleg1);

        Dog Oleg2 = new Dog("Oleg", "Sopsan");
        System.out.println(Oleg2);

        Dog Oleg3 = new Dog("Oleg", "Sopsancheg");
        System.out.println(Oleg3);

        System.out.println();

        System.out.println("Equal name and breed equality: " + Oleg1.equals(Oleg2));
        System.out.println("Diff breed equality: " + Oleg1.equals(Oleg3));

        System.out.println();

        Animal newDog = new Dog("George","York");
        feed(newDog);
    }

    public static void feed(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog thisDog = (Dog) animal;
            thisDog.bark();
        }
        else{
            System.out.println("*Happy eating cat sounds*");
        }
    }
}