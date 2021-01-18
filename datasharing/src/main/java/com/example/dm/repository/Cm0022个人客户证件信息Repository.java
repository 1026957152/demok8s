package com.example.dm.repository;


import com.example.dm.domain.Cm0020_个人客户基本信息;
import com.example.dm.domain.Cm0022个人客户证件信息;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import java.util.List;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Cm0022个人客户证件信息Repository extends JpaRepository<Cm0022个人客户证件信息, Integer> {



    List<Cm0022个人客户证件信息> findByCrednum证件号码AndPersoncredtype个人客户证件类型(String certinum, String text);
}
