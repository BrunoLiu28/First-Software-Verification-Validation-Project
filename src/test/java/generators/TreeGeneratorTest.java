package generators;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.ArrayNTree;

@RunWith(JUnitQuickcheck.class)
public class TreeGeneratorTest {

	@Property(trials=15)
	public void testTreeShow(@InRange(minInt = 1, maxInt = 50)
								@From(TreeGenerator.class) ArrayNTree<Integer> tree) {
		System.out.println(tree);
	}
}
