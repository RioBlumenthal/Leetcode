class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        cheapest = prices[0]
        maxProfit = 0
        for i in range(1,len(prices)):
            if prices[i] < cheapest:
                cheapest = prices[i]
            elif prices[i] - cheapest > maxProfit:
                maxProfit = prices[i] - cheapest
        return maxProfit
    
