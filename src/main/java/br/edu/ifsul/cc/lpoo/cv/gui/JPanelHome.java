/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cv.gui;

import br.edu.ifsul.cc.lpoo.cv1.Controle;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author José Henrique PG
 */
public class JPanelHome extends JPanel {

    private JLabel lblMensagem;
    private JLabel lblImagem;
    private JLabel lblautor;
    private JLabel lblData;
    private BorderLayout layoutGeo;

    private Controle controle;

    public JPanelHome(Controle controle) {

        this.controle = controle;
        initComponents();
    }

    private void initComponents() {

        layoutGeo = new BorderLayout();
        this.setLayout(layoutGeo);//seta o gerenciador de layout para este painel.

        lblMensagem = new JLabel("Bem vindo(a)!");
        lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(lblMensagem, BorderLayout.NORTH);

        lblImagem = new JLabel(new ImageIcon(JPanelHome.class.getResource("/images/logo_ifsul_color.png")));
        this.add(lblImagem, BorderLayout.CENTER);//adiciona a imagem na parte central deste painel.

        ///Calendar c = Calendar.getInstance();//recupera a data atual do computador.
        ///SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ///lblData = new JLabel(df.format(c.getTime()));
        ///lblData.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        ///lblData.setHorizontalAlignment(SwingConstants.LEFT);
        ///this.add(lblData, BorderLayout.NORTH); //adiciona o rotulo para a data na parte inferior deste painel.       

        lblautor = new JLabel("Desenvolvido por José Henrique Paludo Giombelli");
        lblautor.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        lblautor.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(lblautor, BorderLayout.SOUTH);
    }
}
