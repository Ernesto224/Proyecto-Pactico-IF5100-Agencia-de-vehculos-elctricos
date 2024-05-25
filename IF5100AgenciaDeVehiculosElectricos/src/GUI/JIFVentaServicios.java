/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Data.BaseData;
import Data.MovimientoData;
import Domain.Servicio;
import Domain.UsuarioActivo;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class JIFVentaServicios extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFVentaServicios
     */
    private UsuarioActivo usuarioActivo;
    private int idPedido;
    private int idProducto;
    private int idEmpleado;
    private MovimientoData movimientoData;
    private JTable tablaAccesoriosPartes;
    private DefaultTableModel dftModeloTabla;
    private JScrollPane scrollPane;
    private double montoTotal;

    public JIFVentaServicios(UsuarioActivo usuarioActivo) {
        initComponents();
        inhabilitarEementos();
        this.usuarioActivo = usuarioActivo;
        this.dftModeloTabla = new DefaultTableModel();
        this.tablaAccesoriosPartes = new JTable();
        this.tablaAccesoriosPartes.setModel(this.dftModeloTabla);
        this.scrollPane = new JScrollPane(this.tablaAccesoriosPartes);
        this.scrollPane.setBounds(3, 200, 600, 200);
        this.add(this.scrollPane);
        this.idPedido = -1;
        this.idProducto = -1;
        this.movimientoData = new MovimientoData();
        this.idEmpleado = this.usuarioActivo.getId();
        this.montoTotal = 0.0;
        this.crearTabla();
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
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        JLabelPedido = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(628, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Venta de Servicios");

        jLabel2.setText("ID Servicio:");

        jLabel3.setText("ID Cliente: ");

        JLabelPedido.setText("ID DEL PEDIDO:");

        jButton2.setText("Generar Pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Servicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar Factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Digite el moto a pagar: ");

        jButton4.setText("Pagar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelPedido)
                                .addGap(364, 364, 364))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel1))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(307, 307, 307)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(171, 171, 171))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String idClienteText = jTextField2.getText();
        String idProductoText = jTextField1.getText();
        // Validar si los datos son números enteros válidos
        int idCliente, idServicio;
        try {
            idCliente = Integer.parseInt(idClienteText);
            idServicio = Integer.parseInt(idProductoText);
            this.idProducto = idServicio;
        } catch (NumberFormatException e) {
            // Mostrar un mensaje de error si algún dato no es un número entero válido
            JOptionPane.showMessageDialog(this, "Todos los campos deben contener números enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si hay un error
        }

        // Inicializar el ID del pedido
        this.idPedido = Integer.parseInt(JLabelPedido.getText());
        // Ejecutar el segundo procedimiento almacenado
        int resultado = agregarMovimientoInventario(this.idPedido, this.idEmpleado, idServicio);
        if (resultado == 0) {
            JOptionPane.showMessageDialog(this, "Movimiento de inventario registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            //registrarPedido(idCliente);
            this.cargarDatos(this.idPedido);

        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el movimiento de inventario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private int agregarMovimientoInventario(int IdPedido, int IdEmpleado, int IdServicio) {
        try {
            // Obtener la conexión a la base de datos
            BaseData baseData = new BaseData() {
            };
            Connection connection = baseData.getSqlConnection();

            // Preparar la llamada al procedimiento almacenado
            String sql = "{? = call Servicio.sp_InsertarServicioPedido(?, ?, ?)}";
            CallableStatement callableStatement = connection.prepareCall(sql);

            // Registrar el parámetro de salida para el valor de retorno
            callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);

            // Establecer los parámetros del procedimiento almacenado
            System.out.println("DATOS: " + IdPedido + " " + IdEmpleado + " " + IdEmpleado + " " + IdServicio);
            callableStatement.setInt(2, IdPedido);
            callableStatement.setInt(3, IdEmpleado);
            callableStatement.setInt(4, IdServicio);

            // Ejecutar el procedimiento almacenado
            callableStatement.execute();

            // Obtener el valor de retorno del procedimiento almacenado
            int resultado = callableStatement.getInt(1);

            // Cerrar la conexión
            connection.close();

            return resultado;
        } catch (SQLException ex) {
            // Mostrar un mensaje de error si ocurre alguna excepción SQL
            JOptionPane.showMessageDialog(this, "Error al ejecutar el movimiento de inventario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return -1; // Retornar -1 en caso de error
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String idClienteText = jTextField2.getText();
        int idCliente;
        try {
            idCliente = Integer.parseInt(idClienteText);

        } catch (NumberFormatException e) {
            // Mostrar un mensaje de error si algún dato no es un número entero válido
            JOptionPane.showMessageDialog(this, "El ID debe ser enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si hay un error
        }

        // Inicializar el ID del pedido
        this.idPedido = -1;

        // Registrar el pedido solo si el ID del pedido no está ya establecido
        if (this.JLabelPedido.getText().equals("ID DEL PEDIDO:")) {
            this.idPedido = registrarPedido(idCliente);
            if (this.idPedido == -1) {
                JOptionPane.showMessageDialog(this, "El cliente no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si hay un error
            }
            // Actualizar el JLabel con el ID del pedido
            JLabelPedido.setText(String.valueOf(idPedido));
        } else {
            // Obtener el ID del pedido desde el JLabel
            this.idPedido = Integer.parseInt(JLabelPedido.getText());
        }

        habilitarEementos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener la conexión a la base de datos
            BaseData baseData = new BaseData() {
            };
            java.sql.Connection connection = baseData.getSqlConnection();

            // Preparar la llamada al procedimiento almacenado
            String sql = "{? = call FinanzaVenta.sp_RegistrarFactura(?, ?, ?, ?, ?, ?)}";
            CallableStatement callableStatement = connection.prepareCall(sql);

            // Registrar el parámetro de salida para el valor de retorno
            callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);

            // Establecer los parámetros del procedimiento almacenado
            int idCliente = Integer.parseInt(this.jTextField2.getText());
            callableStatement.setInt(2, this.idPedido);
            callableStatement.setInt(3, idCliente);

            // Establecer los parámetros 4, 5 y 6 como NULL
            callableStatement.setNull(4, java.sql.Types.VARCHAR);
            callableStatement.setNull(5, java.sql.Types.VARCHAR);
            callableStatement.setNull(6, java.sql.Types.VARCHAR);

            // Establecer el parámetro 7 (MontoTotal)
            callableStatement.setBigDecimal(7, BigDecimal.valueOf(this.montoTotal));

            System.out.println("SERVICIOS: " + idCliente + " " + this.idPedido + " " + montoTotal);

            // Ejecutar el procedimiento almacenado
            callableStatement.execute();

            // Obtener el valor de retorno del procedimiento almacenado
            int resultado = callableStatement.getInt(1);

            // Cerrar la conexión
            connection.close();

            // Mostrar un mensaje con el valor de retorno y la información del pedido
            String mensaje;
            if (resultado == -1) {
                mensaje = "Error al generar la factura.\nEl pedido o el cliente no existen.";
            } else {
                mensaje = "Se ha generado la factura con éxito.\n\n"
                        + "ID de la Factura: " + resultado + "\n"
                        + "ID del Pedido: " + this.idPedido + "\n"
                        + "ID del Cliente: " + idCliente + "\n"
                        + "Proveedor de Envío: N/A\n"
                        + "ID de Dirección: N/A\n"
                        + "Tracking del Pedido: N/A\n";
            }
            JOptionPane.showMessageDialog(this, mensaje, "Factura Generada", JOptionPane.INFORMATION_MESSAGE);
            cargarDatos(this.idPedido);

        } catch (SQLException ex) {
            // Mostrar un mensaje de error si ocurre alguna excepción SQL
            JOptionPane.showMessageDialog(this, "Error al ejecutar el procedimiento almacenado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (!this.jTextField3.getText().isEmpty()) {
            this.montoTotal = Double.parseDouble(this.jTextField3.getText());
            this.movimientoData.actualizarMontoPedido(this.idPedido, this.montoTotal);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private int registrarPedido(int idCliente) {
        try {
            // Obtener la conexión a la base de datos
            BaseData baseData = new BaseData() {
            };
            Connection connection = baseData.getSqlConnection();

            // Preparar la llamada al procedimiento almacenado
            String sql = "{? = call FinanzaVenta.sp_RegistrarPedido(?)}";
            CallableStatement callableStatement = connection.prepareCall(sql);

            // Registrar el parámetro de salida para el valor de retorno
            callableStatement.registerOutParameter(1, java.sql.Types.INTEGER);

            // Establecer los parámetros del procedimiento almacenado
            callableStatement.setInt(2, idCliente);

            // Ejecutar el procedimiento almacenado
            callableStatement.execute();

            // Obtener el valor de retorno del procedimiento almacenado
            int resultado = callableStatement.getInt(1);

            // Cerrar la conexión
            connection.close();

            return resultado;
        } catch (SQLException ex) {
            // Mostrar un mensaje de error si ocurre alguna excepción SQL
            JOptionPane.showMessageDialog(this, "Error el registro del pedido: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return -1; // Retornar -1 en caso de error
        }
    }

    private void habilitarEementos() {
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(false);
        jButton3.setEnabled(true);
    }

    private void inhabilitarEementos() {
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(true);
        jButton3.setEnabled(false);
    }

    private void crearTabla() {
        try {
            // Limpiar las columnas existentes en el modelo de la tabla
            if (this.dftModeloTabla != null) {
                this.dftModeloTabla.setColumnCount(0); // Eliminar todas las columnas existentes

                // Agregar las nuevas columnas con los nombres correspondientes
                this.dftModeloTabla.addColumn("IDServicio");
                this.dftModeloTabla.addColumn("NombreServicio");
                this.dftModeloTabla.addColumn("Descripcion");
            }
            this.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarDatos(int idPedido) {
        // Obtener los servicios del pedido actual
        ArrayList<Servicio> servicios = this.movimientoData.obtenerServicios(idPedido); // asumiendo que "servicioData" es la instancia que maneja los datos de los servicios
        System.out.println("SERVICIOS: " + servicios.size());
        // Limpiar los datos existentes en la tabla
        if (this.dftModeloTabla != null) {
            this.dftModeloTabla.setRowCount(0); // Eliminar todas las filas existentes
        }

        // Verificar si hay datos para cargar
        if (servicios != null && !servicios.isEmpty()) {
            // Iterar sobre cada servicio y agregarlo a la tabla
            for (Servicio servicio : servicios) {
                Object[] rowData = new Object[]{
                    servicio.getIDServicio(),
                    servicio.getNombreServicio(),
                    servicio.getDescripcion()
                };
                this.dftModeloTabla.addRow(rowData);
            }
        }
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
