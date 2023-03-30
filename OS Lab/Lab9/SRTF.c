#include<stdio.h>
int main()
{
    int n, ari[10],bur[10],total_unit_run=0,i,j,small,temp,procs[100],k,waiting[10],complete[10];
    float tavg=0.0,wavg=0.0;
    printf("enter the number of process :");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter the arrival time of process %d:\t",i);
        scanf("%d",&ari[i]);
        printf("Eneter the burst time of the process %d:\t",i);
       
 scanf("%d", & bur[i]); 
 
    waiting[i] = 0; 
 
    total_unit_run+=bur[i];
    
 
  } 
 
  for (i = 0; i < n; i++) //sorting the arrival time and burst time to the process arriving first
 
  { 
 
    for (j = i + 1; j < n; j++) 
 
    { 
 
      if (ari[i] > ari[j]) 
 
      { 
 
        temp = ari[i]; 
 
        ari[i] = ari[j]; 
 
        ari[j] = temp; 
 
        temp = bur[i]; 
 
        bur[i] = bur[j]; 
 
        bur[j] = temp; 
 
      } 
 
    } 
 
  } 
 
  for (i = 0; i < total_unit_run; i++) 
 
  { 
 
    small = 9999; 
 
    for (j = 0; j < n; j++) 
 
    { 
 
      if ((bur[j] != 0) && (ari[j] <= i) && (bur[j] < small)) // to get the smallest possible burst time 
      { 
        small = bur[j]; 
        k = j; 
      } 
 
    } 
 
    bur[k]--; 
 
    procs[i] = k; 
 
  } 
 
  k = 0; 
 
  for (i = 0; i < total_unit_run; i++) 
 
  { 
 
    for (j = 0; j < n; j++) 
 
    { 
 
      if (procs[i] == j) 
 
      { 
 
        complete[j] = i; 
 
        waiting[j]++; 
 
      } 
 
    } 
 
  } 
 
  for (i = 0; i < n; i++) 
 
  { 
 
    printf("\n PROCESS %d:-complete TIME==> %d TURNAROUND TIME==>%d WAITING TIME==>%d\n", i + 1, complete[i] + 1, (complete[i] - ari[i]) + 1, (((complete[i] + 1) - waiting[i]) - ari[i])); 
 
    wavg = wavg + (((complete[i] + 1) - waiting[i]) - ari[i]); 
 
    tavg = tavg + ((complete[i] - ari[i]) + 1); 
 
  } 
 
  printf("\n WAvG==>\t%f\n TAVG==>\t%f\n", (wavg / n), (tavg / n)); 
 
  return 0; 
 
}