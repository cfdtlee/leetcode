#include<iostream>
#include<vector>
#include<string>
using namespace std;


void backTracking(int num, int pos, vector<int>& table, int curr, vector<string>& res){
    if(num == 0){
       string temp = to_string(curr/100) + ":";
       if(curr%100 > 9) temp += to_string(curr%100);
       else temp += "0" + to_string(curr%100);
       res.push_back(temp);
       return; 
    } 
    for(int i = pos; i < table.size(); i++)
    backTracking(num-1, i+1, table, curr + table[i], res);
}

int main(){
    int num = 1;
    vector<string> res;
    vector<int> table = {100,200,400,800,1,2,4,8,16,32};
    backTracking(num, 0, table, 0, res);
    for(int i = 0; i < res.size(); i++ ) cout<<res[i]<<endl;
    return 0;
}

class Solution {
public:
    vector<string> readBinaryWatch(int num) {
        int num = 1;
        vector<string> res;
        vector<int> table = {100,200,400,800,1,2,4,8,16,32};
        backTracking(num, 0, table, 0, res);
    }
};