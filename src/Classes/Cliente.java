package Classes;

public class Cliente {
    private String nombre;
    private int dni;
    private double saldoInicial;
    private Integer nrodeCuenta;
    private int cbu;
    private String alias;

    public Cliente (String nombre, int dni ) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldoInicial = 0;
        this.nrodeCuenta = 123456;
        this.cbu = 12343657;
        this.alias = nombre + "random";
    }

public String getNombre(){
    return this.nombre;
    }

    public int getDni(){
        return this.dni;
    }

    public double getSaldoInicial() {
        return this.saldoInicial;
    }
    public void setSaldoInicial(Double nuevoSaldo){
        this.saldoInicial= nuevoSaldo;
    }
    public int getNrodeCuenta (){
        return  this.nrodeCuenta;
    }
    public int getCbu(){
        return  this.cbu;
    }

    public String getAlias(){
        return this.alias;
    }
    public void setAlias(String nuevoAlias){
        this.alias= nuevoAlias;
    }
}
