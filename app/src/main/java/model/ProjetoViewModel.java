package model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ProjetoViewModel {

    private int Id;
    private String Descricao;
    private Calendar DataInicio;

    public ProjetoViewModel(int id, String descricao) {
        Id = id;
        Descricao = descricao;
    }

    public ProjetoViewModel(String descricao, Calendar dataInicio, Calendar dataFim) {
        Descricao = descricao;
        DataInicio = dataInicio;
        DataFim = dataFim;
    }

    public ProjetoViewModel() {
    }

    public Calendar getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        DataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return DataFim;
    }

    public void setDataFim(Calendar dataFim) {
        DataFim = dataFim;
    }

    private Calendar DataFim;

    public int getId() {
        return Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setId(int id) {
        Id = id;
    }
}
