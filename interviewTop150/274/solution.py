def hIndex(citations: list[int]) -> int:
   citations.sort(reverse=True)
   for i in range(len(citations)):
      if citations[i] < i+1:
         return i
   return len(citations)
      
result1 = hIndex([1])
result2 = hIndex([1, 3, 1])
result3 = hIndex([1, 3, 1, 3, 3])
result4 = hIndex([3,3,3])
assert result1 == 1
assert result2 == 1
assert result3 == 3
assert result4 == 3