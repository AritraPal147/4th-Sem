fun() {
	a=$1
	b=$2
	c=$3
	d=`expr $a + $b + $c`
	echo $d
}
fun 1 2 3
