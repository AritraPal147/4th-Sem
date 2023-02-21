# 1) WASS to read and print an array

echo "Enter size of array: "
read n

echo "Enter $n numbers into array: "
i=1
while [ $i -le $n ]
do
	read a[$i]
	i=`expr $i + 1`
done

echo
echo "Array is: "
i=1
while [ $i -le $n ]
do
	echo ${a[$i]}
	i=$(( $i + 1 ))
done


