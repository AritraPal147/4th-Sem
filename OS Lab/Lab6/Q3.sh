# 3) WASS to input 2 filenames from previously existing
#    current folder. Concatenate or merge contents of
#    those 2 files and store inside 3rd file

cd 21051881
echo "Enter 2 filenames to be merged: "
read filename1 filename2

echo "Enter name of 3rd file: "
read filename3
cat $filename1 $filename2 > $filename3
echo
echo "Merged file contents: "
cat $filename3
