package testings;

//These are static methods , thats why it has to be import static 
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

//This is the new hasItem package , do not use the one inside jUnit package
import static org.hamcrest.CoreMatchers.hasItem; //for single item check
import static org.hamcrest.CoreMatchers.hasItems; //for multiple item check    

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//We have to import the source file from the folder structure 
import com.example.Test_Utils;

//[Note : ] Even if a single assert method fails , then the entire test_case is considerd to have been failed 
//every single assert method has to be true in order to consider that the entire test case has passed. 

public class Test_Class {
    
    Test_Utils utils;

    //only method with @Test will get tested and ones without the annotation will not get tested 

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
        //Scanner can also be used to pass the values and checked. 
        int result = utils.add(12 ,123);

        // passes if the given value does not match the output value 
        assertNotEquals(22 , result);
    }

    @Test
    public void assertChecks(){
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

    @Test
    public void checkSortedList(){
        List<Integer> input = Arrays.asList(5 , 4, 2 ,346 , 43);
        List<Integer> expected = Arrays.asList(2 ,4 ,5 ,43 , 346);
        List<Integer> actual = utils.sorterd(input);
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualsArray(){
        int arr1[] = {1 ,2 ,3 ,4, 6};
        int arr2[] = {1 ,2 ,3 , 356 , 3};

        //This checks the arrays for each of the elements are same in both the arrays 

        //This test will fail as 4 != 356 
        assertArrayEquals(arr1, arr2);
    }


    @Test
    public void CheckExceptions(){
        //This class throws an exception using assertThrows 
        //It takes an arugement of an exception class and the method inside a lambda expression 

        //If no such excpetion mentioned is thrown , then the test case is considered to be failed.
        //Unless exception is thrown , the test will always become negative  
        
        assertThrows(ArithmeticException.class, () -> utils.divide(12, 0));
    }

    @Test
    public void checkNUll(){
        //passes if it is null
        assertNull(utils.returnString("Hi"));
    }

    @Test
    public void checkNotNull(){
        //passess if not null 

        assertNotNull(utils.returnString("Hello"));
    }

    @Test
    public void checkSame(){
        List<Integer> input = Arrays.asList(2 , 5, 6, 7, 8 , 1);
        List<Integer> output = new ArrayList(utils.checkSameListAfterModifying(input));

        //Here it will fail as the Lists are different so the references of each of the elements inside the 
        //List is different , even if the element itself is same value wise. 
        assertSame(output, input);

    }

    @Test
    public void checkNotSame(){
        List<Integer> input = Arrays.asList(2 , 5, 6, 7, 8 , 1);
        List<Integer> output = new ArrayList(utils.checkSameListAfterModifying(input));

        //This will pass as they are not same , explained above 
        assertNotSame(output, input);
    }

    @Test
    public void checkMatcherInList(){
        List<String> input = Arrays.asList("Tom" , "Jerry" , "Spike");
        List<String> output = utils.checkMatchers(input);

        //checkMatchers returns toUpperCase of the elements , so this would fail. 
        assertThat(output, hasItem("Tom"));
    }

    @After
    public void clearResource(){
        System.out.println("Resource Cleared");
        //This runs after every testcase and clears the resources
        this.utils = null;

        //Making the object null , makes the garbage collector clear the utils.
    }
}
