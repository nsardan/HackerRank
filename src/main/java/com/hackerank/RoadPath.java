package com.hackerank;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by neha on 19/07/17.
 */
public class RoadPath {




static class Graph{
    private int vortexs;
    private LinkedList<Integer>[] adjacentNodes;

    Graph(int vortexs){
        vortexs = vortexs;
        for(int i= 0; i< vortexs; i++){
            adjacentNodes[i] = new LinkedList<Integer>();
        }
    }

    void addAdjacentNodes(int node, int connectedNode){
        adjacentNodes[node].add(connectedNode);
    }

    boolean isReachable(int node_1, int node_2){
        LinkedList<Integer> temp;

        boolean visited[] = new boolean[vortexs];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[node_1] = true;
        queue.add(node_1);

        Iterator<Integer> i;

        while(queue.size()!= 0){
            node_1 = queue.poll();

            int n;
            i = adjacentNodes[node_1].listIterator();

            while(i.hasNext()){
                n = i.next();

                if(n == node_2){
                    return true;
                }
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        return false;
    }

}
}
