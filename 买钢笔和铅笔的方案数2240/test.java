package title.买钢笔和铅笔的方案数2240;

public class test {
}

/*
class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        return dfs(total, cost1, cost2);
    }

    */
/*public int dfs(int total, int cost1, int cost2) {
        int cnt = 0;
        if (total > cost1) cnt += dfs(total - cost1, cost1, cost2) + 1;
        if (total > cost2) cnt += dfs(total - cost2, cost1, cost2) + 1;
        return cnt;
    }*//*


    public int dfs(int total, int cost1, int cost2) {
        if (total < 0) return 1;
        int cnt = 0;
        cnt += dfs(total - cost1, cost1, cost2);
        cnt += dfs(total - cost2, cost1, cost2);
        return cnt;
    }
}*/

///我在干嘛。。。。
class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long n = 1 + total / cost1, ans = n;//注意又是long
        for (long i = 0; i < n; i++) {
            ans += (total - cost1 * i) / cost2;
        }
        return ans;
    }
}