package java.oopsConcept.innerClassDemo;

/**
 * @author rahul.jaiman
 * @version $Id: InnerClassDemo.java, v 0.1 2020-05-14 12:34 rahul.jaiman Exp $$
 */
public class InnerClassDemo {
    class SimpleInnerClass{
        public void methodOfInnerClass(){
            System.out.println("simple method of innner class");
        }

        // Note : you cannot create static method under simple innner class
        //if you uncommnent the code you will get compile time error
        /*public static void staticMethodOfStaticInnerClass(){
            System.out.println("from static method of static inner class");
        }*/
    }

    public static void main(String[] args) {
        SimpleInnerClass innerClass  = new InnerClassDemo().new SimpleInnerClass();
        innerClass.methodOfInnerClass();
    }
}