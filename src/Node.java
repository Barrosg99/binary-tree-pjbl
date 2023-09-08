public class Node<T> {
  private T data;
  private Node<T> left;
  private Node<T> right;
  private int deep;
  private int height;  

  public Node() {
    this.left = null;
    this.right = null;
  }

  public Node(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getLeft() {
    if (left == null)
      left = new Node<>();

    return left;
  }

  public Node<T> getRight() {
    if (right == null)
      right = new Node<>();

    return right;
  }

  public int getDeep() {
    return deep;
  }  

  public void setDeep(int deep) {
    this.deep = deep;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  
}
