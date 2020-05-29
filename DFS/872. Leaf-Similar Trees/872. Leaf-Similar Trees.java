class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
          if(root1!=root2&&(root1==null||root2==null)){
           return false;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        dfsLeaf(root1,list1);
        dfsLeaf(root2,list2);
        if(list1.size()!=list2.size()){
          return false;
        }

        for(int i=0;i<list1.size();i++){
          int element1 = list1.get(i);
          int element2 = list2.get(i);
          if(element1!=element2){
             return false;
          }

        }
     return true;
    }

    public void dfsLeaf(TreeNode root,List<Integer> list){
          if(root==null){
            return;
          }

          if(root.left==null&&root.right==null){
             list.add(root.val);
             return;
          }
          dfsLeaf(root.left,list);
          dfsLeaf(root.right,list);
    }
}
