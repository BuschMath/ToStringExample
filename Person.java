
/*In this example, the Person class overrides the 
    toString() method to return a string that includes 
    the object's name and age attributes. */

public class Person {
    private String name;
    private int age;

    // constructor and getters/setters omitted for brevity
    public void SetName(String name_) {name = name_;}

    public void SetAge(int age_) {age = age_;}

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
