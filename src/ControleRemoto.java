public class ControleRemoto {
    private Televisor televisor;

    public ControleRemoto(Televisor televisor){
        this.televisor = televisor;
    }

    public Integer mudarVolume(boolean opereacao){
        if (opereacao){
            this.televisor.aumentarVolume();
        }else{
            this.televisor.diminuirVolume();
        }
        return televisor.getVolume();
    }

    public void trocarCanal(Integer canal){
        this.televisor.trocaCanal(canal);
    }

    public void sintonizarCanal(Integer canal){
        this.televisor.sintonizarNovoCanal(canal);
    }
}
