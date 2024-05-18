/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Data.BaseData;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;


public class JIFGenerarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFGenerarFactura
     */
    public JIFGenerarFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Generar Factura");

        jLabel2.setText("ID Cliente");

        jButton1.setText("Buscar pedidos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Generar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Pedidos del cliente");

        jLabel4.setText("Dirección");

        jLabel5.setText("Proveedor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel6.setText("(Opcional)");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel7.setText("(Opcional)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Obtener los datos de los campos de texto
    String text1 = jTextField1.getText();
    String text2 = jTextField2.getText();
    String text3 = jTextField3.getText();
    
    // Validar si el primer dato es un número entero válido
    int parametro1;
    try {
        parametro1 = Integer.parseInt(text1);
    } catch (NumberFormatException e) {
        // Mostrar un mensaje de error si el primer dato no es un número entero válido
        JOptionPane.showMessageDialog(this, "El valor ingresado en el primer campo no es un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si hay un error
    }
    
    // Llamar al método para ejecutar el procedimiento almacenado
    generaFactura(parametro1, text2, text3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generaFactura(int parametro1, String parametro2, String parametro3) {
    try {
        // Obtener la conexión a la base de datos
        BaseData baseData = new BaseData() {};
          java.sql.Connection connection = baseData.getSqlConnection();
        
        // Preparar la llamada al procedimiento almacenado
        String sql = "{call InsertarFactura(?, ?, ?)}";
        CallableStatement callableStatement = connection.prepareCall(sql);
        
        // Establecer los parámetros del procedimiento almacenado
        callableStatement.setInt(1, parametro1);
        callableStatement.setString(2, parametro2);
        callableStatement.setString(3, parametro3);
        
        // Ejecutar el procedimiento almacenado
        callableStatement.execute();
        
        // Cerrar la conexión
        connection.close();
        
        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Procedimiento almacenado ejecutado con éxito");
    } catch (SQLException ex) {
        // Mostrar un mensaje de error si ocurre alguna excepción SQL
        JOptionPane.showMessageDialog(this, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage());
    }
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Obtener el texto del campo de texto
    String text = jTextField1.getText();
    
    // Validar si el texto es un número entero válido
    try {
        int value = Integer.parseInt(text);
        // Si se llega aquí, el valor es un número entero válido
        // Llamar al método para cargar datos con el valor ingresado
        cargarDatos(value);
    } catch (NumberFormatException e) {
        // Mostrar un mensaje de error si el texto no es un número entero válido
        JOptionPane.showMessageDialog(this, "El valor ingresado no es un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed
private void cargarDatos(int value) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Id Producto");
    modelo.addColumn("ID Almacén");
    modelo.addColumn("Cantidad");
    modelo.addColumn("ID Cliente");

    String sql = "SELECT IDProducto, IDAlmacen, Cantidad, IDCliente FROM Producto WHERE IDCliente = ?";

    try {
        BaseData baseData = new BaseData() {};
        java.sql.Connection connection = baseData.getSqlConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        // Establecer el valor del parámetro en la consulta SQL
        preparedStatement.setInt(1, value);
        
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Object[] fila = new Object[4];
            fila[0] = resultSet.getInt("IDProducto");
            fila[1] = resultSet.getInt("IDAlmacen");
            fila[2] = resultSet.getInt("Cantidad");
            fila[3] = resultSet.getInt("IDCliente");
            modelo.addRow(fila);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    jTable1.setModel(modelo);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
