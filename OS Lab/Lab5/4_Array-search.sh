# 4) WASS to read and search an element is present in which location
#    in an array, else print not found.

echo "Enter size of array: "
read n

echo "Enter $n numbers into array: "
read -ra arr

echo "Enter element to be searched: "
read element
index=-1

for i in ${arr[@]}
do
        if [[ $element -eq ${arr[i]} ]]
	then
		index=$i
		break
	fi
done

if [[ $index -eq -1 ]]
then
	echo "Not found"
else
	echo "Found at $index"
fi
