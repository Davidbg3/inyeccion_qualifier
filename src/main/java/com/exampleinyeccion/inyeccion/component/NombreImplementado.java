package com.exampleinyeccion.inyeccion.component;

import org.springframework.stereotype.Component;

@Component
public class NombreImplementado implements Nombre{

    @Override
    public void mostrarNombre() {
        System.out.println("David Ian");
    }
}
