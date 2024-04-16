# ⛈️ Weather Application 
In this project, we create a complete APP including several tasks explored during the course of Mobile Applications in the San Jorge University. 

## 🔍 Problem Description
The basic structure of the app could follow this diagram:

<img width="739" alt="Diagram of activities A1, A2, A3, A4, A5 and A6" src="https://github.com/dbsDevelops/WeatherApp-MobileApps-USJ/assets/128851884/9f0c71d6-3f09-4e56-83ab-2c116e63af09">

The recommended API is the following but feel free to use any of your choice that support the features described in this document:
(https://www.visualcrossing.com/resources/documentation/weather-api/timeline-weather-api/)[Visual Crossing Weather]

The suggested Entity-Relationship diagram is:

<img width="651" alt="Entity Relationship Diagram of User Data, City and Forecast" src="https://github.com/dbsDevelops/WeatherApp-MobileApps-USJ/assets/128851884/65fafd71-2a2e-49ee-b741-23ccce14a831">

## 🧩 Activities Description
- **A1 - Splash screen**: will show your “logo/title/whatever” while the data is being loaded in the background and then it will disappear and load the next activity. It won’t be stored into the back-stack. Data will be downloaded and persisted in the device.
- **A2 - Main screen**: ideally, will show the current GPS location information downloaded and menu to the different features. This screen will provide the main user interface.
- **A3 - Favorite Cities List screen**: as an option, the user could add/remove cities to their favorites. The cities and its last report will be shown here. Add search and/or filter functionalities (by weather, temperature... or any other value you consider).
- **A4 - Cities List screen**: by default, you will provide a list of 10 towns/cities for the user to be able to select them. These cities can become favorites and should show that state accordingly. Same search and/filter functions apply here.
- **A5 - City Detail screen**: city information and a detailed weather report of the selected city from any list should appear here. The user should be able to check and uncheck the city as favorite, save weather reports, and access the historic data.
- **A6 - Historical Data screen**: in this screen, all the locally stored data should be displayed and accessible. With that information, you should display some statistical values as average temperature, sunny days a year, or any other you want to provide.
