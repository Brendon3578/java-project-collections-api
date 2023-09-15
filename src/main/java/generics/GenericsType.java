package main.java.generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsType {



    public static void main(String[] args) {
        // descomente para ver o debug do código de exemplo de lista
        listExample();

        // descomente para ver o debug do código de exemplo de map
        mapExample();
    }

    public static void listExample() {
        // criando um objeto de caixa que só aceita valores inteiros através de Generics
        Box<Integer> caixa = new Box();

        caixa.setT(2);
        System.out.println("Os valor que está na caixa é: " + caixa.getT());

        // criando uma lista de nomes de usuários utilizando o Generics (com string)
        List<String> users = new ArrayList<>();

        users.add("Fulano");
        users.add("Betano");
        users.add("Ciclano");

        // Iterando sobre a lista com generics
        for (String usersNames : users) {
            System.out.println(usersNames);
        }

        // criando uma lista de usuários SEM usar Generics

        List colors = new ArrayList();

        colors.add("Red");
        //colors.add(10); // irá executar um exception depois
        colors.add("Blue");

        // iterando sobre cada valor
        for (Object color : colors) {
            // é necessário fazer um cast explícito
            String str = (String) color;
            System.out.println(color);
        }
    }

    public static void mapExample() {
        Map<String, Integer> coresHexadecimal = new HashMap();

        coresHexadecimal.put("red", 0xff0000);
        coresHexadecimal.put("green", 0x00ff00);
        coresHexadecimal.put("blue", 0x0000ff);

        String key = "blue";

        System.out.println("O valor " + key + " em hexadecimal (convertido para decimal) é: " + coresHexadecimal.get(key));

        // iterar pra cada valor dentro do map

        for (Map.Entry<String, Integer> entry : coresHexadecimal.entrySet()) {
            String colorKey = entry.getKey();
            Integer colorValue = entry.getValue();

            System.out.println("Chave: " +colorKey + " tem o seu valor: " + colorValue);
        }
    }

}
