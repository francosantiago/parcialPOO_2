package modelo;

import vista.PanelResultados;
import java.util.ArrayList;

public class banco
{
    private ArrayList<cuenta> cuentasBanco;

    public banco(ArrayList<cuenta> cuentasBanco)
    {
        this.cuentasBanco = cuentasBanco;
    }

    public banco()
    {
        this.cuentasBanco =  new ArrayList<>();
    }

    public ArrayList<cuenta> getCuentasBanco() 
    {
        return cuentasBanco;
    }

    public void setCuentasBanco(ArrayList<cuenta> cuentasBanco) 
    {
        this.cuentasBanco = cuentasBanco;
    }

    public void addCuenta (cuenta cuenta)
    {
        cuentasBanco.add(cuenta);
    }

    public void imprimirCuentas()
    {
        for(int i = 0; i < cuentasBanco.size(); i++)
        {
            PanelResultados.mostrarResultados(cuentasBanco.get(i).toString());
        }
    }

}