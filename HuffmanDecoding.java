void decode(String s, Node root) {
       Node base = root;
        
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='1')
                base = base.right;
           else if(s.charAt(i)=='0')
                base = base.left;

           if(base.left == null && base.right == null){
                System.out.print(base.data);
                base = root;
           }
       }
}
