num1=$1
num2=$2
num3=$3

avg=`echo \( $num1 + $num2 + $num3 \) / 3 | bc -l`
echo Average = $avg
