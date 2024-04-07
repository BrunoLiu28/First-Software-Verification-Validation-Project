package sut;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLCAndBCContains {
	
	//Line Coverage: 123, 124
	//Branch Coverage: B123
	@Test
	public void testWithEmptyTree() {
		List<Integer> list = Arrays.asList();  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(1));
		
	}
	
	//Line Coverage: 123, 126, 127,
	//Branch Coverage: !B123, B126
	@Test
	public void testElementInRoot() {
		List<Integer> list = Arrays.asList(2,3);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertTrue(tree.contains(2));
		
	}
	
	//Line Coverage: 123, 126, 131, 132
	//Branch Coverage: !B123, !B126, B131(1)
	@Test
	public void testIsLeafAndNotIn() {
		List<Integer> list = Arrays.asList(2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(3));
			
	}
	
	//Line Coverage: 123, 126, 131, 132
	//Branch Coverage: !B123, !B126, !B131(1), B131(2)
	@Test
	public void testIsNotLeafAndNotIn() {
		List<Integer> list = Arrays.asList(2,3);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		assertFalse(tree.contains(1));
		
	}
	
	//Line Coverage: 123, 126, 131, 134, 136, 139
	//Branch Coverage: !B123, !B126, !B131(1), !B131(2), !B136, B139(1)
	@Test
	public void testElementInLastPosition1DepthOnly() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		assertTrue(tree.contains(7));
		
	}
	
	//Line Coverage: 123, 126, 131, 132, 134, 136, 137, 139
	//Branch Coverage: !B123, !B126, !B131(1), !B131(2), B136, !B139(1), !B139(2), B131(1) 
	@Test
	public void testElementNotInAndBiggerThanChilds() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		assertFalse(tree.contains(8));		
	}
	
	//Line Coverage: 123, 126, 131, 134, 136, 137, 139
	//Branch Coverage:!B123, !B126, !B131(1), !B131(2), B136, !B139(1), B139(2), B139(1)
	@Test
	public void testElementInAndIn2Depth() {
		List<Integer> list = Arrays.asList(2,3,5,6,7);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		assertTrue(tree.contains(7));
		
	}
}
