import java.util.*;
public class graph {
    public static void main(String[] args) {
        
        // types of graph directed and undirected graph 
        // directed graph example
// path and walk

// input in the graph 
        // adjacency matrix representation
    //    int [][] graph =  {{0,1},{0,2},{1,3}}
    //    System.out.println(graph)

// representation of the graph by the matrix using input in undirected graph

    //    List<List<Integer>> graph = new ArrayList<>();
    //    for(int i = 0; i < 4; i++){
    //        graph.add(new ArrayList<>());
    //    }
    //    graph.get(0).add(1);
    //    graph.get(0).add(2);
    //    graph.get(1).add(3);
    //    graph.get(2).add(0);
    //    graph.get(3).add(1);
    //    System.out.println(graph);


        // traversal of graph
        // adjacency list representation


// graph representation in matrix form {{0,1},{1,2},{2,3},{3,4}}

// List<List<Integer>> graph = new ArrayList<>();
//         for(int i = 0; i < 4; i++){
//             graph.add(new ArrayList<>());
//         }   
//         graph.get(0).add(0);
//         graph.get(0).add(1);
//         graph.get(1).add(1);
//         graph.get(1).add(2);
//         graph.get(2).add(2);
//         graph.get(2).add(3);
//         graph.get(3).add(3);
//         graph.get(3).add(4);
//         System.out.println(graph);


// adjacency list 
// List<List<Integer>> graph = new ArrayList<>();
// int [][] arr = new int [5][];
// int [][] nums = {{0,1},{1,2},{2,3},{3,4}};

// for(int i = 0; i < 4; i++){
//     arr[i] = new int[2];
//     arr[i][0] = nums[i][0];
//     arr[i][1] = nums[i][1];
// //     }
//     for(int i = 0; i < nums.length; i++){
//         arr[nums[i][0]].add(nums[i][1]);
//         arr[nums[i][1]].add(nums[i][0]);
//     }
   
// for (int i = 0; i<5; i++) {
//     System.out.print(i + " : ");
//     for (int j = 0; j<arr[i].length; j++) {
//         System.out.print(arr[i][j]+", ");
//     }
//     System.out.println();
// }
// we have to change the degree of the vector graph 

List<List<Integer>> graph = new ArrayList<>();
int [][] arr = new int [5][];
int [][] nums = {{0,1},{1,2},{2,3},{3,4}};

for(int i = 0; i < 4; i++){
    arr[i] = new int[2];
    arr[i][0] = nums[i][0];
    arr[i][1] = nums[i][1];
    }
    


    }
}
