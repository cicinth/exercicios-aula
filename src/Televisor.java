import java.util.ArrayList;

public class Televisor {
    private String fabricante;
    private String modelo;
    private Integer canalAtual;
    private ArrayList<Integer> listaCanais;
    private Integer volume;

    public  Televisor(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.canalAtual = 0;
        this.listaCanais = new ArrayList<Integer>();
        this.volume = 0;
    }
    public Integer aumentarVolume(){
        if(this.volume < 100){
            this.volume++;
        }
        return this.volume;
    }

    public Integer diminuirVolume(){
        if(this.volume > 0 ){
            this.volume--;
        }
        return this.volume;
    }

    public void trocaCanal(Integer canal){
        this.canalAtual = canal;
    }

    public void sintonizarNovoCanal(Integer novoCanal){
        boolean econtreiOcanal = false;
        for(int i = 0; i < listaCanais.size(); i++){
            if(listaCanais.get(i) == novoCanal){
                econtreiOcanal = true;
                break;
            }
        }

        if(!econtreiOcanal)listaCanais.add(novoCanal);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(Integer canalAtual) {
        this.canalAtual = canalAtual;
    }

    public ArrayList<Integer> getListaCanais() {
        return listaCanais;
    }

    public void setListaCanais(ArrayList<Integer> listaCanais) {
        this.listaCanais = listaCanais;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
