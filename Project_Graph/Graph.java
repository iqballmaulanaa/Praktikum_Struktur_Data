/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu15;

/**
 *
 * @author USER
 */
import java.util.LinkedList;
import java.util.Scanner;
class Graph<T> {
    int vertex;
    LinkedList<T>[] list;
    boolean isDirected; // Menyimpan informasi apakah graph directed atau undirected

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(T source, T destination) {
        if (!isVertexValid(source) || !isVertexValid(destination)) {
            System.out.println("Input vertex out of bounds");
            return;
        }
        list[getIndex(source)].addFirst(destination);
        if (!isDirected) {
            list[getIndex(destination)].addFirst(source);
        }
    }

    public void degree(T vertex) {
        if (!isVertexValid(vertex)) {
            System.out.println("Input vertex out of bounds");
            return;
        }

        int sourceIndex = getIndex(vertex);
        System.out.println("degree vertex " + vertex + " : " + list[sourceIndex].size());

        int totalIn = 0, totalOut = 0;
        if (isDirected) {
            for (int i = 0; i < this.vertex; i++) {
                for (T destination : list[i]) {
                    if (destination.equals(vertex))
                        ++totalIn;
                }
            }
        }

        totalOut = list[sourceIndex].size();

        if (isDirected) {
            System.out.println("Indegree dari vertex " + vertex + " : " + totalIn);
        }
        System.out.println("Outdegree dari vertex " + vertex + " : " + totalOut);
        System.out.println("degree vertex " + vertex + " : " + (totalIn + totalOut));
    }

    public void removeEdge(T source, T destination) throws Exception {
        if (!isVertexValid(source) || !isVertexValid(destination)) {
            System.out.println("Input vertex out of bounds");
            return;
        }
        int sourceIndex = getIndex(source);
        int destinationIndex = getIndex(destination);

        boolean removed = list[sourceIndex].remove(destination);
        if (removed && !isDirected) {
            list[destinationIndex].remove(source);
        } else if (!removed) {
            System.out.println("Edge tidak ditemukan");
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].isEmpty()) {
                System.out.print("Vertex " + list[i].getFirst() + " terhubung dengan: ");
                for (int j = 1; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    private boolean isVertexValid(T vertex) {
        for (LinkedList<T> linkedList : list) {
            if (linkedList.size() > 0 && linkedList.getFirst().equals(vertex))
                return true;
        }
        return false;
    }

    private int getIndex(T vertex) {
        for (int i = 0; i < this.vertex; i++) {
            if (list[i].size() > 0 && list[i].getFirst().equals(vertex))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex: ");
        int vertexCount = input.nextInt();

        System.out.print("Apakah graph directed (true/false): ");
        boolean isDirected = input.nextBoolean();

        Graph<String> graph = new Graph<>(vertexCount, isDirected);

        System.out.print("Masukkan jumlah lintasan yang akan ditambahkan: ");
        int edgeCount = input.nextInt();

        System.out.println("Masukkan lintasan dengan format (source destination):");
        for (int i = 0; i < edgeCount; i++) {
            String source = input.next();
            String destination = input.next();
            graph.addEdge(source, destination);
        }

        System.out.println("Graph Terbentuk:");
        graph.printGraph();

        System.out.print("Masukkan vertex yang ingin diketahui degreenya: ");
        String vertexDegree = input.next();
        graph.degree(vertexDegree);

        input.close();
    }
}