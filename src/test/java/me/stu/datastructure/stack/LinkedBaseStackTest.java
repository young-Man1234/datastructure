package me.stu.datastructure.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedBaseStackTest {

    HmStack stack;

    @BeforeEach
    void init(){
        stack = new LinkedBaseStack();
    }

    @Test
    @DisplayName("스택 데이터 추가 테스트")
    void addStack(){
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }

    @AfterEach
    void destory(){
        stack = null;
    }

}