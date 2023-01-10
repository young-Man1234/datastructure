package me.stu.datastructure.btree;

import me.stu.datastructure.stack.ArrBaseStack;
import me.stu.datastructure.stack.HmStack;

public class ExpressionTree {



    public String[] convToRPNExp(String[] exp){
        HmStack stack = new ArrBaseStack(exp.length);
        String[] temp = new String[exp.length];
        int j = 0;

        for(int i = 0; i < exp.length; i++){
            if(exp[i].chars().allMatch(Character::isDigit)){
                temp[j] = exp[i];
                j++;
            }else{
                //스택이 비어있으면 스택을 채움
                if(stack.isEmpty()){
                    stack.push(exp[i]);
                }else{
                    //우선 순위가 높으면 Stack에 쌓음
                    if(getOpPrec(exp[i]) > getOpPrec(stack.peek())){
                        stack.push(exp[i]);
                    }else{
                        while(!stack.isEmpty()){
                            if(stack.peek().equals("(")){
                                stack.pop();
                                continue;
                            }
                            temp[j] = stack.pop();
                            j++;
                        }
                        if(!exp[i].equals(")"))
                            stack.push(exp[i]);
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            temp[j] = stack.pop();
            j++;
        }
        return temp;
    }

    private int getOpPrec(String data){
        switch (data){
            case "*":
            case "/":
                return 3;
            case "+":
            case "-":
                return 2;
            case "(":
                return 1;
            default:
                return -1;
        }
    }

}
