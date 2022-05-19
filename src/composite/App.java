package composite;

public class App {
    public static void main(String[] args) {
        Tree appleTree = new Tree("Apple tree");

        Branch leftBranch = new Branch("left branch");
        Branch rightBranch = new Branch("right branch");

        Leaf leftLeaf = new Leaf("left leaf");
        Leaf rightLeaf = new Leaf("right leaf");
        leftBranch.add(rightLeaf);
        leftBranch.add(leftLeaf);
        rightBranch.add(rightLeaf);

        appleTree.add(leftBranch);
        appleTree.add(rightBranch);

        appleTree.swing();
    }
}
