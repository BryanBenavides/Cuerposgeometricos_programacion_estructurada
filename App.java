import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);

        double valorA;
        double valorB;
        double resultado;
        double cociente = 0.0;
         
        int cantidadlados;
        int altura;

        double longitud;
        double profundidad;
        double diagonal;
        double perimetrobasemayor; 
        double area;
        double volumen;
        double areabasemayor;
        double areabasemenor;
        double areabase;
        double base;
        double radio;
        double generatriz;
        double perimetrobase;
        double areaLateral;
        double numeros;
        double apotema; 
        double apotemaB;
        double arealateral;
        double radiomayor;
        double perimetrobasemenor;
        double apotemapiramide;
        double apotemabase;
        double areaTotal;
        double apotemaP;


        System.out.println("Menu de opciones:");
        System.out.println("a) Sumar");
        System.out.println("b) Restar");
        System.out.println("c) Multiplicar");
        System.out.println("d) Dividir");
        System.out.println("e) Potenciacion");
        System.out.println("f) Radicacion");
        System.out.println("g) calcular prisma");
        System.out.println("h) calcular cilindro");
        System.out.println("i) calcular piramide");
        System.out.println("j) calcular cono");
        System.out.println("K) calcular esfera");
        System.out.println("l) calcular zona esferica");
        System.out.println("m) calcular Casquete esferico");
        System.out.println("n) calcular Tronco cono");
        System.out.println("N) calcular Tronco piramide");
        System.out.println("o) calcular (Huso esferico/Cuña esferica)");
        System.out.println("p) calcular Tetradeo");
        System.out.println("q) calcular Hexaedro");
        System.out.println("r) calcular Octaedro");
        System.out.println("s) calcular Dodecaedro");
        System.out.println("t) calcular Isoedro");
        System.out.println("u) calcular Ortoedro");
        System.out.println("v) Salir");

        char CG = lector.next().charAt(0);

            switch (CG) {
            case 'a':
                System.out.println("1) Sumar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("La suma de " + valorA + " + " + valorB + " = " + resultado);
                break;
            case 'b':
                System.out.println("2) Restar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("La diferencia entre " + valorA + " - " + valorB + " = " + resultado);
                break;
            case 'c':
                System.out.println("3) Multiplicar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El producto de " + valorA + " * " + valorB + " = " + resultado);
                break;
            case 'd':
                System.out.println("4) Dividir");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                if (valorB == 0) {
                    System.out.println("El divisor no puede ser 0.");
                } else {
                    cociente = valorA / valorB;
                    System.out.println("El cociente entre " + valorA + " / " + valorB + " = " + cociente);
                }                
                break;
            case 'e':
                System.out.println("e) Potenciacion");
                System.out.println("Base: ");
                valorA = lector.nextDouble();
                System.out.println("Exponente: ");
                valorB = lector.nextDouble();
                resultado = Math.pow(valorA,valorB);
                System.out.println(valorA + " a la " + valorB + " = " + resultado);
                break;
            case 'f':
                System.out.println("f) Radicacion");
                System.out.println("Radicando: ");
                valorA = lector.nextDouble();
                resultado = Math.sqrt(valorA);
                if (valorA < 0) {
                    System.out.println("El radicando " + valorA +  " no puede ser menor que 0");
                    System.out.println("El resultado es un numero complejo o imaginario");
                } else {
                    System.out.println(" La raiz cuadrada de " + valorA + " = " + resultado);
                }                
                break;
            case 'g':
            do{
                System.out.print("Cantidad de lados: ");
                cantidadlados = lector.nextInt();
                System.out.print("Altura: ");
                altura = lector.nextInt();
                System.out.print("Longitud de los lados: ");
                longitud = lector.nextDouble();
              } while (cantidadlados<=0 && altura<=0 && longitud<=0);
            perimetrobase = cantidadlados * longitud;
            areaLateral = perimetrobase * altura;
            double alfa = (Math.PI/180) * (360/cantidadlados);
            apotema = longitud / (2 * Math.tan((alfa)/2));
            areabase = (perimetrobase * apotema)/2;
            areaTotal = areaLateral + 2 * areabase;
            volumen = areabase * altura;
            System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
            System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
            System.out.println("Volumen: " + volumen + " unidades cubicas.");
            break;
            case 'h':
            do{
                System.out.print("digite el radio: ");
                radio = lector.nextDouble();
                System.out.print("digite la altura: ");
                altura = lector.nextInt();
              } while (radio<=0 && altura<=0);
            perimetrobase = 2 * Math.PI * radio;
            areaLateral = perimetrobase * altura;
            base = Math.PI * (radio * radio);
            areaTotal = areaLateral + 2;
            volumen = base * altura;
            System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
            System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
            System.out.println("Volumen: " + volumen + " unidades cubicas.");
            break;
            case 'i' :
            do{
                System.out.print("Cantidad de lados: ");
                cantidadlados = lector.nextInt();
                System.out.print("Altura: ");
                altura = lector.nextInt();
                System.out.print("Longitud de los lados: ");
                longitud = lector.nextDouble();
              } while (cantidadlados<=0 && altura<=0 && longitud<=0);
            perimetrobase = cantidadlados * altura;
            alfa = (Math.PI/180) * (360/cantidadlados);
            apotemaB = longitud / (2 * Math.tan((alfa)/2));
            apotemaP = altura + apotemaB;
            arealateral = perimetrobase * apotemaP;
            areabase = (perimetrobase * apotemaB)/2;
            areaTotal = arealateral + areabase;
            volumen = (areabase * altura)/3;
            System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
            System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
            System.out.println("Volumen: " + volumen + " unidades cubicas.");
            break;
            case 'j' :
            do{
            System.out.print("Altura: ");
            altura = lector.nextInt();
            System.out.println("radio: ");
            radio = lector.nextDouble();
              } while (altura<=0 && radio<=0);
         perimetrobase = 2* Math.PI * radio * altura;
         generatriz = altura * altura + radio * radio;
         arealateral = (perimetrobase * generatriz)/2;
         areabase = Math.PI * Math.pow(radio,2);
         areaTotal = arealateral + areabase;
         volumen = (areabase * altura)/3;
         System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
         System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
         System.out.println("Volumen: " + volumen + " unidades cubicas.");
         break;
        case 'k':
        do{
            System.out.println("digite el radio: ");
            radio = lector.nextDouble();
          } while (radio<=0);
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("area: " + area + "unidades");
        System.out.println("volumen: " + volumen + "unidades");
        break;
       case 'l':
       do{
        System.out.println("digite el radio: ");
        radio = lector.nextDouble();
        System.out.println("digite la altura: ");
        altura = lector.nextInt();
        System.out.println("digite el radiomayor: ");
        radiomayor = lector.nextDouble();
         } while (radio<=0 && altura<=0 && radiomayor<=0);
        area = 2 * Math.PI * radiomayor * altura;
        volumen = (Math.PI * altura) * ( altura *altura + 3 * radio * radio + 3 * radio * radio)/6;
        System.out.println("area: " + area + "unidades cubicas");
        System.out.println("volumen " + volumen + "unidades");
        break;
        case 'm':
        do{
            System.out.println("digite la altura: ");
            altura = lector.nextInt();
            System.out.println("digite el radiomayor: ");
            radiomayor = lector.nextDouble();
          } while (altura<=0 && radiomayor<=0);
        area = 2 * Math.PI * radiomayor * altura;
        volumen = (Math.PI * Math.pow(altura, 2)) * (3 * radiomayor - altura)/3;
        System.out.println("area: " + area + "unidades cubicas");
        System.out.println("volumen " + volumen + "unidades");
        break;
        case 'n':
        do{
            System.out.println("digite el radio: ");
            radio = lector.nextDouble();
            System.out.println("digite la altura: ");
            altura = lector.nextInt();
            System.out.println("digite el radiomayor: ");
            radiomayor = lector.nextDouble();
          } while (radio<=0 && altura<=0 && radiomayor<=0);
        generatriz = Math.pow(altura,2) * Math.pow(radio, 2);
        arealateral = Math.PI * generatriz * (radiomayor + radio);
        areabasemayor = Math.PI * Math.pow(radiomayor, 2);
        areabasemenor = Math.PI * Math.pow(radio, 2);
        areaTotal = arealateral + areabasemayor + areabasemenor;
        volumen = (1/3) * Math.PI * altura * (Math.pow(radiomayor, 2) + Math.pow(radio, 2)  + radiomayor * radio);
         System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        break;
        case 'N':
        do{
            System.out.println("Digite la altura: ");
            altura = lector.nextInt();
            System.out.println("Digite la longitud: ");
            longitud = lector.nextDouble();
            System.out.println("Digite la cantidad de lados");
            cantidadlados = lector.nextInt();
            System.out.println("digite la radio mayor: ");
            radiomayor = lector.nextDouble();
            System.out.println("digite la radio : ");
            radio = lector.nextDouble();
          } while (altura<=0 && longitud<=0 && cantidadlados<=0 && radiomayor<=0 && radio<=0);
            alfa = (Math.PI/180) * (360/cantidadlados);
            apotemabase = longitud / (2 * Math.tan((alfa)/2));
            apotemapiramide = Math.pow(altura, 2) + (Math.pow(apotemabase, 2));
            perimetrobasemayor = cantidadlados * longitud;
            perimetrobasemenor = 2 * Math.PI * radio;
            arealateral = (perimetrobasemayor + perimetrobasemenor)/2 * apotemapiramide;
            areabasemayor = Math.PI * Math.pow(radiomayor, 2);
            areabasemenor = Math.PI * Math.pow(radio, 2);
            areaTotal = arealateral + areabasemayor + areabasemenor;
            volumen = (1/3) * altura * (areabasemayor + areabasemenor + Math.sqrt(areabasemayor * areabasemenor));
            System.out.println("Area lateral: " + arealateral + " unidades cuadradas.");
            System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
            System.out.println("Volumen: " + volumen + " unidades cubicas.");
            break;
            case 'o':
            do{
                System.out.println("Digite el radio: ");
                radio = lector.nextDouble();
                System.out.println("Digite el numero grados: ");
                numeros = lector.nextDouble();
              } while (radio<=0 && numeros<=0);
            area = (4 * Math.PI * radio * radio * numeros)/360;
           volumen = (4/3) * (Math.PI * Math.pow(radio, 3) * numeros)/360;
           System.out.println("Area: " + area);
           System.out.println("volumen: " + volumen);
           break;
           case 'p':
           do{
            System.out.println("Digite la base: ");
            areabase = lector.nextInt();
             } while (areabase<=0);
           area = Math.pow(areabase, 2) * Math.sqrt(3);
           volumen = (Math.sqrt(2))/12 * Math.pow(areabase, 3);
           System.out.println("Area: " + area);
           System.out.println("volumen: " + volumen);
           break;
           case 'q':
           do{
            System.out.println("Digite la base: ");
            areabase = lector.nextInt();
             } while (areabase<=0);
           area = 6 * Math.pow(areabase, 2);
           volumen = Math.pow(areabase, 3);
           System.out.println("Area: " + area);
           System.out.println("volumen: " + volumen);
           break;
          case 'r':
          do{
            System.out.println("Digite la base: ");
            areabase = lector.nextInt();
            } while (areabase<=0);
          area = 2 * Math.pow(areabase, 2) * Math.sqrt(3);
        volumen = (Math.sqrt(2))/3 * Math.pow(areabase, 3);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        break;
        case 's':
        do{
            System.out.println("Digite la base: ");
            areabase = lector.nextInt();
          } while (areabase<=0);
          area = 3 * Math.pow(areabase, 2) * Math.sqrt(25 + 10) * Math.sqrt(5);
        volumen = (1/4) * ( 15 + 7 * Math.sqrt(5)) * Math.pow(areabase, 3);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        break;
        case 't':
        do{
            System.out.println("Digite la base: ");
            areabase = lector.nextInt();
          } while (areabase<=0);
        area = 5 * Math.pow(areabase, 2) * Math.sqrt(3);
        volumen = (5/12) * (3 + Math.sqrt(15)) *  Math.pow(areabase, 3);
        System.out.println("Area: " + area);
        System.out.println("volumen: " + volumen);
        break;
        case 'u':
            do{System.out.println("Digite la altura: ");
            altura = lector.nextInt();
            System.out.println("Digite la longitud: ");
            longitud = lector.nextDouble();
            System.out.println("Digite la profundidad: ");
            profundidad = lector.nextDouble();
              } while (altura<=0 && longitud<=0 && profundidad<=0);
        area = 2 * (altura * longitud + altura * profundidad + longitud * profundidad);
        diagonal = Math.sqrt(altura * altura + longitud * longitud + profundidad * profundidad);
        volumen = altura * longitud * profundidad;
        System.out.println("Area: " + area );
        System.out.println("Volumen: " + volumen );
        System.out.println("Diagonal: " + diagonal);
        break;
       case 'v':
         System.out.println("Saliendo del programa");
         break;
    }
     lector.close();
    }
}
