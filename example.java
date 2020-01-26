/**
 * Example
 */
public class Example {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setRollno(100);
    s1.setName("ram");
    s1.setAge(18);
    System.out.println("rollno:" + s1.getRollno());
    System.out.println("name:" + s1.showName());
    System.out.println("rollno:" + s1.showAge());
  }
}