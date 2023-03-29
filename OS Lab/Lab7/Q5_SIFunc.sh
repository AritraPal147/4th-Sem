calcSI() {
	p=$1
	r=$2
	t=$3
	si=`echo \( $p \* $r \* $t \) / 100 | bc -l`
	echo Simple Interest: $si
}

echo "Enter principal amount: "
read P
echo "Enter rate of interest: "
read R
echo "Enter time in years: "
read T
calcSI $P $R $T
