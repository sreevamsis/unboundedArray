import java.util.*;

class unboundedArrayTest {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String type = sc.nextLine();
    if (type.equals("I")) {
      unboundedArray<Integer> list = new unboundedArray<Integer>();
      String command = sc.nextLine();
      while (!command.equals("end")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while (st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("push")) {
            list.pushBack(Integer.parseInt(st.nextToken()));
          }
          if (command1.equals("pop")) {
            list.popBack();
          }
          if (command1.equals("size")) {
            list.size();
          }
          if (command1.equals("capacity")) {
            list.capacity();
          }
          if (command1.equals("print")) {
            list.print();
          }
        }
        command = sc.nextLine();
      }
    }
    if (type.equals("F")) {
      unboundedArray<Float> list = new unboundedArray<Float>();
      String command = sc.nextLine();
      while (!command.equals("end")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while (st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("push")) {
            list.pushBack(Float.valueOf(st.nextToken()));
          }
          if (command1.equals("pop")) {
            list.popBack();
          }
          if (command1.equals("size")) {
            list.size();
          }
          if (command1.equals("capacity")) {
            list.capacity();
          }
          if (command1.equals("print")) {
            list.print();
          }
        }
        command = sc.nextLine();
      }
    }
    if (type.equals("C")) {
      unboundedArray<Character> list = new unboundedArray<Character>();
      String command = sc.nextLine();
      while (!command.equals("end")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while (st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("push")) {
            list.pushBack(st.nextToken().charAt(0));
          }
          if (command1.equals("pop")) {
            list.popBack();
          }
          if (command1.equals("size")) {
            list.size();
          }
          if (command1.equals("capacity")) {
            list.capacity();
          }
          if (command1.equals("print")) {
            list.print();
          }
        }
        command = sc.nextLine();
      }
    }
    if (type.equals("S")) {
      unboundedArray<String> list = new unboundedArray<String>();
      String command = sc.nextLine();
      while (!command.equals("end")) {
        StringTokenizer st = new StringTokenizer(command, " ");
        while (st.hasMoreTokens()) {
          String command1 = st.nextToken();
          if (command1.equals("push")) {
            list.pushBack(st.nextToken());
          }
          if (command1.equals("pop")) {
            list.popBack();
          }
          if (command1.equals("size")) {
            list.size();
          }
          if (command1.equals("capacity")) {
            list.capacity();
          }
          if (command1.equals("print")) {
            list.print();
          }
        }
        command = sc.nextLine();
      }
    }
  }
}