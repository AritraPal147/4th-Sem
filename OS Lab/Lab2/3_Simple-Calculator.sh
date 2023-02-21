# 3) WASS to do a calculator program

echo "Enter 2 numbers: "
read num1 num2

sum=`expr $num1 + $num2`
diff=`expr $num1 - $num2`
prod=`expr $num1 \* $num2`
div=`echo $num1 / $num2 | bc -l`

echo Sum = $sum
echo Difference = $diff
echo Product = $prod
echo Division = $div
