package JavaControlesdeFluxo;

public class SwitchCase {
    float calculaBonus(String cargo,float salario){
        float bonus = 0f;
        cargo = cargo.toLowerCase();
        switch (cargo){
            case "gerente":
                bonus = salario*1.5f;
                break;
            case "analista":
                bonus = salario*1.3f;
                break;
            case "supervisor":
                bonus = salario*1.1f;
                break;
            default:
                bonus = salario*0.7f;
                break;
        }
        return bonus;

        /*if (cargo.equals("gerente")){
            bonus = salario*1.5f;
        }else if(cargo.equals("analista")){
            bonus = salario * 1.3f;
        }else if(cargo.equals("supervisor")){
            bonus = salario * 1.1f;
        }else {
            bonus = salario * 0.7f;
        }
        return bonus;*/
    }
    public static void main(String[] args) {
        String cargo = "gerente";
        float salario = 1000f;
        float bonus = new SwitchCase().calculaBonus(cargo,salario);
        System.out.println("O salario do cargo "+cargo+" é: "+salario + "e sua bonificação é: "+ bonus);
        System.out.println("seu ganho foi de: "+(salario+bonus));
    }
}
