package com.itheima.bos.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.itheima.bos.utils.PinYin4jUtils;

public class Pinyin4JTest {
	@Test
	public void test1(){
		//河北省	石家庄市	桥西区
		String province = "河北省";
		String city = "石家庄市";
		String district = "桥西区";
		//简码---->>HBSJZQX
		
		province = province.substring(0, province.length() - 1);
		city = city.substring(0, city.length() - 1);
		district = district.substring(0, district.length() - 1);
		
		String info = province + city + district;
		
		String[] headByString = PinYin4jUtils.getHeadByString(info);
		String shortcode = StringUtils.join(headByString);
		System.out.println(shortcode);
		
		//城市编码---->>shijiazhuang
		String citycode = PinYin4jUtils.hanziToPinyin(city, "");
		System.out.println(citycode);
	}
}
