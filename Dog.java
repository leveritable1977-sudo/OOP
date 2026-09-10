public class Dog {
     String name;
     int age;
    String breed;
    double weight;
    public Dog(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    public void visaInfo() {
        System.out.println("Namn: " + name);
        System.out.println("Ålder: " + age);
        System.out.println("Ras: " + breed);
        System.out.println("Vikt: " + weight);
    }
}