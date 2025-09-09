package DSA.Collections.ListInterface;

import java.util.*;

// public class ReverseArrayList {
//     public static <T> void reverseArrayList(List<T> list) {
//         int left = 0, right = list.size() - 1;
//         while (left < right) {
//             T temp = list.get(left);
//             list.set(left, list.get(right));
//             list.set(right, temp);
//             left++;
//             right--;
//         }
//     }

//     public static void main(String[] args) {
//         List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//         System.out.println("Original ArrayList: " + arrayList);
//         reverseArrayList(arrayList);
//         System.out.println("Reversed ArrayList: " + arrayList);
//     }
// }


// import java.util.*;

// public class ReverseLinkedList {
//     public static <T> void reverseLinkedList(LinkedList<T> list) {
//         Stack<T> stack = new Stack<>();
//         for (T elem : list) {
//             stack.push(elem);
//         }
//         list.clear();
//         while (!stack.isEmpty()) {
//             list.add(stack.pop());
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
//         System.out.println("Original LinkedList: " + linkedList);
//         reverseLinkedList(linkedList);
//         System.out.println("Reversed LinkedList: " + linkedList);
//     }
// }
