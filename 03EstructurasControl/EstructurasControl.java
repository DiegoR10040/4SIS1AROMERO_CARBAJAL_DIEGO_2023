import java.util.Scanner;

class EstructurasControl{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, numbinario, total, cantidadproducto, num1, edad, cantidad;
        int positivos = 0, negativos = 0;
        double precioAbono, fahrenheit, celsius, kelvin, rankine;
        float precio, resultado, compra=0;
        String nombreproducto;
        String binario = "";
        char letra;
        double longitud, anchura, areaRectangulo, perimetroRectangulo;
        double base, altura, areaTriangulo, perimetroTriangulo;
        double radioEsfera, volumenEsfera;
        double radioCilindro, alturaCilindro, volumenCilindro;

        do{

            System.out. println("Bienvenido al programa :) ");
            System.out. println("Elige alguna opcion deseada: ");
            System.out. println("1.- Descuento por edad ");
            System.out. println("2.- Convertir numero decimal a binario ");
            System.out. println("3.- Convertir temperaturas ");
            System.out. println("4.- Numeros Positivos y Negativos ");
            System.out. println("5.- Tiendita ");
            System.out. println("6.- Area y Perimetro ");
            System.out. println("7.- Tabla ");
            System.out. println("8.- Factorial ");
            System.out. println("9.- Dibujito ");
            System.out. println("10.- Figura Hueca ");
            System.out. println("11.- Patrones de codigo ");
            System.out. println("12.- Diamante ");
            System.out. println("13.- Calculadora ");
            System.out. println("14.- Salir ");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese su edad: ");
                    edad = entrada.nextInt();
                    precioAbono = 100.0; // Precio base del abono

                    if (edad > 65) {
                        precioAbono *= 0.6; // Descuento del 40% para mayores de 65 años
                    } else if (edad < 21) {
                        System.out.print("¿Sus padres son socios? (Sí/No): ");
                        String respuesta = entrada.next();

                        if (respuesta.equalsIgnoreCase("Sí")) {
                            precioAbono *= 0.55; // Descuento del 45% si los padres son socios
                        } else {
                            precioAbono *= 0.75; // Descuento del 25% si los padres no son socios
                        }
                    }

                    System.out.println("El precio del abono es: $" + precioAbono);
                    break;
                case 2:
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    if(numbinario > 0){
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0 ){
                        binario = "0" + binario;
                    }else{
                        binario = "No se puede convedrtir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    fahrenheit = entrada.nextDouble();
                    System.out.println("Elija la conversión deseada:");
                    System.out.println("1. Fahrenheit a Celsius");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Fahrenheit a Rankine");
                    int conversion = entrada.nextInt();

                    switch (conversion) {
                        case 1:
                            celsius = (fahrenheit - 32) * 5 / 9;
                            System.out.println("La temperatura en grados Celsius es: " + celsius);
                            break;
                        case 2:
                            kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                            System.out.println("La temperatura en Kelvin es: " + kelvin);
                            break;
                        case 3:
                            rankine = fahrenheit + 459.67;
                            System.out.println("La temperatura en Rankine es: " + rankine);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de números a evaluar: ");
                    cantidad = entrada.nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese un número: ");
                        int numero = entrada.nextInt();

                        if (numero > 0) {
                            positivos++;
                        } else if (numero < 0) {
                            negativos++;
                        }
                    }

                    System.out.println("Cantidad de números positivos: " + positivos);
                    System.out.println("Cantidad de números negativos: " + negativos);
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita");
                    System.out.println("Por favor ingrese el numero de productos que desea comprar?");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado;
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    System.out.println("Elija una opción:");
                    System.out.println("1. Calcular área y perímetro de un rectángulo");
                    System.out.println("2. Calcular área y perímetro de un triángulo");
                    System.out.println("3. Calcular volumen de una esfera");
                    System.out.println("4. Calcular volumen de un cilindro");
                    int opcionGeometria = entrada.nextInt();

                    switch (opcionGeometria) {
                        case 1:
                            System.out.print("Ingrese la longitud del rectángulo: ");
                            longitud = entrada.nextDouble();
                            System.out.print("Ingrese la anchura del rectángulo: ");
                            anchura = entrada.nextDouble();
                            areaRectangulo = longitud * anchura;
                            perimetroRectangulo = 2 * (longitud + anchura);
                            System.out.println("Área del rectángulo: " + areaRectangulo);
                            System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
                            break;
                        case 2:
                            System.out.print("Ingrese la base del triángulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            altura = entrada.nextDouble();
                            areaTriangulo = 0.5 * base * altura;
                            perimetroTriangulo = base + 2 * (Math.sqrt((base * base) + (altura * altura)));
                            System.out.println("Área del triángulo: " + areaTriangulo);
                            System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
                            break;
                        case 3:
                            System.out.print("Ingrese el radio de la esfera: ");
                            radioEsfera = entrada.nextDouble();
                            volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radioEsfera, 3);
                            System.out.println("Volumen de la esfera: " + volumenEsfera);
                            break;
                        case 4:
                            System.out.print("Ingrese el radio del cilindro: ");
                            radioCilindro = entrada.nextDouble();
                            System.out.print("Ingrese la altura del cilindro: ");
                            alturaCilindro = entrada.nextDouble();
                            volumenCilindro = Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro;
                            System.out.println("Volumen del cilindro: " + volumenCilindro);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            

            }
            




            System.out.println("Deseas repetir el programa?,escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S');
    }


}