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

class Node<T> {
    T vertex;
    LinkedList<T> linkedList;
    Node<T> right;

    public Node(T vertex) {
        this.vertex = vertex;
        linkedList = new LinkedList<>();
        right = null;
    }
}