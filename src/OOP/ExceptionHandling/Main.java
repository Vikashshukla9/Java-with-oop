package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // to get a clear exception msg we can do something like thid with try and catch.
        try{
//            int c = 5 / 0;
//            divide(a,b);
//            throw  new Exception("bdjabdjsbdjasjdjadjbasjbj");
            String name = "vikash";
            if(name.equals("vikash")){
throw new MyException("my name is vikash shukla");}
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){  // or catch(Exception e)     if arithmatic exception is called it will call this
            System.out.println(e.getMessage());
        }catch (Exception e){  // if normal exception is thrown it will call this. if you add this thing above so below it nothing will execue because everything come under exception class.
            System.out.println("normal exception");
        }finally {
            System.out.println("it will always run");
        }
    }
     static int divide(int a, int b) throws  ArithmeticException{    // throws is saying that if you use this method it may throw an exception
        if (b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
