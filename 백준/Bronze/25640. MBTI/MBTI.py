def mbti_check(jinho_mbti, friends_mbti):
    return len([mbti for mbti in friends_mbti if mbti == jinho_mbti])

if __name__ == "__main__":
    friends_mbti = []
    jinho_mbti = input()
    for _ in range(int(input())):
        mbti = input()
        friends_mbti.append(mbti)
        
    print(mbti_check(jinho_mbti=jinho_mbti, friends_mbti=friends_mbti))
