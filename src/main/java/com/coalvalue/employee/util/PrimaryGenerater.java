package com.coalvalue.employee.util;/*
package com.coalvalue.util;

*/
/**
 * Created by Administrator on 2015/10/7.
 *//*


import com.coalvalue.domain.entity.PrimaryBean;
import com.coalvalue.repository.PrimaryBeanRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


public class PrimaryGenerater {


    @Autowired
    private PrimaryBeanRepository primaryBeanRepository;
    */
/**
     * 单例
     *//*

    private static PrimaryGenerater primaryGenerater = null;
    */
/**
     * 数据库访问类
     *//*

 //   private DBHelper dbHelper;
    */
/**
     * 生成流水号的SQL,支持多种格式,如业务BIZ,非业务NOBIZ
     *//*

    private Map<String, String> sqls = new HashMap<String, String>();
    */
/**
     * 对应不用的SQL生产的不同参数类
     *//*

    private Map<String, PrimaryBean> primarBeans = new HashMap<String, PrimaryBean>();

    private PrimaryGenerater() {
        super();
    }

    public PrimaryGenerater(DataSource database, Map<String, String> sqls) {
        super();
   //     this.dbHelper = new DBHelper(database);
        this.sqls = sqls;
        for (String key : sqls.keySet()) {
            this.primarBeans.put(key, this.getPrimaryBeanByDatabase(key));
        }
    }

    public static PrimaryGenerater newInstance(DataSource database,
                                               Map<String, String> sqls) {
        synchronized (PrimaryGenerater.class) {
            primaryGenerater = new PrimaryGenerater(database, sqls);
        }
        return primaryGenerater;
    }

    */
/**
     *
     * 取得PrimaryGenerater的单例实现
     *
     * @return
     *//*

    public static PrimaryGenerater getInstance() {
        if (primaryGenerater == null) {
            synchronized (PrimaryGenerater.class) {
                if (primaryGenerater == null) {
                    primaryGenerater = new PrimaryGenerater();
                }
            }
        }
        return primaryGenerater;
    }

    */
/**
     * 通过 数据库查询键获得封装类
     *
     * @param key
     * @return
     *//*

    public synchronized PrimaryBean getPrimaryBeanByDatabase(String key) {
        if (!this.sqls.containsKey(key))
            return null;
        PrimaryBean primaryBean = this.primarBeans.get(key);
        if (primaryBean != null && !primaryBean.getIsDataBase())
            return primaryBean;
        //primaryBeanRepository.findOne(1);//
        primaryBean = new PrimaryBean("TEST","yyyy-MM-dd","0000000000","20120725");//dbHelper.query(this.sqls.get(key));
        this.primarBeans.put(key, primaryBean);
        return primaryBean;
    }
    */
/**
     * 通过数据库查询键位生成流水号
     *
     * @param key
     * @return
     *//*

    public synchronized String geneterNextNumberByKey(String key) {
        PrimaryBean primaryBean = this.getPrimaryBeanByDatabase(key);
        return this.geneterNextNumber(primaryBean);
    }

    */
/**
     * 通过封装类生成流水号
     *
     * @param primaryBean
     * @return
     *//*


    public synchronized String geneterNextNumber(PrimaryBean primaryBean) {
        String nextNumber = this.geneterNextNumber(isRestart(primaryBean),
                primaryBean.getStartNumber());
        primaryBean.setStartNumber(nextNumber);
        String dataString = this.geneterDataString(primaryBean.getDataString());
        primaryBean.setDateTimeString(dataString);
        if(primaryBean.getIsDataBase()) {
            update(primaryBean);
        }

        String serialNumber = primaryBean.getPrefix() + dataString + nextNumber;
        return serialNumber;
    }

    private synchronized Boolean isRestart(PrimaryBean primaryBean) {
        GregorianCalendar gcNow = new GregorianCalendar();
        GregorianCalendar date = primaryBean.getDateTime();
        if (StringUtils.equalsIgnoreCase(PrimaryBean.YEAR,
                primaryBean.getRepeatCycle())) {
            if (gcNow.get(GregorianCalendar.YEAR) == date
                    .get(GregorianCalendar.YEAR))
                return false;
        }
        if (StringUtils.equalsIgnoreCase(PrimaryBean.MONTH,
                primaryBean.getRepeatCycle())) {
            if (gcNow.get(GregorianCalendar.YEAR) == date
                    .get(GregorianCalendar.YEAR)
                    && gcNow.get(GregorianCalendar.MONTH) == date
                    .get(GregorianCalendar.MONTH))
                return false;
        }
        if (StringUtils.equalsIgnoreCase(PrimaryBean.DAY,
                primaryBean.getRepeatCycle())) {
            if (org.apache.commons.lang3.time.DateUtils.isSameDay(gcNow, date))
                return false;
        }
        return true;
    }

    */
/**
     * 通过开始数字字符串生成下一个流水号
     *
     * @param startNumber
     * @return
     *//*

    public synchronized String geneterNextNumber(Boolean isRestart,
                                                 String startNumber) {
        Long temp = Long.valueOf(startNumber) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < startNumber.length(); i++)
            sb.append("0");
        DecimalFormat df = new DecimalFormat(sb.toString());
        return isRestart ? sb.toString() : df.format(temp);
    }

    */
/**
     * 通过 格式生成日期格式
     *
     * @param dataformat
     * @return
     *//*

    private synchronized String geneterDataString(String dataformat) {
        SimpleDateFormat formatter = new SimpleDateFormat(dataformat);
        return formatter.format(new Date());
    }

    @Transactional
    private synchronized void update(PrimaryBean primaryBean) {
        primaryBeanRepository.save(primaryBean);

    }

    public static void main(String[] args) throws Exception {

        DataSource dataSource =null;
    Map<String, String> map = new HashMap<String, String>();
    map.put("new",
            "select 'SP-' as prefix,'yyyyMMdd' as dataString,'000000' as startNumber from business union select 'SP-' as prefix,'yyyyMMdd' as dataString,'000000' as startNumber");
    PrimaryGenerater.newInstance(dataSource, map);
    for (int i = 0; i < 100; i++) {
        System.out.println(PrimaryGenerater.getInstance()
                .geneterNextNumberByKey("new"));
    }
}
}*/
