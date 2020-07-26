package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView answer, user_input;

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonEqual,buttonDot,buttonClear;
    Button buttonPercentage,buttonDel,buttonSin,buttonCos,buttonTan,buttonLog,buttonLn,buttonFact,buttonRoot,buttonPower;

    Double Res,num1,num2;
    String sign, val_1, val_2;
    boolean has_Dot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input = (TextView) findViewById(R.id.user_input);
        answer = (TextView) findViewById(R.id.answer);
        has_Dot =false;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonPercentage = (Button) findViewById(R.id.buttonPercentage);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLn = (Button) findViewById(R.id.buttonLn);
        buttonFact = (Button) findViewById(R.id.buttonFact);
        buttonPower = (Button) findViewById(R.id.buttonPower);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"1"));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"2"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"3"));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"4"));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"5"));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"6"));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"7"));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"8"));
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"9"));
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText((user_input.getText()+"0"));
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!has_Dot) {
                    if (user_input.getText().equals("")) {

                        user_input.setText("0.");
                    } else {

                        user_input.setText(user_input.getText() + ".");
                    }

                    has_Dot = true;
                }

            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "+";
                if (user_input == null) {
                    answer.setText(" ");
                }
                else {
                    val_1 = user_input.getText().toString();
                    user_input.setText(null);
                    answer.setText("+");
                    has_Dot = false;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "-";
                if (user_input == null) {
                    answer.setText(" ");
                }
                else {
                    val_1 = user_input.getText().toString();
                    user_input.setText(null);
                    answer.setText("-");
                    has_Dot = false;

                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "*";
                if (user_input == null) {
                    answer.setText(" ");
                }
                else {
                    val_1 = user_input.getText().toString();
                    user_input.setText(null);
                    answer.setText("×");
                    has_Dot = false;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "/";
                if (user_input == null) {
                    answer.setText(" ");
                }
                else {
                    val_1 = user_input.getText().toString();
                    user_input.setText(null);
                    answer.setText("÷");
                    has_Dot = false;
                }
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "log";
                user_input.setText(null);
                answer.setText("log");
                has_Dot = false;
            }
        });

        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "ln";
                user_input.setText(null);
                answer.setText("ln");
                has_Dot = false;
            }
        });


        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "sin";
                user_input.setText(null);
                has_Dot = false;
                answer.setText("sin");

            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "cos";
                user_input.setText(null);
                has_Dot = false;
                answer.setText("cos");
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "tan";
                user_input.setText(null);
                has_Dot = false;
                answer.setText("tan");

            }
        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "root";
                user_input.setText(null);
                has_Dot = false;
                answer.setText("√");
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "power";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                has_Dot = false;
                answer.setText("xⁿ");
            }
        });

        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "factorial";
                user_input.setText(null);
                answer.setText("!");
                has_Dot = false;
            }
        });

        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="%";
                val_1 = user_input.getText().toString();
                user_input.setText(null);
                has_Dot = false;
                answer.setText("%");

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (user_input.getText().equals("1")) {
                    answer.setText("1");
                } else if (user_input.getText().equals("2")) {
                    answer.setText("2");
                } else if (user_input.getText().equals("3")) {
                    answer.setText("3");
                } else if (user_input.getText().equals("4")) {
                    answer.setText("4");
                } else if (user_input.getText().equals("5")) {
                    answer.setText("5");
                } else if (user_input.getText().equals("6")) {
                    answer.setText("6");
                } else if (user_input.getText().equals("7")) {
                    answer.setText("7");
                } else if (user_input.getText().equals("8")) {
                    answer.setText("8");
                } else if (user_input.getText().equals("9")) {
                    answer.setText("9");
                } else if (user_input.getText().equals("0")) {
                    answer.setText("0");
                } else */
                if (sign == null) {
                    answer.setText("Error!");
                } else if (user_input.getText().equals(" ")) {
                    answer.setText("Error!");
                } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
                    answer.setText("Error!");
                } /*else if (sign.equals("factorial")) {
                    answer.setText("Please press ! first and then number");
                } else if (sign.equals("%")) {
                    answer.setText("Please press % first and then number");
                }*/ else {
                    switch (sign) {
                        default:
                            break;
                        case "log":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            user_input.setText(Math.log10(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "ln":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            user_input.setText(Math.log(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;

                        case "root":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.sqrt(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;

                        case "power":
                            num1 = Double.parseDouble((val_1));
                            val_2 = user_input.getText().toString();
                            num2 = Double.parseDouble(val_2);
                            user_input.setText(Math.pow(num1, num2) + "");
                            sign = null;
                            answer.setText(null);
                            break;

                        case "factorial":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            int i = Integer.parseInt(val_1) - 1;
                            while (i > 0) {
                                num1 = num1 * i;
                                i--;
                            }
                            user_input.setText(num1 + "");
                            sign = null;
                            answer.setText(null);
                            break;

                        case "%":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            Res = (num1 / 100.0f) ;
                            user_input.setText(Res+"");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "sin":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.sin(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "cos":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.cos(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "tan":
                            val_1 = user_input.getText().toString();
                            num1 = Double.parseDouble((val_1));
                            user_input.setText(Math.tan(num1) + "");
                            sign = null;
                            answer.setText(null);
                            break;

                        case "+":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            Res = num1 + num2;
                            user_input.setText(Res+"");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "-":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            Res = num1 - num2;
                            user_input.setText(Res + "");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "*":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            Res = num1 * num2;
                            user_input.setText(Res + "");
                            sign = null;
                            answer.setText(null);
                            break;
                        case "/":
                            val_2 = user_input.getText().toString();
                            num1 = Double.parseDouble(val_1);
                            num2 = Double.parseDouble(val_2);
                            Res = num1 / num2;
                            user_input.setText(Res + "");
                            sign = null;
                            answer.setText(null);
                            break;

                    }

                }
            }

        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user_input.getText().equals("")) {
                    user_input.setText(null);
                } else {
                    int len = user_input.getText().length();
                    String s = user_input.getText().toString();
                    if (s.charAt(len - 1) == '.') {
                        has_Dot = false;
                        user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));

                    } else {
                        user_input.setText(user_input.getText().subSequence(0, user_input.getText().length() - 1));
                    }
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input.setText(null);
                answer.setText(null);
                val_1 = null;
                val_2 = null;
                sign = null;
                has_Dot = false;

            }
        });
    }
}