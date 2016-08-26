package codigoqr;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public static boolean controlQRWebcam = false;
    public static boolean controlCargaImagen = false;
    public static boolean controlGeneraQR = false;
 
    public VentanaPrincipal() {
        initComponents();
        setTitle("Java QR");
        setLocationRelativeTo(null);
        setVisible(true);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQRWebcam = new javax.swing.JButton();
        btnCargaImagen = new javax.swing.JButton();
        btnGeneraQR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQRWebcam.setText("Leer QR Desde Webcam");
        btnQRWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRWebcamActionPerformed(evt);
            }
        });

        btnCargaImagen.setText("Leer Archivo de Imagen QR");
        btnCargaImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaImagenActionPerformed(evt);
            }
        });

        btnGeneraQR.setText("Generar QR a Partir de Texto");
        btnGeneraQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraQRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGeneraQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQRWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnQRWebcam)
                .addGap(45, 45, 45)
                .addComponent(btnCargaImagen)
                .addGap(47, 47, 47)
                .addComponent(btnGeneraQR)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQRWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRWebcamActionPerformed
        QRWebcam q;
        
        if(!controlQRWebcam) {
            q = new QRWebcam();
            controlQRWebcam = true;
        }
    }//GEN-LAST:event_btnQRWebcamActionPerformed

    private void btnCargaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaImagenActionPerformed
        CargaImagen c;
        
        if(!controlCargaImagen) {
            c = new CargaImagen();
            controlCargaImagen = true;
        }
    }//GEN-LAST:event_btnCargaImagenActionPerformed

    private void btnGeneraQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraQRActionPerformed
        GeneraQR g;
        
        if(!controlGeneraQR) {
            g = new GeneraQR();
            controlGeneraQR = true;
        }
    }//GEN-LAST:event_btnGeneraQRActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaImagen;
    private javax.swing.JButton btnGeneraQR;
    private javax.swing.JButton btnQRWebcam;
    // End of variables declaration//GEN-END:variables
}
