/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscdm.ficha.ingreso.egreso;

/**
 *
 * @author Usuario
 */
public class Ficha_Ingreso_Egreso extends javax.swing.JInternalFrame {
    public static void main(String[] args){
 new Ficha_Ingreso_Egreso();
}

    /**
     * Creates new form Ficha_Ingreso_Egreso
     */
    public Ficha_Ingreso_Egreso() {
        initComponents();
        limpiar();
        bloquear();
        
    }
        void limpiar(){
     //Parte Datos del Paciente
     txt_D.setText("");
     txt_DH.setText("");
     txt_E.setText("");
     txt_EC.setText("");
     txt_H.setText("");
     txt_M.setText("");
     txt_N.setText("");
     txt_NT.setText("");
     txt_PA.setText("");
     txt_RI.setText("");
     txt_RP.setText("");
     txt_SA.setText("");
     //Parte de Datos del Paciente
     
     //Parte Ingreso
     txtI_A.setText("");
     txtI_D.setText("");
     txtI_DI.setText("");
     txtI_H.setText("");
     txtI_M.setText("");
     txtI_SI.setText("");
     //Parte de Ingreso
     
     //Parte de Egreso
     bt_v.setText("");
     bt_M.setText("");
     txtE_C.setText("");
     txtE_C1.setText("");
     txtE_C2.setText("");
     txtE_DP.setText("");
     txtE_DS.setText("");
     txtE_IQ.setText("");
     txtE_P.setText("");
     //Parte de Egreso 
     
     //Parte Traslados Hospitalarios
     txtTH_NH.setText("");
     txtTH_A.setText("");
     txtTH_AH.setText("");
     txtTH_DH.setText("");
      txtTH_EM.setText("");
     txtTH_H.setText("");
     txtTH_M.setText("");
     txtTH_SE.setText("");
     txtTH_TE.setText("");
     //Parte Traslado Hospitalarios
     
     //Traslado IntraHospitalarios
     txtTI_F.setText("");
     txtTI_NI.setText("");
     txtTI_TA.setText("");
     txtTI_TD.setText("");
     //Parte Traslados IntraHospitalarios
}
        void limpiarIngreso(){
            //Parte Ingreso
     txtI_A.setText("");
     txtI_D.setText("");
     txtI_DI.setText("");
     txtI_H.setText("");
     txtI_M.setText("");
     txtI_SI.setText("");
     //Parte de Ingreso
        }
        void limpiarEgreso(){
             //Parte de Egreso
     bt_v.setText("");
     bt_M.setText("");
     txtE_C.setText("");
     txtE_C1.setText("");
     txtE_C2.setText("");
     txtE_DP.setText("");
     txtE_DS.setText("");
     txtE_IQ.setText("");
     txtE_P.setText("");
     //Parte de Egreso 
        }
        void limpiarTrasladoAOHospital(){
             //Traslado IntraHospitalarios
     txtTI_F.setText("");
     txtTI_NI.setText("");
     txtTI_TA.setText("");
     txtTI_TD.setText("");
     //Parte Traslados IntraHospitalarios
        }
        void limpiarTrasladoIHospitalarios(){
            //Parte Traslados Hospitalarios
     txtTH_NH.setText("");
     txtTH_A.setText("");
     txtTH_AH.setText("");
     txtTH_DH.setText("");
      txtTH_EM.setText("");
     txtTH_H.setText("");
     txtTH_M.setText("");
     txtTH_SE.setText("");
     txtTH_TE.setText("");
     //Parte Traslado Hospitalarios
        }
        void bloquear(){
      txt_D.setEnabled(false);
     txt_DH.setEnabled(false);
     txt_E.setEnabled(false);
     txt_EC.setEnabled(false);
     txt_H.setEnabled(false);
     txt_M.setEnabled(false);
     txt_N.setEnabled(false);
     txt_NT.setEnabled(false);
     txt_PA.setEnabled(false);
     txt_RI.setEnabled(false);
     txt_RP.setEnabled(false);
     txt_SA.setEnabled(false);
     RB_F.setEnabled(false);
     RB_M.setEnabled(false);
     bt_Cancelar.setEnabled(false);
     bt_Egreso.setEnabled(false);
     bt_Ingreso.setEnabled(false);
     bt_Nuevo.setEnabled(true);
     btTI_Limpiar.setEnabled(false);
     btTH_Limpiar.setEnabled(false);
     btNuevo_TI.setEnabled(false);
     btNuevo_TAOH.setEnabled(false);
     
     //Parte de Datos del Paciente
     
     //Parte Ingreso
     txtI_A.setEnabled(false);
     txtI_D.setEnabled(false);
     txtI_DI.setEnabled(false);
     txtI_H.setEnabled(false);
     txtI_M.setEnabled(false);
     txtI_SI.setEnabled(false);
     btI_Limpiar.setEnabled(false);
     //Parte de Ingreso
     
     //Parte de Egreso
     txtE_C.setEnabled(false);
     txtE_C1.setEnabled(false);
     txtE_C2.setEnabled(false);
     txtE_DP.setEnabled(false);
     txtE_DS.setEnabled(false);
     txtE_IQ.setEnabled(false);
     txtE_P.setEnabled(false);
     btE_Limpiar.setEnabled(false);
     //Parte de Egreso 
     
     //Parte Traslados Hospitalarios
     txtTH_NH.setEnabled(false);
     txtTH_A.setEnabled(false);
     txtTH_AH.setEnabled(false);
     txtTH_DH.setEnabled(false);
      txtTH_EM.setEnabled(false);
     txtTH_H.setEnabled(false);
     txtTH_M.setEnabled(false);
     txtTH_SE.setEnabled(false);
     txtTH_TE.setEnabled(false);
     btTH_Limpiar.setEnabled(false);
     //Parte Traslados Hopsitalarios
     
     //Parte Traslados Intrahospitalarios
     txtTI_F.setEnabled(false);
     txtTI_NI.setEnabled(false);
     txtTI_TA.setEnabled(false);
     txtTI_TD.setEnabled(false);
     bt_v.setEnabled(false);
     bt_M.setEnabled(false);
     btTI_Limpiar.setEnabled(false);
     //Parte Traslados Intrahospitalarios
}
        
