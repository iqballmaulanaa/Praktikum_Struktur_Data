/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author USER
 */
public class OrderedSearch { 
    public double[] arr;
    
    public OrderedSearch (double arrayNilai []) { 
        arr = new double [arrayNilai.length];
        for (int i = 0; i<arr.length; i++) { 
            arr[i]=arrayNilai [i];
        }
    }
    
    public int cari (double keyword) {
        int index = -1;
        for (int i = 0; i<arr.length; i++) {
            if (keyword==arr[i]) {
                index=i;
                break;
            }else{
                if (keyword<arr[i]) {
                    break;
                }
            }
        }
        return index;
    }
    
    public void tampilkan () { 
        for (int i=0; i<arr.length;i++) { 
            System.out.print(arr[i]+"");
        }
        System.out.println("");
    }
}