package br.com.bg.siscad.tela.controlador;

import br.com.bg.siscad.tela.AcessoRapido;
import br.com.bg.siscad.tela.TelaCadastroBiometrias;
import br.com.bg.siscad.tela.TelaCadastroFuncionario;
import br.com.bg.siscad.tela.TelaCadastroProduto;
import br.com.bg.siscad.tela.TelaCadastroUsuario;
import br.com.bg.siscad.tela.TelaCompraProduto;
import br.com.bg.siscad.tela.TelaConfiguracao;
import br.com.bg.siscad.tela.TelaConsulta;
import br.com.bg.siscad.tela.TelaContribuicao;
import br.com.bg.siscad.tela.TelaDespesa;
import br.com.bg.siscad.tela.TelaLogin;
import br.com.bg.siscad.tela.TelaSobre;
import br.com.bg.siscad.tela.TelaVenda;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author l
 */
public abstract class ControladorTela {

    private JFrame telaPrincipal;
    private JDesktopPane desktop;

    private AcessoRapido acessoRapido;
    private TelaLogin login;
    private TelaCadastroUsuario usuario;
    private TelaCadastroBiometrias aluno;
    private TelaCadastroProduto produto;
    private TelaCadastroFuncionario funcionario;
    private TelaConsulta consulta;
    private TelaContribuicao contribuicao;
    private TelaCompraProduto compraProduto;
    private TelaDespesa despesa;
    private TelaVenda venda;
    private TelaConfiguracao config;

    public ControladorTela(JFrame telaPrincipal, JDesktopPane desktop) {
        this.telaPrincipal = telaPrincipal;
        this.desktop = desktop;
    }

    public void acessoRapido(JFrame telaPrincipal, JDesktopPane desktop) {
        if (acessoRapido == null) {
            acessoRapido = new AcessoRapido(telaPrincipal, desktop);
            desktop.add(acessoRapido);
        }
        acessoRapido.setVisible(true);
        mostrarTela(acessoRapido);
    }

    public void acessoRapido() {
        if (acessoRapido == null) {
            acessoRapido = new AcessoRapido();
            desktop.add(acessoRapido);
        }
        acessoRapido.setVisible(true);
        mostrarTela(acessoRapido);
    }

    public void telaLogin() {
        telaPrincipal.dispose();
    }

    public void telaSobre() {
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }

    public void telaCadastroUsuario() {
        if (usuario == null) {
            usuario = new TelaCadastroUsuario();
            desktop.add(usuario);
        }
        usuario.setVisible(true);
        mostrarTela(usuario);
    }

    public void telaCadastroAluno() {
        if (aluno == null) {
            aluno = new TelaCadastroBiometrias();
            desktop.add(aluno);
        }
        aluno.setVisible(true);
        mostrarTela(aluno);
    }

    public void telaCadastroProduto() {
        if (produto == null) {
            produto = new TelaCadastroProduto();
            desktop.add(produto);
        }
        produto.setVisible(true);
        mostrarTela(produto);
    }

    public void telaCadastroFuncionario() {
        if (funcionario == null) {
            funcionario = new TelaCadastroFuncionario();
            desktop.add(funcionario);
        }
        funcionario.setVisible(true);
        mostrarTela(funcionario);
    }

    public void telaConsulta() {
        if (consulta == null) {
            consulta = new TelaConsulta();
            desktop.add(consulta);
        }
        consulta.setVisible(true);
        mostrarTela(consulta);
    }

    public void telaContribuicao() {
        if (contribuicao == null) {
            contribuicao = new TelaContribuicao();
            desktop.add(contribuicao);
        }
        contribuicao.setVisible(true);
        mostrarTela(contribuicao);
    }

    public void telaCompraProduto() {
        if (compraProduto == null) {
            compraProduto = new TelaCompraProduto();
            desktop.add(compraProduto);
        }
        compraProduto.setVisible(true);
        mostrarTela(compraProduto);
    }

    public void telaDespesa() {
        if (despesa == null) {
            despesa = new TelaDespesa();
            desktop.add(despesa);
        }
        despesa.setVisible(true);
        mostrarTela(despesa);
    }

    public void telaVenda() {
        if (venda == null) {
            venda = new TelaVenda();
            desktop.add(venda);
        }
        venda.setVisible(true);
        mostrarTela(venda);
    }

    public void telaConfiguracoes() {
        if (config == null) {
            config = new TelaConfiguracao();
            desktop.add(config);
        }
        config.setVisible(true);
        mostrarTela(config);
    }

    private void mostrarTela(JInternalFrame tela) {
        if (tela != acessoRapido) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tela.setSize(desktop.getSize());
        desktop.getDesktopManager().activateFrame(tela);
        try {
            tela.setSelected(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ControladorTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
