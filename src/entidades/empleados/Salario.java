package entidades.empleados;

public class Salario
{

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    private  double horasTrabajadas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    private double valorHora;

   public double calcularSalario()
   {
       return (this.getHorasTrabajadas()*this.getValorHora());
   }


}
