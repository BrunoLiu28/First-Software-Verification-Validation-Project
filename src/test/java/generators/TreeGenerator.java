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

	public TreeGenerator(Class<ArrayNTree<Integer>> type) {
		super(type);
	}
	
	private int min = 0;
	private int max = 100;
	private int listLength = 10;
	
	public void configure(InRange range) {
		min = range.minInt();
		max = range.maxInt();
		if(range.maxDouble() <= 1) {
			listLength = 10;
		} else {
			listLength = (int) range.maxDouble();
		}
		
	}
	
	@Override
	public ArrayNTree<Integer> generate(SourceOfRandomness random, GenerationStatus status) {
		List<Integer> randomInts = generateNonRepeatingRandomInts(min, max, listLength);
		System.out.println(randomInts);
		
		ArrayNTree<Integer> tree = new ArrayNTree<>(randomInts, random.nextInt(10)+1);
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
