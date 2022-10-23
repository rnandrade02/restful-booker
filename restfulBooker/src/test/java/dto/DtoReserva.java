package dto;

import request.RequestReserva;

public class DtoReserva {

    public static RequestReserva criarReserva(){
        RequestReserva requestLivro = new RequestReserva();

        requestLivro.setFirstname("Rodrigo");
        requestLivro.setLastname("Andrade");
        return  requestLivro;
    }
}
