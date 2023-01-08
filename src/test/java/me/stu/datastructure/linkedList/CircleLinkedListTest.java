package me.stu.datastructure.linkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleLinkedListTest {
    private HmLinkedList list;

    @BeforeEach
    void init(){
        list = new CircleLinkedList();
    }
    @Test
    @DisplayName("원형 연결리스트 테스트 성공")
    void createCLinkedList(){
        System.out.println("=== 원형 리스트 Add ===");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.showAllData();
        System.out.println("=====================");

        System.out.println("=== 원형 리스트 remove ===");
        list.removeData(2);
        list.removeData(4);
        list.removeData(1);
        list.showAllData();
        System.out.println("========================");

    }

    @Test
    @DisplayName("원형 연결리스트 테스트 실패")
    void createCLinkedList2(){
        
    }


    @AfterEach
    void destroy(){
        list = null;
    }
}