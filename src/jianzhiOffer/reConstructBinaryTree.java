package jianzhiOffer;

/**
 * Created by Len on 2019-03-25
 */
public class reConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        TreeNode root = getNode(pre,0,pre.length-1,in,-1,
                0,in.length-1,new TreeNode(-1));
        return root;
    }

    private TreeNode getNode(int[] pre,int left1,int right1,int[] in,
                             int indexOfIn,int left2,int right2,TreeNode node){
        if(left1<0 || left2<0){
            return null;
        }
        TreeNode nextNode = null;
        if(left1 < right1 && left2 < right2){
            //根
            if(indexOfIn == -1){
                node = new TreeNode(pre[left1]);
                indexOfIn = Search(pre[left1],in,left2,right2);
                int[] indexOfPre1 = getPreIndex(pre,in,left2,indexOfIn-1);
                int[] indexOfPre2 = getPreIndex(pre,in,indexOfIn+1,right2);
                getNode(pre,indexOfPre1[0],indexOfPre1[1],in,indexOfIn,left2,indexOfIn-1,node);
                getNode(pre,indexOfPre2[0],indexOfPre2[1],in,indexOfIn,indexOfIn+1,right2,node);
            }else{
                //左子树
                if(left2 < indexOfIn){
                    nextNode = new TreeNode(pre[left1]);
                    node.left = nextNode;
                }
                else{
                    nextNode = new TreeNode(pre[left1]);
                    node.right = nextNode;
                }
                indexOfIn = Search(pre[left1],in,left2,right2);
                int[] indexOfPre1 = getPreIndex(pre,in,left2,indexOfIn-1);
                int[] indexOfPre2 = getPreIndex(pre,in,indexOfIn+1,right2);
                getNode(pre,indexOfPre1[0],indexOfPre1[1],in,indexOfIn,left2,indexOfIn-1,nextNode);
                getNode(pre,indexOfPre2[0],indexOfPre2[1],in,indexOfIn,indexOfIn+1,right2,nextNode);
            }


            return node;
        }
        if(left1 == right1 || left2 == right2){
            if(left2 < indexOfIn){
                nextNode = new TreeNode(pre[left1]);
                node.left = nextNode;
            }else{
                nextNode = new TreeNode(pre[left1]);
                node.right = nextNode;
            }

        }
        return null;
    }

    private int[] getPreIndex(int[] pre,int[] in,int left2,int right2){
        int[] index = new int[2];
        for(int i=0;i<index.length;i++){
            index[i] = -1;
        }
        if(left2 <= right2){

            int CountOfIn = left2;
            int[] temp = new int[right2-left2+1];
            for(int i=0;i<temp.length;i++){
                temp[i] = -1;
            }

            int p = 0;
            while(CountOfIn <= right2){
                for(int i=0;i<pre.length;i++){
                    if(pre[i] == in[CountOfIn]){
                        temp[p] = i;
                        p++;
                        break;
                    }
                }
                CountOfIn++;
            }
            int min = temp[0];
            for(int i=0;i<temp.length;i++){
                if(temp[i] < min){
                    min = temp[i];
                }
            }
            int max = temp[0];
            for(int i=0;i<temp.length;i++){
                if(temp[i] > max){
                    max = temp[i];
                }
            }
            index[0] = min;
            index[1] = max;
            return index;
        }
        return index;
    }

    private int Search(int target,int[] array,int low,int high){

        for(int i=low;i<=high;i++){
            if(array[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        reConstructBinaryTree test = new reConstructBinaryTree();
        int [] pre = {1,2,4,3,5,6};
        int [] in = {4,2,1,5,3,6};
        System.out.println(test.reConstructBinaryTree(pre,in).val);
    }
}
