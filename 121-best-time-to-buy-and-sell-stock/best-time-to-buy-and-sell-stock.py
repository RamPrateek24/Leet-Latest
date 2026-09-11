class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxx = 0
        mini = float("inf")
        for i in prices:
            mini = min(mini, i)
            maxx = max(maxx, i - mini)
        return maxx    