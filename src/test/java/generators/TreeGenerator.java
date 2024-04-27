package generators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.ArrayNTree;


@RunWith(JUnitQuickcheck.class)
public class TreeGenerator extends Generator<ArrayNTree<Integer>>{

	protected TreeGenerator(Class<ArrayNTree<Integer>> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	private int min = 0;
	private int max = 100;
	private int listLenght = 10;
	
	public void configure(InRange range) {
		min = range.minInt();
		max = range.maxInt();
	}
	
	@Override
	public ArrayNTree<Integer> generate(SourceOfRandomness random, GenerationStatus status) {
		List<Integer> randomInts = generateNonRepeatingRandomInts(min, max, listLenght);
		System.out.println(randomInts);
		ArrayNTree<Integer> tree = new ArrayNTree<>(randomInts, 4);
		return tree;
	}


	private static List<Integer> generateNonRepeatingRandomInts(int min, int max, int listLenght) {
	    if (listLenght > (max - min + 1)) {
	        throw new IllegalArgumentException("Count cannot be greater than the range of integers.");
	    }
	
	    List<Integer> numbers = new ArrayList<>();
	    for (int i = min; i <= max; i++) {
	        numbers.add(i);
	    }
	
	    Collections.shuffle(numbers, new Random());
	
	    return numbers.subList(0, listLenght);
	}
}
