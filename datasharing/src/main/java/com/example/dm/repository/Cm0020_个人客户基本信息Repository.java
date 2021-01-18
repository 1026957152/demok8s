package com.example.dm.repository;


import com.example.dm.domain.Cm0020_个人客户基本信息;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Cm0020_个人客户基本信息Repository extends JpaRepository<Cm0020_个人客户基本信息, Integer> {




    Cm0020_个人客户基本信息 findByCustid个人客户号(String custid个人客户号);

}
