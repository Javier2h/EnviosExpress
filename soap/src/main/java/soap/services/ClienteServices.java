package soap.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import soap.model.Cliente;

import java.util.List;

@WebService(name = "ClienteService")
public interface ClienteServices {

    @WebMethod
    List<Cliente> listarClientes();

    @WebMethod
    @WebResult(name = "Cliente")
    Cliente buscarClientePorId(@WebParam(name = "id") Long id);

    @WebMethod
    Cliente crearCliente(@WebParam(name = "cliente") Cliente cliente);

    @WebMethod
    boolean eliminarCliente(@WebParam(name = "id") Long id);

}
