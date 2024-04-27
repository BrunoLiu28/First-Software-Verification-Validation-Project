package generators;

import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.ArrayNTree;

@RunWith(JUnitQuickcheck.class)
public class TreeGeneratorTest {

	//MAXDOUBLE IS THE NUMBER OS ELEMENTS THAT THE LIST WILL HAVE
	@Property(trials=30)
	public void testTreeInvariant(@InRange(minInt = 1, maxInt = 10000, maxDouble = 30)
								@From(ListForTreeGenerator.class) List<Integer> list, 
								@InRange(min = "2", max = "10") int capacity) {
		
		ArrayNTree<Integer> tree =  new ArrayNTree<Integer>(list, capacity);
		Collections.shuffle(list);
		ArrayNTree<Integer> tree2 =  new ArrayNTree<Integer>(list, capacity);
		assertTrue(tree.equals(tree2));
	}
	
	@Property(trials=30)
	public void testRemoveAllElements(@InRange(minInt = 1, maxInt = 10000, maxDouble = 30)
								@From(ListForTreeGenerator.class) List<Integer> list, 
								@InRange(min = "2", max = "10") int capacity) {
		ArrayNTree<Integer> tree =  new ArrayNTree<Integer>(list, capacity);
		for (int i : list) {
			tree.delete(i);
		}
		assertTrue(tree.isEmpty());
	}
	
	@Property(trials=30)
	public void testInsertAndRemoveSameElement(@InRange(minInt = 1, maxInt = 10000, maxDouble = 30)
								@From(ListForTreeGenerator.class) List<Integer> list, 
								@InRange(min = "2", max = "10") int capacity) {
		
		ArrayNTree<Integer> tree =  new ArrayNTree<Integer>(list, capacity);
		ArrayNTree<Integer> tree2 = tree.clone();
		
		Random random = new Random();
        int randomNumber;
        do {
            randomNumber = random.nextInt();
        } while (list.contains(randomNumber));
		
        tree.insert(randomNumber);
        tree.delete(randomNumber);
        assertTrue(tree.equals(tree2));
	}
	
	@Property(trials=30)
	public void testInsertingAllElementsAgain(@InRange(minInt = 1, maxInt = 10000, maxDouble = 30)
								@From(ListForTreeGenerator.class) List<Integer> list, 
								@InRange(min = "2", max = "10") int capacity) {
		
		ArrayNTree<Integer> tree =  new ArrayNTree<Integer>(list, capacity);
		int counteLeaves = tree.countLeaves();
		int height = tree.height();
		int size = tree.size();
		String treeToString =tree.toString();
		
		
		for (int i : list) {
			tree.insert(i);
		}
		
		assertTrue(counteLeaves == tree.countLeaves() && height == tree.height()
				&& size == tree.size() && treeToString.equals(tree.toString()));
	}
	
	@Property(trials=30)
	public void testInsertingOneElementManyTimes(@InRange(minInt = 1, maxInt = 10000, maxDouble = 30)
								@From(ListForTreeGenerator.class) List<Integer> list, 
								@InRange(min = "2", max = "10") int capacity,
								@InRange(min = "5", max = "70") int insertTimes) {
		ArrayNTree<Integer> tree =  new ArrayNTree<Integer>(list, capacity);
		int counteLeaves = tree.countLeaves();
		int height = tree.height();
		int size = tree.size();
		String treeToString =tree.toString();
		
		Random random = new Random();
		int randomListIndex = random.nextInt(tree.size());
		for (int i = 0; i < insertTimes; i++) {
			tree.insert(list.get(randomListIndex));
		}
		
		assertTrue(counteLeaves == tree.countLeaves() && height == tree.height()
				&& size == tree.size() && treeToString.equals(tree.toString()));
	}
}
