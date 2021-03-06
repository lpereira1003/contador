package sv.com.pereira.gui;


import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.persistence.Query;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import static javax.swing.RowFilter.orFilter;
import static javax.swing.RowFilter.regexFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import static net.sf.jasperreports.engine.JasperFillManager.fillReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import static net.sf.jasperreports.engine.util.JRLoader.loadObjectFromFile;
import net.sf.jasperreports.view.JasperViewer;
import pojos.Clientes;
import pojos.Compras;
import pojos.Empresas;
import pojos.Impuestos;
import static sv.com.pereira.gui.Principal.jDesktopPane1;

public class Compras1 extends javax.swing.JInternalFrame {
    public Compras1() {
        initComponents();
        PlaceHolder holder = new PlaceHolder(campoSeleccionEmpresa, "Nombre de Empresa o NRC");
        PlaceHolder holder1 = new PlaceHolder(campoSeleccionCliente, "Nombre de Proveedor o NRC");
        PlaceHolder holder2 = new PlaceHolder(campoBuscoTransaccion, "# de Documento");
        PlaceHolder holder3 = new PlaceHolder(campoDocVta, "# Documento de Compra");
        //PlaceHolder holder4 = new PlaceHolder(campoGravado, "Valor Monetario");
        Date fechaDiditacion = new Date();
        fechador.setDate(fechaDiditacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ContadorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ContadorPU").createEntityManager();
        empresasQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT e FROM Empresas e");
        empresasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empresasQuery.getResultList();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : ContadorPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        grupoTipoVtas = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblPpal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpresas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatosIngresados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblDataIng = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoTotalIva = new javax.swing.JTextField();
        campoTotalGravado = new javax.swing.JTextField();
        campoTotalPercepcion = new javax.swing.JTextField();
        campoTotalTotales = new javax.swing.JTextField();
        campoBuscoTransaccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblGravado_total = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lblPercepcion = new javax.swing.JLabel();
        campoGravado = new javax.swing.JTextField();
        campoDocVta = new javax.swing.JTextField();
        CampoIva = new javax.swing.JTextField();
        campoTotalVta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoPercepcion = new javax.swing.JTextField();
        btnGuardarCompra = new javax.swing.JButton();
        panelconfigProceso = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();
        jSeparator1 = new javax.swing.JSeparator();
        fechador = new com.toedter.calendar.JDateChooser();
        campoSeleccionEmpresa = new javax.swing.JTextField();
        campoSeleccionCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnEliminarTransacc = new javax.swing.JToggleButton();
        btnCompras = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("** Ingresando Compras **");
        setToolTipText("");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1050, 650));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblPpal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPpal.setForeground(new java.awt.Color(0, 0, 255));
        lblPpal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPpal.setText("Ingresando Compras");
        lblPpal.setToolTipText("");
        lblPpal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 51), null));
        lblPpal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, empresasList, tablaEmpresas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idempresa}"));
        columnBinding.setColumnName("Idemp");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ncr}"));
        columnBinding.setColumnName("Ncr");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("G.Cont");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpresasMouseClicked(evt);
            }
        });
        tablaEmpresas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaEmpresasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpresas);
        if (tablaEmpresas.getColumnModel().getColumnCount() > 0) {
            tablaEmpresas.getColumnModel().getColumn(0).setMinWidth(50);
            tablaEmpresas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaEmpresas.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaEmpresas.getColumnModel().getColumn(2).setMinWidth(75);
            tablaEmpresas.getColumnModel().getColumn(2).setPreferredWidth(75);
            tablaEmpresas.getColumnModel().getColumn(2).setMaxWidth(75);
            tablaEmpresas.getColumnModel().getColumn(3).setMinWidth(75);
            tablaEmpresas.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaEmpresas.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, tablaProveedor);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idclien}"));
        columnBinding.setColumnName("IdProvee");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nrc}"));
        columnBinding.setColumnName("Nrc");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gcontrib}"));
        columnBinding.setColumnName("Gcontrib");
        columnBinding.setColumnClass(Boolean.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProveedor);
        if (tablaProveedor.getColumnModel().getColumnCount() > 0) {
            tablaProveedor.getColumnModel().getColumn(0).setMinWidth(50);
            tablaProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaProveedor.getColumnModel().getColumn(2).setMinWidth(100);
            tablaProveedor.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaProveedor.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaProveedor.getColumnModel().getColumn(3).setMinWidth(50);
            tablaProveedor.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaProveedor.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        tablaDatosIngresados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idVta", "Proveedor", "#Doc", "F.Compra", "Grav", "IVA", "Percep", "total Vta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatosIngresados.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaDatosIngresados);
        if (tablaDatosIngresados.getColumnModel().getColumnCount() > 0) {
            tablaDatosIngresados.getColumnModel().getColumn(0).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(5).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(5).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(5).setMaxWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setMinWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setPreferredWidth(40);
            tablaDatosIngresados.getColumnModel().getColumn(6).setMaxWidth(40);
        }

        jLabel2.setBackground(new java.awt.Color(0, 255, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empresas");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDataIng.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDataIng.setForeground(new java.awt.Color(255, 0, 51));
        lblDataIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataIng.setText("Datos Ingresados");
        lblDataIng.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proveedor");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Gravado");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("IVA");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Percepcion");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Total Vtas");

        campoTotalIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        campoTotalGravado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoTotalGravado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTotalGravadoKeyPressed(evt);
            }
        });

        campoTotalPercepcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        campoTotalTotales.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(campoTotalIva, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoTotalGravado, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTotalGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoTotalIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTotalPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoTotalTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoBuscoTransaccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscoTransaccionKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso transacciones"));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("# doc");

        lblGravado_total.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGravado_total.setText("Gravado");

        lbl_iva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_iva.setText("IVA");

        lblPercepcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPercepcion.setText("Percep.");

        campoGravado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoGravado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoGravadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoGravadoKeyTyped(evt);
            }
        });

        campoDocVta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoDocVta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoDocVtaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDocVtaKeyTyped(evt);
            }
        });

        CampoIva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CampoIva.setText("0.00");

        campoTotalVta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoTotalVta.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Total");

        campoPercepcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoPercepcion.setText("0.00");
        campoPercepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPercepcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPercepcionKeyTyped(evt);
            }
        });

        btnGuardarCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarCompra.setText("Guardar");
        btnGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompraActionPerformed(evt);
            }
        });
        btnGuardarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarCompraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGravado_total)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoGravado)
                            .addComponent(campoDocVta)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPercepcion)
                            .addComponent(jLabel14)
                            .addComponent(lbl_iva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTotalVta)
                            .addComponent(campoPercepcion)
                            .addComponent(CampoIva))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDocVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGravado_total)
                    .addComponent(campoGravado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iva)
                    .addComponent(CampoIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPercepcion)
                    .addComponent(campoPercepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoTotalVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelconfigProceso.setBackground(new java.awt.Color(51, 153, 255));
        panelconfigProceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuacion de proceso"));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Fecha de Compra");

        fechador.setBorder(javax.swing.BorderFactory.createTitledBorder("Mes de PROCESO"));
        fechador.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout panelconfigProcesoLayout = new javax.swing.GroupLayout(panelconfigProceso);
        panelconfigProceso.setLayout(panelconfigProcesoLayout);
        panelconfigProcesoLayout.setHorizontalGroup(
            panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                            .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(11, 11, 11))
                        .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(jSeparator1)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelconfigProcesoLayout.createSequentialGroup()
                        .addComponent(fechador, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        panelconfigProcesoLayout.setVerticalGroup(
            panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                .addGroup(panelconfigProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelconfigProcesoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        campoSeleccionEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionEmpresaKeyTyped(evt);
            }
        });

        campoSeleccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSeleccionClienteKeyTyped(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.darkGray, null, null));

        btnEliminarTransacc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminarTransacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarTransacc.setText("Eliminar Transaccion");
        btnEliminarTransacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTransaccActionPerformed(evt);
            }
        });

        btnCompras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro_compras.png"))); // NOI18N
        btnCompras.setText("Libro Compras");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminarTransacc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnEliminarTransacc)
                .addGap(25, 25, 25)
                .addComponent(btnCompras)
                .addGap(25, 25, 25)
                .addComponent(btnSalir)
                .addGap(20, 20, 20))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        btnNuevoCliente.setText("Nuevo Proveedor");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(campoSeleccionEmpresa))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoSeleccionCliente)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevoCliente)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelconfigProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE))
                            .addComponent(lblDataIng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(campoBuscoTransaccion))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPpal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataIng, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoSeleccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelconfigProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(campoBuscoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoSeleccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevoCliente))
                            .addComponent(jLabel11)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        lblPpal.getAccessibleContext().setAccessibleName("Ventas");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnVerCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCotizacionActionPerformed
    
    }//GEN-LAST:event_btnVerCotizacionActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnVerCotizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerCotizacionKeyPressed

    }//GEN-LAST:event_btnVerCotizacionKeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void campoDocVtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaKeyTyped
       
    }//GEN-LAST:event_campoDocVtaKeyTyped

    private void campoGravadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyTyped
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int filaEmpresas = tablaEmpresas.getSelectedRow();
        int filaClientes = tablaProveedor.getSelectedRow();
        if(filaEmpresas==-1){
            showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
           return;
       }
        if(filaClientes==-1){
            showMessageDialog(this,"Seleccione Proveedor");
           limpiarcamposTransacciones();
           return; 
        }
        String gContrEmpresa = tablaEmpresas.getValueAt(filaEmpresas, 3).toString();
        campoGravado.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(final KeyEvent e)
            {
                if(campoGravado.getText().isEmpty()){
                    //limpiarcamposTransacciones();
                    campoGravado.setText("");
                    return;
                }
              hacemeCalculos();
            }
         });  
    }//GEN-LAST:event_campoGravadoKeyTyped

    private void btnGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCompraActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int fila = tablaEmpresas.getSelectedRow();
        if(fila==-1){
           showMessageDialog(this,"Seleccione empresa");
           limpiarcamposTransacciones();
           btnGuardarCompra.setBackground(Color.lightGray);
           return;
        }
        if (campoDocVta.getText().isEmpty()){
             showMessageDialog(this,"Ingrese numero de Comprobante Crédito");
             btnGuardarCompra.setBackground(Color.lightGray);
           return;
        }if (campoGravado.getText().isEmpty()){
             showMessageDialog(this,"Ingrese compra NETA");
             btnGuardarCompra.setBackground(Color.lightGray);
           return;
        }
        if(campoPercepcion.getText().isEmpty()){
            campoPercepcion.setText("0.00");
        }
        
            
      //Escribir compras
        Compras compras = new Compras();
        int filaClientes = tablaProveedor.getSelectedRow();
        String idclientes = tablaProveedor.getValueAt(filaClientes, 0).toString();
        int idProvee = parseInt(idclientes);
        Clientes proveeid = em.find(Clientes.class,idProvee );
        compras.setIdproveedor(proveeid);
        int filaEmpresa = tablaEmpresas.getSelectedRow();
        out.println("fila seleccionada es "+filaEmpresa);
        String idempresabuscar = tablaEmpresas.getValueAt(filaEmpresa, 0).toString();
        int idempresa1 = parseInt(idempresabuscar);
        Empresas empresaid=em.find(Empresas.class, idempresa1);
        out.println("empresa encontrada es "+empresaid.getIdempresa());
        compras.setIdempresa(empresaid);
        compras.setGravado(new BigDecimal(campoGravado.getText()));
        compras.setValorcompra(new BigDecimal(campoTotalVta.getText()));
        compras.setValoriva(new BigDecimal(CampoIva.getText()));
       
        compras.setValorpercibe(new BigDecimal(campoPercepcion.getText()));
        compras.setFechacompra(calendario.getDate());
        //compras.setFechadigitado(new Date());
        compras.setFechadigitado(fechador.getDate());
        compras.setNumdoc(campoDocVta.getText());
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            em.persist(compras);
            tx.commit();
        } catch (Exception e) {
        tx.rollback();
        }
        limpiarcamposTransacciones();
        try {
            cargarDatadigitada();
        } catch (ParseException ex) {
            getLogger(Compras1.class.getName()).log(SEVERE, null, ex);
        }
        int lineasTablaData = tablaDatosIngresados.getRowCount();
        tablaDatosIngresados.getSelectionModel().setSelectionInterval(lineasTablaData-1,lineasTablaData-1);
        campoPercepcion.setBackground(Color.lightGray);
    }//GEN-LAST:event_btnGuardarCompraActionPerformed

    private void campoSeleccionEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionEmpresaKeyTyped
        // TODO add your handling code here:
        campoSeleccionEmpresa.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionEmpresa.getText());
                campoSeleccionEmpresa.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 1); // Busca nombre
                RowFilter filtro2 = regexFilter("(?i)"+campoSeleccionEmpresa.getText(), 2); // Busca NRC
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaEmpresas.getModel());
        tablaEmpresas.setRowSorter(trs);  
        tablaEmpresas/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionEmpresaKeyTyped

    private void campoSeleccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSeleccionClienteKeyTyped
        // TODO add your handling code here:
         campoSeleccionCliente.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoSeleccionCliente.getText());
                campoSeleccionCliente.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoSeleccionCliente.getText(), 1); // Busca nombre
                RowFilter filtro2 = regexFilter("(?i)"+campoSeleccionCliente.getText(), 2); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaProveedor.getModel());
        tablaProveedor.setRowSorter(trs);  
        tablaProveedor/**/.selectAll();
    }//GEN-LAST:event_campoSeleccionClienteKeyTyped

    private void tablaEmpresasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEmpresasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEmpresasKeyPressed

    private void tablaEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpresasMouseClicked
        try {
            limpiarCamposTotales();
            cargarDatadigitada();
        } catch (ParseException ex) {
            //JOptionPane.showMessageDialog(this, "No hay Data");
            //return;
        }
    }//GEN-LAST:event_tablaEmpresasMouseClicked

    private void campoGravadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoGravadoKeyPressed
        // TODO add your handling code here:
        int filaProveedor = tablaProveedor.getSelectedRow();
        if(filaProveedor<0){
             showMessageDialog(this,"Seleccione Proveedor");
             return;
        }
        String proveedorGC = tablaProveedor.getValueAt(filaProveedor, 3).toString();
         if(evt.getKeyCode()==VK_ENTER) {
             if(proveedorGC.equals("true")){
                 campoPercepcion.requestFocus();
                 campoPercepcion.setBackground(Color.green);
                 campoPercepcion.setText("");
             }else
             {
               btnGuardarCompra.requestFocus();
            btnGuardarCompra.setBackground(Color.green);  
             }
            
        }
    }//GEN-LAST:event_campoGravadoKeyPressed

    private void campoBuscoTransaccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscoTransaccionKeyTyped
        // TODO add your handling code here:
        campoBuscoTransaccion.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyReleased(final KeyEvent e) {
                String encuentrelo = (campoBuscoTransaccion.getText());
                campoBuscoTransaccion.setText(encuentrelo);
                RowFilter filtro1 = regexFilter("(?i)"+campoBuscoTransaccion.getText(), 2); // Busca nombre
                //RowFilter filtro2 = regexFilter("(?i)"+campoBuscarCliente.getText(), 3); // Busca Nombre
                ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<>();
                filtros.add(filtro1);
                //filtros.add(filtro2);
                trs.setRowFilter(orFilter(filtros));
            }
        });
        trs = new TableRowSorter(tablaDatosIngresados.getModel());
        tablaDatosIngresados.setRowSorter(trs);  
        tablaDatosIngresados/**/.selectAll();
    }//GEN-LAST:event_campoBuscoTransaccionKeyTyped

    private void btnEliminarTransaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTransaccActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        int fila = tablaDatosIngresados.getSelectedRow();
        if(fila==-1){
            showMessageDialog(this,"Seleccione Transaccion a ELIMINAR");
            return;
        }
        String idVta = tablaDatosIngresados.getValueAt(fila, 0).toString();
        int idVta1 = parseInt(idVta);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
        Compras comprasBorrar = em.find(Compras.class, idVta1);
        em.remove(comprasBorrar);
            tx.commit();
         } catch (Exception e){
            tx.rollback();
         }finally{
            em.close();
            campoBuscoTransaccion = new javax.swing.JTextField();
            campoBuscoTransaccion.setText("");
            try {
                cargarDatadigitada();
            } catch (ParseException ex) {
                getLogger(Compras1.class.getName()).log(SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarTransaccActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        int fila = tablaEmpresas.getSelectedRow();
        int filaData = tablaDatosIngresados.getRowCount();
        if(fila==-1){
            showMessageDialog(this,"Seleccione Empresa");
            return;
        }
        if(filaData==-1){
            showMessageDialog(this,"NO Hay Compras para esta Empresa");
            return;
        }
        String idEmpresa = tablaEmpresas.getValueAt(fila, 0).toString();
        int idEmpresa1 = parseInt(idEmpresa);        
        Calendar now = getInstance();
        int mes = now.get(MONTH);// verificar cuando la pc este en mes 12
        mes += 1;
        out.println("muestra el mes "+mes);
        int anno = now.get(YEAR);
        Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/contabledb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\LibrodeCompras.jasper");
            Map valores = new HashMap();
            valores.put ( "MES" , mes);
            valores.put ( "ANNO" , anno );
            valores.put ( "IDEMPRESA" , idEmpresa1 );
            JasperPrint jasperPrint = fillReport(reporte, valores, conn);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.toFront();
            viewer.setTitle("Reporte Compras");
            viewer.setSize(1_100, 600);
            viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            //database.desconectar();
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
       
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        // TODO add your handling code here:
        hacemeCalculos();
    }//GEN-LAST:event_tablaProveedorMouseClicked

    private void campoDocVtaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDocVtaKeyPressed
        if(evt.getKeyCode()==VK_ENTER) {
            campoGravado.requestFocus();
        }  
    }//GEN-LAST:event_campoDocVtaKeyPressed

    private void campoTotalGravadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalGravadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalGravadoKeyPressed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        this.dispose();

        ProveedoresToCompras1 proveedoresToCompras1 = new ProveedoresToCompras1();
        jDesktopPane1.add(proveedoresToCompras1);
        //jDesktopPane1.getDesktopManager().maximizeFrame(contribuyentes1);
        proveedoresToCompras1.setVisible(true);
        proveedoresToCompras1.setIconifiable(true);
        proveedoresToCompras1.setMaximizable(true);
        proveedoresToCompras1.setClosable(true);
        proveedoresToCompras1.setResizable(true);
        proveedoresToCompras1.toFront();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnGuardarCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarCompraKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==VK_ENTER) {
            btnGuardarCompra.doClick();
            btnGuardarCompra.setBackground(Color.lightGray);
        }         
    }//GEN-LAST:event_btnGuardarCompraKeyPressed

    private void campoPercepcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPercepcionKeyTyped
        // TODO add your handling code here:
          campoPercepcion.addKeyListener(new KeyAdapter() 
        {
            @Override
            
            public void keyReleased(final KeyEvent e) {
                double ventaTotal = 0.00;
                double gravado = 0.00;
                if(campoPercepcion.getText().isEmpty()){
                    return;
                }
                String gravado1 = campoGravado.getText();
                gravado=Double.parseDouble(gravado1);
                String percepcion1 = campoPercepcion.getText();
                
                double percepcion = Double.parseDouble(percepcion1);
                String iva1 = CampoIva.getText();
                double iva = Double.parseDouble(iva1);
                                      
                       ventaTotal=gravado+iva+percepcion;
                       campoTotalVta.setText(""+ventaTotal);
            }
        });
          
    }//GEN-LAST:event_campoPercepcionKeyTyped

    private void campoPercepcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPercepcionKeyPressed
         if(evt.getKeyCode()==VK_ENTER) {
             btnGuardarCompra.requestFocus();
            btnGuardarCompra.setBackground(Color.green);
             }
    }//GEN-LAST:event_campoPercepcionKeyPressed

    TableRowSorter trs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIva;
    private javax.persistence.EntityManager ContadorPUEntityManager;
    private javax.swing.JToggleButton btnCompras;
    private javax.swing.JToggleButton btnEliminarTransacc;
    private javax.swing.JButton btnGuardarCompra;
    private javax.swing.JToggleButton btnNuevoCliente;
    private javax.swing.JToggleButton btnSalir;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JTextField campoBuscoTransaccion;
    private javax.swing.JTextField campoDocVta;
    private javax.swing.JTextField campoGravado;
    private javax.swing.JTextField campoPercepcion;
    private javax.swing.JTextField campoSeleccionCliente;
    private javax.swing.JTextField campoSeleccionEmpresa;
    private javax.swing.JTextField campoTotalGravado;
    private javax.swing.JTextField campoTotalIva;
    private javax.swing.JTextField campoTotalPercepcion;
    private javax.swing.JTextField campoTotalTotales;
    private javax.swing.JTextField campoTotalVta;
    private java.util.List<pojos.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private java.util.List<pojos.Empresas> empresasList;
    private javax.persistence.Query empresasQuery;
    private com.toedter.calendar.JDateChooser fechador;
    private javax.swing.ButtonGroup grupoTipoVtas;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDataIng;
    private javax.swing.JLabel lblGravado_total;
    private javax.swing.JLabel lblPercepcion;
    private javax.swing.JLabel lblPpal;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JPanel panelconfigProceso;
    private javax.swing.JTable tablaDatosIngresados;
    private javax.swing.JTable tablaEmpresas;
    private javax.swing.JTable tablaProveedor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void limpiarcamposTransacciones() {
    campoDocVta.setText("");
    CampoIva.setText("0.00");
    campoGravado.setText("");
    campoTotalVta.setText("0.00");
    campoPercepcion.setText("0.00");
    campoDocVta.requestFocus();
    }

    private void cargarDatadigitada() throws ParseException {
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
         int filaempresa = tablaEmpresas.getSelectedRow();
        String idempresa = tablaEmpresas.getValueAt(filaempresa, 2).toString();
        DefaultTableModel tablaFactura = (DefaultTableModel) tablaDatosIngresados.getModel();
        String nombreEmpresa = tablaEmpresas.getValueAt(filaempresa, 1).toString();
        lblDataIng.setText("Datos Ingresados a:  ".concat(nombreEmpresa));
         lblPpal.setText("Procesando Compras a: >> ".concat(nombreEmpresa));
        double totalPercepcion = 0.00;
        double totalIva = 0.00;
        double totalVentas = 0.00;
        double totalGravado = 0.00;
        DefaultTableModel tablaFactura1 = (DefaultTableModel) tablaDatosIngresados.getModel();
        tablaDatosIngresados.setFont(new java.awt.Font("Tahoma", 0, 9));
        String tipovta = "CCF";
        Calendar now = getInstance();
        try {//limpiando tabla ventas para CCF
           DefaultTableModel temp = (DefaultTableModel) tablaDatosIngresados.getModel();
           int a = temp.getRowCount();
           for (int i = 0; i < a; i++) {
                temp.removeRow(0);
            }
            } catch (Exception e) {
        }
        Query query;//*** cambiar query a compras
        query = em.createQuery("Select v from Compras v where v.idempresa.ncr = :proveedorBuscar order by v.fechacompra asc")
                .setParameter("proveedorBuscar", idempresa);
                //.setParameter("tipovta", tipovta) ;
                
        List<Compras> list=query.getResultList();
        int mesActual = now.get(MONTH)+1;//obtengo el mes actual
        for(Compras compras:list)
        {   
            Timestamp mesDigitado = new Timestamp(compras.getFechadigitado().getTime());// fecha de escritura en Dbs
            int mescompra = mesDigitado.getMonth();// mes de digitacion
            int mescompra1 = mescompra+1;// igualo mes compra a mes digitacion
            if(mesActual==mescompra1)
            {
                String idcompra = compras.getIdcompra().toString();
                //String nomEmpresa = compras.getIdempresa().getNombre();
                String nomProvee = compras.getIdproveedor().getNombre();
                String numDoc = compras.getNumdoc();
                String grav = compras.getGravado().toString();
                String iva = compras.getValoriva().toString();
                String percep = compras.getValorpercibe().toString();
                String percep1 = compras.getValorcompra().toString();
                String fechaCompra = compras.getFechacompra().toGMTString();
                Object FilaElemento[] = {idcompra, nomProvee, numDoc, fechaCompra, grav, iva, percep, percep1 };
                tablaFactura.addRow(FilaElemento);
                totalIva += parseDouble(iva);
                totalPercepcion += parseDouble(percep);
                totalVentas += parseDouble(percep1);
                totalGravado += parseDouble(grav);
                campoTotalGravado.setText(""+format("%.2f",totalGravado));
                campoTotalIva.setText(""+format("%.2f",totalIva));
                campoTotalPercepcion.setText(""+format("%.2f",totalPercepcion));
                campoTotalTotales.setText(""+format("%.2f",totalVentas));
            }
        }// for lista
    }

    private void limpiarCamposTotales() {
        campoTotalGravado.setText("0.00");
        campoTotalIva.setText("0.00");
        campoTotalPercepcion.setText("0.00");
        campoTotalTotales.setText("0.00");
    }

    private void hacemeCalculos(){
        EntityManagerFactory emf = createEntityManagerFactory("ContadorPU");
        EntityManager em = emf.createEntityManager();
        Impuestos impuestos = em.find(Impuestos.class, 7);
        Double valorIVA = impuestos.getIva();
        Double valorPercepcion = impuestos.getPercepcion();
        Double valorConversion = impuestos.getConversion();
        double percepcion = 0.00;
        int filaEmpresas = tablaEmpresas.getSelectedRow();
        if(campoGravado.getText().isEmpty()){
            return;
        }
      // if(campo.getText().isEmpty())return;
        double gravado = parseDouble(campoGravado.getText());
        double iva = parseDouble(CampoIva.getText());
        if(campoPercepcion.getText().isEmpty()){
            campoPercepcion.setText("0.0");
        }
        percepcion = parseDouble(campoPercepcion.getText());
        
        double ventaTotal = parseDouble(campoTotalVta.getText());
        int filaProveedor = tablaProveedor.getSelectedRow();
        String gContrProveedor1 = tablaProveedor.getValueAt(filaProveedor, 3).toString();
        String gContrEmpresa = tablaEmpresas.getValueAt(filaEmpresas, 3).toString();
        if((gContrEmpresa.equals("false")&& gContrProveedor1.equals("true")) && gravado>=100.00 ){
         // percepcion=gravado*valorPercepcion;
          iva=gravado*valorIVA;
          ventaTotal=gravado+iva;//+percepcion;
          CampoIva.setText("" + format("%.2f", iva));
          if(campoPercepcion.getText().isEmpty()){
              campoPercepcion.setText("0.0");
          }
          campoPercepcion.setText("" + format("%.2f", percepcion));
          campoTotalVta.setText("" + format("%.2f", ventaTotal));
        }else
        {
            percepcion=0.00;
            iva=gravado*valorIVA;
            ventaTotal=gravado+iva+percepcion;
            CampoIva.setText("" + format("%.2f", iva));
            campoPercepcion.setText("" + format("%.2f", percepcion));
            campoTotalVta.setText("" + format("%.2f", ventaTotal));
        }
        if(gContrEmpresa.equals("true")&&gContrProveedor1.equals("true") )
        {
            percepcion=0.00;
            iva=gravado*valorIVA;
            ventaTotal=gravado+iva;//+percepcion;
            if(campoPercepcion.getText().isEmpty()){
              campoPercepcion.setText("0.0");
            }
            CampoIva.setText("" + format("%.2f", iva));
            campoPercepcion.setText("" + format("%.2f", percepcion));
            campoTotalVta.setText("" + format("%.2f", ventaTotal));
        }
    }
    private static final Logger LOG = Logger.getLogger(Compras1.class.getName());
}
