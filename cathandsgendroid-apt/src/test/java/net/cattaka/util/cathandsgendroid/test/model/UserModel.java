
package net.cattaka.util.cathandsgendroid.test.model;

import java.util.Date;
import java.util.List;

import net.cattaka.util.cathandsgendroid.accessor.EnumOrderAccessor;
import net.cattaka.util.cathandsgendroid.annotation.DataModel;
import net.cattaka.util.cathandsgendroid.annotation.DataModelAttrs;

@DataModel(find = {
        "id", "username", "team:role+,id", "team:id-", ":id", "authority:id+"
}, unique = {
    "username"
})
public class UserModel {
    public enum Role {
        PROGRAMMER, DESIGNNER, MANAGER
    }

    public enum Authority {
        USER, ADMIN
    }

    @DataModelAttrs(primaryKey = true)
    private Long id;

    private String username;

    @DataModelAttrs(version = 2)
    private String nickname;

    @DataModelAttrs(version = 2)
    private String team;

    private Role role;

    private Date createdAt;

    private List<String> tags;

    @DataModelAttrs(version = 3, accessor = EnumOrderAccessor.class)
    private Authority authority;

    @DataModelAttrs(ignore = true)
    private Object userData;

    private byte[] blob;

    private Boolean booleanData;

    private Byte byteData;

    private Character charData;

    public UserModel() {
    }

    public UserModel(Long id, String username, String nickname, String team, Role role,
            Date createdAt, List<String> tags, Authority authority) {
        super();
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.team = team;
        this.role = role;
        this.createdAt = createdAt;
        this.tags = tags;
        this.authority = authority;
    }

    public UserModel(Long id, String username, String nickname, String team, Role role,
            Date createdAt, List<String> tags, Authority authority, byte[] blob,
            Boolean booleanData, Byte byteData, Character charData) {
        super();
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.team = team;
        this.role = role;
        this.createdAt = createdAt;
        this.tags = tags;
        this.authority = authority;
        this.blob = blob;
        this.booleanData = booleanData;
        this.byteData = byteData;
        this.charData = charData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object userData) {
        this.userData = userData;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public byte[] getBlob() {
        return blob;
    }

    public void setBlob(byte[] blob) {
        this.blob = blob;
    }

    public Boolean getBooleanData() {
        return booleanData;
    }

    public void setBooleanData(Boolean booleanData) {
        this.booleanData = booleanData;
    }

    public Byte getByteData() {
        return byteData;
    }

    public void setByteData(Byte byteData) {
        this.byteData = byteData;
    }

    public Character getCharData() {
        return charData;
    }

    public void setCharData(Character charData) {
        this.charData = charData;
    }

}
