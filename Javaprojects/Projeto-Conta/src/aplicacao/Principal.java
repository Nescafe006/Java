package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresarial;
import entidade.Contasalva;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;



public class Principal {

    public static void main(String[] args){
   

        Locale ptBR= Locale.forLanguageTag("pt-BR");
        Locale.setDefault(ptBR);

        List<Conta>list= new ArrayList<>();

        list.add(new Contasalva(1001,"alex",500.00,0.01));
       
        list.add(new ContaEmpresarial(1002,"maria",1000.0,400.0));

        list.add(new Contasalva(1004,"bob",300.0,0.01));

        list.add(new ContaEmpresarial(1005,"anna",500.0,500.0));




        

        double sum = 0.0;
        for(Conta con : list){
           sum+=con.getSaldo();


        }

        for(Conta con : list){
            System.out.printf("saldo da conta %d: %.2f%n",
            con.getNumero(), con.getSaldo());

        }

        System.out.printf("Saldo total: %.2f%n", sum);

        for (Conta con : list){
            con.deposito(10.0);
        }

        double som = 0.0;
        for(Conta con : list){
           som+=con.getSaldo();


        }


        for(Conta con : list){
            System.out.printf("saldo da conta atualizado %d: %.2f%n",
            con.getNumero(), con.getSaldo());

        }

        System.out.printf("Saldo total atualizado: %.2f%n", som);



    }

    

}
