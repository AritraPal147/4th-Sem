#include <stdio.h>

#define MAX_PROCESSES 100
#define TIME_QUANTUM 2

struct process {
    int pid;
    int burst_time;
    int remaining_time;
};

int main() {
    int num_processes;
    printf("Enter the number of processes: ");
    scanf("%d", &num_processes);

    struct process processes[MAX_PROCESSES];
    for (int i = 0; i < num_processes; i++) {
        printf("Enter the burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burst_time);
        processes[i].remaining_time = processes[i].burst_time;
        processes[i].pid = i + 1;
    }

    int current_time = 0;
    int completed_processes = 0;
    while (completed_processes < num_processes) {
        for (int i = 0; i < num_processes; i++) {
            if (processes[i].remaining_time > 0) {
                printf("Time %d: Running process %d\n", current_time, processes[i].pid);
                processes[i].remaining_time -= TIME_QUANTUM;
                current_time += TIME_QUANTUM;

                if (processes[i].remaining_time <= 0) {
                    printf("Time %d: Completed process %d\n", current_time, processes[i].pid);
                    completed_processes++;
                }
            }
        }
    }

    return 0;
}