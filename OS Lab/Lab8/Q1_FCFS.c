// C program to implement First Come First Served (FCFS) Algorithm

#include <stdio.h>

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int pid[100], at[100], bt[100], wt[100] = {0};
    int n;

    printf("Enter the number of processes: ");
    scanf("%d",&n);
 
    printf("Enter process id of all the processes: ");
    for(int i=0; i<n; i++)
        scanf("%d", &pid[i]);
 
    printf("Enter arrival time of all the processes: ");
    for (int i=0; i<n; i++) 
        scanf("%d", &at[i]);

    printf("Enter burst time of all the processes: ");
    for(int i=0; i<n; i++)
        scanf("%d", &bt[i]);

    for (int i=0; i<n; i++) {
        for (int j=i+1; j<n; j++) {
            if (at[j] < at[i]) {
                swap(&at[j], &at[i]);
                swap(&pid[j], &pid[i]);
                swap(&bt[j], &bt[i]);
            }
        }
    }
 
    float twt=0.0, totalTat= 0.0;
    for(int i=1; i<n; i++) {
        wt[i] = bt[i-1] + wt[i-1];
        twt += wt[i];
        totalTat += wt[i] + bt[i];
    }
 
    printf("Process ID     Arrival Time     Burst Time     Waiting Time     TurnAround Time\n");
    for(int i=0; i<n; i++) {
        printf("P%d\t\t", pid[i]);
        printf("%d\t\t", at[i]);
        printf("%d\t\t", bt[i]);
        printf("%d\t\t", wt[i]);
        printf("%d\n", bt[i] + wt[i]);
    }

    printf("Avg. waiting time= %f\n", twt/n);
    printf("Avg. turnaround time= %f", totalTat/n);
    return 0;
}