---

# InstaChat

InstaChat is a real-time messaging application built using **Spring Boot** and **StompJS**. It allows users to exchange messages instantly, leveraging WebSocket technology for efficient and reliable communication.

## Features

- **Real-Time Messaging**: Send and receive messages instantly without refreshing the page.
- **WebSocket Integration**: Built with WebSocket and STOMP for seamless communication.
- **User Authentication**: Secure login functionality for users.
- **Clean and Intuitive UI**: A user-friendly interface for a smooth messaging experience.
- **Scalable Backend**: Powered by Spring Boot, suitable for handling high volumes of traffic.

## Tech Stack

- **Frontend**: JavaScript (StompJS), HTML, CSS, Thymeleaf
- **Backend**: Spring Boot (Java)
- **WebSocket Protocol**: STOMP (Simple/Streaming Text-Oriented Messaging Protocol)
- **Database**: MySQL 

## Setup and Installation

Follow these steps to set up the project locally:

### Prerequisites

- JDK 11 or higher
- MySQL installed and running
- Maven installed
- A modern web browser

### Steps to Run the Application

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-repo/InstaChat.git
    cd InstaChat
    ```

2. **Build the Project**:
    ```bash
    mvn clean install
    ```

3. **Configure the Database**:
   Update the `application.properties` file in the `src/main/resources` directory with your MySQL connection details:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:22713/defaultdb?ssl-mode=REQUIRED
    ```

4. **Run the Application**:
    ```bash
    mvn spring-boot:run
    ```

5. **Access the Application**:
   Open your browser and navigate to `http://localhost:8080`.

## Usage

1. **Login/Register**: Enter your credentials to log in or create a new account.
2. **Send Messages**: Select a user and start chatting in real-time.
3. **Group Chat**: Chat with multiple people at the same time, similar to Twitch.

## File Structure

```
InstaChat
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.instachat (Backend logic)
│   │   ├── resources
│   │   │   ├── static (Frontend files)
│   │   │   └── application.properties (Configurations)
│   └── test (Unit tests)
├── pom.xml (Maven dependencies)
└── README.md (Project documentation)
```

## Screenshots


**Registration:**
![image](https://github.com/user-attachments/assets/2ad48e47-82f6-493b-9643-3e84da691517)

**Login:**
![image](https://github.com/user-attachments/assets/0f4a682c-2ef7-499e-8c01-22da1882f2c0)

**Home:**
![image](https://github.com/user-attachments/assets/0cf2674a-d24c-4169-a0eb-05c4556f32fa)

**Chat:**
![image](https://github.com/user-attachments/assets/8f163de5-9f1a-4d7c-ae68-6bf8cdc1aa6b)





## Future Enhancements

- **Group Chats**: Enable users to create group chat rooms.
- **File Sharing**: Support sharing files and media in chats.
- **User Status**: Show online/offline status of users.
- **Push Notifications**: Real-time notifications for new messages.

## Contributors

- **[G. Pradeep Chandra](https://github.com/Pradeep-Chandra-G)** - Full Stack Developer

## License

This project is is free to use.

---
