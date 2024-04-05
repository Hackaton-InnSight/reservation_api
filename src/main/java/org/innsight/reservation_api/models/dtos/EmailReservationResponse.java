package org.innsight.reservation_api.models.dtos;

public class EmailReservationResponse {
    private Boolean available;

    public EmailReservationResponse(Boolean available) {
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
