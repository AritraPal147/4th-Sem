#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char* ltrim(char*);
char* rtrim(char*);

int parse_int(char*);


/*
 * Complete the 'kSub' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY nums
 */

long kSub(int k, int nums_count, int* nums) {
    long count = 0;
    int sum = 0;
    for(int i = 0; i < nums_count; i++)
    {
        sum = 0;
        for(int j=i; j<nums_count; j++) {
            sum += *(nums + j);
            if (sum % k == 0)
                count++;
            else
                break;
        }
    }
    return count;
}
int main()
{
    FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

    int k = parse_int(ltrim(rtrim(readline())));

    int nums_count = parse_int(ltrim(rtrim(readline())));

    int* nums = (int*) malloc(nums_count * sizeof(int));

    for (int i = 0; i < nums_count; i++) {
        int nums_item = parse_int(ltrim(rtrim(readline())));

        *(nums + i) = nums_item;
    }

    long result = kSub(k, nums_count, nums);

    fprintf(fptr, "%ld\n", result);

    fclose(fptr);

    return 0;
}

char* readline() {
    size_t alloc_length = 1024;
    size_t data_length = 0;

    char* data = (char*)malloc(alloc_length);

    while (true) {
        char* cursor = data + data_length;
        char* line = fgets(cursor, alloc_length - data_length, stdin);

        if (!line) {
            break;
        }

        data_length += strlen(cursor);

        if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') {
            break;
        }

        alloc_length <<= 1;

        data = (char*)realloc(data, alloc_length);

        if (!data) {
            data = '\0';

            break;
        }
    }

    if (data[data_length - 1] == '\n') {
        data[data_length - 1] = '\0';

        data = (char*)realloc(data, data_length);

        if (!data) {
            data = '\0';
        }
    } else {
        data = (char*)realloc(data, data_length + 1);

        if (!data) {
            data = '\0';
        } else {
            data[data_length] = '\0';
        }
    }

    return data;
}

char* ltrim(char* str) {
    if (!str) {
        return '\0';
    }

    if (!*str) {
        return str;
    }

    while (*str != '\0' && isspace(*str)) {
        str++;
    }

    return str;
}

char* rtrim(char* str) {
    if (!str) {
        return '\0';
    }

    if (!*str) {
        return str;
    }

    char* end = str + strlen(str) - 1;

    while (end >= str && isspace(*end)) {
        end--;
    }

    *(end + 1) = '\0';

    return str;
}

int parse_int(char* str) {
    char* endptr;
    int value = strtol(str, &endptr, 10);

    if (endptr == str || *endptr != '\0') {
        exit(EXIT_FAILURE);
    }

    return value;
}