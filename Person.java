
/*In this example, the Person class overrides the 
    toString() method to return a string that includes 
    the object's name and age attributes. */

public class Person {
    private String name;
    private int age;

    // constructor and getters/setters omitted for brevity

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
