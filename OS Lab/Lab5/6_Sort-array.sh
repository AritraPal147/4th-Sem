# 6) WASS to arrange the elements in ascending order
#    using bubble sort

echo "Enter elements into array: "
read -ra arr

len=${#arr[@]}
i=0
j=0

while [ $i -lt `expr $len - 1` ]
do
	j=0
	while [ $j -lt `expr $len - $i - 1` ]
	do
		next=${arr[$(( j + 1 ))]}
		if [[ ${arr[j]} -gt $next ]]
		then
			temp=${arr[j]}
			arr[j]=$next
			arr[$(( j + 1 ))]=$temp
		fi
		j=$(( j + 1))
	done
	i=$(( i + 1))
done

echo "Sorted Array: ${arr[@]}"
