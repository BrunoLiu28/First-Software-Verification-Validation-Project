package PITForEqualsMethod;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestBaseChoiceCoverage {
	
	/* tree1
	 * [empty, not empty]
	 * 
	 * tree2
	 * [empty, not empty]
	 * 
	 * tree2
	 * [null, not null]
	 * 
	 * intersection
	 * [empty, full, partial] 
	 * 
	 * (tree1, tree1, tree2, intersection)
	 * 
	 * Base Choice
	 * (!empty, !empty, !null, empty)
	 * 
	 * Other Choices
	 * (empty, !empty, !null, empty)
	 * (!empty, empty, !null, empty)
	 * (!empty, !empty, null, empty)
	 * (!empty, !empty, !null, full)
	 * (!empty, !empty, !null, partial)
	 * */
	
	//(!empty, !empty, !null, empty)
	@Test
	public void testBaseChoice() {
		List<Integer> list = Arrays.asList(1); 
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,4);
		List<Integer> list2 = Arrays.asList(4); 
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2,4);
		assertFalse(tree.equals(tree2));
	}
	
	//(empty, !empty, !null, empty)
	@Test
	public void testTree1EmptyBCC() {
		ArrayNTree<Integer> tree = new ArrayNTree<>(4);
		List<Integer> list2 = Arrays.asList(2); 
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2,4);
		assertThrows(NullPointerException.class, () -> assertTrue(tree.equals(tree2)));
	}
	
	
	//(!empty, empty, !null, empty)
	@Test
	public void testTree2EmptyBCC() {
		List<Integer> list = Arrays.asList(9); 
		ArrayNTree<Integer> tree = new ArrayNTree<>(list,4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(4);
		assertFalse(tree.equals(tree2));
	}
	
	//(!empty, !empty, null, empty)
	@Test
	public void testTree2NullBCC() {
		ArrayNTree<Integer> tree = new ArrayNTree<>(4);
		ArrayNTree<Integer> tree2 = null;
		assertFalse(tree.equals(tree2));
	}
	
	//(!empty, !empty, !null, full)
	@Test
	public void testIntersectionFullBCC() {
		List<Integer> list = Arrays.asList(1,3,5,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,3,5,2);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}

	//(!empty, !empty, !null, partial)
	@Test
	public void testIntersectionPartialBCC() {
		List<Integer> list = Arrays.asList(1,3,5,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		List<Integer> list2 = Arrays.asList(1,3,5,4);  
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertFalse(tree.equals(tree2));
	}
	
}
