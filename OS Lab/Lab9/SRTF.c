#include <stdio.h>

void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

int main() {
  int i, j, k, small, temp, procs[100], complete[10];
  int total_unit_run = 0;
  int n = 5;
  float tavg = 0.0, wavg = 0.0;
  int ari[5] = {2, 5, 1, 0, 4};
  int bur[5] = {6, 2, 8, 3, 4};
  int waiting[10] = {0};
  for (i = 0; i < n; i++) 
    total_unit_run += bur[i];

  // sorting the arrival time and burst time to the process arriving first
  for (i = 0; i < n; i++) {
    for (j = i + 1; j < n; j++) {
      if (ari[i] > ari[j]) {
        swap(&ari[i], &ari[j]);
        swap(&bur[i], &bur[j]);
      }
    }
  }

  for (i = 0; i < total_unit_run; i++) {
    small = 9999;
    for (j = 0; j < n; j++) {
      // to get the smallest possible burst time
      if ((bur[j] != 0) && (ari[j] <= i) && (bur[j] < small))  {
        small = bur[j];
        k = j;
      }
    }

    bur[k]--;
    procs[i] = k;
  }

  k = 0;
  for (i = 0; i < total_unit_run; i++) {
    for (j = 0; j < n; j++) {
      if (procs[i] == j) {
        complete[j] = i;
        waiting[j]++;
      }
    }
  }

  printf("Process\t\tCT\t\tTAT\t\tWT\n");
  for (i = 0; i < n; i++) {
    printf("\n%d\t\t%d\t\t%d\t\t%d\n", i+1, complete[i]+1, complete[i]-ari[i]+1, complete[i]+1-waiting[i]-ari[i]);

    wavg += complete[i] + 1 - waiting[i] - ari[i];
    tavg += complete[i] - ari[i] + 1;
  }

  printf("\nAvg Waiting Time: %f\nAvg TurnAround Time: %f", (wavg / n), (tavg / n));
  return 0;
}