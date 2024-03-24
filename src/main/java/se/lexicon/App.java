package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car1 = new Car("Volvo","V60");
        car1.setBrand("VOLVO");
        //car1.displayInfo();

        Car car2 = new Car("VOLVO","V40",2022);
        //car2.displayInfo();

        Car car3 = new Car();
        //car3.displayInfo();

        Person person1 = new Person("John Doe", "123455667", "123 Main st");
        Person person2 = new Person("Foo NKl", "454565676567", "343 Second st");

        car1.setOwner(person1);
        person1.registerCarOwnership(car1);
        person1.registerCarOwnership(car2);
        car1.displayInfo();
        car2.displayInfo();
        System.out.println("--------");
        person1.displayInfo();
        person2.displayInfo();



    }
}
