package Proyecto_MVC;
/**
 *
 * @author Jonat
 */
public class Chat extends javax.swing.JFrame implements Observer {

    private Controlador controlador;
    
    public Chat(Controlador controlador){
        this.controlador = controlador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaChat = new javax.swing.JPanel();
        chatSP = new javax.swing.JScrollPane();
        chatTA = new javax.swing.JTextArea();
        mensajeTF = new javax.swing.JTextField();
        enviarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaChat.setBackground(new java.awt.Color(153, 204, 255));

        chatSP.setAutoscrolls(true);

        chatTA.setEditable(false);
        chatTA.setBackground(new java.awt.Color(255, 255, 204));
        chatTA.setColumns(20);
        chatTA.setLineWrap(true);
        chatTA.setRows(5);
        chatSP.setViewportView(chatTA);

        mensajeTF.setBackground(new java.awt.Color(255, 255, 204));

        enviarBtn.setBackground(new java.awt.Color(153, 255, 153));
        enviarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enviarBtn.setText("Enviar");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaChatLayout = new javax.swing.GroupLayout(ventanaChat);
        ventanaChat.setLayout(ventanaChatLayout);
        ventanaChatLayout.setHorizontalGroup(
            ventanaChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chatSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaChatLayout.createSequentialGroup()
                        .addComponent(mensajeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaChatLayout.setVerticalGroup(
            ventanaChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chatSP, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarBtn)
                    .addComponent(mensajeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        String mensaje = mensajeTF.getText();
        chatTA.append("- ");
        this.controlador.actualizarVentana(mensaje);
        this.mensajeTF.setText("");
    }//GEN-LAST:event_enviarBtnActionPerformed
    
    @Override
    public void actualizarChat(String mensaje){
        chatTA.append(mensaje);
    }

    public Controlador getControlador() {
        return controlador;
    }
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane chatSP;
    private javax.swing.JTextArea chatTA;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JTextField mensajeTF;
    private javax.swing.JPanel ventanaChat;
    // End of variables declaration//GEN-END:variables
}
