//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Traffic_Lights_Main {
    public static void main(String[] args) {

        Traffic_Lights go= Traffic_Lights.GREEN;
        for (Traffic_Lights lights: Traffic_Lights.values()){
           if(lights==go){
               System.out.println("Light is " + lights);
               System.out.println("Actions is " + go.getAction());
           }
        }
    }
}


