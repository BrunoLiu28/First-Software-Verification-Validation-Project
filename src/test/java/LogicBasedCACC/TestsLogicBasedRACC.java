package LogicBasedCACC;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestsLogicBasedRACC {
	
//	EQUALS
//	P1: C1 || C2 && C3
//	C1: this == other
//	C2: other instanceof NTree
//	C3: equalTrees(this, ((NTree<T>) other))

	@Test
	public void test5() {
		List<Integer> list = Arrays.asList(1,3,5,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,3,5,2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	@Test
	public void test6() {
		List<Integer> list = Arrays.asList(1);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	@Test
	public void test8() {
		List<Integer> list = Arrays.asList(1,3,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);  
		List<Integer> list2 = Arrays.asList(1,3,4);
		assertFalse(tree.equals(list2));
	}
//	----------------------------------------------
//	EQUALTREES
	
	
//	P1: C1
//	C1: one == other

	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test9() {
		List<Integer> list = Arrays.asList(1,3,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);  
		assertTrue(tree.equals(tree));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test10() {
		List<Integer> list = Arrays.asList(1,3,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	
//	----------------------------------------------

//	P2: C2 && C3
//	C2: one != null
//	C3: other != null

	@Test
	public void test11() {
		List<String> list = Arrays.asList("a", "b", "c", "d", "f");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 4);
		List<String> list2 = Arrays.asList("a", "b", "c", "d", "z");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 1);
		assertFalse(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test12() {
		List<String> list = Arrays.asList("a", "b", "c", "d", "f");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 4); 
		ArrayNTree<Integer> tree2 = null;
		assertFalse(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test13() {
		ArrayNTree<Integer> tree = null;
		List<String> list = Arrays.asList("a", "b", "c", "d", "f");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list, 4);
		assertFalse(tree.equals(tree2));
	}

//	----------------------------------------------
	
//	P3: C4 && C5
//	C4: it1.hasNext()
//	C5: it2.hasNext()

	@Test
	public void test15() {
		List<String> list = Arrays.asList("a", "b");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a", "b");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertTrue(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test16() {
		List<String> list = Arrays.asList("a", "b");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList();  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test17() {
		List<String> list = Arrays.asList("a");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a", "b");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
//	----------------------------------------------
	
//	P4: C6
//	C6: !it1.next().equals(it2.next())

	@Test
	public void test19() {
		List<String> list = Arrays.asList("a");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("b");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test20() {
		List<String> list = Arrays.asList("a");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertTrue(tree.equals(tree2));
	}
	
	
//	----------------------------------------------
	
//	P5: C7 && C8
//	C7: !it1.hasNext()
//	C8: !it2.hasNext()
	
	@Test
	public void test21() {
		List<String> list = Arrays.asList("a", "b");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a", "b");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertTrue(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test22() {
		List<String> list = Arrays.asList("a", "b");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a", "b", "c");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}
	
	//NOT POSSIBLE INSIDE THE EQUALTREES BUT TESTING ANYWAY
	@Test
	public void test23() {
		List<String> list = Arrays.asList("a", "b", "c");  
		ArrayNTree<String> tree = new ArrayNTree<>(list, 2);
		List<String> list2 = Arrays.asList("a", "b");  
		ArrayNTree<String> tree2 = new ArrayNTree<>(list2, 2);
		assertFalse(tree.equals(tree2));
	}

}
