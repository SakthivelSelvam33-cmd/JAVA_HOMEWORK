
package graphtraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphTraversal 
{
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void BFS(int start) 
    {

        Queue<Integer> queue = new LinkedList<>();

        visited = new boolean[graph.size()];

        queue.add(start);
        visited[start] = true;

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) 
        {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbour : graph.get(node)) 
            {

                if (!visited[neighbour]) 
                {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }


    public static void DFS(int node) 
    {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbour : graph.get(node)) 
        {

            if (!visited[neighbour]) 
            {

                DFS(neighbour);
            }
        }
    }

    
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();


        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();


        graph = new ArrayList<>();

        for(int i=0;i<vertices;i++) 
        {

            graph.add(new ArrayList<>());
        }


        System.out.println("Enter edges:");

        for(int i=0;i<edges;i++) 
        {

            int u = sc.nextInt();
            int v = sc.nextInt();


            graph.get(u).add(v);
            graph.get(v).add(u);

        }


        System.out.print("Enter starting node: ");
        int start = sc.nextInt();


        BFS(start);


        visited = new boolean[vertices];

        System.out.println("DFS Traversal:");

        DFS(start);

        sc.close();
    }
    }
    

