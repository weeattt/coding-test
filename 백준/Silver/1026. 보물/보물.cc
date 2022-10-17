#include <stdio.h>
int a[51];
int b[51];
int result[51];
int result1[51];
int main()
{
    int num;
    scanf("%d", &num);
    for (int s = 0; s < num; s++)
    {
        scanf("%d", &a[s]);
    }
    for (int s = 0; s < num; s++)
    {
        scanf("%d", &b[s]);
    }
    int cnt = 0;
    for (int s = 100; s >= 0; s--)
    {
        for (int c = 0; c < num; c++)
        {
            if (s == b[c])
            {
                result[cnt] = c;
                cnt++;
            }
        }
    }cnt = 0;
    for (int s = 0; s <= 100; s++)
    {
        for (int c = 0; c < num; c++)
        {
            if (s == a[c])
            {
                result1[cnt] = s;
                cnt++;
            }
        }
    } int sum = 0;
    for (int c = 0; c < num; c++)
    {
        sum += (b[result[c]] * result1[c]);
    }
    printf("%d\n", sum);
    return 0;
}
