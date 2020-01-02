package HomeWork.HomeWork28;

public class HomeWork28 {

    public static void main(String[] args) {
        tiger t = new tiger();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class tiger {

    public void eat(String food) {
        if (!food.equals("meat")) {
            throw new NotMeatException("tiger dont eat " + food);
        }
        System.out.println("Tiger eat " + food);
    }

    public void drink(String drink) throws NotWaterException {
        if (!drink.equals("water")) {
            throw new NotWaterException("tiger dont drink " + drink);
        }
        System.out.println("Tiger drink " + drink);
    }

}

class NotMeatException extends RuntimeException {

    NotMeatException(String s) {
        super(s);
    }
}

class NotWaterException extends Exception {

    NotWaterException(String s) {
        super(s);
    }
}
