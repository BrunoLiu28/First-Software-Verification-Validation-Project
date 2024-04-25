package LogicBasedCACC;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestsLogicBasedCACC {

	/*	Tests that need to be passed according to the report:
	 * 		In equals:
	 * 			test 5 from predicate 1
	 * 			test 6 from predicate 1
	 * 			test 8 from predicate 1
	 * 		In equalTrees:
	 * 			test 2 from predicate 1
	 * 			test 1 from predicate 2
	 * 			test 1 from predicate 3
	 *  		test 2 from predicate 3
	 *  		test 3 from predicate 3
	 *  		test 1 from predicate 4
	 *		 	test 2 from predicate 4
	 *			test 1 from predicate 5
	 *			test 2 from predicate 5
	 *			test 3 from predicate 5
	 * */
	
	/*
	 * According to the report this test tests:
	 * 		In equals:
	 * 			test 5 from predicate 1
	 * 		In equalTrees:
	 * 			test 2 from predicate 1
	 * 			test 1 from predicate 2
	 * 			test 1 from predicate 3
	 *		 	test 2 from predicate 4
	 *			test 1 from predicate 5
	 * */
	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(1,2,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2,4);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	/*
	 * According to the report this test tests:
	 * 		In equals:
	 * 			test 6 from predicate 1
	 * 		In equalTrees:
	 * 			test 2 from predicate 1
	 * 			test 1 from predicate 2
	 * 			test 1 from predicate 3
	 * 			test 1 from predicate 4
	 *		 	test 2 from predicate 4
	 * */
	@Test
	public void test2() {
		List<Integer> list = Arrays.asList(1,2,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2,3);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	/*
	 * According to the report this test tests:
	 * 		In equals:
	 * 			test 8 from predicate 1
	 * */
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(2);
		assertFalse(tree.equals(list2));
	}
	
	/*
	 * According to the report this test tests:
	 * 		In equals:
	 * 			test 6 from predicate 1
	 * 		In equalTrees:
	 * 			test 2 from predicate 1
	 * 			test 1 from predicate 2
	 * 			test 1 from predicate 3
	 * 			test 2 from predicate 3
	 *		 	test 2 from predicate 4
	 *			test 3 from predicate 5
	 * */
	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1,2,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	/*
	 * According to the report this test tests:
	 * 		In equals:
	 * 			test 6 from predicate 1
	 * 		In equalTrees:
	 * 			test 2 from predicate 1
	 * 			test 1 from predicate 2
	 * 			test 1 from predicate 3
	 * 			test 3 from predicate 3
	 *		 	test 2 from predicate 4
	 *			test 2 from predicate 5
	 * */
	@Test
	public void test5() {
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2,4);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
}
