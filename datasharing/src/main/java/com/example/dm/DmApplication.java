package com.example.dm;


import com.example.dm.domain.Dp0104个人客户基本信息;
import com.example.dm.enumT.E_待_证据类型_证件类型;
//import com.example.dm.repository.CM001_单位基本资料表Repository;
import com.example.dm.repository.Dp0104个人客户基本信息Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class DmApplication {
/*
	@Autowired
	private CM001_单位基本资料表Repository cm001_单位基本资料表Repository;
*/

	@Autowired
	private Dp0104个人客户基本信息Repository dp0104个人客户基本信息Repository;


	public static void main(String[] args) {
		SpringApplication.run(DmApplication.class, args);
	}


 //  @PostConstruct
 //  @Transactional
 /*   public void queryLoanee_() throws Exception {

	   List<CM001_单位基本资料表> cm001_单位基本资料表List = cm001_单位基本资料表Repository.findAll();

	   cm001_单位基本资料表List.stream().forEach(e->{
	   	System.out.println(e);
	   });


	   for(int i = 0; i< 100;i++){
		   CM001_单位基本资料表 cm001_单位基本资料表 = new CM001_单位基本资料表();
	   		String channelId = "测试测试"+ UUID.randomUUID();
		   cm001_单位基本资料表.setChnl(channelId);
		 //  cm001_单位基本资料表 = cm001_单位基本资料表Repository.save(cm001_单位基本资料表);
*//*		   CM001_单位基本资料表 return_CM001 = cm001_单位基本资料表Repository.findByChnl(channelId);
		   if(return_CM001 == null){
		   	throw new Exception(" 出现了错误啊啊啊");
		   }*//*
	   }

	   System.out.println("==============="+ "成功了");


    }
*/
/*
	@PostConstruct
	//  @Transactional
	public void queryLoanee______() throws Exception {

		List<Dp0104个人客户基本信息> dp0104个人客户基本信息s = dp0104个人客户基本信息Repository.findTop100By();

		dp0104个人客户基本信息s.stream().forEach(e->{
			System.out.println(e);
		});


		for(int i = 0; i< 100;i++){
			CM001_单位基本资料表 cm001_单位基本资料表 = new CM001_单位基本资料表();
			String channelId = "测试测试"+ UUID.randomUUID();
			cm001_单位基本资料表.setChnl(channelId);
			//  cm001_单位基本资料表 = cm001_单位基本资料表Repository.save(cm001_单位基本资料表);
*/
/*		   CM001_单位基本资料表 return_CM001 = cm001_单位基本资料表Repository.findByChnl(channelId);
		   if(return_CM001 == null){
		   	throw new Exception(" 出现了错误啊啊啊");
		   }*//*

		}

		System.out.println("==============="+ "成功了");


	}
*/


}
