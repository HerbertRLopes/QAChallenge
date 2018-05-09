---
title: Security
description: Analyse this platform and tell us if there's something you'd change in terms of security measures.
author: Herbert Lopes


---
=========


## [01] Insufficient Anti-automation
       Insufficient Anti-automation occurs when a web application permits an attacker to automate a process that was originally designed to be performed only in a manual operation
      Application login forms – attackers may automate brute force login requests in an attempt to guess user credentials.


### Form to prevent this issue

      A common practice for protecting against automation attacks is the implementation of reCAPTCHA mechanisms in web applications. 
    
### Common reCAPTCHA mechanisms may include:

      "I'm not a Robot" reCAPTCHA checkbox;
       Simple math questions such as: "How much is 2+3?"
       Common sense questions such as: "What is the capital city of Brazil?"
       "Select all images below that match this one"

## Frontend integration
    script src="https://www.google.com/recaptcha/api.js?render=reCAPTCHA_site_key"></script>
  <script>
  grecaptcha.ready(function() {
      grecaptcha.execute('reCAPTCHA_site_key', {action: 'action_name'}).then(function(token) {
         ...
      });
  });
  </script>
