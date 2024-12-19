#!/bin/bash

# Script to automate Git add, commit, and push with a dynamic commit message

# Prompt for the commit message
read -p "Enter your commit message: " COMMIT_MSG

# Check if the commit message is empty
if [ -z "$COMMIT_MSG" ]; then
  echo "Commit message cannot be empty. Aborting."
  exit 1
fi

# Stage all changes
git add .

# Commit with the specified message
git commit -m "$COMMIT_MSG"

# Push to the remote repository
git push

echo "Changes have been pushed successfully with the message: '$COMMIT_MSG'"
