findAvg() {
	num1=$1
	num2=$2
	num3=$3
	avg=`echo \( $num1 + $num2 + $num3 \) / 3 | bc -l`
	echo Avg of $num1, $num2, $num3 is: $avg
}

echo "Enter 3 numbers: "
read n1 n2 n3
findAvg $n1 $n2 $n3

