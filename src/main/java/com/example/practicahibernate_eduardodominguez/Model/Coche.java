package com.example.practicahibernate_eduardodominguez.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // Indica que esta clase representa una entidad que se mapea a una tabla en la base de datos.
@Table(name = "COCHES") // Especifica el nombre de la tabla en la base de datos que esta clase representa
public class Coche {

    @Id  // Indica que este atributo es la clave primaria de la entidad
    @Column(name = "matricula") // Especifica el nombre de la columna en la tabla que corresponde a este atributo
    private String matricula; // Atributo que almacena la matrícula del coche, que es única
    @Column(name = "marca") // Especifica el nombre de la columna en la tabla que corresponde a este atributo
    private String marca; // Atributo que almacena la marca del coche

    @Column(name = "modelo") // Especifica el nombre de la columna en la tabla que corresponde a este atributo
    private String modelo; // Atributo que almacena el modelo del coche

    @Column(name = "tipo") // Especifica el nombre de la columna en la tabla que corresponde a este atributo
    private String tipo; // Atributo que almacena el tipo del coche (por ejemplo, SUV, sedán, etc.)

    // Constructores
    public Coche(String matricula, String marca, String modelo, String tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Coche() {
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}