package cuentas;

/**
 * Clase que define el objeto Cuenta
 * @author CIDEAD
 */
public class CCuenta {
    /**
    * Atributos de la clase cuenta.
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de Interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipo de Interés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
  
/**
 * Método constructor por defecto
 */
    public CCuenta() {
    }

    /**
     * Método constructor parametrizado
     * @param nom el nombre 
     * @param cue la cuenta
     * @param sal el saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
       
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método que muestra el saldo actual de la cuenta
     * @return 
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para realizar un ingreso en cuenta
     * @param cantidad la cantidad a ingresar
     * @throws Exception Controla que la cantidad introducida no sea negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
        {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para realizar una retirada en cuenta
     * @param cantidad la cantidad a retirar
     * @throws Exception Controla que la cantidad introducida no sea negativa ni menor al saldo en cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
        {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad)
        {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método toString que devuelve una cadena de texto con los valores de todos los atributos de una cuenta
     * @return 
     */
    @Override
    public String toString() {
        return "CCuenta{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoInterés" + tipoInterés + '}';
    }
    
 

}
