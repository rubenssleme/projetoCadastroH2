package br.com.bg.siscad.view;

import br.com.bg.siscad.controller.ControladorTelaAcessoRapido;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author l
 */
public class AcessoRapido_v2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaUsuario
     */
    public AcessoRapido_v2() {
        initComponents();
    }

    public AcessoRapido_v2(JFrame telaPrincipal, JDesktopPane desktop) {
        this();
        controlador = new ControladorTelaAcessoRapido(telaPrincipal, desktop, 
                lblConsultar, lblAluno, lblFuncionario, lblUsuario, lblProduto, 
                lblAluno1, lblFuncionario1, lblProduto2, lblProduto2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblAluno = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblContribuicao = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        lblCompraProduto = new javax.swing.JLabel();
        lblDespesa = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblAluno1 = new javax.swing.JLabel();
        lblFuncionario1 = new javax.swing.JLabel();
        lblProduto2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblAluno2 = new javax.swing.JLabel();
        lblFuncionario2 = new javax.swing.JLabel();
        lblProduto3 = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblAluno3 = new javax.swing.JLabel();
        lblFuncionario3 = new javax.swing.JLabel();
        lblProduto4 = new javax.swing.JLabel();
        lblConsultar2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setAutoscrolls(true);
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 150));

        lblAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cadastramento-icon.png"))); // NOI18N
        lblAluno.setText("Cadastramento");
        lblAluno.setToolTipText("Cadastrar Aluno");
        lblAluno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAluno.setMinimumSize(new java.awt.Dimension(134, 100));
        lblAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblFuncionario.setToolTipText("Cadastrar Funcionário");
        lblFuncionario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFuncionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFuncionario.setMinimumSize(new java.awt.Dimension(100, 100));

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actions-user -icon.png"))); // NOI18N
        lblUsuario.setText("Cadastro Usuario");
        lblUsuario.setToolTipText("Cadastrar Usuário");
        lblUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUsuario.setMinimumSize(new java.awt.Dimension(100, 100));
        lblUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblProduto.setToolTipText("Cadastrar Produto");
        lblProduto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblProduto.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lblFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lblAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblAluno.getAccessibleContext().setAccessibleDescription("Cadastramento");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar"));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 150));
        jPanel3.setName(""); // NOI18N

        lblContribuicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContribuicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cash_icon_finder.png"))); // NOI18N
        lblContribuicao.setToolTipText("Registrar Contribuição");
        lblContribuicao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblContribuicao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblContribuicao.setMinimumSize(new java.awt.Dimension(100, 100));

        lblVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/venda.png"))); // NOI18N
        lblVenda.setToolTipText("Registrar Venda");
        lblVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVenda.setMinimumSize(new java.awt.Dimension(100, 100));

        lblCompraProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buyProduct.png"))); // NOI18N
        lblCompraProduto.setToolTipText("Registrar Compra de Produto");
        lblCompraProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCompraProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCompraProduto.setMinimumSize(new java.awt.Dimension(100, 100));

        lblDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/moneyWithWings1.png"))); // NOI18N
        lblDespesa.setToolTipText("Registrar Despesa");
        lblDespesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDespesa.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel15.setText("Contribuição");

        jLabel16.setText("Venda");

        jLabel17.setText("Compra de Produto");

        jLabel18.setText("Despesa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblContribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCompraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblCompraProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblContribuicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Acesso");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Rapido");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/acesso_rapido_icon_finder.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Acesso Rapido");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));
        jPanel7.setMinimumSize(new java.awt.Dimension(0, 150));

        lblAluno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cadastramento-icon.png"))); // NOI18N
        lblAluno1.setText("Cadastramento");
        lblAluno1.setToolTipText("Cadastrar Aluno");
        lblAluno1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAluno1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAluno1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAluno1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAluno1.setMinimumSize(new java.awt.Dimension(134, 100));
        lblAluno1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFuncionario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblFuncionario1.setToolTipText("Cadastrar Funcionário");
        lblFuncionario1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFuncionario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFuncionario1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFuncionario1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblProduto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblProduto2.setToolTipText("Cadastrar Produto");
        lblProduto2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblProduto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProduto2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblProduto2.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFuncionario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));
        jPanel8.setMinimumSize(new java.awt.Dimension(0, 150));

        lblAluno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAluno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cadastramento-icon.png"))); // NOI18N
        lblAluno2.setText("Cadastramento");
        lblAluno2.setToolTipText("Cadastrar Aluno");
        lblAluno2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAluno2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAluno2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAluno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAluno2.setMinimumSize(new java.awt.Dimension(134, 100));
        lblAluno2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFuncionario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblFuncionario2.setToolTipText("Cadastrar Funcionário");
        lblFuncionario2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFuncionario2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFuncionario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFuncionario2.setMinimumSize(new java.awt.Dimension(100, 100));

        lblProduto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblProduto3.setToolTipText("Cadastrar Produto");
        lblProduto3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblProduto3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProduto3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblProduto3.setMinimumSize(new java.awt.Dimension(100, 100));

        lblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon_finder.png"))); // NOI18N
        lblConsultar.setText("Consultar");
        lblConsultar.setToolTipText("Consultar");
        lblConsultar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblConsultar.setMinimumSize(new java.awt.Dimension(100, 100));
        lblConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFuncionario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAluno2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));
        jPanel9.setMinimumSize(new java.awt.Dimension(0, 150));

        lblAluno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAluno3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cadastramento-icon.png"))); // NOI18N
        lblAluno3.setText("Cadastramento");
        lblAluno3.setToolTipText("Cadastrar Aluno");
        lblAluno3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAluno3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAluno3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAluno3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAluno3.setMinimumSize(new java.awt.Dimension(134, 100));
        lblAluno3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFuncionario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncionario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblFuncionario3.setToolTipText("Cadastrar Funcionário");
        lblFuncionario3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFuncionario3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFuncionario3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFuncionario3.setMinimumSize(new java.awt.Dimension(100, 100));

        lblProduto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interrogation_icon_finder.png"))); // NOI18N
        lblProduto4.setToolTipText("Cadastrar Produto");
        lblProduto4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblProduto4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProduto4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblProduto4.setMinimumSize(new java.awt.Dimension(100, 100));

        lblConsultar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConsultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon_finder.png"))); // NOI18N
        lblConsultar2.setText("Consultar");
        lblConsultar2.setToolTipText("Consultar");
        lblConsultar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblConsultar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblConsultar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblConsultar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblConsultar2.setMinimumSize(new java.awt.Dimension(100, 100));
        lblConsultar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFuncionario3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblConsultar2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFuncionario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAluno3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 1672, 825);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblAluno1;
    private javax.swing.JLabel lblAluno2;
    private javax.swing.JLabel lblAluno3;
    private javax.swing.JLabel lblCompraProduto;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblConsultar2;
    private javax.swing.JLabel lblContribuicao;
    private javax.swing.JLabel lblDespesa;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblFuncionario1;
    private javax.swing.JLabel lblFuncionario2;
    private javax.swing.JLabel lblFuncionario3;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblProduto2;
    private javax.swing.JLabel lblProduto3;
    private javax.swing.JLabel lblProduto4;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVenda;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaAcessoRapido controlador;
}
