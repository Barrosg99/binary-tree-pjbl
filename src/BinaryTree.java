public class BinaryTree {
  private Node<Integer> root = new Node<>();
  private int size;
  private int rootHeight = 0;

  public BinaryTree() {
    this.size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  private void insert(Node<Integer> node, int data, int deep/* , int height */) {
    try {
      int currentData = node.getData();

      if (data < currentData)
        insert(node.getLeft(), data, deep + 1/* , height - 1 */);
      else
        insert(node.getRight(), data, deep + 1/* , height - 1 */);

      // node.setHeight(node.getHeight() + 1);
        
    } catch (Exception e) {
      node.setData(data);
      node.setDeep(deep);

      // if (deep > rootHeight)
      //   rootHeight = deep;

      // if (height <= 0) {
      //   node.setHeight(0);
      // }

      size++;
    }  
  }
  
  public void add(int data) {
    insert(root, data, 0/* , rootHeight */);
  }
}
