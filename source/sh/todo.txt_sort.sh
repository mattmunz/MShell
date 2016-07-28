#!/bin/bash

# Special sort command for todo.txt content.

shDirectory=$(dirname $0)

source $shDirectory/next_to_do.sh

msort $1
