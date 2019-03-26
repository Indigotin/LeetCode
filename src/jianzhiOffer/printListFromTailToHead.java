package jianzhiOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Len on 2019-03-25
 */
public class printListFromTailToHead {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList();
        /*ListNode node = new ListNode(listNode.val);*/
        while(listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        for(int i=0,j=list.size()-1;i<=j;i++,j--){
            int temp = list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
        }
        return list;
    }
    public static void main(String[] args){
        printListFromTailToHead test = new printListFromTailToHead();
        ListNode listNode = null;
        System.out.println(test.printListFromTailToHead(listNode));
    }
}
