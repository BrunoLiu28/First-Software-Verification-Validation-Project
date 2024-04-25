package AllCouplingUseCoverage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestAllCouplingUseCoverage {
	
	/*
	 * This tests:
	 * variable position used in function delete that is last defined in node A
	 * variable children used in function compact that is last defined in node 12
	 * variable elem used in function proposePosition that is last defined in node 1
	 * */
	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		tree.delete(2);
	}
	
	/*
	 * This tests:
	 * variable position used in function delete that is last defined in node G
	 * variable elem used in function proposePosition that is last defined in node 1
	 * */
	@Test
	public void test2() {
		List<Integer> list = Arrays.asList(1,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		tree.delete(3);
	}
	
	/*
	 * This tests:
	 * variable position used in function delete that is last defined in node A
	 * variable position used in function delete that is last defined in node I
	 * variable children used in function compact that is last defined in node 8
	 * variable elem used in function proposePosition that is last defined in node 1
	 * */
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1,2,3,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		tree.delete(1);
	}

}
