package testings;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//We have to import the source file from the folder structure 
import com.example.Test_Utils;

public class Test_Class {
    
    Test_Utils utils;


    //During running of the test case , the before annotation makes this block run at the beginning of the test case. 
    //The before and after annotated methods will run before and after each test block with @test annotation 
    @Before
    public void setup(){
        //This runs before every single testcase and creates the object of the source class inside src.main
        //This is required to access the methods inside the source 
        utils = new Test_Utils();
    }

    @Test
    public void assertEqualsAddition(){
        //In order to not always manually create the object , we create it in the before annotated method setup , so the line below
        //need not be written everytime 
        //Test_Utils utils = new Test_Utils();
        int result = utils.add(10,5);

        //checks whether the given value matches the output value
        assertEquals(15 , result);
    }
    
    @Test 
    //These are custom testcase methods and the assertNotEquals are jUnit static methods that are imported 
    //in order to pass the values to check with expected and actual. 
    public void assertNotEqualsAddition(){
        int result = utils.add(12 ,123);

        // passes if the given value does not match the output value 
        assertNotEquals(22 , result);
    }

    @Test
    public void assertCheck(){
        List<Integer> data = Arrays.asList(1 ,2 ,3 ,4);
        List list = utils.returnList(data);
        for(Object o : list){
            //This passes the test case. As it is an Integer List  
            assertTrue(o instanceof Integer);
            Integer i = (Integer)o;
            //This test case fails as not every element in the List is divisible by 2 
            //assertTrue(i%2==0);
        }
    }

    @After
    public void clearResource(){
        System.out.println("Resource Cleared");
        //This runs after every testcase and clears the resources
        this.utils = null;

        //Making the object null , makes the garbage collector clear the utils.
    }
}
