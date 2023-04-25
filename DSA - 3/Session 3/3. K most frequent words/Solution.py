# Time  : O(n)
# Space : O(n)

from collections import Counter
from typing import List
import heapq


def frequentWords(words: List[str], k: int) -> List[str]:
    results = []
    count = {}
    for word in words:
        count[word] = count.get(word, 0) + 1
    heap = []
    for key, value in count.items():
        heapq.heappush(heap, (-value, key))    
    for i in range(k):
        results.append(heapq.heappop(heap)[1])
    return results

def main():
    n = int(input())
    words = input().strip().split()
    k = int(input())
    result = frequentWords(words ,k)
    print('\n'.join(result))

if __name__ == "__main__":
    main()
