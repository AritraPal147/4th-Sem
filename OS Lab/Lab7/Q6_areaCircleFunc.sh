area() {
	r=$1
	area=`echo $r \* $r \* 3.14 | bc -l`
	echo Area of circle with radius $r = $area
}

echo "Enter radius of circle: "
read rad
area $rad
