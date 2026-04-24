def parse(s):
    stack = ['$', 'E']
    s = list(s) + ['$']
    i = 0

    table = {
        ('E','i'): ['T',"E'"],
        ("E'",'+'): ['+','T',"E'"],
        ("E'",'$'): [],
        ('T','i'): ['F',"T'"],
        ("T'",'+'): [],
        ("T'",'*'): ['*','F',"T'"],
        ("T'",'$'): [],
        ('F','i'): ['i']
    }

    while stack:
        top = stack.pop()
        if top == s[i]:
            i += 1
        elif (top, s[i]) in table:
            rule = table[(top, s[i])]
            stack += rule[::-1]
        else:
            print("Rejected")
            return

    print("Accepted")

parse("i+i*i")