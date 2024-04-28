package PrimePathCoverage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestPrimePathCoverage {
	
//	[1,2]
	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertTrue(tree.equals(tree));
	}
	
//	[1,3,5,6,7,8,4]
	@Test
	public void test2() {
		List<Integer> list = Arrays.asList(1);
		List<Integer> list2 = Arrays.asList();
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
	
//	[1,3,4]
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.equals(null));
	}

//	[1,3,5,6,7,10,7,8,4]
	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1,4);
		List<Integer> list2 = Arrays.asList(1);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
//	[1,3,5,6,(7,10,7)*,8,9]
	@Test
	public void test5() {
		List<Integer> list = Arrays.asList(1,2,4,5,6);
		List<Integer> list2 = Arrays.asList(1,2,4,5,6);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	
//	[1,3,5,6,7,10,7,10,11]
	@Test
	public void test6() {
		List<Integer> list = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(1,3);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
}
