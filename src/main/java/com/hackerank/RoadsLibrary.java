package com.hackerank;

import com.graph.Graph;
import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by neha on 18/07/17.
 */
public class RoadsLibrary {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for(int a0 = 0; a0 < queries; a0++){
            int cities = in.nextInt();
            int roads = in.nextInt();
            long clib = in.nextLong();
            long croad = in.nextLong();
            for(int a1 = 0; a1 < roads; a1++){


                Graph graph = new Graph(cities);
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                graph.addRoad(city_1, city_2);

            }





        }
    }

    static void DFS(int city, Graph graph){
        int cities = graph.neighbours.length;
        boolean[] connected = new boolean[cities];
        DFSUtil(city, connected, graph);

    }

    static void DFSUtil(int city, boolean[] connected, Graph graph){
        connected[city] = true;

        Iterator<Integer> i = graph.neighbours[city].listIterator();

        while(i.hasNext()){
            int c = i.next();
            if(!connected[c]){
                DFSUtil(c,connected, graph);
            }
        }



    }


    static int calculateCost(Graph gr, long clib, long croad){


    return 0;}

    static class Graph{
        private int city;
        private LinkedList<Integer>[] neighbours;

        Graph(int city){
            this.city = city;
            neighbours = new LinkedList[city];
            for(int i = 0; i< city; i++){
                neighbours[i] = new LinkedList<Integer>();
            }
        }

        void addRoad(int city, int road){
            this.neighbours[city].add(road);
        }

    }


}
