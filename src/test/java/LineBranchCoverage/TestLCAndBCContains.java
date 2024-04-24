package LineBranchCoverage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestLCAndBCContains {
	
	@Test
	public void testWithEmptyTree() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(1));
		
	}
	
	@Test
	public void testElementInRoot() {
		List<Integer> list = Arrays.asList(2,3);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertTrue(tree.contains(2));
		
	}
	
	@Test
	public void testIsLeafAndNotIn() {
		List<Integer> list = Arrays.asList(2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(3));
			
	}
	
	@Test
	public void testIsNotLeafAndNotIn() {
		List<Integer> list = Arrays.asList(2,3);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(1));
		
	}
	
	@Test
	public void testElementInLastPosition1DepthOnly() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		assertTrue(tree.contains(7));
		
	}
	
	@Test
	public void testElementNotInAndBiggerThanChilds() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		assertFalse(tree.contains(8));		
	}
	
	@Test
	public void testElementInAndIn2Depth() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		assertTrue(tree.contains(7));
		
	}
		
	@Test
	public void testToCoverProposePosition() {
		List<Integer> list = Arrays.asList(30,60,90,20,25,75,80,88,98,100);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		assertFalse(tree.contains(40));
		
	}
}
