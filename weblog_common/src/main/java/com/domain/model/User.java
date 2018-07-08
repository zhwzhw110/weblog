package com.domain.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int userId;//用户编号
    private int groupId;//用户小组编号
    @NotNull
    private String userName;//用户姓名
    @NotNull
    private String userPwd;//用户密码
    private String userSalt;//用户盐
    private String userPhone;//用户手机号
    private String userSex;//用户性别
    private String userQq;//用户QQ
    private String userEmail;//用户邮箱
    private String userAddress;//用户地址
    private int userMark; //用户积分
    private int userRankId;//用户等级
    private String userLastLoginIp;//用户上一次登录IP地址
    private Date userbirthday;//用户生日
    private String userDescription;//自我描述
    private String userImageUrl;//用户头像存储路径
    private String userSchool;//毕业学校
    private Date userRegisterTime;//用户生日
    private String userRegisterIp;//用户上一次登录IP地址
    private Date userLastUpdateTime;//用户上次更新博客时间
    private String userWeibo;//用户微博
    private char userBloodType;//用户血型
    private String userSays;//用户语录
    private int userLock;//是否锁定，0为不锁定，1为锁定
    private int userFreeze;//是否冻结，0为不冻结，1为冻结
    private int userPower;//是否冻结，拥有权限


    public User() {
    }

    public User(int userId, int groupId, @NotNull String userName, @NotNull String userPwd, String userSalt, String userPhone, String userSex, String userQq, String userEmail, String userAddress, int userMark, int userRankId, String userLastLoginIp, Date userbirthday, String userDescription, String userImageUrl, String userSchool, Date userRegisterTime, String userRegisterIp, Date userLastUpdateTime, String userWeibo, char userBloodType, String userSays, int userLock, int userFreeze, int userPower) {
        this.userId = userId;
        this.groupId = groupId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userSalt = userSalt;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userQq = userQq;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userMark = userMark;
        this.userRankId = userRankId;
        this.userLastLoginIp = userLastLoginIp;
        this.userbirthday = userbirthday;
        this.userDescription = userDescription;
        this.userImageUrl = userImageUrl;
        this.userSchool = userSchool;
        this.userRegisterTime = userRegisterTime;
        this.userRegisterIp = userRegisterIp;
        this.userLastUpdateTime = userLastUpdateTime;
        this.userWeibo = userWeibo;
        this.userBloodType = userBloodType;
        this.userSays = userSays;
        this.userLock = userLock;
        this.userFreeze = userFreeze;
        this.userPower = userPower;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserMark() {
        return userMark;
    }

    public void setUserMark(int userMark) {
        this.userMark = userMark;
    }

    public int getUserRankId() {
        return userRankId;
    }

    public void setUserRankId(int userRankId) {
        this.userRankId = userRankId;
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getUserRegisterIp() {
        return userRegisterIp;
    }

    public void setUserRegisterIp(String userRegisterIp) {
        this.userRegisterIp = userRegisterIp;
    }

    public Date getUserLastUpdateTime() {
        return userLastUpdateTime;
    }

    public void setUserLastUpdateTime(Date userLastUpdateTime) {
        this.userLastUpdateTime = userLastUpdateTime;
    }

    public String getUserWeibo() {
        return userWeibo;
    }

    public void setUserWeibo(String userWeibo) {
        this.userWeibo = userWeibo;
    }

    public char getUserBloodType() {
        return userBloodType;
    }

    public void setUserBloodType(char userBloodType) {
        this.userBloodType = userBloodType;
    }

    public String getUserSays() {
        return userSays;
    }

    public void setUserSays(String userSays) {
        this.userSays = userSays;
    }

    public int getUserLock() {
        return userLock;
    }

    public void setUserLock(int userLock) {
        this.userLock = userLock;
    }

    public int getUserFreeze() {
        return userFreeze;
    }

    public void setUserFreeze(int userFreeze) {
        this.userFreeze = userFreeze;
    }

    public int getUserPower() {
        return userPower;
    }

    public void setUserPower(int userPower) {
        this.userPower = userPower;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", groupId=" + groupId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userSalt='" + userSalt + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userQq='" + userQq + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userMark=" + userMark +
                ", userRankId=" + userRankId +
                ", userLastLoginIp='" + userLastLoginIp + '\'' +
                ", userbirthday=" + userbirthday +
                ", userDescription='" + userDescription + '\'' +
                ", userImageUrl='" + userImageUrl + '\'' +
                ", userSchool='" + userSchool + '\'' +
                ", userRegisterTime=" + userRegisterTime +
                ", userRegisterIp='" + userRegisterIp + '\'' +
                ", userLastUpdateTime=" + userLastUpdateTime +
                ", userWeibo='" + userWeibo + '\'' +
                ", userBloodType=" + userBloodType +
                ", userSays='" + userSays + '\'' +
                ", userLock=" + userLock +
                ", userFreeze=" + userFreeze +
                ", userPower=" + userPower +
                '}';
    }
}
