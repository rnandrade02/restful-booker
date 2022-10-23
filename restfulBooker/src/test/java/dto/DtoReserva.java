package dto;

import request.RequestReserva;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class DtoReserva {


    public static Map<String, String> datas(String checkin , String checkout){


        Map<String, String > bookingdates = new HashMap<>();
        bookingdates.put("checkin", checkin);
        bookingdates.put("checkout", checkout);

        return bookingdates;
    }


    public static RequestReserva criarReservaDto(String nome, String sobreNome, Double valor , boolean deposito, Map datas,String adicional){


        RequestReserva requestLivro = new RequestReserva();
        requestLivro.setFirstname(nome);
        requestLivro.setLastname(sobreNome);
        requestLivro.setTotalprice(valor);
        requestLivro.setDepositpaid(deposito);
        requestLivro.setBookingdates(datas);
        requestLivro.setAdditionalneeds(adicional);

        return  requestLivro;
    }
}
