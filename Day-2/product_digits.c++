#include <bits/stdc++.h>
#include<iostream>
using namespace std;

void next_higher_peak(int arr[], int n) {
	// your code goes here
	int peak;
	for(int i=0; i<n; i++){
	    for(int j=i; j<n; j++){
	        if(arr[i]<arr[j]){
	            peak = arr[j];
	            cout<< peak;
	            break;
	        }
	        if(j==n-1){
	            peak = -1;
	            cout<<peak;
	        }
	    }
		cout<<" ";
	}
	
}
int main(){
    int n;
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
	    cin>>arr[i];
	}
	next_higher_peak(arr,n);
}
