
package HomeWork.Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String departament;
    
    Employee (int id2, String surname2, double salary2, int age2, String departament2){
    id = id2;
    salary = salary2;
    surname = surname2;
    age = age2;
    departament = departament2;
    }
    
   public Employee(int id2){ 
       id = id2;
   }
   Employee(String surname2){ 
       surname = surname2;
   }
    private Employee(double salary2){ 
       salary = salary2;
   }
    
    double doubleSalary (){
       return salary *=2;
       
   }
   public void getId(){
       System.out.println("ID = " + id);
}
     public void getSalary(){
       System.out.println("salary = " + salary);
}
     public void getSurname(){
       System.out.println("surneme = " + surname);
               }
}
class EmployeeTest {
public static void main (String[] args){
    Employee emp1 = new Employee(2);
    Employee emp2 = new Employee("Steve");
    //Employee emp3 = new Employee(100.5);
    
    emp1.getId();
    //emp3.getSalary();
    emp2.getSurname();
            }
}
