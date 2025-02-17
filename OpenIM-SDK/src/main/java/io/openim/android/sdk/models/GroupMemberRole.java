package io.openim.android.sdk.models;

public class GroupMemberRole {
    private String userID;
    /// 1 ordinary member, 2 group owners, 3 administrators
    /// 1普通成员, 2群主，3管理员
    private int roleLevel;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }
}
