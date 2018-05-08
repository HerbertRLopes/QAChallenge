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
=========


=========



|title|description|author|
|---|---|---|
|1.2 Spec out|GWrite the Functional Analysis spec that would be given to a developer for the login/signup page and mechanism.|Herbert Lopes|



## 1.0 INTRODUCTION
This document specifies the requirements of the Annotation Tools providing developers and testers with the necessary information for the design and implementation to perform system testing and approval.


## 2.0 Requirements - Web
  
     2.1 WebSite Home page
     The web site Home page must be developed to perform the Login in Annotation Tools.
   
    2.2 Annotation Tools Registration
    2.2.1 A Master Admin user will have the capability to register a new user.
    2.2.2 An admin user profile must be created for the institution Unbabel. 
    2.2.3 This user will have the admin rights for that particular institution with the capability to set up further users within the organisation. 
    2.2.4 The registration page must contain at least these below data elements: 		

   
    2.2.5 When the user fills in the information, it must be validated to ensure no junk data is being input. 
    2.2.6 When the user clicks ‘Register’ button, an e-mail must be sent to the site administrator to validate the details. 
    2.2.7 Upon activation, an e-mail must be sent to the e-mail id provided at the time of registration informing that the id is activated along with the initial (one-time) password for log in.

 Email will look like this:

 ![registration](https://user-images.githubusercontent.com/5126039/39733944-6c185814-524b-11e8-9792-72945149e84c.png)


## 3.0 System Availability

    It's expected that this service must support 75 users at any given moment and must be able to handle 350 requests per second. The response time must be under 200 ms.
    
    
## 4.0 UI mockup


 Login Screen may look like this:  
 ![login](https://user-images.githubusercontent.com/5126039/39731311-59b92bde-523d-11e8-914b-9185329b608b.png)


## 5.0 Controls description


This part of the document inform the controls description to work in each part of the Login screen.
    
###  5.1 Field E-mail Address
     5.1.1 Textbox with maximum 320 chars [Note: 320 is maximum allowed email length according the spec], empty by default.
     5.1.2 Registered user  – ‘Enter email address’.
     5.1.3 Textbox supports all character formats (letter, number and symbols)
    
###  5.2 Field Password 
    5.2.1 Textbox with maximum 100 chars [Note: 100 is maximum allowed password length according the spec], empty by default.
    5.2.2 Registered user  – ‘Enter Password characters’.
    5.2.3 Textbox supports all character formats (letter, number and symbols).
    5.2.4 Password must be at least six characters.
    5.2.5 When user types password then display ‘*’ instead of entered characters.
    5.2.6 Checkbox ‘Show Password’. It can be either Select or Unselected. Unselected  –  by default. So, if it is selected, then show password without ‘*’.
      
### 5.3 Acess Main Screen
    5.3.1 User access the Main screen by clicking in 'Enter' button. [Note: User has a valid  regitered Login and Password]
       
### 5.4 Button Sing  in
     5.4.1 Button 'Sing in ' to user access the main screen by clicking the button. [Note: User has a valid  regitered Login and Password]
   Button 'Sing in' may look like this:
   ![sing in](https://user-images.githubusercontent.com/5126039/39734034-d93aecae-524b-11e8-9a0c-19fec934f3d5.png)

###  5.5 Error Messages
    5.5.1 If user iforms a incorrect Email a red error message is displayed below the title.  [Note: system does not tell real reason to avoid hacking]
       
   ![errormessage](https://user-images.githubusercontent.com/5126039/39732956-a389303e-5246-11e8-8c26-050c4a6e6f04.png)
     
    5.5.2 If user iforms a correct Email with an incorrect Password a red error message is displayed below the title. [Note: <‘Invalid PAssword >]
    
    5.5.3 If user fill the fields with a valid Email and Password, but an error occurs, then a red error message is displayed: 'Please try again and if error still occurs contact the Administrator'
    
 ###  5.6 Correct Login
 
        5.6.1 If all informations are correctly the Main Screen is displayed correctly.
   Main screen will look like this:    
   ![mainscreen](https://user-images.githubusercontent.com/5126039/39733984-9ded35d0-524b-11e8-8d8d-6e5167840d74.png)

        
        
    
    
  
       
       
       

       
       


