
public class MainData {
    public static void main(String[] args) {
        //a
        Data data1 = new Data(2023, 3, 2);
        //b
        System.out.println(data1);
        //c
        Data data2 = new Data(1974, 4, 25);
        //d
        System.out.println(data2.toAnoMesDiaString());
        //e
        if (data1.isMaior(data2)) {
            System.out.println("data1 é maior do que data2");
        } else {
            System.out.println("data 1 é menor ou igual a data2");
        }
        //f
        System.out.println("Diferença entre data1 e data2 é: "+ Math.abs(data1.calcularDiferenca(data2)));
        //g
        System.out.println("Número dias até ao natal data1 = " + data1.calcularDiferenca(2023,12,25));
        //h
        System.out.println("A data2 ocorreu no dia da semana: " + data2.determinarDiaDaSemana());
        //i
        if (Data.isAnoBissexto(data2.getAno())){
            System.out.println("O ano " + data2.getAno() + " é bissexto");
        } else{
            System.out.println("O ano " + data2.getAno() + " não é bissexto");
        }
    }
}
