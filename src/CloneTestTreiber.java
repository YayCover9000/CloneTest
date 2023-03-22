public class CloneTestTreiber {
    public static void main(String[] args) {
        CloneTest Test = new CloneTest("Test", 1);
        CloneTest Test2 = (CloneTest) Test.clone();
        Test.changeMovie();
        Test.changeViewTime();
        System.out.println("Test 1: " + Test.getMovie() + " " + Test.getAufenthaltsdauer());

        System.out.println("Test 2: " + Test2.getMovie() + " " + Test2.getAufenthaltsdauer());
    }
}
