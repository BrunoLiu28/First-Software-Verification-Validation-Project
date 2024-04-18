package sut;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestAllCouplingUseCoverage {
	
////	  Delete: [1,2]
//	@Test
//	public void testDeleteEmptyTree() {
//		List<Integer> list = Arrays.asList();
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		tree.delete(2);
////		assertTrue(tree.equals(tree));
//	}
//	
////	  Delete: [1,3,4]
//	@Test
//	public void testDeleteNotInAndLeaf() {
//		List<Integer> list = Arrays.asList(1);
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		tree.delete(2);
//
//	}
//	
//	  Delete: [1,3,5,7,9]
//	  ProposePosition: [A,B,C,F,G,D]
//	@Test
//	public void testDeleteNotInAndLeaf2() {
//		List<Integer> list = Arrays.asList(2,5);
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		tree.delete(3);
//
//	}
//	
//	  Delete: [1,3,5,7,10,12,13]
//	  ProposePosition: [A,(B,C,F,H,I,J,B)+,D]
//	[A,B,C,F,H,J,B,D] IMPOSSIVEL POR ISSO ADAPTADO FICA
	//[A,B,C,F,H,I,J,B,D]
//	@Test
//	public void testDeleteNotInAndLeaf3() {
//		List<Integer> list = Arrays.asList(20,30,40);
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		tree.delete(40);
//
//	}
	
//	  Delete: [1,3,5,6,8,13]
//	@Test
//	public void testDeleteNotInAndLeaf4() {
//		List<Integer> list = Arrays.asList(20,30);
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 1);
//		tree.delete(20);
//
//	}
	
	


//	[A,B,C,F,H,J,B,D] IMPOSSIVEL POR ISSO ADAPTADO FICA
//	[A,B,C,F,H,I,J,B,D]
//	@Test
//	public void testDeleteNotInAndLeaf3() {
//		List<Integer> list = Arrays.asList(20,30);
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		tree.delete(25);
//
//	}
	
//	COMPACT
//	[a,b,c]
//	[a,b,d,f,g,i]
//	[a,b,d,e,b,c]
	

}
