package com.king.web.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.king.domain.Category;
import com.king.domain.Product;
import com.king.service.adminServicce;
import com.king.utils.ConmmentUtils;
import com.mysql.jdbc.StringUtils;

public class UpdateProductServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String pid=request.getParameter("productpid");
			String pimage=request.getParameter("upload");
			String king = request.getParameter("king");
			System.out.println("让给我看一下king是否为空"+king);
			System.out.println("让给我看一下iage是否为空"+pimage);
			System.out.println(pid+"---------------------------------------------");
			String flag="0";
		try {
			//1、创建磁盘文件项工厂
			//作用：设置缓存文件的大小  设置临时文件存储的位置
			String path_temp = this.getServletContext().getRealPath("temp");
			//DiskFileItemFactory factory = new DiskFileItemFactory(1024*1024, new File(path_temp));
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1024*1024);
			factory.setRepository(new File(path_temp));
			//2、创建文件上传的核心类
			ServletFileUpload upload = new ServletFileUpload(factory);
			//设置上传文件的名称的编码
			upload.setHeaderEncoding("UTF-8");
			
			//ServletFileUpload的API
			boolean multipartContent = upload.isMultipartContent(request);//判断表单是否是文件上传的表单
			Product product = new Product();
			HashMap<String,Object> hashMap = new HashMap<String,Object>();
			if(multipartContent){
				//是文件上传的表单
				//***解析request获得文件项集合
				List<FileItem> parseRequest = upload.parseRequest(request);
				if(parseRequest!=null){
					for(FileItem item : parseRequest){
						//判断是不是一个普通表单项
						boolean formField = item.isFormField();
						if(formField){
							//username=zhangsan
							String fieldName = item.getFieldName();
							String fieldValue = item.getString("UTF-8");//对普通表单项的内容进行编码
							//在此封装字段Product,先将字段放入map之中
							hashMap.put(fieldName, fieldValue);
							//当表单是enctype="multipart/form-data"时 request.getParameter相关的方法
							//String parameter = request.getParameter("username");
							
						}else{
							//文件上传项
							//文件的名
							String fileName = item.getName();
							System.out.println(fileName+"_=_=_=-+_=_=-=+_=-+");
							//获得上传文件的内容
							InputStream in = item.getInputStream();
							String path_store = this.getServletContext().getRealPath("upload");
							OutputStream out=null;
							if(!"".equals(fileName)){
								out = new FileOutputStream(path_store+"/"+fileName);
							}
							hashMap.put("pimage", "upload/"+fileName);
							IOUtils.copy(in, out);
							in.close();
							//out.close();
							//删除临时文件
							if(out==null){
								flag="1";
								System.out.println("为什么"+flag);
							}
							item.delete();
						}
					}
					//将map中的数据放入product之中
					BeanUtils.populate(product, hashMap);
					//补充未能填充的字段
					//private String pid;
					if(flag=="1"){
						product.setPimage(pimage);
					}
					product.setPid(pid);
					//private Date pdate;
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					product.setPdate(format.format(new Date()));
					//private int pflag;
					product.setPflag(0);
					//private Category category;
					Category category = new Category();
					category.setCid(hashMap.get("cid").toString());
					product.setCategory(category);
				}
			}else{
				//不是文件上传表单
				//使用原始的表单数据的获得方式 request.getParameter();
			}
			
			//传递给service层,存入数据库
			adminServicce servicce = new adminServicce();
			servicce.UpdateProduct(product);
			//最后转发到商品显示页面(这样复合人类的操作习惯)
			request.getRequestDispatcher("/allProductlist").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		 	doGet(request,response);
	}

}
