# 3) WASS to check whether a number is Armstrong or not

echo "Enter a number: "
read num
temp=$num
sum=0
d=0
while [ $temp -gt 0 ]
do
	d=`expr $temp % 10`
	sum=`expr $sum + $d \* $d \* $d`
	temp=`expr $temp / 10`
done

if [ $sum -eq $num ]
then
	echo "Armstrong Number."
else
	echo "Not an Armstrong Number."
fi
