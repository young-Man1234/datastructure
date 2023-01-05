package me.stu.datastructure.linkedList;

import org.junit.jupiter.api.*;

class SimpleLinkedListTest {

    private SimpleLinkedList list;

    @BeforeEach
    void init(){
        list = new SimpleLinkedList();
    }

    @Test
    @DisplayName("리스트 추가 테스트")
    void createList(){
        System.out.println("=== 리스트 생성 및 추가 ===");
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.showAllData();
        System.out.println("========================");

    }

    @Test
    @DisplayName("삭제 테스트")
    void removeTest(){
        System.out.println("=== 리스트 생성 및 삭제 ===");
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.showAllData();
        System.out.println("=========================");
        System.out.println("=== 삭제 후 ===");
        list.removeData(3);
        list.removeData(1);
        list.showAllData();
        System.out.println("==============");
    }


    @AfterEach
    void destoryList(){
        list = null;
    }

}