package br.com.digitalhouse.exercrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.exercrecyclerview.adapter.AlunoAdapter;
import br.com.digitalhouse.exercrecyclerview.model.Aluno;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewAlunos;

    //Declaração da classe adaptadora
    AlunoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewAlunos = findViewById(R.id.recyclerViewAlunos);

        //Inicialização da classe adapter
        adapter = new AlunoAdapter(listaDeAlunos());

        //Setando o adapter para o componente recyclerView
        recyclerViewAlunos.setAdapter(adapter);

        //Definição do layout da lista utilizando a classe LayoutManager
        recyclerViewAlunos.setLayoutManager(new LinearLayoutManager(this));

    }

    //Método que retorna uma lista de alunos
    private List<Aluno> listaDeAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Jéssica Milena", "Mobile Android", R.drawable.imagem1));
        alunos.add(new Aluno("Fabio Tadashi", "Mobile Android", R.drawable.imagem2));
        alunos.add(new Aluno("Guilherme Sartori", "Mobile Android", R.drawable.imagem3));
        alunos.add(new Aluno("Victor Caldas", "Mobile Android", R.drawable.imagem4));
        alunos.add(new Aluno("Tairo Robero", "Mobile Android", R.drawable.imagem5));

        return alunos;
    }

}
