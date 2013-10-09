import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class flagSolverTest extends flagSolver {

    @Test
    public void test() throws Exception {
	
	int test1[] = {1, 2, 3, 1, 2, 3, 1, 2, 3};
	int test1A[] = {1, 1, 1, 2, 2, 2, 3, 3, 3};
	
	assertArrayEquals("Testing a regular scrambled flag",
		flagSolveAlternate(test1), test1A);
	
	
	int test2[] = {1, 1, 2, 2, 3, 3};
	int test2A[] = {1, 1, 2, 2, 3, 3};
	
	assertArrayEquals("Testing a unscrambled flag",
		flagSolveAlternate(test2), test2A);
	
	
	int test3[] = {1, 2, 3, 1, 2, 1};
	int test3A[] = {1, 1, 1, 2, 2, 3};
	
	assertArrayEquals("Testing an array with irregular parts",
		flagSolveAlternate(test3), test3A);
	
		
	int test4[] = {};
	int test4A[] = {};
	
	assertArrayEquals("Testing an array with no elements",
		flagSolveAlternate(test4), test4A);
	
	
	int test5[] = {3, 3, 2, 2, 1, 1};
	int test5A[] = {1, 1, 2, 2, 3, 3};
	
	assertArrayEquals("Testing an array in reverse order",
		flagSolveAlternate(test5), test5A);
	
	
	int test6[] = {1, 2, 3, 1, 2, 3};
	int test6A[] = {1, 1, 2, 2, 3, 3};
	
	assertArrayEquals("Testing an array incremented sequentially twice",
		flagSolveAlternate(test6), test6A);

    }

}
