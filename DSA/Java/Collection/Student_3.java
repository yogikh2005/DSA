public class Student_3 {

    private int age;
    private String name;
    private int weight;

    public Student_3(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student_2{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}