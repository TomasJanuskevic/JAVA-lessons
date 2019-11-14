
package HomeWork.Lesson6;

public class Sum {
    int Summa;
    
    int Sum (){
        int result = 0;
        System.out.println("summa = " + result);
        return result;
    }
    
    int Sum (int a1){
    int result1 = a1;
    System.out.println("summa = " + result1);
    return result1;    
    }
    
    int Sum (int a2, int b2){
    int result2 = a2+b2;
    System.out.println("summa = " + result2);
    return result2;  
    }
    
    int Sum (int a3, int b3, int c3){
    int result3 = a3+b3+c3;
    System.out.println("summa = " + result3);
    return result3;   
    }
     
}

class sumTest{
    public static void main(String[] args){
    
    Sum summa = new Sum();
    summa.Sum();
    summa.Sum(6);
    summa.Sum(5,4);
    summa.Sum(6,4,7);
    
    }


}
