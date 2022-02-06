#include<bits/stdc++.h>
using namespace std;
int search(vector<int> &nums, int target)
{
	int right = nums.size()-1,left=0;
	while(left<=right)
	{
		int mid = (left & right) + ((left ^ right) >> 1);
		if(nums[mid]==target)
			return mid;
		if(nums[mid]<target)
		{
			left = mid + 1;
			continue;
		}
		if(nums[mid]>target)
			right = mid - 1;
	}
	return -1;
}
int main()
{
	return 0;
}