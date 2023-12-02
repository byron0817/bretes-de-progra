/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado2;

/**
 *
 * @author Byron
 */
public class Spotify {
    public int idCancion, ano, pos = 0, anoT = 2023; public String titulo, autor; public double duracion; 
    public Array top[] = new Array[10]; 
    public Spotify() { } 
    public void agregarCancion(int idCancion, String titulo, String autor, int ano, double duracion) { 
        top[pos] = new Array (idCancion, titulo, autor, ano, duracion); pos += 1; } 
    public void Mostrarcancion() {
        for (int i = 0; i < top.length; i++) {
            if (top[i] != null) { if (top[i].ano < anoT) { 
    System.out.println("Canciones anteriores al año" + anoT); 
    System.out.println( "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = " + top[i].autor + "\nAño = " + top[i].ano + "\nDuracion = " + top[i].duracion); 
    System.out.println("*****************************************************"); } 
    if (top[i].ano == anoT) { 
    System.out.println("Canciones del mismo año" + anoT); 
    System.out.println( "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = " + top[i].autor + "\nAño = " + top[i].ano + "\nDuracion = " + top[i].duracion); 
    System.out.println("*****************************************************"); } 
    System.out.println("*****************************************************"); 
    System.out.println("Autor numero 1 = " + top[0].autor); 
    System.out.println( "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = " + top[i].autor + "\nAño = " + top[i].ano + "\nDuracion = " + top[i].duracion); } } } 
    public void separar() { } 
    public void setTitulo(String titulo) { 
        this.titulo = titulo; } 
    public void setAutor(String autor) { 
        this.autor = autor; }
    public void setId(int idCancion) { 
        this.idCancion = idCancion; } 
    public void setDuracion(double duracion) { 
        this.duracion = duracion; } 
    public void setAno(int ano) { this.ano = ano; } 
    public int getId() { return idCancion; } 
    public double getDuracion() { return duracion; } 
    public int getAno() { return ano; } 
    public String getTitulo() { return titulo; } 
    public String getAutor() { return autor; } }

