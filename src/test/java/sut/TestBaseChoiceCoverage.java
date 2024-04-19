package sut;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestBaseChoiceCoverage {
	
	/*
	 * 
	 * (tree1, tree2, intersection)
	 * 
	 * tree1
	 * [empty]
	 * 
	 * tree2
	 * [empty, null]
	 * 
	 * 
	 * intersection
	 * [empty, full, partial] 
	 * 
	 * tests trees:
	 * (empty, empty)
	 * (empty, null)
	 * (empty, not empty)
	 * ----
	 * (empty, empty)
	 * (not empty, empty)
	 * (empty, null)
	 * (not empty, null)
	 * 
	 * tests intersection:
	 * (empty)
	 * (full)
	 * (partial)
	 * 
	 * */
	
	
	//(empty, empty)
	@Test
	public void testTree1EmptyTree2EmptyBCC() {
		ArrayNTree<Integer> tree = new ArrayNTree<>(4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(4);
		assertTrue(tree.equals(tree2));
	}
	
	//(empty, null)
	@Test
	public void testTree1EmptyTree2nullBCC() {
		ArrayNTree<Integer> tree = new ArrayNTree<>(4);
		ArrayNTree<Integer> tree2 = null;
		assertFalse(tree.equals(tree2));
	}
	
	//(empty, not empty)
	@Test
	public void testTree1EmptyTree2NotEmptyBCC() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list,4);
		assertFalse(tree.equals(tree2));
	}
	
	//(not empty, empty)
	@Test
	public void testTree1NotEmptyTree2EmptyBCC() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(4);
		assertFalse(tree.equals(tree2));
	}
	
	//(not empty, null)
	@Test
	public void testTree1NotEmptyTree2NullBCC() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,4);
		ArrayNTree<Integer> tree2 = null;
		assertFalse(tree.equals(tree2));
	}
	
	//(not empty, null)
	@Test
	public void testIntersectionfull() {
		List<Integer> list = Arrays.asList(30,60,90,20,25,75,80,88,98);
		List<Integer> list2 = Arrays.asList(30,60,90,20,25,75,80,88,98);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,3);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list,3);
		assertTrue(tree.equals(tree2));
	}
	
	//(not empty, null)
	@Test
	public void testIntersectionPartial() {
		List<Integer> list = Arrays.asList(30,60,90,20,25,75,80,88,98);
		List<Integer> list2 = Arrays.asList(30,60,90,20,25,75,10,70,98);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2,4);
		assertFalse(tree.equals(tree2));
	}
}
