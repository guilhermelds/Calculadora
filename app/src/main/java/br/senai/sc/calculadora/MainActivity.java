package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacoes =  "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }
    public void onClickBotao1(View v) {
        atualizaNumeroDigitado("1");
        atualizarDisplay("1");
    }
    public void onClickBotao2(View v){
        atualizaNumeroDigitado("2");
        atualizarDisplay("2");
    }
    public void onClickBotao3(View v){
        atualizaNumeroDigitado("3");
        atualizarDisplay("3");
    }
    public void onClickBotao4(View v){
        atualizaNumeroDigitado("4");
        atualizarDisplay("4");
    }
    public void onClickBotao5(View v){
        atualizaNumeroDigitado("5");
        atualizarDisplay("5");
    }
    public void onClickBotao6(View v){
        atualizaNumeroDigitado("6");
        atualizarDisplay("6");
    }
    public void onClickBotao7(View v){
        atualizaNumeroDigitado("7");
        atualizarDisplay("7");
    }
    public void onClickBotao8(View v){
        atualizaNumeroDigitado("8");
        atualizarDisplay("8");
    }
    public void onClickBotao9(View v){
        atualizaNumeroDigitado("9");
        atualizarDisplay("9");
    }
    public void onClickBotao0(View v){
        atualizaNumeroDigitado("0");
        atualizarDisplay("0");
    }
    public void onClickAdicao(View v) {
        if (!primeiroNumero.isEmpty()) {
            operacoes = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar un número antes", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickSubtracao(View v){
        if(!primeiroNumero.isEmpty()){
            operacoes = "-";
            atualizarDisplay("-");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar un número antes", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickmultiplicacao(View v){
        if(!primeiroNumero.isEmpty()){
            operacoes = "x";
            atualizarDisplay("x");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar un número antes", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickdivisao(View v){
        if(!primeiroNumero.isEmpty()){
            operacoes = "/";
            atualizarDisplay("/");
        }else{
            Toast.makeText(MainActivity.this, "É preciso informar un número antes", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickIgual(View v){
        if(!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()){
            float numero1 = Integer.parseInt(primeiroNumero);
            float numero2 = Integer.parseInt(segundoNumero);
            if (operacoes.equals("+")){
                float resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            else if(operacoes.equals("-")){
                float resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            else if(operacoes.equals("x")){
                float resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            else if(operacoes.equals("/")){
                if(!segundoNumero.equals("0")){
                    float resultado = numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                }else{
                    display.setText(String.valueOf(" Impossível dividir por zero"));
                }
            }
        }else{

            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_SHORT).show();
        }

    }
    public void onClickLimpar(View v){
        operacoes = "";
        primeiroNumero = "";
        segundoNumero = "";
        display.setText(String.valueOf(""));

    }
    private void atualizarDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }
    private void atualizaNumeroDigitado(String numero){
        if (operacoes.isEmpty()){
            primeiroNumero = primeiroNumero + numero;
        }else{
            segundoNumero = segundoNumero + numero;
        }
    }

}