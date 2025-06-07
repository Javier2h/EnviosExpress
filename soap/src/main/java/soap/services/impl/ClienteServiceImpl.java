package soap.services.impl;

import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soap.model.Cliente;
import soap.repository.ClienteRepository;
import soap.services.ClienteServices;

import java.util.List;
import java.util.Optional;

@Component
@WebService(endpointInterface = "soap.services.ClienteServices", serviceName = "ClienteService")

@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteServices {

    @Autowired
    private ClienteRepository repository;


    @Override
    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        cliente.setId(null);
        return repository.save(cliente);
    }

    @Override
    public boolean eliminarCliente(Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        if (cliente.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
