package com.limo.demo.feign.service;

import com.limo.demo.feign.model.Address;

/**
 * @Author limo
 * @Date 2024/7/5 13:50
 * @Description:
 */
public interface AddressService {

    Address getAddressById(int id);

}
