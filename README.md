Extended JSTL expression language functions
===========================================
The Extended Tag Library is a collection of tags and functions to be used in addition to the Standard tag library.


To Use
------
Copy extended.jar from lib into your application lib folder.


API
---
### Commons Lang StringUtils functions
- *Capitalize* =>
  ```java
  java.lang.String capitalize(java.lang.String)
  ```
- *Uncapitalize* =>
  ```java
  java.lang.String uncapitalize(java.lang.String)
  ```
- *lastIndexOf* =>
  ```java
  int lastIndexOf(java.lang.String, java.lang.String)
  ```
- *left* =>
  ```java
  java.lang.String left(java.lang.String, int)
  ```
- *mid* =>
  ```java
  java.lang.String mid(java.lang.String, int)
  ```
- *right* =>
  ```java
  java.lang.String right(java.lang.String, int)
  ```
- *repeat* =>
  ```java
  java.lang.String repeat(java.lang.String, int)
  ```
- *leftPad* =>
  ```java
  java.lang.String leftPad(java.lang.String, int, java.lang.String)
  ```
- *rightPad* =>
  ```java
  java.lang.String rightPad(java.lang.String, int, java.lang.String)
  ```
- *center* =>
  ```java
  java.lang.String center(java.lang.String, int, java.lang.String)
  ```
- *abbreviate* =>
  ```java
  java.lang.String abbreviate(java.lang.String, int)
  ```

### Commons Lang WordUtils functions
- *capitalizeAllWords* =>
  ```java
  java.lang.String capitalize(java.lang.String)
  ```

### Regex String Replacement
- *replaceAll* =>
  ```java
  java.lang.String replaceAll(java.lang.String, java.lang.String, java.lang.String)
  ```
- *replaceFirst* =>
  ```java
  java.lang.String replaceFirst(java.lang.String, java.lang.String, java.lang.String)
  ```

### java.lang.Math functions
- *ceil* =>
  ```java
  double ceil(double)
  ```
- *floor* =>
  ```java
  double floor(double)
  ```
- *round* =>
  ```java
  long round(double)
  ```
- *sqrt* =>
  ```java
  double sqrt(double)
  ```

### java.lang.System
- *env* =>
  ```java
  java.lang.String getenv(java.lang.String)
  ```
- *property* =>
  ```java
  java.lang.String property(java.lang.String)
  ```

### java.net.URLEncoder/URLDecoder
- *encode* =>
  ```java
  java.lang.String encode(java.lang.String, java.lang.String)
  ```
- *decode* =>
  ```java
  java.lang.String decode(java.lang.String, java.lang.String)
  ```

### MD5 Hex encoding
- *md5hex* =>
  ```java
  java.lang.String md5hex(java.lang.String)
  ```

### Weak URL fetch and cache
- *fetchUrl* =>
  ```java
  java.lang.String fetch(java.lang.String)
  ```


To build
--------
```
./build.sh
```

