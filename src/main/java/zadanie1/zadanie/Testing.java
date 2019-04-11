package zadanie1.zadanie;

import java.util.ArrayList;
import org.junit.*;
import junit.framework.Assert;

public class Testing {
	App app = new App();
    ArrayList<Integer> input;
    ArrayList<Integer> output;
	
    
	@Before
    public void beforeTest1() {
		System.out.println("----------rozpoczecie testu----------");
    }
	@After
	public void afterTest() {
		System.out.println("----------zakoczenie testu----------");
    }
	@Test
	public void evenNumbersTest()    {
		System.out.println("Test: parzystosc liczb");
        input = new ArrayList<Integer>();
        input.add(66);
        input.add(2);
        input.add(4);
        input.add(-1);
        input.add(121);
        input.add(5);
        System.out.println("liczby w tablicy wejściowej: "+input);
        output = new ArrayList<Integer>();
        output.add(66);
        output.add(2);
        output.add(4);
        System.out.println("liczby ktore powinny sie znalezc w tablicy wyjsciowej: "+output);
		
        
		System.out.println("liczby zwrocone przez metodę: "+app.arrayFiltering(input));
	    Assert.assertEquals(app.arrayFiltering(input),output);  
	}

	
	@Test
	public void emptyArrayTest() {
		System.out.println("---------Test: pusta tablica---------");
        input = new ArrayList<Integer>();
        System.out.println("liczby w tablicy wejściowej: "+input);
        output = new ArrayList<Integer>();
        System.out.println("liczby ktore powinny sie znalezc w tablicy wyjsciowej: "+output);
        
        
		System.out.println("liczby zwrocone przez metodę: "+app.arrayFiltering(input));
	    Assert.assertEquals(app.arrayFiltering(input),output);  
	}

}
