package com.example.ftrani.petagram;


public class Mascota {
    private int foto;
    private String nombre;
    private String raza;
    private int likes;

    public Mascota(int foto, int likes, String nombre, String raza) {
        this.foto = foto;
        this.likes = likes;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
