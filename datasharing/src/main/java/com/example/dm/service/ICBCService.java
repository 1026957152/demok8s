package com.example.dm.service;



import com.example.dm.apidata.icbc.Query;
import com.example.dm.apidata.icbc.ReturnResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Created by silence yuan on 2015/7/25.
 */
public interface ICBCService {





    ReturnResult queryLoanee(Query query);
}
