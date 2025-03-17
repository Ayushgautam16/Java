import java.util.ArrayList;
import java.util.List;
public class collectionFramework {
    public static void main(String[] args) {

// List <String> list = new ArrayList();

// list.add("Apple");

// list.add("Banana");

// list.add("Cherry");

// System.out.println("Original List: " + list);

// List <Integer> list2 = new ArrayList();
// list2.add(22);
// list2.add(34);
// list2.add(2);

// System.out.println("Original List: " + list2);

// list2.add(34);

// System.out.println("List after adding duplicate element: " + list2);
// list2.add(23);

// System.out.println("List after adding another element: " + list2);

// System.out.println("Index of '23' in the list: " + list2.indexOf(23));

// System.out.println("Index of '34' in the list: " + list2.indexOf(34));

// System.out.println("List after removing '22' from the list: " + list2.remove(2));


// List <Integer> list3 = new ArrayList();
// list3.add(93);
// list2.add(333);

// list2.addAll(list3);

// System.out.println("List after merging list3 with list2: " + list2); 


// // outputs

// // Original List: [Apple, Banana, Cherry]
// // Original List: [22, 34, 2]
// // List after adding duplicate element: [22, 34, 2, 34]    
// // List after adding another element: [22, 34, 2, 34, 23]  
// // Index of '23' in the list: 4
// // Index of '34' in the list: 1
// // List after removing '22' from the list: 2
// // List after merging list3 with list2: [22, 34, 34, 23, 333, 93]



// List <Integer> list4 = new ArrayList();

// list4.add(22);

// list4.add(34);

// list4.retainAll(list2);

// System.out.println("List after retaining common elements with list2: " + list4);

// List after retaining common elements with list2: [] 
// List after retaining common elements with list2: [22, 34]

// basically retain method gives the common value
 // from the current list and removes the rest.

//  get function

// System.out.println("Get value at index 2: " + list2.get(2));
// Get value at index 2: 2




// set function 
// to update the value at the index 

// list2.set(2, 45);
// System.out.println(list2);
// [22, 34, 45]

List<Integer> list2 = new ArrayList<>();
list2.add(3);
list2.add(2);
list2.add(23);
list2.add(2333);
list2.add(233);
list2.add(222);
list2.add(234);
list2.add(224);

System.out.println(list2);

// for(int i = 0; i < list2.size(); i++){
//     System.out.println("the element is " + list2.get(i));


// }
// list2.size() it tells about the how many elements are there in the list currently

// for (Integer element: list2){
//     System.out.println("the element is " + element);
// }

// [3, 2, 23, 2333, 233, 222, 234, 224]
// the element is 3
// the element is 2
// the element is 23
// the element is 2333
// the element is 233
// the element is 222
// the element is 234
// the element is 224

// Iterator<Integer> it = list2.iterator();

// while(it.hasNext()){
//     System.out.println("the element is " + it.next());




}
}
