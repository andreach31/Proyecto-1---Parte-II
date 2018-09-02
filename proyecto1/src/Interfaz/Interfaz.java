/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Interfaz extends JFrame {

    public Interfaz() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        setTitle("Simple menu");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();

        JMenu Archivo = new JMenu("Archivo");
        Archivo.setMnemonic(KeyEvent.VK_F);

        JMenuItem Recuperar = new JMenuItem("Recuperar");
        Recuperar.setMnemonic(KeyEvent.VK_E);
        Recuperar.setToolTipText("Recuperar grafo");
        //Recuperar.addActionListener((ActionEvent event) -> {
        //System.exit(0);

        JMenuItem Guardar = new JMenuItem("Guardar");
        Guardar.setMnemonic(KeyEvent.VK_E);
        Guardar.setToolTipText("Guardar grafo");
        //Guardar.addActionListener((ActionEvent event) -> {
        //System.exit(0);

        JMenuItem Limpiar = new JMenuItem("Limpiar");
        Limpiar.setMnemonic(KeyEvent.VK_E);
        Limpiar.setToolTipText("Limpiar grafo");
        //Limpiar.addActionListener((ActionEvent event) -> {
        //System.exit(0);

        JMenuItem eMenuItem = new JMenuItem("Salir");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Salir de la aplicacion");
        eMenuItem.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

                 
        Archivo.add(Guardar);
        Archivo.add(Recuperar);
        Archivo.add(Limpiar);
        menubar.add(Archivo);

        setJMenuBar(menubar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Interfaz ex = new Interfaz();
            ex.setVisible(true);
        });
    }
}
