package mision.view.formularios;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import mision.view.laminas.ControlsPanel;
import mision.view.laminas.ResultsPanel;

public class FrmConsultas extends JFrame {

    public FrmConsultas() {
        setLayout(new BorderLayout());
        ResultsPanel resultPanel = new ResultsPanel();
        ControlsPanel controles = new ControlsPanel();
        //setContentPane(resultPanel);
        add(resultPanel, BorderLayout.CENTER);
        add(controles, BorderLayout.SOUTH);
    }

    public void crearFormulario(String titulo, int ancho, int alto) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(titulo);
        setResizable(false);
        setSize(ancho, alto);
        setLocationRelativeTo(null);      

    }
    

}
