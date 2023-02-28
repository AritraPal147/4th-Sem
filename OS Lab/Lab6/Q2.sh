# 2) WASS to create a directory inside the current directory.
#    Create a file inside it, store data in it and display it on screen.

mkdir 2105188
cd 2105188
echo "Enter filename to be created: "
read filename

echo
echo Enter data into file $filename:
cat>$filename
echo
echo "File Contents: "
cat $filename
