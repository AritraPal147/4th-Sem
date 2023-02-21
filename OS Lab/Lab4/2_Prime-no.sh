# 2) WASS to check whether a given number is prime or not

echo "Enter number to be checked: "
read num
flag=0
i=2

while [ $i -le `expr $num / 2` ]
do
	if [ `expr $num % $i` -eq 0 ]
	then
		flag=1
		break
	fi
	i=$(( i + 1 ))
done

if [ $flag -eq 1 ]
then
	echo "Not Prime"
else
	echo "Prime"
fi