        void desbloquear(){
     txt_D.setEnabled(true);
     txt_DH.setEnabled(true);
     txt_E.setEnabled(true);
     txt_EC.setEnabled(true);
     txt_H.setEnabled(true);
     txt_M.setEnabled(true);
     txt_N.setEnabled(true);
     txt_NT.setEnabled(true);
     txt_PA.setEnabled(true);
     txt_RI.setEnabled(true);
     txt_RP.setEnabled(true);
     txt_SA.setEnabled(true);
     RB_F.setEnabled(true);
     RB_M.setEnabled(true);
     bt_Cancelar.setEnabled(true);
     //botones
     bt_Egreso.setEnabled(true);
     bt_Ingreso.setEnabled(true);
     bt_Nuevo.setEnabled(false);
     btNuevo_TI.setEnabled(true);
     btNuevo_TAOH.setEnabled(true);
     //Parte de Datos del Paciente
     
     
}
        void desbloquearIngreso(){
     txtI_A.setEnabled(true);
     txtI_D.setEnabled(true);
     txtI_DI.setEnabled(true);
     txtI_H.setEnabled(true);
     txtI_M.setEnabled(true);
     txtI_SI.setEnabled(true);
     btI_Limpiar.setEnabled(true);
     
}
        void desbloquearEgreso(){
     bt_v.setEnabled(true);
     bt_M.setEnabled(true);
     txtE_C.setEnabled(true);
     txtE_C1.setEnabled(true);
     txtE_C2.setEnabled(true);
     txtE_DP.setEnabled(true);
     txtE_DS.setEnabled(true);
     txtE_IQ.setEnabled(true);
     txtE_P.setEnabled(true);
     btE_Limpiar.setEnabled(true);
}
     void desbloquearTrasladosIntrahospitalarios(){
           //Parte Traslados Intrahospitalarios
     txtTI_F.setEnabled(true);
     txtTI_NI.setEnabled(true);
     txtTI_TA.setEnabled(true);
     txtTI_TD.setEnabled(true);
     bt_v.setEnabled(true);
     bt_M.setEnabled(true);
     btTI_Limpiar.setEnabled(true);
     //Parte Traslados Intrahospitalarios
         
        }
     void desbloquearTrasladosAOtroHospital(){
         //Parte Traslados Hospitalarios
     txtTH_NH.setEnabled(true);
     txtTH_A.setEnabled(true);
     txtTH_AH.setEnabled(true);
     txtTH_DH.setEnabled(true);
      txtTH_EM.setEnabled(true);
     txtTH_H.setEnabled(true);
     txtTH_M.setEnabled(true);
     txtTH_SE.setEnabled(true);
     txtTH_TE.setEnabled(true);
     btTH_Limpiar.setEnabled(true);    
     btTH_Limpiar.setEnabled(true);
     //Parte Traslados Hopsitalarios
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtI_M = new javax.swing.JTextField();
        txtTH_M = new javax.swing.JTextField();
        txtI_A = new javax.swing.JTextField();
        txtTH_A = new javax.swing.JTextField();
        txtI_SI = new javax.swing.JTextField();
        txtI_DI = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        bt_v = new javax.swing.JRadioButton();
        bt_M = new javax.swing.JRadioButton();
        txtTH_AH = new javax.swing.JTextField();
        txtTH_DH = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        bt_Nuevo = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        bt_Ingreso = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        bt_Egreso = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        bt_Cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        RB_M = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        RB_F = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_PA = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_SA = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_EC = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_N = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txt_E = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txt_M = new javax.swing.JTextField();
        txt_D = new javax.swing.JTextField();
        txt_H = new javax.swing.JTextField();
        txt_NT = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtE_C = new javax.swing.JTextField();
        txt_DH = new javax.swing.JTextField();
        txtE_DS = new javax.swing.JTextField();
        txt_RP = new javax.swing.JTextField();
        txtE_C1 = new javax.swing.JTextField();
        txt_RI = new javax.swing.JTextField();
        txtE_IQ = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtE_C2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtE_P = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTI_F = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtTI_TD = new javax.swing.JTextField();
        txtTI_TA = new javax.swing.JTextField();
        txtTI_NI = new javax.swing.JTextField();
        txtTH_NH = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTH_EM = new javax.swing.JTextField();
        txtE_DP = new javax.swing.JTextField();
        txtTH_SE = new javax.swing.JTextField();
        txtI_H = new javax.swing.JTextField();
        txtTH_TE = new javax.swing.JTextField();
        txtI_D = new javax.swing.JTextField();
        txtTH_H = new javax.swing.JTextField();
        btI_Limpiar = new javax.swing.JButton();
        btE_Limpiar = new javax.swing.JButton();
        btNuevo_TI = new javax.swing.JButton();
        btNuevo_TAOH = new javax.swing.JButton();
        btTI_Limpiar = new javax.swing.JButton();
        btTH_Limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        txtI_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtI_MActionPerformed(evt);
            }
        });

        txtI_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtI_AActionPerformed(evt);
            }
        });

        txtI_SI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtI_SIActionPerformed(evt);
            }
        });

        jLabel24.setText("Egreso");

        jLabel25.setText("Diagnostico Principal de Egreso");

        bt_v.setText("Vivo");

        bt_M.setText("Muerto");
        bt_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MActionPerformed(evt);
            }
        });

        jLabel26.setText("Codigo");

        bt_Nuevo.setText("Nuevo");
        bt_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_NuevoActionPerformed(evt);
            }
        });

        jLabel27.setText("Diagnostico Secundario");

        bt_Ingreso.setText("Ingreso");
        bt_Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IngresoActionPerformed(evt);
            }
        });

        jLabel28.setText("Codigo");

        bt_Egreso.setText("Egreso");
        bt_Egreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EgresoActionPerformed(evt);
            }
        });

        jLabel29.setText("Intervencion Quirúrgica");

        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad");

        jLabel30.setText("Codigo");

        jLabel8.setText("Meses");

        jLabel31.setText("Procedimientos");

        jLabel9.setText("Dias");

        jLabel32.setText("Traslados a Otros Servicios Intrahospitalarios");

        jLabel10.setText("Horas");

        jLabel33.setText("Fecha");

        jLabel11.setText("Sexo");

        jLabel34.setText("Traslado De");

        buttonGroup1.add(RB_M);
        RB_M.setText("M");
        RB_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_MActionPerformed(evt);
            }
        });

        jLabel35.setText("Traslado A");

        jLabel12.setText("Diresccion Habitual");

        jLabel13.setText("Telefono");

        jLabel14.setText("Responsable Paciente");

        buttonGroup1.add(RB_F);
        RB_F.setText("F");
        RB_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_FActionPerformed(evt);
            }
        });

        jLabel1.setText("Hospital Nacional \"San Juan de Dios\" San Miguel");

        jLabel2.setText("Ficha de Ingreso y Egreso");

        jLabel3.setText("Primer Apellido");

        jLabel4.setText("Segundo Apellido");

        jLabel5.setText("Nombres");

        jLabel6.setText("No. de Expediente Clinico");

        jLabel36.setText("Nombre de Medico que Indica");

        jLabel37.setText("Traslado a Otro Hospital");

        jLabel38.setText("Nombre Hospital");

        jLabel39.setText("Condicion de Egreso");

        jLabel15.setText("Responsable Igreso(ESDOMED)");

        jLabel40.setText("Antes 48 Hras");

        txt_PA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PAActionPerformed(evt);
            }
        });
        txt_PA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PAKeyTyped(evt);
            }
        });

        jLabel41.setText("Despues de 48 Hras");

        txt_SA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SAActionPerformed(evt);
            }
        });
        txt_SA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SAKeyTyped(evt);
            }
        });

        jLabel42.setText("Egreso sin Consentimiento Medico");

        txt_EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ECActionPerformed(evt);
            }
        });

        jLabel43.setText("Fecha de Egreso:");

        txt_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NActionPerformed(evt);
            }
        });
        txt_N.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NKeyTyped(evt);
            }
        });

        jLabel44.setText("Hora:");

        txt_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EActionPerformed(evt);
            }
        });

        jLabel45.setText("Mes:");

        txt_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MActionPerformed(evt);
            }
        });

        txt_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DActionPerformed(evt);
            }
        });

        txt_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HActionPerformed(evt);
            }
        });

        txt_NT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NTActionPerformed(evt);
            }
        });
        txt_NT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NTKeyTyped(evt);
            }
        });

        jLabel46.setText("Año:");

        jLabel47.setText("Tiempo de Estancia");

        jLabel48.setText("Servicio Hospitalario de Egreso");

        txt_DH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DHActionPerformed(evt);
            }
        });

        txt_RP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RPActionPerformed(evt);
            }
        });

        txtE_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtE_C1ActionPerformed(evt);
            }
        });

        txt_RI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RIActionPerformed(evt);
            }
        });

        txtE_IQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtE_IQActionPerformed(evt);
            }
        });

        jLabel16.setText("Ingreso");

        jLabel17.setText("Fecha:");

        jLabel18.setText("Hora");

        jLabel19.setText("Dia");

        jLabel20.setText("Mes");

        jLabel21.setText("Año");

        jLabel22.setText("Servicio de Internacion");

        jLabel23.setText("Diagnostico de Ingreso");

        txtTH_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTH_EMActionPerformed(evt);
            }
        });

        txtE_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtE_DPActionPerformed(evt);
            }
        });

        txtTH_SE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTH_SEActionPerformed(evt);
            }
        });

        btI_Limpiar.setText("Limpiar");
        btI_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btI_LimpiarActionPerformed(evt);
            }
        });

        btE_Limpiar.setText("Limpiar");
        btE_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btE_LimpiarActionPerformed(evt);
            }
        });

        btNuevo_TI.setText("T.  Intrahospitalarios");
        btNuevo_TI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_TIActionPerformed(evt);
            }
        });

        btNuevo_TAOH.setText("T. a Otro Hospital");
        btNuevo_TAOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevo_TAOHActionPerformed(evt);
            }
        });

        btTI_Limpiar.setText("Limpiar");
        btTI_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTI_LimpiarActionPerformed(evt);
            }
        });

        btTH_Limpiar.setText("Limpiar");
        btTH_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTH_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel7)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_M, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(txt_D, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txt_H, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(RB_M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RB_F)
                        .addGap(372, 372, 372))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel9)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel10)
                        .addGap(364, 364, 364))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(404, 404, 404))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(382, 382, 382))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(jLabel37))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addComponent(jLabel11)
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txt_NT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(txt_EC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(txt_PA, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_SA, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btI_Limpiar)
                            .addComponent(btE_Limpiar))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtE_DS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE_DP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE_IQ, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtE_P, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtI_DI, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtI_H, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(txtI_D, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtI_M, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtI_A, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel19)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel20)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel21)))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtI_SI, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(132, 132, 132)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtE_C2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtE_C1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtE_C, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(txt_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(421, 421, 421))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(347, 347, 347))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(445, 445, 445))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtTI_F, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(232, 232, 232)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel40)
                                                .addComponent(txtTI_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(txtTI_TD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel33)
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel34)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel35)
                                        .addGap(142, 142, 142)
                                        .addComponent(txtTI_NI, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btTH_Limpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(txtTH_TE, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(173, 173, 173)
                                        .addComponent(txtTH_SE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTH_NH, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel39)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bt_v)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(bt_M))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(txtTH_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtTH_M, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(txtTH_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                    .addGap(36, 36, 36)
                                                                    .addComponent(jLabel41)
                                                                    .addGap(43, 43, 43)))))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtTH_A, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel48)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtTH_AH, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(245, 245, 245)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel43)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtTH_H, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(60, 60, 60))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(124, 124, 124)
                                                    .addComponent(jLabel44)
                                                    .addGap(42, 42, 42)
                                                    .addComponent(jLabel45)
                                                    .addGap(57, 57, 57)
                                                    .addComponent(jLabel46)
                                                    .addGap(62, 62, 62))))))
                                .addGap(9, 9, 9)
                                .addComponent(btTI_Limpiar)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(179, 179, 179))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(btNuevo_TI))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Egreso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btNuevo_TAOH, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_RI, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DH, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_RP, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_EC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_NT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_PA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_SA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RB_M)
                        .addComponent(RB_F, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addComponent(txt_RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txt_RI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Egreso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevo_TAOH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevo_TI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel19))
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtI_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtI_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtI_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtI_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtI_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtI_DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btI_Limpiar)
                        .addGap(30, 30, 30)))
                .addComponent(jLabel24)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtE_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtE_DS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtE_IQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtE_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtE_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtE_C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtE_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btE_Limpiar)
                        .addGap(52, 52, 52)))
                .addComponent(jLabel32)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTI_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTI_TD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTI_TA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTI_NI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTH_Limpiar))
                .addGap(40, 40, 40)
                .addComponent(jLabel37)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTH_AH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_v)
                                    .addComponent(txtTH_NH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_M)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTH_DH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTH_EM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTH_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTH_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTH_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTI_Limpiar)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTH_TE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTH_SE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 524, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtI_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtI_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtI_MActionPerformed

    private void txtI_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtI_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtI_AActionPerformed

    private void txtI_SIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtI_SIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtI_SIActionPerformed

    private void bt_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_MActionPerformed

    private void bt_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_NuevoActionPerformed
        desbloquear();
        txt_EC.requestFocus();
    }//GEN-LAST:event_bt_NuevoActionPerformed

    private void bt_EgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EgresoActionPerformed
        // TODO add your handling code here:
        desbloquearEgreso();
    }//GEN-LAST:event_bt_EgresoActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed

        bloquear();
        limpiar();
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void RB_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_FActionPerformed
        // TODO add your handling code here:
        RB_F.transferFocus();
        
    }//GEN-LAST:event_RB_FActionPerformed

    private void txt_PAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PAActionPerformed
        // TODO add your handling code here:
        txt_PA.transferFocus();
        
    }//GEN-LAST:event_txt_PAActionPerformed

    private void txtE_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtE_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtE_C1ActionPerformed

    private void txtE_IQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtE_IQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtE_IQActionPerformed

    private void txtTH_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTH_EMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTH_EMActionPerformed

    private void txtE_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtE_DPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtE_DPActionPerformed

    private void txtTH_SEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTH_SEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTH_SEActionPerformed

    private void btNuevo_TAOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_TAOHActionPerformed
        // TODO add your handling code here:
        desbloquearTrasladosAOtroHospital();
    }//GEN-LAST:event_btNuevo_TAOHActionPerformed

    private void btNuevo_TIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevo_TIActionPerformed
        // TODO add your handling code here:
        desbloquearTrasladosIntrahospitalarios();
        
    }//GEN-LAST:event_btNuevo_TIActionPerformed

    private void btI_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btI_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarIngreso();
    }//GEN-LAST:event_btI_LimpiarActionPerformed

    private void btE_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btE_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarEgreso();
    }//GEN-LAST:event_btE_LimpiarActionPerformed

    private void btTI_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTI_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTrasladoIHospitalarios();
    }//GEN-LAST:event_btTI_LimpiarActionPerformed

    private void btTH_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTH_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTrasladoAOHospital();
        
    }//GEN-LAST:event_btTH_LimpiarActionPerformed

    private void bt_IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IngresoActionPerformed
        // TODO add your handling code here:
        desbloquearIngreso();
    }//GEN-LAST:event_bt_IngresoActionPerformed

    private void txt_NTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        
    }//GEN-LAST:event_txt_NTKeyTyped

    private void txt_NKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NKeyTyped

    private void txt_PAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PAKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txt_PAKeyTyped

    private void txt_SAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SAKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c<'a'|| c>'z')&& (c<'A'|| c>'Z')) evt.consume();
    }//GEN-LAST:event_txt_SAKeyTyped

    private void txt_ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ECActionPerformed
        // TODO add your handling code here:
        txt_EC.transferFocus();
    }//GEN-LAST:event_txt_ECActionPerformed

    private void txt_SAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SAActionPerformed
        // TODO add your handling code here:
        txt_SA.transferFocus();
    }//GEN-LAST:event_txt_SAActionPerformed

    private void txt_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NActionPerformed
        // TODO add your handling code here:
        txt_N.transferFocus();
    }//GEN-LAST:event_txt_NActionPerformed

    private void txt_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EActionPerformed
        // TODO add your handling code here:
        txt_E.transferFocus();
    }//GEN-LAST:event_txt_EActionPerformed

    private void txt_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MActionPerformed
        // TODO add your handling code here:
        txt_M.transferFocus();
    }//GEN-LAST:event_txt_MActionPerformed

    private void txt_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DActionPerformed
        // TODO add your handling code here:
        txt_D.transferFocus();
    }//GEN-LAST:event_txt_DActionPerformed

    private void txt_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HActionPerformed
        // TODO add your handling code here:
        txt_H.transferFocus();
    }//GEN-LAST:event_txt_HActionPerformed

    private void RB_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_MActionPerformed
        // TODO add your handling code here:
        RB_M.transferFocus();
    }//GEN-LAST:event_RB_MActionPerformed

    private void txt_NTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NTActionPerformed
        // TODO add your handling code here:
        txt_NT.transferFocus();
    }//GEN-LAST:event_txt_NTActionPerformed

    private void txt_DHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DHActionPerformed
        // TODO add your handling code here:
        txt_DH.transferFocus();
    }//GEN-LAST:event_txt_DHActionPerformed

    private void txt_RPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RPActionPerformed
        // TODO add your handling code here:
        txt_RP.transferFocus();
    }//GEN-LAST:event_txt_RPActionPerformed

    private void txt_RIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RIActionPerformed
        // TODO add your handling code here:
        txt_RI.transferFocus();
    }//GEN-LAST:event_txt_RIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB_F;
    private javax.swing.JRadioButton RB_M;
    private javax.swing.JButton btE_Limpiar;
    private javax.swing.JButton btI_Limpiar;
    private javax.swing.JButton btNuevo_TAOH;
    private javax.swing.JButton btNuevo_TI;
    private javax.swing.JButton btTH_Limpiar;
    private javax.swing.JButton btTI_Limpiar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Egreso;
    private javax.swing.JButton bt_Ingreso;
    private javax.swing.JRadioButton bt_M;
    private javax.swing.JButton bt_Nuevo;
    private javax.swing.JRadioButton bt_v;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtE_C;
    private javax.swing.JTextField txtE_C1;
    private javax.swing.JTextField txtE_C2;
    private javax.swing.JTextField txtE_DP;
    private javax.swing.JTextField txtE_DS;
    private javax.swing.JTextField txtE_IQ;
    private javax.swing.JTextField txtE_P;
    private javax.swing.JTextField txtI_A;
    private javax.swing.JTextField txtI_D;
    private javax.swing.JTextField txtI_DI;
    private javax.swing.JTextField txtI_H;
    private javax.swing.JTextField txtI_M;
    private javax.swing.JTextField txtI_SI;
    private javax.swing.JTextField txtTH_A;
    private javax.swing.JTextField txtTH_AH;
    private javax.swing.JTextField txtTH_DH;
    private javax.swing.JTextField txtTH_EM;
    private javax.swing.JTextField txtTH_H;
    private javax.swing.JTextField txtTH_M;
    private javax.swing.JTextField txtTH_NH;
    private javax.swing.JTextField txtTH_SE;
    private javax.swing.JTextField txtTH_TE;
    private javax.swing.JTextField txtTI_F;
    private javax.swing.JTextField txtTI_NI;
    private javax.swing.JTextField txtTI_TA;
    private javax.swing.JTextField txtTI_TD;
    private javax.swing.JTextField txt_D;
    private javax.swing.JTextField txt_DH;
    private javax.swing.JTextField txt_E;
    private javax.swing.JTextField txt_EC;
    private javax.swing.JTextField txt_H;
    private javax.swing.JTextField txt_M;
    private javax.swing.JTextField txt_N;
    private javax.swing.JTextField txt_NT;
    private javax.swing.JTextField txt_PA;
    private javax.swing.JTextField txt_RI;
    private javax.swing.JTextField txt_RP;
    private javax.swing.JTextField txt_SA;
    // End of variables declaration//GEN-END:variables
}
