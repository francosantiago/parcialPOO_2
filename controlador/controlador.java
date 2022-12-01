package controlador;

import modelo.banco;
import modelo.cuenta;
import vista.VentanaPrincipal;
import vista.DialogoCrearCuenta;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener
{

    private VentanaPrincipal venPrin;
    private banco Banco;

    public controlador(VentanaPrincipal pVenPrin, banco pBanco)
    {
        this.venPrin = pVenPrin;
        this.Banco = pBanco;
        this.venPrin.miPanelOperaciones.btnAgregarCuenta;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("se hizo lo que se pudo :(");
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("AgregarCuenta"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miCuenta.agregarOyenteBoton(this);
        }

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }
    }
}
