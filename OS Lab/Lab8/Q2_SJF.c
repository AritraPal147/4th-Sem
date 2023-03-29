// C program to implement Shortest Job First (SJF) algorithm

#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int pid[100], bt[100], wt[100] = {0};
    int i, j, n;
    float avg_wt = 0, avg_tat = 0;

    printf("Enter number of process: ");
    scanf("%d", &n);

    printf("Enter Burst Time:\n");
    for (i = 0; i < n; i++) {
        printf("P%d: ", i + 1);
        scanf("%d", &bt[i]);    
        pid[i] = i + 1;
    }

    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (bt[j] < bt[i]) {
                swap(&bt[j], &bt[i]);
                swap(&pid[i], &pid[j]);
            }
        }
    }

    for (i = 1; i < n; i++) {
        // Since the array is sorted on the basis of burst time, the sum of previous burst times will
        // give the waiting time for previous process
        for (j = 0; j < i; j++)
            wt[i] += bt[j];
        avg_wt += wt[i];
    }

    printf("ProcessId     Burst Time     Waiting Time     TurnAround Time\n");
    for (i = 0; i < n; i++) {
        // TAT = BT + WT
        avg_tat += bt[i] + wt[i];
        printf("P%d\t\t%d\t\t%d\t\t%d\n", pid[i], bt[i], wt[i], bt[i] + wt[i]);
    }
    
    
    avg_wt /= n;
    avg_tat /= n;
    printf("Average Waiting Time= %f", avg_wt);
    printf("\nAverage Turnaround Time= %f", avg_tat);
    return 0;
}