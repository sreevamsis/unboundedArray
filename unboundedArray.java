@SuppressWarnings("unchecked")
class unboundedArray<E> {
  private E[] array;
  private E[] newarray;
  private int alpha = 4;
  private int beta = 2;
  private int size = 1;
  private int nofelements = 0;
  unboundedArray() {
    array = (E[])new Object[size];
  }
  public void pushBack(E element) {
    if (nofelements == size) {
      reallocate(beta * nofelements);
    }
    array[nofelements] = element;
    nofelements++;
  }
  public void popBack() {
    if (nofelements == 0) {
      System.out.println("Array is empty");
    }
    if (nofelements > 0) {
      array[nofelements - 1] = null;
      nofelements--;
    }
    if (((alpha * nofelements) <= size) && (nofelements > 0)) {
      reallocate(beta * nofelements);
    }
  }
  public void reallocate(int newsize) {
    newarray = (E[])new Object[newsize];
    for (int i = 0; i < nofelements; i++) {
      newarray[i] = array[i];
    }
    size = newsize;
    array = newarray;
  }
  public void size() {
    System.out.println(nofelements);
  }
  public void capacity() {
    System.out.println(size);
  }
  public void print() {
    if (nofelements == 0) {
      System.out.println("Array is empty");
    }
    for (int i = 0; i < nofelements; i++) {
      System.out.print(array[i]);
      if (i < nofelements - 1) {
          System.out.print(" ");
      }
    }
    System.out.println("");
  }
}