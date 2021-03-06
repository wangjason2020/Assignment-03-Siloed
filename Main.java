import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float h1=72.0f;
        float h2=19.0f;
        float h3=50.0f;
        float h4=67.0f;
        float h5=16.0f;
        float h6=53.0f;
        float h7=69.0f;
        float h8=30.0f;
        float h9=52.0f;
        float h10=40.0f;
        float h11=31.0f;
        float h12=75.0f;

        float d1=22.0f;
        float d2=18.0f;
        float d3=13.0f;
        float d4=16.0f;
        float d5=14.0f;
        float d6=23.0f;
        float d7=22.0f;
        float d8=22.0f;
        float d9=23.0f;
        float d10=16.0f;
        float d11=18.0f;
        float d12=23.0f;

        float pi=3.14f;

        float t1=pi*(d1/2)*(d1/2)*h1;
        float t2=pi*(d2/2)*(d2/2)*h2;
        float t3=pi*(d3/2)*(d3/2)*h3;
        float t4=pi*(d4/2)*(d4/2)*h4;
        float t5=pi*(d5/2)*(d5/2)*h5;
        float t6=pi*(d6/2)*(d6/2)*h6;
        float t7=pi*(d7/2)*(d7/2)*h7;
        float t8=pi*(d8/2)*(d8/2)*h8;
        float t9=pi*(d9/2)*(d9/2)*h9;
        float t10=pi*(d10/2)*(d10/2)*h10;
        float t11=pi*(d11/2)*(d11/2)*h11;
        float t12=pi*(d12/2)*(d12/2)*h12;

        float totalVolume=t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12;
        float waterUsage=37640.0f*0.246f*28.0f;
        float waterDifference=waterUsage-totalVolume;
        float save=(waterDifference/37640)/28;

        DecimalFormat decimalFormat=new DecimalFormat("0.000");
        String rounded=decimalFormat.format(save);
        System.out.print("Each person needs to save "+rounded+" cubic meters of water every day");

    }
}
