/**
 * 二叉树
 *
 * @author Liu
 * @version 1.0.0.1
 * @date 2021/6/21 14:32
 */
public class BinaryTree {
    private ManNode root;

    public BinaryTree(ManNode node) {
        this.root = node;
    }

    private void preOrder() {
        if (this.root == null) {
            return;
        }
        this.root.preOrder();
    }

    private void midOrder() {
        if (this.root == null) {
            return;
        }
        this.root.midOrder();
    }

    private void backOrder() {
        if (this.root == null) {
            return;
        }
        this.root.backOrder();
    }

    private ManNode preSearch(int no) {
        if (this.root == null) {
            return null;
        }
        ManNode manNode = this.root.preSearch(no);
        return manNode;
    }

    private ManNode midSearch(int no) {
        if (this.root == null) {
            return null;
        }
        ManNode manNode = this.root.midSearch(no);
        return manNode;
    }

    private ManNode backSearch(int no) {
        if (this.root == null) {
            return null;
        }
        ManNode manNode = this.root.backSearch(no);
        return manNode;
    }

    /**
     * 删除节点
     * 叶子节点：直接删除
     * 非叶子节点：删除子树
     * @param no
     */
    public void deleteManNode(int no){
        if (this.root == null) {
            System.out.println("空树......");
            return;
        }

        if (this.root.getNo() == no) {
            root = null;
            return;
        }

       root.deleteManNode(no);
    }

    public static void main(String[] args) {
        ManNode root = new ManNode(0, "root");
        ManNode manNode1 = new ManNode(1, "left");
        ManNode manNode2 = new ManNode(2, "right");
        ManNode manNode3 = new ManNode(3, "left");
        ManNode manNode4 = new ManNode(4, "right");
        ManNode manNode5 = new ManNode(5, "left");
        ManNode manNode6 = new ManNode(6, "right");
        root.setLeft(manNode1);
        root.setRight(manNode2);
        manNode2.setLeft(manNode3);
        manNode2.setRight(manNode4);
        manNode4.setLeft(manNode5);
        manNode4.setRight(manNode6);
        BinaryTree binaryTree = new BinaryTree(root);
        System.out.println("===============preOrder=================");
        binaryTree.preOrder();

        System.out.println("===============midOrder=================");
        binaryTree.midOrder();

        System.out.println("===============backOrder=================");
        binaryTree.backOrder();

        int aimNo = 4;
        System.out.println("需要查找的目标数据:" + aimNo);
        System.out.println("==================================");
        System.out.println("preSearch: 0123456");
        ManNode preManNode = binaryTree.preSearch(aimNo);
        System.out.println(preManNode);
        System.out.println("==================================");
        System.out.println("midSearch:1032546");
        ManNode midManNode = binaryTree.midSearch(aimNo);
        System.out.println(midManNode);
        System.out.println("==================================");
        System.out.println("backSearch:1356420");
        ManNode backManNode = binaryTree.backSearch(aimNo);
        System.out.println(backManNode);
        System.out.println("==================================");
        System.out.println("================删除节点===========");
        binaryTree.deleteManNode(aimNo);
        binaryTree.preOrder();
        System.out.println("==================================");

    }
}
