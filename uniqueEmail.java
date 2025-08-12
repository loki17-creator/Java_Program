class uniqueEmail {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> set = new HashSet<>();
        for(String s:emails){
           if(s.indexOf("@")!=s.lastIndexOf("@")) continue;
           if(s.indexOf("@")==0 || s.indexOf("@")==s.length()-1) continue;
           if(s.indexOf("+")==0) continue;
           if(!s.endsWith(".com")) continue;
           String c[]=s.split("@");
           String s1= c[0];String s2=c[1];
        //    for(int i=0;i<s1.length();i++){
        //     if(s.charAt(i)=='+'){
        //         s1=s1.substring(0,i);
        //     }
        //    }
          int pindex=s1.indexOf("+");
          if(pindex!=-1){
            s1=s1.substring(0,pindex);
          }
          
          s1=s1.replace(".","");
         
          
          s=s1 + "@" + s2;
          set.add(s);


        }
        return set.size();
    }
}