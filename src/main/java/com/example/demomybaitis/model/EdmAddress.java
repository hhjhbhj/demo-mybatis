package com.example.demomybaitis.model;

public class EdmAddress {
  private String company_code;
  private String account_id;
  private String account_name;
  public EdmAddress(){

  }
  public EdmAddress(String company_code,String account_id,String account_name){
    this.company_code = company_code;
    this.account_id = account_id;
    this.account_name = account_name;
  }
  public String getCompany_code(){
    return company_code;
  }
  public void setCompany_code(String company_code){
    this.company_code = company_code;
  }
  public String getAccount_id(){
    return account_id;
  }
  public void setAccount_id(String account_id){
    this.account_id = account_id;
  }
  public String getAccount_name(){
    return account_name;
  }
  public void setAccount_name(String account_name){
    this.account_name = account_name;
  }

}
