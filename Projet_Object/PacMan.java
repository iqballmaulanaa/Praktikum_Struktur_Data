/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author USER
 */
public class PacMan {
    int x;
    int y;
    int width;
    int height;
    
    PacMan() {
    }
    PacMan(int wd, int hg) {
        width = wd;
        height = hg;
    } 
    
    public void moveLeft() {
        x = x - 1;
    }
    public void moveRight() {
        x = x + 1;
    }
    public void moveUp() {
        y = y + 1;
    }
    public void moveDown() {
        y = y - 1;
    }
    public void printPosition() {
        if (x <= 0) {
            x = 0;
        }
        if (x >= width) {
            x = width;
        }
        if (y <= 0) {
            y = 0;
        }
        if (y >= height) {
            y = height;
        }
        System.out.printf("Koordinat PacMan sekarang (%d, %d)", x, y);
    }
}
