public class Q3_TryCatchFinally {
    public static void main(String args[]){    
        try{  
            int data=25/0;    
            System.out.println(data);    
        } catch(ArithmeticException e){  
            System.out.println(e.getMessage());  
        } finally {  
            System.out.println("finally block"); 
        }    
    }
}
