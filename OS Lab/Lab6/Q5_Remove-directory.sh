# 5) WASS to remove a directory.

echo "Enter name of directory to be removed:"
read dirname
rm -r $dirname
# Use rmdir $dirname for empty directory
echo $dirname removed successfully.
