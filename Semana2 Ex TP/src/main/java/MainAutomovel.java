
public class MainAutomovel {
    public static void main(String[] args) {

        //a) Crie uma instância da classe Automovel, designada a1, com a marca Toyota, matrícula 11-11-AA e cilindrada 1400 cc;
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);

        //b) Mostre o automóvel a1 no ecrã;
        System.out.println("Automóvel a1: " + a1.toString());

        //c) Mostre apenas a matrícula do automóvel a1;
        System.out.println("Matrícula Automovél a1: " + a1.getMatricula());

        //d) Mostre a quantidade de instâncias Automovel criadas;
        System.out.println("Quantidade de Instâncias Criadas: " + Automovel.getTotalAutomoveis());

        //e) Crie uma nova instância da classe Automovel, designada a2, com a marca Audi e matrícula 22-22-BB;
        Automovel a2 = new Automovel("22-22-BB", "Audi");

        //f) Mostre o automóvel a2;
        System.out.println("Automóvel a2: " + a2.toString());

        //g) Modifique a cilindrada do automóvel a2 para 1800 cc;
        a2.setCilindrada(1800);

        //h) Mostre novamente o automóvel a2 no ecrã;
        System.out.println("Automóvel a2: " + a2.toString());

        //i) Mostre novamente a quantidade de instâncias Automovel criadas;
        System.out.println("Quantidade de Instâncias Criadas: " + Automovel.getTotalAutomoveis());

        //j) Mostre a diferença de cilindrada (valor absoluto) entre os automóveis a1 e a2;
        System.out.println("Diferença das cilindradas: " + Math.abs(a1.calcularDiferencaCilindrada(a2)));

        //k) Mostre a matrícula do automóvel que tem a maior cilindrada entre os automóveis a1 e a2;
        if (a1.isCilindradaMaior(a2)){
            System.out.println("Matricula do Automovel com maior cilindrada: "+ a1.getMatricula());
        } else if (a2.isCilindradaMaior(a1)) {
            System.out.println("Matricula do Automovel com maior cilindrada: "+ a2.getMatricula());
        } else {
            System.out.println("Os automóveis têm a mesma matricula");
        }

        //l) Verifique se a cilindrada do automóvel a1 é superior a 2000 cc.
        if (a1.isCilindradaMaior(2000)){
            System.out.println("A cilindrada do Automovel com a matrícula " + a1.getMatricula() + " é maior do que 2000cc");
        } else {
            System.out.println("A cilindrada do Automovel com a matrícula " + a1.getMatricula() + " é menor ou igual a 2000cc");
        }
    }
}
