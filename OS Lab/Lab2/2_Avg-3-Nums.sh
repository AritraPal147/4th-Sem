# 2) WASS to find average of 3 numbers

echo "Enter 3 numbers: "
read num1 num2 num3
avg=`echo \( $num1 + $num2 + $num3 \) / 3 | bc -l`
echo "Average of $num1, $num2 and $num3 is: $avg"
