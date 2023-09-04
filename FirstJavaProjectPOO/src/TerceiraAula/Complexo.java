package TerceiraAula;

public class Complexo {
    private double real;
    private double imaginaria;

    public Complexo() {
        real = 0.0;
        imaginaria = 0.0;
    }

    public Complexo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void inicializaNumero(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void imprimeNumero() {
        System.out.println(real + "+" + imaginaria + "i");
    }

    public boolean eIgual(Complexo complex) {
        return this.real == complex.real && this.imaginaria == complex.imaginaria;
    }

    public Complexo soma(Complexo complex) {
        return new Complexo(this.real + complex.real, this.imaginaria + complex.imaginaria);
    }

    public Complexo subtrai(Complexo complex) {
        return new Complexo(this.real - complex.real, this.imaginaria - complex.imaginaria);
    }

    public Complexo multiplica(Complexo complex) {
        double newReal = this.real * complex.real - this.imaginaria * complex.imaginaria;
        double newComplexo = this.real * complex.imaginaria + this.imaginaria * complex.real;
        return new Complexo(newReal, newComplexo);
    }

    public Complexo divide(Complexo complex) {
        double divisor = complex.real * complex.real + complex.imaginaria * complex.imaginaria;

        double newReal = (this.real * complex.real + this.imaginaria * complex.imaginaria) / divisor;
        double newComplexo = (this.imaginaria * complex.real - this.real * complex.imaginaria) / divisor;

        return new Complexo(newReal, newComplexo);
    }
}
