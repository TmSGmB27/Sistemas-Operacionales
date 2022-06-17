package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;

public class Control implements ActionListener {

    Proceso objProceso = new Proceso();
    Formulario objFormulario = new Formulario();
    Interfaz objInterfaz = new Interfaz();
    Listas objListas = new Listas();

    public Control() {

        objFormulario.getBtnañadir().addActionListener(this);
        objInterfaz.getBntaceptar().addActionListener(this);

    }

    public void iniciar() {

        objInterfaz.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (objInterfaz.getBntaceptar() == e.getSource()) {

            objFormulario.setVisible(true);
        }

        if (objFormulario.getBtnañadir() == e.getSource()) {

            objProceso.setNombre(objFormulario.getTxtnombre().getText());
            objProceso.setTamaño(Integer.parseInt(objFormulario.getTxttamaño().getText()));

            objListas.setNumprocesos(Integer.parseInt(objInterfaz.getTxtnprocesos().getText()));

            for (int i = 0; i <= objListas.getNumprocesos(); i++) {
                System.out.println(i);
                if (i <= objListas.getNumprocesos()) {
                    objFormulario.getBtnañadir().setEnabled(false);
                }
            }

            if (objFormulario.getRecurso1().isSelected() == false
                    && objFormulario.getRecurso2().isSelected() == false
                    && objFormulario.getRecurso3().isSelected() == false
                    && objFormulario.getRecurso4().isSelected() == false
                    && objFormulario.getRecurso5().isSelected() == false) {

                //si no selecciona ningun recurso entra
            } else {
                if (objFormulario.getRecurso1().isSelected() == true) {
                    System.out.println("Escogio recurso 1");
                }
                if (objFormulario.getRecurso2().isSelected() == true) {
                    System.out.println("Escogio recurso 2");

                }
                if (objFormulario.getRecurso3().isSelected() == true) {
                    System.out.println("Escogio recurso 3");

                }
                if (objFormulario.getRecurso4().isSelected() == true) {
                    System.out.println("Escogio recurso 4");

                }
                if (objFormulario.getRecurso5().isSelected() == true) {
                    System.out.println("Escogio recurso 5");

                }
            }

            System.out.println("Proceso: " + objProceso.getNombre() + "\nTam: " + objProceso.getTamaño());
        }

    }

}
