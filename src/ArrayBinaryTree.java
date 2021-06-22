/**
 * 顺序存储二叉树
 *
 * @author Liu
 * @version 1.0.0.1
 * @date 2021/6/21 20:13
 */
public class ArrayBinaryTree {
    private int[] arr;

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }

    /**
     * 前序遍历
     *
     * @param index 数组的下标
     */
    public void preOrder(int index) {
        if (this.arr == null && arr.length == 0) {
            System.out.println("空数组,不遍历");
            return;
        }
        System.out.println(arr[index]);

        if (2 * index + 1 < this.arr.length) {
            preOrder(2 * index + 1);
        }

        if (2 * index + 2 < this.arr.length) {
            preOrder(2 * index + 2);
        }
    }

    /**
     * 中序遍历
     *
     * @param index
     */
    public void midOrder(int index) {
        if (this.arr == null && arr.length == 0) {
            System.out.println("空数组,不遍历");
            return;
        }

        if (2 * index + 1 < this.arr.length) {
            midOrder(2 * index + 1);
        }

        System.out.println(arr[index]);

        if (2 * index + 2 < this.arr.length) {
            midOrder(2 * index + 2);
        }
    }

    /**
     * 后续遍历
     *
     * @param index
     */
    public void backOrder(int index) {
        if (this.arr == null && arr.length == 0) {
            System.out.println("空数组,不遍历");
            return;
        }

        if (2 * index + 1 < this.arr.length) {
            backOrder(2 * index + 1);
        }


        if (2 * index + 2 < this.arr.length) {
            backOrder(2 * index + 2);
        }

        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
        arrayBinaryTree.preOrder(0);
        System.out.println("====================");
        arrayBinaryTree.midOrder(0);
        System.out.println("====================");
        arrayBinaryTree.backOrder(0);

    }
}
