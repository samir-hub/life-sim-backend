# MyPath 🏁

MyPath is dedicated to helping high school students and young adults plan for the future. This is the repository for MyPath's back-end. It was built using Java and Spring Boot with a PostgreSQL database. 

[**Deployed Application**](https://www.getmypathapp.com)

---

## **API Documentation**

**BASE URL** https://samirlilienfeld-mypath.herokuapp.com

### **Table of Contents**

#### NON-PROTECTED ENDPOINTS

| Links                                   | Endpoints            |
| ----------------------------------------| ---------------------|
| [POST Registration](#post-registration) | `/createnewuser`     |
| [POST Login](#post-login)               | `/login`             |

#### PROTECTED ENDPOINTS

| Links                                             | Endpoints                     |
|---------------------------------------------------|-------------------------------|
| [GET Logout](#get-logout)                         | `/logout`                     |
| [GET User's Info](#get-user-info)                 | `/users/getuserinfo`          |
| [GET Details By Id](#get-details-by-id)           | `/details/details/:detailsid` |
| [GET Details By User Id](#get-details-by-user-id) | `/details/user/:userid`       |
| [PUT Details](#put-details)                       | `/data/details/:detailsid`    |
| [DELETE Details](#delete-details)                 | `/data/details/:detailsid`    |

---

### [POST] Registration

#### URL: https://samirlilienfeld-mypath.herokuapp.com/createnewuser

**Payload:** _an object with the following credentials:_

> **Required:** `username`, `password`, & `primaryemail`

```json
{
  "username": "myUsername",
  "password": "myPassword",
  "primaryemail": "myemail@gmail.com",
}
```
[Back to Top](#table-of-contents)

---

### [POST] Login

#### URL: https://samirlilienfeld-mypath.herokuapp.com/login

**Request Structure:** _the username and password with an authorization header containing the CLIENTID and CLIENTSECRET_

```javascript

axios.post('https://samirlilienfeld-mypath.herokuapp.com/login', 
           `grant_type=password&username=${USERNAME}&password=${PASSWORD}`, 
           {
            headers: { Authorization: `Basic ${btoa('my-client-id:my-client-secret')}`,
                      'Content-Type': 'application/x-www-form-urlencoded'
                      },
            })
```

**Return:** _An access token will be returned. Save this token to local storage (or similar). This token will be required for all HTTP requests below (protected endpoints)._

```json
{
  "access_token": "2fgce453-63gh-33cd-5ff5-g56dcft55555",
  "token_type": "bearer",
  "expires_in": 3600,
  "scope": "read trust write"
}
```

[Back to Top](#table-of-contents)

---

### [GET] Logout

#### URL: https://samirlilienfeld-mypath.herokuapp.com/logout

**Return:** _Removes token from token store and returns nothing._

[Back to Top](#table-of-contents)

---

---
