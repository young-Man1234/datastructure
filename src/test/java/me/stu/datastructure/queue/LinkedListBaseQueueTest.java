package me.stu.datastructure.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBaseQueueTest {
    HmQueue q;

    @BeforeEach
    void init(){
        q = new LinkedListBaseQueue();
    }

    @Test
    @DisplayName("연결리스트 기반 큐 테스트")
    void linkedListBaseQTest(){
        System.out.println("=== 연결리스트 기반 큐 테스트 ===");
        q.enQueue(2);
        q.enQueue(1);
        q.enQueue(7);
        q.enQueue(3);
        while(!q.isEmpty())
            System.out.println(q.deQueue());
        System.out.println("=============================");
    }

    @Test
    @DisplayName("연결리스트 기반 큐 테스트2")
    void linkedListBaseQTest2(){
        System.out.println("=== 연결리스트 기반 큐 테스트 ===");
        q.enQueue(2);
        q.enQueue(1);
        System.out.println("데이터 삭제: " + q.deQueue());
        q.enQueue(7);
        System.out.println("데이터 삭제: " + q.deQueue());
        q.enQueue(3);

        System.out.println("큐 비우고 전체 데이터 출력");
        while(!q.isEmpty())
            System.out.println(q.deQueue());
        System.out.println("=============================");
    }

    @AfterEach
    void destory(){
        q = null;
    }

}