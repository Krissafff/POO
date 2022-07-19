package com.cursoandroid.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta conta = new Conta();
        conta.depositar(100);//200
        conta.sacar(50);//150


        System.out.println( conta.recuperarSaldo() );

    }
}

        /*
        Passaro passaro = new Passaro();
        passaro.correr();



        Cao cao = new Cao();
        cao.correr();


        Animal animal = new Animal();
        animal.correr();
        */



        /*
        //Retornos e Parametros
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Henrique";
        funcionario.salario= 920;

        double salarioRecuperado = funcionario.recuperarSalario( 120, 20 );
        System.out.println( "O Salário é: " + salarioRecuperado );
        //int numero = 10;
        Casa minhaCasa = new Casa();

        minhaCasa.cor = "verde";

        Casa minhaCasa2 = new Casa();
        minhaCasa2.cor = "Branca";

        System.out.println( minhaCasa.cor );
        minhaCasa.abrirPorta();*/
