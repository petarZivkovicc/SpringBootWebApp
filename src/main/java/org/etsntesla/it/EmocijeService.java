package org.etsntesla.it;

import org.etsntesla.it.repositories.EmocijeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmocijeService {

    @Autowired
    EmocijeRepository emocijeRepository;
}
