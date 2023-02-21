# 3) WASS to find min and max among elements of an array

echo "Enter size of array: "
read n

echo "Enter $n numbers into array: "
i=0
while [ $i -lt $n ]
do
        read a[$i]
        i=`expr $i + 1`
done

max=${a[0]}
min=${a[0]}
for num in ${a[@]}
do
        if [[ $max -lt $num ]]
	then
		max=$num
	fi
	if [[ $min -gt $num ]]
	then
		min=$num
	fi
        i=`expr $i + 1`
done

echo
echo "Max: $max and Min: $min"
