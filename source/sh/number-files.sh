#!/bin/bash

# Renames all files in the directory with a number suffix. 
# TODO Some things are hardcoded here to a fit a particular use case and should be generalized.

i=1

for file in *.*; do

  if [[ "$file" == *\.jpg || "$file" == *\.jpeg || "$file" == *\.JPG ]]
  then
  
    newFile=$(printf "DesktopPhotos.%04d.jpeg" "$i")
  
    echo "Renaming $file to $newFile"
  
    mv -- "$file" "$newFile"
  
    let i=i+1
  fi
done
