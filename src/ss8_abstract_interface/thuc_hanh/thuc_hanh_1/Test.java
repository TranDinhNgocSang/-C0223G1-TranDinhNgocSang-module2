package ss8_abstract_interface.thuc_hanh.thuc_hanh_1;

public class Test {
    public static void main(String[] args) {
        System.out.println("kiểm tra lớp Animal và các lớp con");
        Animal [] animals = new Animal[2];
        animals [0] = new Tiger();
        animals [1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }
        System.out.println("kiểm tra lớp Fruit");
        Fruit[] fruits= new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }


    }
}
