#include<bits/stdc++.h>
using namespace std;
int convertInteger(int A, int B)
{
	A = A ^ B;
	int ans = 0;
	while(A)
	{
		ans++;
		A = A & (A-1);
	}
	return ans;
}
int main()
{
	return 0;
}