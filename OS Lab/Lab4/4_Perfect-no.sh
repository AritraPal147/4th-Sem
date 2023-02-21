# 4) WASS to check if a number is perfect number or not

echo "Enter a number: "
read num
i=1
sum=0

while [ $i -le `expr $num / 2` ]
do
	if [ `expr $num % $i` -eq 0 ]
	then
		sum=$(( $sum + $i ))
	fi
	i=$(( $i + 1 ))
done

if [ $sum -eq $num ]
then
	echo "Perfect Number"
else
	echo "Not a Perfect Number"
fi

