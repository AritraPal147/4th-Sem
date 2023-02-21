# 5) WASS to check if a find reverse of given number
#    and check if it is palindrome number or not

echo "Enter a number: "
read num
temp=$num
rev=0
d=0

while [ $temp -gt 0 ]
do
	d=`expr $temp % 10`
	rev=`expr $rev \* 10 + $d`
	temp=`expr $temp / 10`
done

echo "Reversed Number: $rev"
if [ $num -eq $rev ]
then
	echo "Palindrome Number"
else
	echo "Not a Palindrome Number"
fi
