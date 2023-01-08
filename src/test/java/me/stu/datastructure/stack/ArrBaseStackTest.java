package me.stu.datastructure.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrBaseStackTest {
    HmStack stack;

    @BeforeEach
    void init(){
        stack = new ArrBaseStack();
    }

    @Test
    @DisplayName("스택 데이터 추가 테스트")
    void addStack(){
        stack.push("하나");
        stack.push("둘");
        stack.push("셋");
        stack.push("넷");

        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }

    @AfterEach
    void destory(){
        stack = null;
    }

}