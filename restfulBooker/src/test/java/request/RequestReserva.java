package request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

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
    private Map bookingdates;

    @Getter
    @Setter
    private String additionalneeds;
}
