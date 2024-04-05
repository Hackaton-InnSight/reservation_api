package org.innsight.reservation_api.models;

public class UserAddResponse {
    private Long id;

    public UserAddResponse(UserModel user) {
        this.id = user.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
