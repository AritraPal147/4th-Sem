rad=$1

area=`echo $rad \* $rad \* 3.14 | bc -l`
echo Area of circle with radius $rad = $area
