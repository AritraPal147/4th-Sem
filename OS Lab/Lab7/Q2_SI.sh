p=$1
r=$2
t=$3

si=`echo \( $p \* $r \* $t \) / 100 | bc -l`
echo Simple Interest: $si
