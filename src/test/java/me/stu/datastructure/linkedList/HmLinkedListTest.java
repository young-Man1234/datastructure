package me.stu.datastructure.linkedList;

import me.stu.datastructure.Node;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HmLinkedListTest {

    private static HmLinkedList list;

    @BeforeAll
    static void init(){
        list = new HmLinkedList();
    }

    @Test
    @DisplayName("리스트 추가 테스트")
    void createList(){
        list.addHmLinkedList(2);
        list.addHmLinkedList(3);
        list.addHmLinkedList(1);
        list.addHmLinkedList(4);
        list.showAllData();
    }

    @Test
    @DisplayName("삭제 테스트")
    void removeTest(){
        list.addHmLinkedList(2);
        list.addHmLinkedList(3);
        list.addHmLinkedList(1);
        list.addHmLinkedList(4);
        list.showAllData();

        list.removeData(3);
        list.removeData(1);
        list.showAllData();
    }


    @AfterAll
    static void destory(){
        list = null;
    }

}