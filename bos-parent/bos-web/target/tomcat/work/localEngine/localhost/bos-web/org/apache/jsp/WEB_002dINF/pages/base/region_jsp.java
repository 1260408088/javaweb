package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class region_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>区域设置</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.ocupload-1.1.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction doAdd(){\r\n");
      out.write("\t\t$('#addRegionWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doView(){\r\n");
      out.write("\t\talert(\"修改...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doDelete(){\r\n");
      out.write("\t\talert(\"删除...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//工具栏\r\n");
      out.write("\tvar toolbar = [ {\r\n");
      out.write("\t\tid : 'button-edit',\t\r\n");
      out.write("\t\ttext : '修改',\r\n");
      out.write("\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\thandler : doView\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-add',\r\n");
      out.write("\t\ttext : '增加',\r\n");
      out.write("\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\thandler : doAdd\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-delete',\r\n");
      out.write("\t\ttext : '删除',\r\n");
      out.write("\t\ticonCls : 'icon-cancel',\r\n");
      out.write("\t\thandler : doDelete\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-import',\r\n");
      out.write("\t\ttext : '导入',\r\n");
      out.write("\t\ticonCls : 'icon-redo'\r\n");
      out.write("\t}];\r\n");
      out.write("\t// 定义列\r\n");
      out.write("\tvar columns = [ [ {\r\n");
      out.write("\t\tfield : 'id',\r\n");
      out.write("\t\tcheckbox : true,\r\n");
      out.write("\t},{\r\n");
      out.write("\t\tfield : 'province',\r\n");
      out.write("\t\ttitle : '省',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'city',\r\n");
      out.write("\t\ttitle : '市',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'district',\r\n");
      out.write("\t\ttitle : '区',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'postcode',\r\n");
      out.write("\t\ttitle : '邮编',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'shortcode',\r\n");
      out.write("\t\ttitle : '简码',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'citycode',\r\n");
      out.write("\t\ttitle : '城市编码',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 收派标准数据表格\r\n");
      out.write("\t\t$('#grid').datagrid( {\r\n");
      out.write("\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\tpageList: [30,50,100],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\turl : \"regionAction_pageQuery.action\",\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//页面加载完成后，调用OCUpload插件的方法\r\n");
      out.write("\t\t$(\"#button-import\").upload({\r\n");
      out.write("\t\t\taction:'regionAction_importXls.action',\r\n");
      out.write("\t\t\tname:'regionFile'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 添加、修改区域窗口\r\n");
      out.write("\t\t$('#addRegionWindow').window({\r\n");
      out.write("\t        title: '添加修改区域',\r\n");
      out.write("\t        width: 400,\r\n");
      out.write("\t        modal: true,\r\n");
      out.write("\t        shadow: true,\r\n");
      out.write("\t        closed: true,\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction doDblClickRow(){\r\n");
      out.write("\t\talert(\"双击表格数据...\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("    \t<table id=\"grid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"区域添加修改\" id=\"addRegionWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">区域信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>省</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"province\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>市</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"city\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>区</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"district\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>邮编</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"postcode\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>简码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"shortcode\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>城市编码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"citycode\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
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
