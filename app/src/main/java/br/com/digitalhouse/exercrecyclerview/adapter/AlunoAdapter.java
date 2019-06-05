package br.com.digitalhouse.exercrecyclerview.adapter;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.exercrecyclerview.R;
import br.com.digitalhouse.exercrecyclerview.model.Aluno;
import de.hdodenhof.circleimageview.CircleImageView;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {

    private List<Aluno> listaAlunos;

    public AlunoAdapter(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @Override
    //Infla o layout do item e retorna uma nova instancia do ViewHolder
    public AlunoAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_lista_item_aluno, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlunoAdapter.ViewHolder viewHolder, int i) {

        //Criar uma nova instancia
        Aluno novoContato = listaAlunos.get(i);

        //adiciona o valor da instancia para ser atribuido no componente
        viewHolder.bind(novoContato);

    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    // CLASSE ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nomeAluno;
        TextView nomeCurso;
        CircleImageView profileAluno;

        public ViewHolder(View itemView) {
            super(itemView);

            nomeAluno = itemView.findViewById(R.id.nomeAluno);
            nomeCurso = itemView.findViewById(R.id.nomeCurso);
            profileAluno = itemView.findViewById(R.id.circleImageViewProfile);

        }

        public void bind(Aluno aluno) {
            nomeAluno.setText(aluno.getNome());
            nomeCurso.setText(aluno.getCurso());
            profileAluno.setImageResource(aluno.getFoto());

        }
    }


}