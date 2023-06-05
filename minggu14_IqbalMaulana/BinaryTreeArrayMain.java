/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu14;

/**
 *
 * @author USER
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) { 
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0}; 
        int idxLast = 6;
        bta.populateData(data, idxLast); 
        bta.traverseInOrder(0);
    }
}