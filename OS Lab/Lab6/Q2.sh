# 2) WASS to create a directory inside the current directory.
#    Create a file inside it, store data in it and display it on screen.

mkdir 21051881
cd 21051881
echo "Enter filename to be created: "
read filename

echo
echo Enter data into file $filename:
cat>$filename
echo
echo "File Contents: "
cat $filename
