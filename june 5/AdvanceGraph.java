package chandu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceGraph {


		static class Graph{
			private Map<Integer,List<Integer>> adjList=new HashMap<Integer,List<Integer>>();
			
			void addEdge(int u,int v) {
				adjList.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
				adjList.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
			}
			void printGraph() {
				for (int node:adjList.keySet()) {
					System.out.println("Node"+node+"is connected to:");
					for(int neighbor:adjList.get(node)) {
						System.out.println(neighbor+" ");
					}
					System.out.println();
				}
			}
		}


    public static void main(String[] args) {
    	Graph g= new Graph();
    	g.addEdge(1, 2);
    	g.addEdge(1, 3);
    	g.addEdge(2, 4);  
    	g.addEdge(3, 4);
    	g.printGraph();
    	
    }
}
