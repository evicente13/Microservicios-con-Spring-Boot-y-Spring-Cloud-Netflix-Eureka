package com.formacionbdi.springboot.app.productos.controllers;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id){
        return productoService.findById(id);
    }
}
