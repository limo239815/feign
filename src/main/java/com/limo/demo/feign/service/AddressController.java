package com.limo.demo.feign.service;

import com.limo.demo.feign.client.AddressClient;
import com.limo.demo.feign.model.Address;
import com.limo.waste.common.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/5 14:11
 * @Description:
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Resource
    AddressClient addressClient;

    @GetMapping("/getAddressById/{id}")
    public Result<Address> getAddressById(@PathVariable("id") int id){
        return addressClient.getAddressById(id);
    }

}
