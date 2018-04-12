package org.apache.jsp.WEB_002dINF.pages.qupai;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticebill_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>添加业务受理单</title>\r\n");
      out.write("<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 对save按钮条件 点击事件\r\n");
      out.write("\t\t$('#save').click(function(){\r\n");
      out.write("\t\t\t// 对form 进行校验\r\n");
      out.write("\t\t\tif($('#noticebillForm').form('validate')){\r\n");
      out.write("\t\t\t\t$('#noticebillForm').submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\"\r\n");
      out.write("\t\tborder=\"false\">\r\n");
      out.write("\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\tplain=\"true\">新单</a>\r\n");
      out.write("\t\t\t<a id=\"edit\" icon=\"icon-edit\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/page_qupai_noticebill.action\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\tplain=\"true\">工单操作</a>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t<form id=\"noticebillForm\" action=\"noticebillAction_add.action\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"table-edit\" width=\"100%\" align=\"center\">\r\n");
      out.write("\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t<td colspan=\"4\">客户信息</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>来电号码:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"telephone\" required=\"true\" />\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t//页面加载完成后，为手机号输入框绑定离焦事件\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"input[name=telephone]\").blur(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//获取页面输入的手机号\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar telephone = this.value;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//发送ajax请求，请求Action，在Action中远程掉调用crm服务，获取客户信息，用于页面回显\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.post('noticebillAction_findCustomerByTelephone.action',{\"telephone\":telephone},function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(data != null){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//查询到了客户信息，可以进行页面回显\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar customerId = data.id;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar customerName = data.name;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar address = data.address;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=customerId]\").val(customerId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=customerName]\").val(customerName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=delegater]\").val(customerName);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=pickaddress]\").val(address);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//没有查询到客户信息，不能进行页面回显\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=customerId]\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=customerName]\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=delegater]\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name=pickaddress]\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t</script>\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>客户编号:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\"  name=\"customerId\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>客户姓名:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"customerName\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t\t<td>联系人:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"delegater\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t<td colspan=\"4\">货物信息</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>品名:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"product\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t\t<td>件数:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-numberbox\" name=\"num\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>重量:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-numberbox\" name=\"weight\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t\t<td>体积:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"volume\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>取件地址</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"easyui-validatebox\" name=\"pickaddress\"\r\n");
      out.write("\t\t\t\t\t\trequired=\"true\" size=\"144\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>到达城市:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-validatebox\" name=\"arrivecity\"\r\n");
      out.write("\t\t\t\t\t\t /></td>\r\n");
      out.write("\t\t\t\t\t<td>预约取件时间:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"easyui-datebox\" name=\"pickdate\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"editable:false\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>备注:</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\"><textarea rows=\"5\" cols=\"80\" type=\"text\" class=\"easyui-validatebox\" name=\"remark\"\r\n");
      out.write("\t\t\t\t\t\t ></textarea></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
