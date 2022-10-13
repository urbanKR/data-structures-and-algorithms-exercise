package dataStructuresExercise2task4Package;

public class PrimePredicate implements Predicate<Integer> {
    private Integer n;

    public PrimePredicate(Integer n) {
        this.n = n;
    }

    @Override
    public boolean accept(Integer arg) {
        return arg % this.n != 0;

    }

}
