package fr.damien.calcul_exo;

import java.util.StringTokenizer;

public class CalculScanner {

    public CalculScanner(String fullCalcul) {
        StringTokenizer tokens = new StringTokenizer(fullCalcul, " ");
        String[] splited = new String[tokens.countTokens()];

        int index = 0;
        while (tokens.hasMoreTokens()) {
            splited[index] = tokens.nextToken();
            ++index;
        }

        int[] num = new int[splited.length / 2 + 1];
        String[] operator = new String[splited.length / 2 ];
        int result = 0;
        int iterator = 1;
        int repeat = 0;
        int n = 0;

        for (int i = 0; i < splited.length ; i++){

            if (!splited[i].equals("-") && !splited[i].equals("+") && !splited[i].equals("*") && !splited[i].equals("/")){
                if (num[0] == 0){
                    num[0] = Integer.parseInt(splited[0]);
                }else {
                    num[iterator] = Integer.parseInt(splited[i]);
                    iterator++;
                }
            } else {

                    operator[repeat] = splited[i];
                    repeat++;
            }
            System.out.println(splited[i]);
        }

        for (int l = 0; l < num.length; l++){
            if(result == 0){
                result = num[0];
            }
            else {
                switch (operator[n]){
                    case "-":
                        result = result - num[l];
                        break;
                    case "+":
                        result = result + num[l];
                        break;
                    case "/":
                        result = result / num[l];
                        break;
                    case "*":
                        result = result * num[l];
                        break;
                }
                n++;
            }

        }

        System.out.println(result);
//        int result = 0;
//
//        for (int i = 0; i < splitedCalcul.length - 1; i++) {
//
//        }
//
//        for (int i = 0; i < splitedCalcul.length - 1; i++) {
//
//            switch (splitedCalcul[i]) {
//                case "-":
//
//                    break;
//            }
//
//            result = result;
//        }

    }
}
//    public static int calculString(String splitedCalcul) throws ScriptException {
//        int[] num = new int[splitedCalcul.length];
//        int result = 0;
//        String[] operator = new String[splitedCalcul.length];
//



//        for (int i = 0; i < splitedCalcul.length; i++){
//
//            System.out.println(splitedCalcul[i]);
//            if (!splitedCalcul[i].equals("-") && !splitedCalcul[i].equals("+") && !splitedCalcul[i].equals("*") && !splitedCalcul[i].equals("/")) {
//                num[i] = Integer.parseInt(splitedCalcul[i]);
//            }else {
//                operator[i] = splitedCalcul[i];
//            }
//        }
//        for (int j = 0; j < num.length; j++){
//            if (result == 0){
//                result = num[j];
//            }else if(operator[j].equals("-")){
//                result = result - num[j];
//            }else if(operator[j].equals("+")){
//                result = result + num[j];
//            }else if(operator[j].equals("/")){
//                result = result / num[j];
//            }else if(operator[j].equals("*")){
//                result = result * num[j];
//            }
//        }
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("js");
//        Object result = engine.eval(finalCalcul);

//        return result;
//    }
//}
