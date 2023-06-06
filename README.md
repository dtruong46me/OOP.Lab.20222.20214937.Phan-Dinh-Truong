# OOP.Lab.20222.20214937.Phan-Dinh-Truong

## AIMS PROJECT
**1. Problem Description**

Ti-do company, a potential merger of Tiki and Sendo, is looking for a software system for their **AIMS Project** *(An Internet Media Store)*. The store currently only sells **Digital Video Discs** (DVDs) and allows customers to browse, search, view details, add to cart, and place orders. Customers can search for DVDs by title, category, or price range, and can sort and filter their cart. The system also calculates delivery fees and allows for credit card payments. The store manager can log in to the system to manage pending orders, add new DVDs, and remove DVDs from the store.

**2. Project Objectives**

This project aims to create a complete software system for the Ti-do company **AIMS Project**, allowing customers to easily search, view details, add to a cart and order DVD products. The system also needs to support the store's product management and order management features. The goal of the project is to provide customers with a convenient online shopping experience that meets their needs and helps Ti-do company compete effectively with other e-commerce platforms in the market.

**3. Solutions**

When the users execute this program, the first thing you see is the **AIMS MENU**:
```
------------ AIMS MENU -------------
Enter 1. View store
Enter 2. Update store
Enter 3. See current cart
Enter 4. Back up store
Enter 0. Exit
------------------------------------
Your choice: 
```
You can choose `'1-2-3-4'` or `'0'` to exit program. And here are some instructions of functions in this program:

- View Store: `AIMS MENU -> 1`, the terminal will show you the items in the store which has been back up:
```
+----------------------------------------------------------------+
|                          STORE ITEMS                           |
+----+--------+--------------------------+------------+----------+
| No.|   ID   |         Title            |  Category  |   Cost   |
+----+--------+--------------------------+------------+----------+
| 1  | 100001 | The Lion King            | Animation  |  19.95$  |
| 2  | 100002 | Clean Code               | Software.. |  29.99$  |
| 3  | 100003 | Harry Potter and the P.. | Fantasy    |  12.99$  |
| 4  | 100004 | Inception                | Sci-Fi     |  14.99$  |
| 5  | 100005 | Avengers: Endgame        | Action     |  24.99$  |
| 6  | 100006 | Java: A Beginner's Guide | Programm.. |  19.99$  |
| 7  | 100007 | Titanic                  | Romance    |  14.99$  |
| 8  | 100008 | The Great Gatsby         | Classic    |  12.99$  |
| 9  | 100009 | To Kill a Mockingbird    | Fiction    |  15.99$  |
| 10 | 100010 | Thriller                 | Pop        |   9.99$  |
+----+--------+--------------------------+------------+----------+
```
- See media's details: `AIMS MENU -> 1 -> 1`. You have to enter the title (ignore uppercase or lowercase) to see the detail of the media, for e.g. `the lion king`:
```
------ DIGITAL VIDEO DISC ------
 - ID      : 100001
 - Title   : The Lion King
 - Category: Animation
 - Cost    : 19.95
 - Director: Roger Allers
 - Length  : 87
--------------------------------
```
And the system will ask you to add this media to cart, you can choose `'Y'` to accept to add this media to cart, and `'N'` to reject.

- Add media to cart: `AIMS MENU-> 1 -> 2 -> [Enter the title]` or `AIMS MENU-> 1 -> 1 -> [Enter the title] -> Y`

- Play the media: `AIMS MENU-> 1 -> 3 -> [Enter the title]`. The system will show you the playing media if this can be played. Here is an example:
```
PLAY THE MEDIA
 - Playing DVD : The Lion King
 - DVD length  : 87 minutes
```
- See current cart: `AIMS MENU-> 1 -> 4` or `AIMS MENU -> 3` to see the items in the current cart and the total cost. If your cart is empty, the system will notify to user `<Your cart is empty!>`, and if your cart is not empty, the system will display the current cart, for e.g.
```
------------------ CART ITEMS -------------------
Ordered Items:
1. Media - 100001 - The Lion King - Animation - 19.95$
2. Media - 100010 - Thriller - Pop - 9.99$
3. Media - 100002 - Clean Code - Software Development - 29.99$
Total cost: 59.93$
-------------------------------------------------
```
Notice that if your cart is empty, you should add some medias to your cart followed the ***'Add to cart'*** instruction. (`AIMS MENU-> 1 -> 2 -> [Enter the title]`)

