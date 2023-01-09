package me.stu.datastructure.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrBaseQueueTest {
    HmQueue q;


    /*
     배열의 크기는 4 데이터는 3개만 저장할 수 있다.
     == 개선 방안(아직 구현되지 않음) ==
     배열의 크기를 사용자가 직접 입력하여 큐의 크기를 직접 지정할 수 있어야 한다
     */
    @Test
    @DisplayName("배열기반 큐 테스트")
    void arrBaseQTest(){
        q = new ArrBaseQueue();
        System.out.println("=== 배열기반 큐 ===");
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        while(!q.isEmpty())
            System.out.println(q.deQueue());
        System.out.println("=================");

    }

    @AfterEach
    void destroy(){
        q = null;
    }


}