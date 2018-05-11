---
title: Load Testing
description: It's expected that this service must support 75 users at any given moment and must be able to handle 350 requests per second. The response time must be under 200 ms.
author: Herbert Lopes


---
=========


## Steps do Execute the Load Testing

 1. Download the Jmeter at: "http://jmeter.apache.org/download_jmeter.cgi";
 2. Execute Jmeter and Open the Project "QAChallengeTestPlan.jmx";
  ![openproject](https://user-images.githubusercontent.com/5126039/39905000-7e80bcea-54b1-11e8-989c-b95b822bca0a.png)

 3. Execute the tests with 75 users;
  ![executewith75](https://user-images.githubusercontent.com/5126039/39905033-aa1f691e-54b1-11e8-8239-5379960d7f59.png)


## Result of the Load Testing with 75 users

   In general the average time was 612ms, without having presented percentage of failures. Attending the 75 simultaneous accesses without
problems. If we consideret that the response time must be under 200ms this is a very bad result, 
but we need to consider the fact that I am testing in Brazil and the distance is big, for this reason the ms becomes high.

   ![results](https://user-images.githubusercontent.com/5126039/39905149-3bcf3f2e-54b2-11e8-961c-b99e57a1d270.png)

  
 

## Result of the Load Testing with 350 Requests per second

 In general the average time was 647ms, if you compare with the 75 users you can identify, there was no significant difference comparing with the 350 requests. So we just need to consider the distance beetwen brazil and europe because this is the cause of the high MS. 

 ![350requests](https://user-images.githubusercontent.com/5126039/39905456-f85a8396-54b3-11e8-86d0-9c4ae219a8cc.png)
 
 
 ![result](https://user-images.githubusercontent.com/5126039/39905972-7ecb981e-54b6-11e8-94f8-714d7b18a547.png)


