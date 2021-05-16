# Apples vs Oranges
An application for comparing two things, it doesn't really do it effeciently, it just pulls two definitions from the api.
This app is written in java, uses the MVVM architecture, ViewBinding, Hilt for dependency injection, Retrofit for HTTP requests, and RxJava for threading.

API used is Free Dictionary API

https://dictionaryapi.dev/

## Libraries used:

- **Retrofit**: https://github.com/square/retrofit
- **RxJava2**: https://github.com/ReactiveX/RxJava
- **Dagger Hilt**: https://dagger.dev/hilt/
- **Navigation**: https://developer.android.com/guide/navigation/navigation-getting-started

## Packages:

* **di**: for Hilt Modules
* **domain**: for the UI Models
* **repository**: for housing the repository that constructs the Flowable object
* **source**: for data sources
    * **remote** : for the Retrofit service for the 
        * **dto** : for the data transfer objects  
* **ui**: for the fragments and activities
    * **main** : MainFragment and ViewModel, which contains the screen for handling user input 
    * **versus** : VersusFragment and ViewModel which displays the API responses
* **util** : for the various util classes




