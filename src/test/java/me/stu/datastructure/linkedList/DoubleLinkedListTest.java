package me.stu.datastructure.linkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    private DoubleLinkedList list;

    @BeforeEach
    void init(){
        list = new DoubleLinkedList();
    }

    @Test
    @DisplayName("양방향 연결리스트 추가 테스트")
    void addTest(){
        System.out.println("=== 양방향 연결리스트 추가 ===");
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(10);
        list.showAllData();
        System.out.println("==========================");

        System.out.println("=== 양방향 연결리스트 삭제 ===");
        list.removeData(4);
        list.removeData(10);
        list.showAllData();
        System.out.println("==========================");

    }

    @AfterEach
    void destroy(){
        list = null;
    }

}