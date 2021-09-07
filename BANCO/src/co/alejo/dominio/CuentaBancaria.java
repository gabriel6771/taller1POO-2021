package co.alejo.dominio;

public class CuentaBancaria {
    // Atributos
    public int numero;
    public String tipoCuenta;
    public long saldo;
    public Persona propietario;
    public Banco banco;
    public boolean activa;

    // Métodos
    public void activar() {
        activa = true;
    }

    public void inactivar() {
        activa = false;
    }

    public boolean consignar(long dineroAConsignar) {
        if (activa == true) {
            saldo += dineroAConsignar;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(long dineroARetirar) {
        return true;
    }

    public boolean transferir(CuentaBancaria cuentaDestino, long dineroATransferir) {
        return true;
    }

    public void mostrarSaldo() {
        System.out.println("El saldo de la cuenta " + numero + " es: $" + saldo);
    }
}
