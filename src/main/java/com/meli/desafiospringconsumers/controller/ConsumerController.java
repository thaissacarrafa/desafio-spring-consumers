package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

    @Autowired
    private IProduct service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Product product) {
        service.save(product);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
