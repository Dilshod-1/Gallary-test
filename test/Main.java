package com.vizor.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author DKurbonov - Не коментировал , но попробую.
 */
public class Main extends javax.swing.JFrame {// расширяет класс в функции Swing*;
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;
    int x = 0;
    File path = new File("assets/");// выставляем путь
    File[] list = path.listFiles();


    /**
     * Creates new form Main
     */
    public Main() {
        setSize(WIDTH, HEIGHT);//размер заданный изначально
        setUndecorated(true);//убираем рамки
        setLocationRelativeTo(null);//позиция на экране
        initComponents();// все функционалы и позиции инструментов и изображении
        SetImageSize(0);// начало какой картинки по счету
    }



    public void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(String.valueOf(list[i]));
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        label.setIcon(newImc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        openImage = new javax.swing.JLabel();
        openFile = new javax.swing.JLabel();
        sizeImg = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        next.setIcon(new javax.swing.ImageIcon("D:\\dt-developer-test-dkurbonov\\src\\main\\java\\com\\vizor\\test\\img\\icons8-стрелка-вправо-в-круге-64.png")); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });

        openImage.setIcon(new javax.swing.ImageIcon("D:\\dt-developer-test-dkurbonov\\src\\main\\java\\com\\vizor\\test\\img\\Download-Icon.png")); // NOI18N
        openImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openImage.setMaximumSize(new java.awt.Dimension(50, 50));
        openImage.setMinimumSize(new java.awt.Dimension(50, 50));
        openImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openImageMousePressed(evt);
            }
        });

        openFile.setIcon(new javax.swing.ImageIcon("D:\\dt-developer-test-dkurbonov\\src\\main\\java\\com\\vizor\\test\\img\\open file.png")); // NOI18N
        openFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openFileMousePressed(evt);
            }
        });

        sizeImg.setIcon(new javax.swing.ImageIcon("D:\\dt-developer-test-dkurbonov\\src\\main\\java\\com\\vizor\\test\\img\\size.png")); // NOI18N
        sizeImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sizeImgMousePressed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon("D:\\dt-developer-test-dkurbonov\\src\\main\\java\\com\\vizor\\test\\img\\exit.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 1027, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeImg)
                    .addComponent(openFile))
                .addGap(73, 73, 73)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sizeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addComponent(openFile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(openImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        SetImageSize(++x);
        x +=1;

    }//GEN-LAST:event_nextMousePressed

    private void openImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openImageMousePressed
        //create file chooser
        JFileChooser jfc = new JFileChooser();
        //pathname file
        jfc.setSelectedFile(new File("assets"));
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.getName().endsWith(".png") || f.isDirectory()) {
                    return true;
                }
                return false;
            }
            @Override
            public String getDescription() {
                return "Image";
            }
        });
        jfc.showOpenDialog(label);
        String filepath = jfc.getSelectedFile().getPath();
        String filename = jfc.getSelectedFile().getName();
        Path cop = Paths.get(filepath);
        Path path = Paths.get("assets\\" + filename);
        try {
            Files.copy(cop, path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        }//GEN-LAST:event_openImageMousePressed
    private void openFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileMousePressed

            String openfile = "assets/";
            new ImageIcon(openfile);
            File f = new File(openfile);
            Desktop dt = Desktop.getDesktop();
            try {
                dt.open(f);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }//GEN-LAST:event_openFileMousePressed

    private void sizeImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeImgMousePressed
        String sizeImg = "assets/"+list[x-1].getName();
        new ImageIcon(sizeImg);
        File f = new File(sizeImg);
        Desktop dt = Desktop.getDesktop();
        try {
            dt.open(f);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }//GEN-LAST:event_sizeImgMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
       System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel label;
    private javax.swing.JLabel next;
    private javax.swing.JLabel openFile;
    private javax.swing.JLabel openImage;
    private javax.swing.JLabel sizeImg;
    // End of variables declaration//GEN-END:variables
}
