public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy",1,"Brown");

        Cat myCat = new Cat("Batman", 7,"Black");

        System.out.println(myCat);
        System.out.println(myDog);

    }
}

abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void speak();
}

class Dog extends Animal{
    private String furColor;

    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "\nDog name: " + this.getName() + "\nDog age: " + this.getAge() + "\nDog fur color: " + this.getFurColor();
    }
}

class Cat extends Animal{
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "\nCat name: " + this.getName() + "\nCat age: " + this.getAge() + "\nCat breed: " + this.getBreed();
    }
}