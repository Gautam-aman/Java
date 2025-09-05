package com.cfs.mysqlsecurity.config;

public class UserListRequest {
    private List<UserRequest>  users;

    public List<UserRequest> getUsers() {
        return users;
    }

    public void setUsers(List<UserRequest> users) {
        this.users = users;
    }
}
