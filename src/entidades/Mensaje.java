package entidades;

public enum Mensaje
{

  MENSAJE_PETICION_HORAS("Ingrese  las horas trabajadas "),
 MENSAJE_PETICION_VALOR_HORA("Ingrese el valor de la hora de trabajo"),
    MENSAJE_SALARIO_PAGAR("El salario a pagar es :");

  private String mensaje;

    Mensaje(String s)
    {
        this.mensaje=s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