- Add media to store: `AIMS MENU -> 2 -> 1`, then the menu of adding media to the store will display:
```
ADD MEDIA TO THE STORE
   + Enter 1: Add CD to the Store
   + Enter 2: Add Book to the Store
   + Enter 3: Add DVD to the Store
   + Enter 0: RETURN TO UPDATE STORE
Your choice:
```
You can choose `'1-2-3'` to choose what type of media you want to add to your store. After that, you have to enter the attributes of that media.
```
ADD MEDIA TO THE STORE
   + Enter 1: Add CD to the Store
   + Enter 2: Add Book to the Store
   + Enter 3: Add DVD to the Store
   + Enter 0: RETURN TO UPDATE STORE
Your choice: 1

ADD COMPACT DISC TO THE STORE
  + Enter the title   : cd_title_example 
  + Enter the category: cd_category_example
  + Enter the cost    : 123.4
  + Enter the length  : 56
  + Enter the director: cd_director_example
  + Enter the artist  : cd_artist_example
  + Enter the list of track titles <Separated by comma>: track_1,track_2,track_3
    + Enter the length of track 'track_1': 7
    + Enter the length of track 'track_2': 8
    + Enter the length of track 'track_3': 9
```
When you complete the features of that media, the system will notify the user that the media has been successfully. For e.g.`THE MEDIA 'cd_title_example' HAS BEEN ADDED TO THE STORE!`

- Remove media from store: `AIMS MENU -> 2 -> 2 -> [Enter the title]`

- Filter medias in the cart: `AIMS MENU -> 3 -> 1 -> [Choose number]` (`[1]` is to filter by ID, `[2]` is to filter by title)

- Sort medias in the cart: `AIMS MENU -> 3 -> 2 -> [Choose number]` (`[1]` is to filter by ID, `[2]` is to filter by title)

- Remove media from cart: `AIMS MENU -> 3 -> 3 -> [Enter the title]`

- Play the media in the cart: `AIMS MENU -> 3 -> 4 -> [Enter the title]`

- Place the order: `AIMS MENU -> 3 -> 5`. Then the system will allow you to fill in the billing detail (include your full name, phone number, email address). After complete the billing detail, the system will print your order detail. For example: 
```
+------------------------------------------+
|                YOUR ORDER                |
+------------------------------------------+
| 1. INFORMATION:                          |
|  - Name  : Phan Dinh Truong              |
|  - Phone : 0979870156                    |
|  - Email : dtruong46.me@gmail.com        |
+------------------------------------------+
| 2. ORDER DETAIL:                         |
|  - Clean Code                    29.99 $ |
|  - The Lion King                 19.95 $ |
|  - Thriller                       9.99 $ |
|                                          |
|                    Total Cost:   59.93 $ |
+------------------------------------------+
```
- Back up the store: `AIMS MENU -> 4` After you add the media to the store, you should back up the media for the next time use.

## OTHER PROJECTS
This include 2 topics:

**1. Problems in Lab01**
- [x] 2.2.1 HelloWorld.java
- [x] 2.2.2 FirstDialog.java
- [x] 2.2.3 HelloNameDialog.java
- [x] 2.2.4 ShowTwoNumbers.java
- [x] 2.2.5 CalculateTwoNums.java
- [x] 2.2.6 SolvingEquation.java
- [x] 6.1 ChoosingOption.java
- [x] 6.2 InputFromKeyboard.java
- [x] 6.3 DisplayTriangle.java
- [x] 6.4 DaysInMonth.java
- [x] 6.5 SortArray.java
- [x] 6.6 MatrixAddition.java

**2. `String`, `StringBuilder` and `StringBuffer`**
- Create a new class ConcatenationInLoops to test the processing time to construct String using `'+'` operator, `StringBuffer` and `StringBuilder`. 
- Create a new class `GarbageCreator`. Create “`garbage`” as much as possible and observe when you run 
a program (it should let the program hangs or even stop working when too much “`garbage`”). Write another 
class `NoGarbage` to solve the problem.
- Some suggestions:
    + Read a text/binary file to a String without using StringBuffer to concatenate String (only use `'+'` operator). Observe and capture your screen when you choose a very long file
    + Improve the code using `StringBuffer`.

- Here is the sample code for `GarbageCreator` using `'+'` operator:
```
String filename = "OtherProjects/hust/soict/dsai/garbage/test.bin";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();

        String outputString = "";

        for (byte b : inputBytes) {
            outputString = outputString + (char) b;
        }
```

- And new code using `StringBuilder` and `StringBuffer`
```
StringBuilder outputStringBuilder = new StringBuilder();

        for (byte b : inputBytes) {
            outputStringBuilder.append((char) b);
        }
```

```
StringBuffer outputStringBuffer = new StringBuffer();

        for (byte b : inputBytes) {
            outputStringBuffer.append((char) b);
        }
```

## GUI PROJECT