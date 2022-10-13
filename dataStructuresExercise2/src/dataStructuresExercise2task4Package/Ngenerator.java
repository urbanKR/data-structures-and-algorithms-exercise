package dataStructuresExercise2task4Package;

import java.util.Iterator;

public class Ngenerator implements Iterator<Integer>{
	private int N;
	private int ElemNext = 2;
	public Ngenerator(int N) {
		this.N = N;
	}

	@Override
	public boolean hasNext() {
		return ElemNext < N;
	}
	@Override
	public Integer next() {
		Integer value = ElemNext;
		ElemNext++;
		return value;
	}
}

