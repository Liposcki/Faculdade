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
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao0(View V) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickBotao1(View V) {
        atualizarNumeroDigitado("1");
        atualizarDisplay("1");
    }

    public void onClickBotao2(View V) {
        atualizarNumeroDigitado("2");
        atualizarDisplay("2");
    }

    public void onClickBotao3(View V) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public void onClickBotao4(View V) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public void onClickBotao5(View V) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }

    public void onClickBotao6(View V) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }

    public void onClickBotao7(View V) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public void onClickBotao8(View V) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public void onClickBotao9(View V) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public void onClickAdicao(View V) {
        if(!primeiroNumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            operacaoIncompleta();
        }
    }

    public void onClickSubtracao(View V) {
        if(!primeiroNumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            operacaoIncompleta();
        }
    }

    public void onClickMultiplicacao(View V) {
        if(!primeiroNumero.isEmpty()) {
            operacao = "x";
            atualizarDisplay("x");
        } else {
            operacaoIncompleta();
        }
    }

    public void onClickDivisao(View V) {
        if(!primeiroNumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay("/");
        } else {
            operacaoIncompleta();
        }
    }

    public void onClickIgual(View V) {
        if(!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {
            int numero1 = Integer.parseInt(primeiroNumero);
            int numero2 = Integer.parseInt(segundoNumero);
            int resultado = 0;
            if (operacao.equals("+")) {
                resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("x")) {
                resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/") && numero2 != 0) {
                resultado = numero1 / numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/") && numero2 == 0) {
                Toast.makeText(MainActivity.this, "Não é permitido dividir por zero.", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_LONG).show();
        }
    }

    private void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado(String numero) {
        if(operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + numero;
        } else {
            segundoNumero = segundoNumero + numero;
        }
    }

    private void operacaoIncompleta() {
        Toast.makeText(MainActivity.this, "Necessário digitar um número para a operação.", Toast.LENGTH_LONG).show();
    }
}