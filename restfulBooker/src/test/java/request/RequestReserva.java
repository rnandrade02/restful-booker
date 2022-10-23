package request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RequestReserva {
    @Getter
    @Setter
    private String firstname;

    @Getter
    @Setter
    private String lastname;

    @Getter
    @Setter
    private Double totalprice;

    @Getter
    @Setter
    private Boolean depositpaid;

    @Getter
    @Setter
    private String bookingdates;

    @Getter
    @Setter
    private Date checkin;

    @Getter
    @Setter
    private Date checkout;

    @Getter
    @Setter
    private String additionalneeds;
}
