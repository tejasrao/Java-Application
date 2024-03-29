package LoginAndRegistration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class WelcomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeFrame
     */
    public WelcomeFrame() {
        initComponents();
        Clock();
    }

    void setUserName(String userName) {
        userNameField.setText(userName);
    }

    /*
    * This method is used to display the current time and date 
     */
    private void Clock() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        dateLabel.setText("Date: " + dateFormat.format(currentDateTime));
        //Timer updates the time on screen after every 500ms 
        Timer t = new Timer(500, updateClockAction);
        t.start();

    }
    /*
    * This listener interface is used to update the timeLabel
     */
    ActionListener updateClockAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime currentDateTime = LocalDateTime.now();
            timeLabel.setText("Time: " + timeFormat.format(currentDateTime));
        }
    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        minimiseButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameField = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        minimiseButton.setBackground(new java.awt.Color(255, 255, 255));
        minimiseButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        minimiseButton.setForeground(new java.awt.Color(255, 255, 255));
        minimiseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimiseButton.setText("̶");
        minimiseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimiseButtonMouseClicked(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Catamaran", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME");

        userNameField.setBackground(new java.awt.Color(255, 255, 255));
        userNameField.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        userNameField.setForeground(new java.awt.Color(255, 255, 255));
        userNameField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameField.setText("Tejas");

        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LogOut");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(240, 240, 240));
        dateLabel.setText("Date:");

        timeLabel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(240, 240, 240));
        timeLabel.setText("Time: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginAndRegistration/background.jpg"))); // NOI18N
        jLabel2.setText("Welcome");
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(minimiseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimiseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimiseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimiseButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Do you really want to logout?");
        if (option == 0) {
            /* Create and Display Login Form and dispose the current WelcomeFrame*/
            LoginFrame loginForm = new LoginFrame();
            loginForm.setVisible(true);
            loginForm.pack();
            loginForm.setLocationRelativeTo(null);
            loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            WelcomeFrame welcomeFrame = new WelcomeFrame();
            welcomeFrame.setVisible(true);
            welcomeFrame.setLocationRelativeTo(null);
            welcomeFrame.pack();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel minimiseButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel userNameField;
    // End of variables declaration//GEN-END:variables
}
