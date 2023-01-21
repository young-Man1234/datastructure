package me.stu.datastructure.hashtable;

public class ArrBaseTable {

    EmpInfo[] empArr;
    private static final int TABLESIZE = 100;

    public ArrBaseTable() {
        this.empArr = new EmpInfo[TABLESIZE];
    }

    public void add(EmpInfo emp){
        empArr[getHashValue(emp.empNum)] = emp;
    }

    public EmpInfo search(int empNum){
        return empArr[empNum];
    }

    private int getHashValue(int empNum){
        return empNum % 100;
    }


}
