package src;
public class loadModel {

    static DecisionTreeClassifier loadedModel = DecisionTreeClassifier.loadModel("C:\\\\Users\\\\Manav Khandurie\\\\Downloads\\\\FASAL-FUSION\\\\models\\\\trained_model.ser");
    public static String middleware(double nitrogen, double phosphorus, double potassium, double temp, double humidity, double ph, double rain){
        String result="";
        result=loadedModel.predictCrop(75,88,98,50,54,1,70);
        return result;
    }
    public static void main(String[] args) {
        String result="",input;
        double nitrogen, phosphorus, potassium, temp, ph, humidity, rain;

        input = System.console().readLine("Enter the value of N: ");
        nitrogen = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of P: ");
        phosphorus = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of K: ");
        potassium = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of temp: ");
        temp = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of humidity: ");
        humidity = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of ph: ");
        ph = Double.parseDouble(input);

        input = System.console().readLine("Enter the value of rain: ");
        rain = Double.parseDouble(input);
        if (loadedModel != null) {
            result=loadedModel.predictCrop(nitrogen,phosphorus,potassium,temp,humidity,ph,rain);
            System.out.println(result);
        }
        else{
            System.out.println("No Model Created");
        }
    }
}