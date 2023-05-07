//https://www.enjoyalgorithms.com/blog/check-whether-array-is-subset-of-another-array
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        //Brute force O(n*n)
        Arrays.sort(a1);
        Arrays.sort(a2);
        int p1 = 0,p2 = 0;
      
        while(p1<n && p2<m){
            if(a1[p1]>a2[p2])
                return "No";
            else if(a1[p1]==a2[p2]) {
                p1++;
                p2++;
            }else{
                p1++;
            }
        }
        if(p2==m)
            return "Yes";
        return "No";
    }
}
