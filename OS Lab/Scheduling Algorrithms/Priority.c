#include <stdio.h>

#define MAX_PROCESSES 100

struct process {
    int pid;
    int burst_time;
    int priority;
    int waiting_time;
};

void calculate_waiting_time(struct process processes[], int num_processes) {
    int total_waiting_time = 0;
    processes[0].waiting_time = 0;

    for (int i = 1; i < num_processes; i++) {
        processes[i].waiting_time = processes[i - 1].waiting_time + processes[i - 1].burst_time;
        total_waiting_time += processes[i].waiting_time;
    }

    double average_waiting_time = (double) total_waiting_time / num_processes;
    printf("Average waiting time: %lf\n", average_waiting_time);
}

void sort_by_priority(struct process processes[], int num_processes) {
    for (int i = 0; i < num_processes - 1; i++) {
        for (int j = i + 1; j < num_processes; j++) {
            if (processes[i].priority > processes[j].priority) {
                struct process temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;
            }
        }
    }
}

int main() {
    int num_processes;
    printf("Enter the number of processes: ");
    scanf("%d", &num_processes);

    struct process processes[MAX_PROCESSES];
    for (int i = 0; i < num_processes; i++) {
        printf("Enter the burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burst_time);

        printf("Enter the priority for process %d: ", i + 1);
        scanf("%d", &processes[i].priority);

        processes[i].pid = i + 1;
    }

    sort_by_priority(processes, num_processes);
    calculate_waiting_time(processes, num_processes);

    return 0;
}