public class Employee{
    int age;
    String name;

    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void incrementAge(Employee employee){
        employee.age++;
    }

    public static void incrementMe(Integer a){
        a++;
    }
}