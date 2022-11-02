package io.gdfbarbosa.patterns.behavioral.templatemethod;

/**
 * Base class of social network using Template Method (Design Pattern).
 */
public abstract class SocialNetwork {
    String userName;
    String password;

    SocialNetwork() {}

    /**
     * Publish the data to whatever network. (skeleton of the algorithm)
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}