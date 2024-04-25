package LineBranchCoverage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestLCAndBCEquals { 
	
	@Test
	public void testSameObject() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertTrue(tree.equals(tree));
		
	}
	
	@Test
	public void testDifferentInstances() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.equals(list));
		
	}
	
//	@Test
//	public void test2() {
//		List<Integer> list = Arrays.asList(1);  
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		List<Integer> list2 = Arrays.asList(1);  
//		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
//		assertTrue(tree.equals(tree2));
//	}
	
	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	@Test
	public void test7() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
	@Test
	public void test8() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 3);
		assertFalse(tree.equals(tree2));
	}
	
	@Test
	public void test9() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		assertFalse(tree.equals((ArrayNTree<Integer>)null));
	}
}
