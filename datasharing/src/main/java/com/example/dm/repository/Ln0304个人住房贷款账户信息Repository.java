package com.example.dm.repository;


import com.example.dm.domain.Ln0304个人住房贷款账户信息;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Ln0304个人住房贷款账户信息Repository extends JpaRepository<Ln0304个人住房贷款账户信息, Integer> {


    Ln0304个人住房贷款账户信息 findByContractcode合同代码(String contractcode合同代码);
}
