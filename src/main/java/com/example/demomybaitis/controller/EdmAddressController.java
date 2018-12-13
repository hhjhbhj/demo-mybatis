package com.example.demomybaitis.controller;

import com.example.demomybaitis.model.EdmAddress;
import com.example.demomybaitis.service.EdmAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EdmAddressController {

  @Autowired
  private EdmAddressService edmAddressService;
  @RequestMapping("/getList")
  public List<EdmAddress> getList(){
    return edmAddressService.getList();
  }
}
