package Interfaz;

public class Instrucciones extends javax.swing.JFrame {

    public Instrucciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(370, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(12, 20));
        jScrollPane1.setWheelScrollingEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("      Buen día Director,\n\n Soy el Secretario de dirección de la Facultad, y estoy aquí para \n guiaros en los primeros pasos de la dirección académica.\n\n Cada turno llegan cinco refuerzos, que pueden aumentar por los \n bonos específicos de las facultades controladas. \n Estos deben ser colocados en su totalidad en los edificios aliados.\n\n Luego comienza la fase de Transferencia y Ataque, en que se \n podrán mover las tropas a territorios conectados directamente, que,\n en caso de estar controlados por el enemigo, entrarán en batalla.\n\n Recuerde Director proteger sus edificios, y que SIEMPRE, \n al menos un hombre debe permanecer presente en cada edificio.");
        jTextArea1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jTextArea1.setMaximumSize(new java.awt.Dimension(370, 400));
        jTextArea1.setPreferredSize(new java.awt.Dimension(370, 400));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 420, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
