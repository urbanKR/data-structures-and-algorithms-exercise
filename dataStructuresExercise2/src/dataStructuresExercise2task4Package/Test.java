package dataStructuresExercise2task4Package;

public class Test {

    public static void main(String[] args) {
        PrimeGenerator pG = new PrimeGenerator(20);
        while(pG.hasNext()) {
            System.out.println(pG.next());
        }

    }

}
