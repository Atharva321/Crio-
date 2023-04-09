# Time  : O(n)
# Space :

def capitalise(s: str) -> str:
    ans  = s.split()
    for i in range(0,len(ans)):

        ans[i] = ans[i][0].upper() + ans[i][1:]
    
    s = " ".join(ans)
    return s


def main():
    s = input()
    res = capitalise(s)
    print(res)


if __name__ == "__main__":
    main()
