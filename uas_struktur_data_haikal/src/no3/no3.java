package no3;

public class no3 {
    public static void getNo3() {

        Tree tree = new Tree();

        System.out.println("Memasukan value: 10, 11, 16, 27, 32, 28, 27, 23, 31");
        tree.insert(10);
        tree.insert(11);
        tree.insert(16);
        tree.insert(27);
        tree.insert(32);
        tree.insert(28);
        tree.insert(27);
        tree.insert(23);
        tree.insert(31);




        // get size
        System.out.println("\nSize: " + tree.size());


        // traversal in order
        System.out.println("\nMelakukan Traversal in order ");
        tree.traverseInOrder();

        // get max
        System.out.println("\nMax: " + tree.max());

    }
}
