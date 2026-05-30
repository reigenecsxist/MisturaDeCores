package sistemabancario;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Sistema_Bancario {

    public Sistema_Bancario() {
        
        boolean visuSaldo = true;
        String textoVisuSaldo="Esconder saldo";
        int[] opcao = {0, 0, 0};
        
        ArrayList<Transferencia> registro = new ArrayList<>();
        ArrayList<Transacao> extrato = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();
        
        do{
            opcao[0] = Integer.parseInt(JOptionPane.showInputDialog("1 - Acessar minha conta\n2 - Criar conta\n\n"
                    + "10 - Esqueci meu número da conta\n20 - Esqueci minha senha\n\n0 - Sair do programa"));
            String nomeEsquecido;
            String senhaEsquecida;
            int numContaEsquecido;
            
            switch(opcao[0]){
                case 1:
                    int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
                    
                    if(!contas.isEmpty()){
                        for(Conta ct : contas){
                            if(conta==ct.numConta){
                                String senha = JOptionPane.showInputDialog("Digite sua senha:");

                                if(senha.equals(ct.senha)){
                                    String saldoMostrado = "";
                                    int codigoOp = 0;
                                    
                                    do{
                                        if(visuSaldo) saldoMostrado = ""+ct.saldo;
                                        
                                        opcao[1] = Integer.parseInt(JOptionPane.showInputDialog("Olá, "+ct.nomeMeliante
                                            + "\n\nSaldo: "+saldoMostrado+""
                                            + "\n\n1 - Depósito"
                                            + "\n2 - Saque"
                                            + "\n3 - Extrato"
                                            + "\n4 - Transferências"
                                            + "\n5 - "+textoVisuSaldo+""
                                            + "\n\n0 - Sair da conta"
                                            + "\n\nQual serviço deseja realizar?"));

                                            switch(opcao[1]){
                                                case 0:
                                                    break;

                                                case 1:
                                                    float valorDep = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja depositar?"));                                                    
                                                    ct.saldo += valorDep;
                                                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                                                                                                        
                                                    Transacao trDeposito1 = new Transacao(codigoOp++, "Depósito", valorDep, ct.numConta, ct.senha, ct.nomeMeliante, ct.saldo);
                                                    extrato.add(trDeposito1);
                                                    
                                                    break;

                                                case 2:
                                                    float saque = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja sacar?"));
                                                    if(saque>ct.saldo) JOptionPane.showMessageDialog(null, "O valor solicitado para saque é maior que o saldo disponível!");
                                                    else {
                                                        ct.saldo -= saque;
                                                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                                                        
                                                        Transacao trDeposito2 = new Transacao(codigoOp++, "Saque", saque, ct.numConta, ct.senha, ct.nomeMeliante, ct.saldo);
                                                        extrato.add(trDeposito2);
                                                    }
                                                    break;

                                                case 3:
                                                    String tabelaExtrato = "<html>" +
                                                                                "    <table border='1'>" +
                                                                                "        <tr>" +
                                                                                "            <th>CÓDIGO</th>" +
                                                                                "            <th>OPERAÇÃO</th>" +
                                                                                "            <th>VALOR</th>" +
                                                                                "        </tr>";
                                                                for(Transacao ex:extrato){
                                                                    if(ex.numConta==ct.numConta){
                                                                        tabelaExtrato += "<tr>"
                                                                                + "     <td>"+ex.codigo+"</td>"
                                                                                + "     <td>"+ex.tipoOperacao+"</td>"
                                                                                + "     <td>"+ex.valor+"</td>"
                                                                                + "</tr>";
                                                                    }
                                                                }

                                                                tabelaExtrato += "     </table>"
                                                                        + "</html>";

                                                                JOptionPane.showMessageDialog(null, tabelaExtrato);
                                                    
                                                    
                                                    break;

                                                case 4:
                                                    do{
                                                        opcao[2] = Integer.parseInt(JOptionPane.showInputDialog("Tranferências\n\n"
                                                                + "1 - Realizar transferência\n"
                                                                + "2 - Ver registro de transferências\n"
                                                                + "0 - Voltar"
                                                                + "\n\nQual serviço deseja realizar?"));

                                                        switch(opcao[2]){
                                                            case 1:
                                                                int codigo = 1;
                                                                int contaRecebe = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da conta que irá receber o dinheiro?"));
                                                                
                                                                if(contaRecebe!=ct.numConta){
                                                                    for(Conta ctTf : contas){
                                                                        if(contaRecebe==ctTf.numConta){
                                                                            Float valorTf = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja transferir?"));
                                                                            if(valorTf>ct.saldo){
                                                                                JOptionPane.showMessageDialog(null, "O valor que deseja transferir é maior que o saldo disponível.");
                                                                            }
                                                                            else{
                                                                                int opTf = JOptionPane.showConfirmDialog(null, 
                                                                                        "Deseja transferir $"+valorTf+" para a conta de "+ctTf.nomeMeliante+"?", "Transferir?", JOptionPane.YES_NO_OPTION, 3);//colocar pra aparecer só sim ou não

                                                                                if(opTf==JOptionPane.YES_OPTION){
                                                                                    ctTf.saldo += valorTf;
                                                                                    ct.saldo -= valorTf;

                                                                                    JOptionPane.showMessageDialog(null, "O valor de $"+valorTf+" foi transferido para a conta "+contaRecebe+" de"
                                                                                            + " titularidade de "+ctTf.nomeMeliante+" com sucesso!\n\nSeu saldo atual: $"+ct.saldo);

                                                                                    Transferencia tf = new Transferencia(codigo++, ctTf.nomeMeliante, ct.numConta, contaRecebe, valorTf);
                                                                                    registro.add(tf);
                                                                                    Transacao trDepositoMeu = new Transacao(codigoOp++, "Transferência Enviada", valorTf, ct.numConta, ct.senha, ct.nomeMeliante, ct.saldo);
                                                                                    extrato.add(trDepositoMeu);//no extrato de quem envia, mas precisa estar no de quem recebe também
                                                                                    Transacao trDepositoDele = new Transacao(codigoOp++, "Transferência Recebida", valorTf, ctTf.numConta, ctTf.senha, ctTf.nomeMeliante, ctTf.saldo);
                                                                                    extrato.add(trDepositoDele);                                                                                    
                                                                                }
                                                                                else JOptionPane.showMessageDialog(null, "Transferência cancelada.");

                                                                            }
                                                                        }
                                                                        else if(contaRecebe!=ctTf.numConta&&contas.indexOf(ctTf)==contas.size()) 
                                                                            JOptionPane.showMessageDialog(null, "Conta não encontrada.");
                                                                    }
                                                                }
                                                                else JOptionPane.showMessageDialog(null, "Conta inválida!");
                                                                break;

                                                            case 2:
                                                                String tabelaTransferencias = "<html>" +
                                                                                "    <table border='1'>" +
                                                                                "        <tr>" +
                                                                                "            <th>CÓDIGO</th>" +
                                                                                "            <th>VALOR</th>" +
                                                                                "            <th>RECEBEDOR</th>" +
                                                                                "            <th>CONTA</th>" +
                                                                                "        </tr>";
                                                                for(Transferencia tx:registro){
                                                                    if(tx.contaEnvia==ct.numConta){//somente poder ver o próprio registro de transferências
                                                                        tabelaTransferencias += "<tr>"
                                                                                + "     <td>"+tx.codigo+"</td>"
                                                                                + "     <td>"+tx.valor+"</td>"
                                                                                + "     <td>"+tx.nome+"</td>"
                                                                                + "     <td>"+tx.contaRecebe+"</td>"
                                                                                + "</tr>";
                                                                    }
                                                                }

                                                                tabelaTransferencias += "     </table>"
                                                                        + "</html>";

                                                                JOptionPane.showMessageDialog(null, tabelaTransferencias);
                                                                break;

                                                            case 0:
                                                                break;
                                                        }
                                                    }while(opcao[2]!=0);
                                                break;

                                                case 5:

                                                    if(visuSaldo){
                                                        saldoMostrado = "****";
                                                        textoVisuSaldo = "Mostrar saldo";
                                                        visuSaldo = false;
                                                    }
                                                    else{
                                                        saldoMostrado = ""+ct.saldo;
                                                        textoVisuSaldo = "Esconder saldo";
                                                        visuSaldo = true;
                                                    }
                                                break;
                                            }

                                        }while(opcao[1]!=0);
                                    }
                                else JOptionPane.showMessageDialog(null, "Senha incorreta");

                                }
                            else if((contas.indexOf(ct)==contas.size()) && conta!=ct.numConta) JOptionPane.showMessageDialog(null, "Conta inexistente."); /*
                            Se o for-each estiver na última posição da lista e ainda assim o número da conta for difente do que está no objeto, aí sim a conta é inexistente.
                            */                        
                            }
                    }
                    else JOptionPane.showMessageDialog(null, "Conta inexistente.");
                    break;
                    
                case 2:
                    String nome = JOptionPane.showInputDialog("Insira o nome do titular da conta:");
                    String senha = JOptionPane.showInputDialog("Digite uma senha numérica de 4 dígitos para a conta:");
                    
                    while(senha.length()>4||senha.length()<4||!senha.matches("\\d+")){
                        JOptionPane.showMessageDialog(null, "Senha inválida");
                        senha = JOptionPane.showInputDialog("Digite uma senha numérica de 4 dígitos para a conta:");
                    }
                    
                    Random random = new Random();
                    int numero = random.nextInt(9000) + 1000;
                    for(Conta ct2 : contas){
                        if(numero==ct2.numConta) numero = random.nextInt(9000) + 1000;
                    }
                    
                    float saldo = 0;
                    
                    Conta ct = new Conta(numero, senha, nome, saldo);
                    contas.add(ct);
                    
                    JOptionPane.showMessageDialog(null, "CONTA CRIADA COM SUCESSO!\n\nTITULAR DA CONTA: "+nome+"\nNÚMERO DA CONTA: "+numero);
                    
                    break;
                    
                case 10:
                    nomeEsquecido = JOptionPane.showInputDialog("-RECUPERAÇÃO DE CONTA-\n\nInsira o nome do titular da conta:");
                    senhaEsquecida = JOptionPane.showInputDialog("-RECUPERAÇÃO DE CONTA-\n\nInsira a senha da conta:");
                    
                    for(Conta ct2 : contas){
                        if(nomeEsquecido.equals(ct2.nomeMeliante) && senhaEsquecida.equals(ct2.senha)) JOptionPane.showMessageDialog(null, "-RECUPERAÇÃO DE CONTA-\n\n"
                                + "O número da conta é: "+ct2.numConta);
                    }
                    
                    break;
                    
                case 20:
                    nomeEsquecido = JOptionPane.showInputDialog("-RECUPERAÇÃO DE CONTA-\n\nInsira o nome do titular da conta:");
                    numContaEsquecido = Integer.parseInt(JOptionPane.showInputDialog("-RECUPERAÇÃO DE CONTA-\n\nInsira o número da conta:"));
                    
                    for(Conta ct2 : contas){
                        if(nomeEsquecido.equals(ct2.nomeMeliante) && numContaEsquecido==ct2.numConta) JOptionPane.showMessageDialog(null, "-RECUPERAÇÃO DE CONTA-\n\n"
                                + "A senha da conta é: "+ct2.senha);
                    }
                    
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            
            }
            
        }while(opcao[0]!=0);
        
    }
    
    public class Conta{
        int numConta;
        String senha, nomeMeliante;
        float saldo=0;

        public Conta(int numConta, String senha, String nomeMeliante, float saldo) {
            this.numConta = numConta;
            this.senha = senha;
            this.nomeMeliante = nomeMeliante;
        }
    }
    
    private class Transferencia{
        int codigo;
        String nome;
        int contaEnvia;
        int contaRecebe;
        float valor;

        public Transferencia(int codigo, String nome,int contaEnvia, int contaRecebe, float valor) {
            this.nome = nome;
            this.contaEnvia = contaEnvia;
            this.contaRecebe = contaRecebe;
            this.valor = valor;
        }
    }
        
    private class Transacao extends Conta{
        int codigo;
        String tipoOperacao;
        float valor;

        public Transacao(int codigo, String tipoOperacao, float valor, int numConta, String senha, String nomeMeliante, float saldo) {
            super(numConta, senha, nomeMeliante, saldo);
            this.codigo = codigo;
            this.tipoOperacao = tipoOperacao;
            this.valor = valor;
        }
    }
    
    public static void main(String[] args) {
        Sistema_Bancario sis = new Sistema_Bancario();
    }
}
