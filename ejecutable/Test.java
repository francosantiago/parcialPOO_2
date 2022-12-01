package ejecutable;

import modelo.banco;
import vista.VentanaPrincipal;
import controlador.controlador;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        banco miBiblioteca = new banco();
        new controlador(miVentana, miBiblioteca);    
    }

}