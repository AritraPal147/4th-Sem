# 1) WASS to read a filename and test whether it is
#    an ordinary file or directory file using test command.
#    Add some content (name, branch, roll) to this file, open
#    it and read its contents

echo "Enter filename:"
read filename

if test -d $filename
then
	echo $filename is a Directory file.
else
	echo $filename is an Ordinary file.
	echo
	echo "Enter data into file: "
	cat >> $filename
	echo
	echo "File Contents: "
	cat $filename
fi
