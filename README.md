# Secret Message App

## Overview
This Android application allows users to enter a secret message on the first screen and view it on a second screen using Android Intents. The project demonstrates navigation between activities and passing data between screens.

---

## Features
- User input via EditText
- Button-based navigation
- Explicit Intent to open a second activity
- Passing data using `putExtra`
- Receiving data using `getStringExtra`
- Back navigation using `finish()`

---

## Technologies Used
- Kotlin
- Android Studio
- Android SDK
- XML Layouts
- AppCompat Activities

---

## How It Works

### 1. Main Screen (MainActivity)
- User enters a message
- Clicks "Send Secret Message"
- Message is passed to the second screen using Intent

### 2. Display Screen (MessageDisplayActivity)
- Receives the message from the Intent
- Displays it in a TextView
- Provides a Back button to return to the main screen

---

## Project Structure
```
app/
 ├── java/com.example.secretmessageapp/
 │    ├── MainActivity.kt
 │    ├── MessageDisplayActivity.kt
 │
 ├── res/layout/
 │    ├── activity_main.xml
 │    ├── activity_message_display.xml
 │
 ├── manifests/
 │    ├── AndroidManifest.xml
```

---

## Key Code Concept

### Sending Data
```kotlin
val intent = Intent(this, MessageDisplayActivity::class.java)
intent.putExtra("SECRET_MESSAGE", message)
startActivity(intent)
```

### Receiving Data
```kotlin
val message = intent.getStringExtra("SECRET_MESSAGE")
textViewMessage.text = message
```

---

## Test Cases

### Normal Cases
- Entering a short message → displays correctly
- Entering a long message → displays correctly
- Sending multiple messages → updates correctly

### Edge Cases
- Empty message → shows blank or "No message received"
- Rapid button clicks → app remains stable
- Back navigation → returns to main screen without crash

---

## Conclusion
This project demonstrates basic Android navigation, Intent usage, and data passing between activities. It serves as an introduction to multi-screen Android applications.

---

## Youtube
https://www.youtube.com/watch?v=iDhir_GPVj4
