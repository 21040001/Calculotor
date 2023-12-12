package com.IA.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txv;
    private int sonuc;
    ConstraintLayout dec;
    String text;
    String xur;
    String tr;
    Double a;
    Double b;
    private TextView txv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dec=(ConstraintLayout)findViewById(R.id.ekran);

        /*btn1 = (Button)findViewById(R.id.button25);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button);
        btn4 = (Button)findViewById(R.id.button3);
        btn5 = (Button)findViewById(R.id.button4);
        btn6 = (Button)findViewById(R.id.button5);*/

        txv = (TextView)findViewById(R.id.textView);
        txv1=(TextView)findViewById(R.id.txt2);
        txv1.setText("");




    }

    /* @SuppressLint("NonConstantResourceId")
     public void hisobla(View v){
         String a = String.valueOf(txt1.getText());
         String b = String.valueOf(txt2.getText());

         if(!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b) ){
             int son1 = Integer.valueOf(a);
             int son2 = Integer.valueOf(b);

             hesabla hsb = new hesabla(son1,son2);

             switch (v.getId()){
                 case R
                     sonuc = hsb.kopaytiruv();
             }

         }

     }*/
    public void switch12(){}
    public void clear (View j){
        if (j.getId()==R.id.clear){
            txv1.setText("");
            txv.setText("");
        }
    }

    public void son(View s){


        if(s.getId()==R.id.son1){
            text ="1";
            txv.setText(txv.getText() + text);
        } else
        if(s.getId()==R.id.son2){
            text ="2";
            txv.setText(txv.getText() + text);
        } else if (s.getId()==R.id.son3) {
            text ="3";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son4){
            text ="4";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son5){
            text ="5";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son6){
            text ="6";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son7){
            text ="7";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son8){
            text ="8";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son9){
            text ="9";
            txv.setText(txv.getText() + text);
        }else if(s.getId()==R.id.son0){
            text ="0";
            txv.setText(txv.getText() + text);

        } else if (s.getId()==R.id.nuqta) {
            text =".";
            txv.setText(txv.getText() + text);
        }


    }
    public void amal(View l){
        // if(txv != null){

        if(l.getId()==R.id.nuqta){
            text ="sin(";
            if(txv.getText() != "") {
                txv1.setText(text + txv.getText() + ")");
                txv.setText("");
            }

        }
        if(l.getId()==R.id.ayir){
            text ="-";
            if(txv.getText() != ""){
                txv1.setText(txv.getText() + text);
                a= Double.valueOf((String) txv.getText());
                txv.setText("");}
        }
        if(l.getId()==R.id.boluv){
            text ="/";
            if(txv.getText() != ""){
                txv1.setText(txv.getText() + text);
                a= Double.valueOf((String) txv.getText());
                txv.setText("");}
        }
        if(l.getId()==R.id.kopaytir){
            text ="*";
            if(txv.getText() != ""){
                txv1.setText(txv.getText() + text);
                a= Double.valueOf((String) txv.getText());
                txv.setText("");}

        }
        if(l.getId()==R.id.kvad){
            text ="**";
            if(txv.getText() != ""){
                txv1.setText(txv.getText() +text);
            a= Double.valueOf((String) txv.getText());}
        }
        if(l.getId()==R.id.plus){
            text ="+";
            if(txv.getText() != ""){
                txv1.setText(txv.getText() + text);
                a= Double.valueOf((String) txv.getText());
                txv.setText("");}

        }

    }
    public void orqaga(View d){


        if(d.getId()==R.id.xes){


            if(txv.getText() != "") {
                xur = String.valueOf(txv.getText());
                txv.setText(xur.substring(0, xur.length() - 1));
            }else if (txv1.getText() != "" || txv.getText() != ""){
                xur = String.valueOf(txv1.getText());
                txv1.setText(xur.substring(0, xur.length() - 1));

            }
        }




    }
    public void hisobla(View v){
        if (v.getId()==R.id.teng){
            if(txv.getText() != "" & txv1.getText() !="") {
                b=Double.valueOf((String) txv.getText());

                hesabla hsb = new hesabla(a,b);
                tr=String.valueOf(txv1.getText());
                String t = tr.substring( tr.length() - 1);


                switch (t){

                    case "+" :
                        double f=hsb.qoshuv();
                        txv1.setText("");
                        txv.setText(String.valueOf(f));
                        break;
                    case "-":
                        double r =hsb.ayiruv();
                        txv1.setText("");
                        txv.setText(String.valueOf(r));
                        break;

                    case "/":
                        if (b!=0){
                            double p=hsb.boluv();
                            txv1.setText("");
                            txv.setText(String.valueOf(p));
                        }
                        break;
                    case "*":
                        double o=hsb.kopaytiruv();
                        txv1.setText("");
                        txv.setText(String.valueOf(o));
                        break;
                    case "_":
                        double y=hsb.kopaytiruv();
                        txv1.setText("");
                        txv.setText(String.valueOf(y));
                        break;


                }



            }else {}
        }

    }
}