package org.trendyol.config;

public class Credentials {

    public String username;

    public String password;

    public int supplierId;

    public boolean isStage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public boolean isStage() {
        return isStage;
    }

    public void setStage(boolean stage) {
        isStage = stage;
    }
}
