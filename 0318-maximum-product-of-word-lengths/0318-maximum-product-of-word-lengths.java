class Solution {
    public int maxProduct(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            String c=words[i];
            HashSet<Character> curr=new HashSet<>();
            for(int q=0;q<c.length();q++){
                curr.add(c.charAt(q));
            }
            for(int j=i+1;j<words.length;j++){
                String l=words[j];
                int flag=0;
                for(int k=0;k<l.length();k++){
                    if(curr.contains(l.charAt(k))){
                        flag=1;
                        break;
                        
                    }
                    
                }
                if(flag==0){
                        ans=Math.max(ans,(c.length()*l.length()));
                }
                
            }
        }
        return ans;
    }
}