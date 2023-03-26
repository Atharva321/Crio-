# Time  : O(1)
# Space : O(1)

def reverseWordsInAString(s: str) -> str:
    return ' '.join(s.split()[::-1])

def main():
    s = input()
    print(reverseWordsInAString(s))

if __name__=="__main__":
    main()
