package com.example.dm.repository;


import com.example.dm.domain.Ac0103客户与应用账户关联表;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhao yuan on 01/10/2015.
 */
public interface Ac0103客户与应用账户关联表Repository extends JpaRepository<Ac0103客户与应用账户关联表, Integer> {
    Ac0103客户与应用账户关联表 findByExtaccnum外部账号AndAccounttype账户类型(String unitaccnum单位账号, String text);

    Ac0103客户与应用账户关联表 findByCustid个人客户号AndAccounttype账户类型(String custid个人客户号, String text);


}
