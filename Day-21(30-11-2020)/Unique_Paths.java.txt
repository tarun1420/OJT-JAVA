package day13;

public class Unique_Paths {
	public static int uniquePaths(int m, int n) {
		System.out.println(dfs(0,0,m,n));
	    return dfs(0,0,m,n);
	}
	 
	public static int dfs(int i, int j, int m, int n){
	    if(i==m-1 && j==n-1){
	    	System.out.println(1);
	        return 1;
	    }
	 
	    if(i<m-1 && j<n-1){
	    	System.out.println(dfs(i+1,j,m,n) + dfs(i,j+1,m,n));
	        return dfs(i+1,j,m,n) + dfs(i,j+1,m,n);
	    }
	 
	    if(i<m-1){
	    	System.out.println(dfs(i+1,j,m,n));
	        return dfs(i+1,j,m,n);
	    }
	 
	    if(j<n-1){
	    	System.out.println(dfs(i,j+1,m,n));
	        return dfs(i,j+1,m,n);
	    }
	 System.out.println(0);
	    return 0;
	}
	public static void main(String[] args) {
int x = 6;
int y = 7;
uniquePaths(x,y);
	}

}
