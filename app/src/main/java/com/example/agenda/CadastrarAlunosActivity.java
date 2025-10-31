package com.example.agenda;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastrarAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_alunos);

        Button botaosalvar = findViewById(R.id.activity_cadastrar_aluno_botao);

        final EditText nomeAluno = findViewById(R.id.activity_cadastrar_aluno_nome);
        final EditText telefoneAluno = findViewById(R.id.activity_cadastrar_aluno_telefone);
        final EditText emailAluno = findViewById(R.id.activity_cadastrar_aluno_email);



        botaosalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomeAluno.getText().toString();
                String telefone = telefoneAluno.getText().toString();
                String email = emailAluno.getText().toString();

                var alunoCriado = new Aluno(nome, telefone, email);


                Toast.makeText(CadastrarAlunosActivity.this, "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                Toast.makeText(CadastrarAlunosActivity.this, alunoCriado.getNome(), Toast.LENGTH_LONG).show();
                Toast.makeText(CadastrarAlunosActivity.this, alunoCriado.getTelefone(), Toast.LENGTH_LONG).show();
                Toast.makeText(CadastrarAlunosActivity.this, alunoCriado.getEmail(), Toast.LENGTH_LONG).show();
            }
        });

    }
}