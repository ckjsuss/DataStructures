/**
 * 人 节点
 *
 * @author Liu
 * @version 1.0.0.1
 * @date 2021/6/21 14:42
 */
public class ManNode {
    private int no;
    private String name;
    private ManNode left;
    private ManNode right;

    public ManNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManNode getLeft() {
        return left;
    }

    public void setLeft(ManNode left) {
        this.left = left;
    }

    public ManNode getRight() {
        return right;
    }

    public void setRight(ManNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "ManNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        System.out.println(this);
        if (this.getLeft() != null) {
            this.getLeft().preOrder();
        }
        if (this.getRight() != null) {
            this.getRight().preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void midOrder() {
        if (this.getLeft() != null) {
            this.getLeft().midOrder();
        }
        System.out.println(this);
        if (this.getRight() != null) {
            this.getRight().midOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void backOrder() {
        if (this.getLeft() != null) {
            this.getLeft().backOrder();
        }
        if (this.getRight() != null) {
            this.getRight().backOrder();
        }
        System.out.println(this);
    }

    /**
     * 前序查找
     *
     * @param no
     * @return
     */
    public ManNode preSearch(int no) {

        if (this.no == no) {
            return this;
        } else {
            System.out.println(this.no);
        }
        ManNode manNode = null;
        if (this.left != null) {
            manNode = this.left.preSearch(no);
        }
        if (manNode != null) {
            return manNode;
        }

        if (this.right != null) {
            manNode = this.right.preSearch(no);
        }

        return manNode;
    }


    /**
     * 中序查找
     *
     * @param no
     * @return
     */
    public ManNode midSearch(int no) {
        ManNode manNode = null;
        if (this.left != null) {
            manNode = this.left.midSearch(no);
        }
        if (manNode != null) {
            return manNode;
        }


        if (this.no == no) {
            return this;
        } else {
            System.out.println(this.no);
        }

        if (this.right != null) {
            manNode = this.right.midSearch(no);
        }
        return manNode;
    }

    /**
     * 后序查找
     *
     * @param no
     * @return
     */
    public ManNode backSearch(int no) {
        ManNode manNode = null;
        if (this.left != null) {
            manNode = this.left.backSearch(no);
        }
        if (manNode != null) {
            return manNode;
        }
        if (this.right != null) {
            manNode = this.right.backSearch(no);
        }
        if (manNode != null) {
            return manNode;
        }
        if (this.no == no) {
            return this;
        } else {
            System.out.println(this.no);
        }
        return null;
    }

    /**
     * 删除节点
     *
     * @param no
     */
    public void deleteManNode(int no) {
        if (this.left != null && this.getLeft().getNo() == no) {
            this.left = null;
        }

        if (this.right != null && this.right.getNo() == no) {
            this.right = null;
        }

        if (this.left != null) {
            this.left.deleteManNode(no);
        }

        if (this.right != null) {
            this.right.deleteManNode(no);
        }
    }
}
