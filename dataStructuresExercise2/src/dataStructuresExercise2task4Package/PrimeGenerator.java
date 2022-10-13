package dataStructuresExercise2task4Package;

import java.util.Iterator;

public class PrimeGenerator implements Iterator<Integer> {

	private Iterator<Integer> Ngenerator;
	private FilterIterator primeFilter;
	private int primeNumber = 2;



	public PrimeGenerator(int N) {
		this.Ngenerator = new Ngenerator(N);
		this.primeFilter = new FilterIterator(Ngenerator, new PrimePredicate(Integer.MAX_VALUE));
		findNext();
	}

	private void findNext() {


		if(primeFilter.hasNext()) {
			primeNumber = primeFilter.next();
			this.primeFilter =new FilterIterator(this.primeFilter, new PrimePredicate(primeNumber));
			return;
		}

	}

	@Override
	public boolean hasNext() {
		return this.primeFilter.hasNext();

	}

	@Override
	public Integer next() {
		Integer temp = primeNumber;
		findNext();
		return temp;
	}

}
