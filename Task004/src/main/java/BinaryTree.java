public class BinaryTree {
    Node root;
    public boolean addNode(int value){
        if(root != null){
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        }else{
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }
    private boolean addNode(Node node, int value){
        if(node.value == value)
            return false;
        else {
            if(node.value > value){
                if(node.left != null){
                    boolean result = addNode(node.left, value);
                    node.left = rebalance(node.left);
                    return result;
                }else {
                    node.left = new Node();
                    node.left.color = Color.RED;
                    node.left.value = value;
                    return true;
                }
            }else {
                if(node.right != null){
                    boolean result = addNode(node.right, value);
                    node.right = rebalance(node.right);
                    return result;
                }else {
                    node.right = new Node();
                    node.right.color = Color.RED;
                    node.right.value = value;
                    return true;
                }

            }
        }
    }



    private void colorSwap(Node node){
        node.right.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node rightSwap(Node node){
        Node rightChild = node.right;
        Node betweenChild = rightChild.left;
        rightChild.left = node;
        node.right = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;

        return rightChild;
    }
    private Node leftSwap(Node node){
        Node leftChild = node.left;
        Node betweenChild = leftChild.right;
        leftChild.right = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private Node rebalance(Node node){
        Node result = node;
        boolean needRebalance;
        do{
            needRebalance = false;
            if(result.right != null && result.right.color == Color.RED &&
                    (result.left == null || result.left.color == Color.BLACK)){
                needRebalance = true;
                result = rightSwap(result);
            }
            if(result.left != null && result.left.color == Color.RED &&
                    (result.left.left != null && result.left.left.color == Color.RED)){
                needRebalance = true;
                result = leftSwap(result);
            }
            if(result.left != null && result.left.color == Color.RED &&
            result.right != null && result.right.color == Color.RED){
                needRebalance = true;
                colorSwap(result);
            }

        } while(needRebalance);
        return result;
    }
    class Node{
        int value;
        Color color;
        Node left;
        Node right;

        public String toString(){
            return "Node {" +
                    "value = " + value +
                    ", color = " + color +
                    "}";
        }

    }

    private enum Color{
        RED, BLACK;

    }

    public boolean find(int value){
        Node cur = root;
        while(cur != null){
            if(cur.value == value){
                return true;
            }
            if(cur.value < value){
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return false;
    }

    public void print(){
        print(root);
    }

    private void print(Node node){
        if(node == null)
            return;
        System.out.println(node.value +" "+ node.color);
        if(node.left != null ){
            System.out.println("L: " + node.left.value);
        }
        if(node.right != null ){
            System.out.println("R: " + node.right.value);
        }
        print(node.left);
        print(node.right);
    }
}
