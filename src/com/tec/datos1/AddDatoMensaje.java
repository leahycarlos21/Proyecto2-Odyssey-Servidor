package com.tec.datos1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import com.tec.datos1.Mensajes;
import com.tec.datos1.XMLCancion.Canciones;

/**
 *Clase necesaria para crear el objeto del XML recbido
 * Tiene que tener el mismo formato de la clase de C# para poder hacer el intercambio
 */
public class AddDatoMensaje extends Mensajes {
    public Canciones[] cancion;
    public int cantidadTotalSong;
   // public Usuario usuario;

    public AddDatoMensaje(){

    }
}
