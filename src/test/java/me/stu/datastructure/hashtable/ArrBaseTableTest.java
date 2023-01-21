package me.stu.datastructure.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrBaseTableTest {


    //테이블 내부에서 사용하는 배열의 size 100으로 고정
    @Test
    void test(){

        /*
            나는 단순히 5명의 직원을 저장할 해쉬 테이블을 만들것인데
            해쉬 테이블 안에서 사용하는 배열의 크기를 회원의 고유 아이디의 길이만큼
            설정을 해야하는 문제가 있다.

            이러한 문제에서 Key 값을 해쉬 테이블안에서 사용할 고유한 값으로 변경하는 것이
            해쉬 함수라고 할 수 있겠다.
         */
        ArrBaseTable abt = new ArrBaseTable();

        EmpInfo emp1 = new EmpInfo(123, 23);
        EmpInfo emp2 = new EmpInfo(23, 31);
        EmpInfo emp3 = new EmpInfo(1, 40);
        EmpInfo emp4 = new EmpInfo(42, 50);
        EmpInfo emp5 = new EmpInfo(33, 60);

        abt.add(emp1);
        abt.add(emp2);
        abt.add(emp3);
        abt.add(emp4);
        abt.add(emp5);

        assertEquals(emp1, abt.search(123));

    }


}