import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Funcionario {
    private String nome;
    private String email;
    private Map<String, Integer> horasTrabalhadas;
    private Map<String, Double> salarioPorHora;

    public Funcionario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.horasTrabalhadas = new HashMap<String, Integer>();
        this.salarioPorHora = new HashMap<String, Double>();
    }
    public void setHorasTrabalhadas(String mes, Integer horas){
        this.horasTrabalhadas.put(mes.toUpperCase(), horas);
    }

    public void setSalarioPorHora(String mes, Double salarioPorHora) {
        this.salarioPorHora.put(mes.toUpperCase(), salarioPorHora);
    }

    public Double retornarSalarioMensal(String mes){
        Integer horasTrabalhadas = this.horasTrabalhadas.get(mes.toUpperCase());
        Double salarioPorHora = this.salarioPorHora.get(mes.toUpperCase());

        return horasTrabalhadas * salarioPorHora;
    }


}
