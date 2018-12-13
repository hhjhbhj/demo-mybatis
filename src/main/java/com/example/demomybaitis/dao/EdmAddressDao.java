package com.example.demomybaitis.dao;

import com.example.demomybaitis.model.EdmAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EdmAddressDao {
  List<EdmAddress> getList ();
}
