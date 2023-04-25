from collections import Counter

def longestPalindrome(n: int, s: str) -> int:
    letter_to_frequency = Counter(s)
    has_odd = False
    longest_len = 0
    for frequency in letter_to_frequency.values():
        if frequency % 2:
            has_odd = True
        longest_len += frequency - frequency % 2
    if has_odd:
        longest_len += 1
    return longest_len

def main():
    n = int(input())
    s = input()
    result = longestPalindrome(n, s)
    print(result)

if __name__=="__main__":
    main()
