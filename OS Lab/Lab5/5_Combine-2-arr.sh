# 5) Write a shell script to combine two arrays
#    into third array

echo "Enter 1st array: "
read -ra arr1

echo "Enter 2nd array: "
read -ra arr2

combined=("${arr1[@]}" "${arr2[@]}")
echo "Combined array: ${combined[@]}"
