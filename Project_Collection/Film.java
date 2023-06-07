/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu16;

/**
 *
 * @author USER
 */

class Film {
    private int idFilm;
    private String judulFilm;
    private int tahunTayang;
    private String director;

    public Film(int idFilm, String judulFilm, int tahunTayang, String director) {
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.tahunTayang = tahunTayang;
        this.director = director;
    }

    public int getIdFilm() {
        return idFilm;
    }

    @Override
    public String toString() {
        return "Film{" +
                "ID Film=" + idFilm +
                ", Judul Film='" + judulFilm + '\'' +
                ", Tahun Tayang=" + tahunTayang +
                ", Director='" + director + '\'' +
                '}';
    }
}