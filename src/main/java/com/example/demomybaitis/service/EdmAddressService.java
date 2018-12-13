package com.example.demomybaitis.service;

import com.example.demomybaitis.dao.EdmAddressDao;
import com.example.demomybaitis.model.EdmAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class EdmAddressService {
  @Autowired
  private EdmAddressDao edmAddressDao;
  public List<EdmAddress> getList (){
    return edmAddressDao.getList();
  }
}
