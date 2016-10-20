/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.eam.diseno.banco.vista.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Camilo Andres
 */
public class PanelInterno extends JDesktopPane {

    public PanelInterno() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
       // g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(new ImageIcon("src/imagenes/BannerGrande.png").getImage(),this.getWidth()-350,this.getHeight()-175,350,175, null);
        
        for (Component component : getComponents()) {
            component.repaint();
        }
    }

   







}
