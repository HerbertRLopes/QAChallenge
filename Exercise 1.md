---
title: Review and Refactor
description: Given the Annotation Guideline document available. Provide 5 specific examples of things you would change, why and how.
author: Herbert Lopes


---
=========

## 1 - Theres no feedback for the progress bar in the Main Page

When user perform an annotation the progress bar change but isn't possible to know the percent of the progress. Adding a
progress more intuitive we can fix this problem and perform a better interaction.


Example of an intuitive progress bar
![progress bar](https://user-images.githubusercontent.com/5126039/39676719-9f44b162-5145-11e8-97e9-ba48851ee651.jpg)


## 2 - After finish all the annotations progress bar change to "Done"

To keep always the same standard in the aplication the progress bar must continuous with the format without change to "Done", performing only a change of color when its in 100%.


## 3 - All colors of the severities should be diferent, not only blue 

Currently the Annotation Guideline explain that the Severities appears in blue tonality (lighter blue= Minor severity, darker blue= Major
severity, and darkest blue = Critical severity). But to allow a better view is necessary to have a difference in the colors using for example Green for Minor Severity, Yellow for Major severity and Red for a critical Severity. 


## 4 - The usability of the fluency bar must be improved

When user open the Annotation Guideline is explained what to do after review all annotations, but the usability that is shown is not ok. IS possible to creat a new interface for this progress, like using five stars and some questions to user respond with "Yes" Or "No": 

Examples of questions: 
```
"Do you consider the text translator a good professional?"
```

All this question will help Unbabel to select better professionals and detect possible problems with the translators.

## 5 - There's no explanation about the count time that appears in the Annotation Tools

A Guideline must contain all the necessary infomrations for user know how to perform the work in a better way. Implement this information can help user utilize his time correctly.

## 6 - There's no explanation when user report an Annotation

There's no default rules for user report an annotation. When is possible and in what cases is necessary to report ? 
After report, why is not possible to edit and what happens with the annotations after being reported ?
All these questions should appears in the Guideline in order to user doesnt make mistakes when performing a review. 

## 7 - List of batches without the title on menu

In page three of Guideline we can see that the images that represents the main menu appears only with the title in options "Created" (the date it was created), "Progress" (amount of tasks you still need to annotate to finish the batch). 
It should input the title "Available Batches" for user know the batches they need to review.

 ## 8 - Is necessary implementate a field for user recover the password
 
 In case the user forget the password theres no field to recover the password in a easy and quickly way. And this information is not shown in the Guideline with the explanation what user do in this case. This is necessary because sometimes the users doesnt save they password in the computer and eventually forgetting this information.
 
 ```
 Example: User can recover the password by email.
 ```






