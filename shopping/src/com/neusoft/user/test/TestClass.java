package com.neusoft.user.test;


/**
 * Created by xiyem on 2017/3/23.
 */
public class TestClass {

/*

    public static void  main(String[] args){
       *//* Calendar nowtime = new GregorianCalendar();
        String strDateTime="["+String.format("%04d", nowtime.get(Calendar.YEAR))+"/"+
                String.format("%02d", nowtime.get(Calendar.MONTH))+"/" +
                String.format("%02d", nowtime.get(Calendar.DATE))+" " +
                String.format("%02d", nowtime.get(Calendar.HOUR))+":" +
                String.format("%02d", nowtime.get(Calendar.MINUTE))+":" +
                String.format("%02d", nowtime.get(Calendar.SECOND))+"." +
                String.format("%03d", nowtime.get(Calendar.MILLISECOND))+"]";
        System.out.println(strDateTime);

        //method 2
        String msg="";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
        msg+="["+sdf.format(date)+"]";

        System.out.println(msg);*//*


        String date = "2016-05-01 12:30:45"; // 输入的数据 yyyy-mm-dd hh:mm:ss
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//格式化
        Date inDate = null;
        try {
            inDate = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();// 素输入时间
        calendar.setTime(inDate);
        calendar.add(Calendar.MINUTE, 55);//加55分钟

        Date outDate = calendar.getTime();
        System.out.println(sdf.format(outDate));
    }*/

}
