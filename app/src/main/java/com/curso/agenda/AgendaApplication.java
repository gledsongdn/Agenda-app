package com.curso.agenda;

import android.app.Application;

import com.curso.agenda.dao.AlunoDao;
import com.curso.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDao dao = new AlunoDao();
        dao.salva(new Aluno("Gledson", "2222222", "gledson@gmail.com"));
        dao.salva(new Aluno("Maria", "3333333", "maria@gmail.com"));
    }
}
