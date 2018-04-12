package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
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
      out.write("/css/default.css\">\t\r\n");
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
      out.write("\t\t$('#save').click(function(){\r\n");
      out.write("\t\t\t//校验表单 \r\n");
      out.write("\t\t\tvar v = $(\"#userForm\").form(\"validate\");\r\n");
      out.write("\t\t\tif(v){\r\n");
      out.write("\t\t\t\t$('#userForm').submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("       <form id=\"userForm\" method=\"post\" action=\"userAction_add.action\">\r\n");
      out.write("           <table class=\"table-edit\"  width=\"95%\" align=\"center\">\r\n");
      out.write("           \t\t<tr class=\"title\"><td colspan=\"4\">基本信息</td></tr>\r\n");
      out.write("\t           \t<tr><td>用户名:</td><td><input type=\"text\" name=\"username\" id=\"username\" class=\"easyui-validatebox\" required=\"true\" /></td>\r\n");
      out.write("\t\t\t\t\t<td>口令:</td><td><input type=\"password\" name=\"password\" id=\"password\" class=\"easyui-validatebox\" required=\"true\" validType=\"minLength[5]\" /></td></tr>\r\n");
      out.write("\t\t\t\t<tr class=\"title\"><td colspan=\"4\">其他信息</td></tr>\r\n");
      out.write("\t           \t<tr><td>工资:</td><td><input type=\"text\" name=\"salary\" id=\"salary\" class=\"easyui-numberbox\" /></td>\r\n");
      out.write("\t\t\t\t\t<td>生日:</td><td><input type=\"text\" name=\"birthday\" id=\"birthday\" class=\"easyui-datebox\" /></td></tr>\r\n");
      out.write("\t           \t<tr><td>性别:</td><td>\r\n");
      out.write("\t           \t\t<select name=\"gender\" id=\"gender\" class=\"easyui-combobox\" style=\"width: 150px;\">\r\n");
      out.write("\t           \t\t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t           \t\t\t<option value=\"男\">男</option>\r\n");
      out.write("\t           \t\t\t<option value=\"女\">女</option>\r\n");
      out.write("\t           \t\t</select>\r\n");
      out.write("\t           \t</td>\r\n");
      out.write("\t\t\t\t\t<td>单位:</td><td>\r\n");
      out.write("\t\t\t\t\t<select name=\"station\" id=\"station\" class=\"easyui-combobox\" style=\"width: 150px;\">\r\n");
      out.write("\t           \t\t\t<option value=\"\">请选择</option>\r\n");
      out.write("\t           \t\t\t<option value=\"总公司\">总公司</option>\r\n");
      out.write("\t           \t\t\t<option value=\"分公司\">分公司</option>\r\n");
      out.write("\t           \t\t\t<option value=\"厅点\">厅点</option>\r\n");
      out.write("\t           \t\t\t<option value=\"基地运转中心\">基地运转中心</option>\r\n");
      out.write("\t           \t\t\t<option value=\"营业所\">营业所</option>\r\n");
      out.write("\t           \t\t</select>\r\n");
      out.write("\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"telephone\" id=\"telephone\" class=\"easyui-validatebox\" required=\"true\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t           \t<tr><td>备注:</td><td colspan=\"3\"><textarea style=\"width:80%\"></textarea></td></tr>\r\n");
      out.write("\t           \t<tr>\r\n");
      out.write("\t           \t\t<td>选择角色:</td>\r\n");
      out.write("\t           \t\t<td colspan=\"3\" id=\"roleTD\">\r\n");
      out.write("\t           \t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t           \t\t\t\t$(function(){\r\n");
      out.write("\t           \t\t\t\t\t//页面加载完成后，发送ajax请求，获取所有的角色数据\r\n");
      out.write("\t           \t\t\t\t\t$.post('roleAction_listajax.action',function(data){\r\n");
      out.write("\t           \t\t\t\t\t\t//在ajax回调函数中，解析json数据，展示为checkbox\r\n");
      out.write("\t           \t\t\t\t\t\tfor(var i=0;i<data.length;i++){\r\n");
      out.write("\t           \t\t\t\t\t\t\tvar id = data[i].id;\r\n");
      out.write("\t           \t\t\t\t\t\t\tvar name = data[i].name;\r\n");
      out.write("\t           \t\t\t\t\t\t\t$(\"#roleTD\").append('<input id=\"'+id+'\" type=\"checkbox\" name=\"roleIds\" value=\"'+id+'\"><label for=\"'+id+'\">'+name+'</label>');\r\n");
      out.write("\t           \t\t\t\t\t\t}\r\n");
      out.write("\t           \t\t\t\t\t});\r\n");
      out.write("\t           \t\t\t\t});\r\n");
      out.write("\t           \t\t\t</script>\r\n");
      out.write("\t           \t\t</td>\r\n");
      out.write("\t           \t</tr>\r\n");
      out.write("           </table>\r\n");
      out.write("       </form>\r\n");
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
