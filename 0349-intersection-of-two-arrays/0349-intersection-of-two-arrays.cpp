#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> nums2set(nums2.begin(), nums2.end());
        set<int> nums1set(nums1.begin(), nums1.end());
        vector<int> result;
        set_intersection(nums2set.begin(), nums2set.end(), nums1set.begin(), nums1set.end(), back_inserter(result));
        return result;
    }
};