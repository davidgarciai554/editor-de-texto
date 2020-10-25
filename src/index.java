
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();

    }
    File mainFile = new File("");

    /*
    *
    * Creamos un archivo principal
    * con el que le iremos cambiando 
    * la ruta cada vez que elijamos  
    * modificar o crear un archivo
    *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreArchivo = new javax.swing.JTextField();
        RutaArchivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        fileChooserButton = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        guardarComo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(430, 440));

        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Nombre archivo");

        jLabel3.setText("Ruta archivo");

        jLabel5.setText("Contenido archivo");

        fileChooserButton.setText("jButton1");
        fileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserButtonActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        guardarComo.setText("Guardar como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NombreArchivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(RutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fileChooserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardarComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 149, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileChooserButton)))
                    .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserButtonActionPerformed
        fileChooser.showOpenDialog(this);
        if (fileChooser.showOpenDialog(this) == fileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            mainFile = file;
            try {
                RutaArchivo.setText(file.getAbsolutePath());
                NombreArchivo.setText(file.getName());
                leerArchivo();

            } catch (Exception e) {
            }
        }
        /*
        *
        * Abrimos el file Chooser y hacemos que escriba los valores del 
        * archivo seleccionado en los textFields correspondientes
        *
        */
    }//GEN-LAST:event_fileChooserButtonActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (cogeExtension(NombreArchivo.getText()) == "txt" || cogeExtension(NombreArchivo.getText()) == "xml") {
            File file = new File(RutaArchivo.getText().replace(mainFile.getName(), "") + NombreArchivo.getText());
            try {
                mainFile.renameTo(file);
                mainFile = file;
                RutaArchivo.setText(mainFile.getAbsolutePath());
                NombreArchivo.setText(mainFile.getName());
                escribirEnArchivo();

            } catch (Exception e) {
            }
        } else {
            mensaje.setText("<html>ERROR <br>Archivo no renombrado<br>Extension no admitida</html>");
        }
        /*
        *
        * Cuando le damos al boton de guardas creamos un archivo que lo 
        * convertimos en nuestro principal y sacamos todos los datos por 
        * pantalla y comprobamos que la extension del archivo es la correcta(txt o xml)
        *
        */
    }//GEN-LAST:event_guardarActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        if (cogeExtension(NombreArchivo.getText()) == "txt" || cogeExtension(NombreArchivo.getText()) == "xml") {
            File f = new File(mainFile.getParent() + "\\" + NombreArchivo.getText());
            mainFile = f;
            try {
                if (mainFile.createNewFile()) {
                    escribirEnArchivo();
                    mensaje.setText("Archivo creado");
                } else {
                    mensaje.setText("<html>ERROR <br>Archivo no creado</html>");
                }
            } catch (Exception e) {
            }
        } else {
            mensaje.setText("<html>ERROR <br>Archivo no creado<br>Extension no admitida</html>");
        }
        /*
        *
        * Cuando le damos al boton de guardar como cogemos la ruta del archivo
        * actual y quitamos el nombre del archivo y añadimos la del nombre del 
        * jText y comprobamos que la extension del archivo es la correcta (txt o xml)
        *
        */

    }//GEN-LAST:event_guardarComoActionPerformed

    private void escribirEnArchivo() {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(mainFile));
            bw.write(text.getText());
            bw.close();
        } catch (Exception e) {
        }
    }
    /*
    *
    * Funcion recurrida para escribir en el archivo el contenido del 
    * jText
    *
    */

    private void leerArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(mainFile));
            String linea;
            String texto = "";
            while ((linea = br.readLine()) != null) {
                texto += linea;
            }
            text.setText(texto);
            br.close();
        } catch (Exception e) {
        }
    }
    /*
    *
    * Funcion recurrida para sacar el contenido del archivo por pantalla
    *
    */
    

    private static String cogeExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreArchivo;
    private javax.swing.JTextField RutaArchivo;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton fileChooserButton;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarComo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
