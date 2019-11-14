
package HomeWork.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    
    Employee (int id2, String surname2, double salary2, int age2, String departament2){
    id = id2;
    salary = salary2;
    surname = surname2;
    age = age2;
    departament = departament2;
    }
    
   double doubleSalary (){
       return salary *=2;
       
   }
    
}

class EmployeeTest {
public static void main (String[] args){
    Employee emp1 = new Employee(1, "John", 1000.0, 25, "IT");
    Employee emp2 = new Employee(2, "Steve", 1500.52, 32, "IT");
    emp1.doubleSalary();
    emp2.doubleSalary();
    System.out.println(emp1.salary);
    System.out.println(emp2.salary);
    
    
            }
}