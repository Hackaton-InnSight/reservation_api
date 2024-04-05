package org.innsight.reservation_api.models.dtos;

public class EmailReservationResponse {
    private Boolean isClient;

    public EmailReservationResponse(Boolean isClient) {
        this.isClient = isClient;
    }

    public Boolean getIsClient() {
        return isClient;
    }

    public void setIsClient(Boolean isClient) {
        this.isClient = isClient;
    }
}
