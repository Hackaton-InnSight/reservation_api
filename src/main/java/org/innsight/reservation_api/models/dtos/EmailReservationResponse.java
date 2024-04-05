package org.innsight.reservation_api.models.dtos;

public class EmailReservationResponse {
    private Boolean isClient;

    public EmailReservationResponse(Boolean isClient) {
        this.isClient = isClient;
    }

    public Boolean getAvailable() {
        return isClient;
    }

    public void setAvailable(Boolean isClient) {
        this.isClient = isClient;
    }
}
