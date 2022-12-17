public class Start {
    public static void main(String[] args) {
        Integer[] digit = {9, 2, 5, 13, 6, 10, 14, 7, 33, 44, 3};
        Node<Integer> node = new Node<>();
        node.createNode(node, 9);
        for (int i = 1; i < digit.length; i++) {
            node.insert(node, digit[i]);
        }
        node.inOrderTraversal(node);
        System.out.println();
        node.postOrderTraversal(node);
        System.out.println();
        node.directOrderTraversal(node);
        System.out.println();
        Node<Integer> nodeMin = node.getMin(node);
        assert nodeMin != null;
        System.out.println("Min : " + nodeMin.getValue());
        Node<Integer> nodeMax = node.getMax(node);
        assert nodeMax != null;
        System.out.println("Max : " + nodeMax.getValue());
        System.out.println(node.remove(node, 10));
        node.inOrderTraversal(node);
        System.out.println();
    }
}
