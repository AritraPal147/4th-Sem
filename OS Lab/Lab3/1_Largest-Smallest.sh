# 1) WASS to compare 3 numbers to find the
#    largest and smallest using if statement

echo "Enter 3 numbers: "
read num1 num2 num3

if [ $num1 -gt $num2 ]
then
	if [ $num1 -gt $num3 ]
	then
		largest=$num1

		if [ $num2 -gt $num3 ]
		then
			smallest=$num3
		else
			smallest=$num2
		fi

	else
		largest=$num3
		smallest=$num2
	fi

else
	if [ $num2 -gt $num3 ]
	then
		largest=$num2

		if [ $num3 -gt $num1 ]
		then
			smallest=$num1
		else
			smallest=$num3
		fi

	else
		largest=$num3
		smallest=$num1
	fi
fi

echo "Largest: $largest"
echo "Smallest: $smallest"
