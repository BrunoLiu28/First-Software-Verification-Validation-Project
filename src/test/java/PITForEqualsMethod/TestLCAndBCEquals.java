package PITForEqualsMethod;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestLCAndBCEquals { 
	
	/* Lines covered: 292
	 * Branch covered: B292
	 * */
	@Test
	public void testSameObject() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertTrue(tree.equals(tree));
		
	}
	
	
	/* Lines covered: 292, 293
	 * Branch covered: !B292, B293
	 * */
	@Test
	public void testDifferentInstances() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.equals(list));
		
	}
	
	/* Lines covered: 292, 293, 294, 300, 303, 304, 305, 307, 308, 311, 312
	 * Branch covered: !B292, !B293, B294, !B300, !B303(1), !B303(2),
     *   !B307(1), !B307(2), B307(1), B307(2) !B308, B311(1), B311(2)
	 * */
	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	/* Lines covered: 292, 293, 294, 300, 303, 304, 305, 307, 308, 309
	 * Branch covered: !B292, !B293, B294, !B300, !B303(1), !B303(2),
     *   !B307(1), !B307(2), B307(1), B307(2) !B308, B308
	 * */
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	/* Lines covered: 292, 293, 294, 300, 303, 304, 305, 307, 308, 311, 315
	 * Branch covered: !B292, !B293, B294, !B300, !B303(1), !B303(2),
     *   !B307(1), !B307(2), B307(1), B307(2) !B308, !B311(1), B311(2)
	 * */
	@Test
	public void test7() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
	/* Lines covered: 292, 293, 294, 300, 303, 304, 305, 307, 308, 311, 315
	 * Branch covered: !B292, !B293, B294, !B300, !B303(1), !B303(2),
     *   !B307(1), !B307(2), B307(1), B307(2) !B308, B311(1), !B311(2)
	 * */
	@Test
	public void test8() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 3);
		assertFalse(tree.equals(tree2));
	}
	
	
	/* Lines covered: 292, 293
	 * Branch covered: !B292, !B293
	 * */
	@Test
	public void test9() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		assertFalse(tree.equals((ArrayNTree<Integer>)null));
	}
}
