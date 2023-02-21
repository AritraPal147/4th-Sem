# 2) WASS to find sum of elements of array.

echo "Enter size of array: "
read n

echo "Enter $n numbers into array: "
i=1
while [ $i -le $n ]
do
        read a[$i]
        i=`expr $i + 1`
done

i=1
sum=0
while [ $i -le $n ]
do
        sum=`expr ${a[$i]} + $sum`
        i=$(( $i + 1 ))
done

echo
echo "Sum: $sum"
