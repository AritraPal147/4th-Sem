# 2) WASS to provide grade of students based on the following data
#	Marks		Grade
#	90-100		  O
#	80-89		  E
# 	70-79		  A
#	60-69		  B
#	50-59		  C
#	40-49		  D
#    less than 40	  F

echo "Enter marks: "
read marks

if [ $marks -le 100 ]
then
	if [ $marks -ge 90 ]
	then
		echo "Grade: O"
	elif [ $marks -ge 80 ]
	then
		echo "Grade: E"
	elif [ $marks -ge 70 ]
	then
		echo "Grade: A"
	elif [ $marks -ge 60 ]
	then
		echo "Grade: B"
	elif [ $marks -ge 50 ]
	then
		echo "Grade: C"
	elif [ $marks -ge 40 ]
	then
		echo "Grade: D"
	else
		echo "Grade: F"
	fi
else
	echo "Invalid marks (marks > 100)"
fi
