package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
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
      out.write("\tfunction doAdd(){\r\n");
      out.write("\t\t//alert(\"增加...\");\r\n");
      out.write("\t\t$('#addStaffWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doView(){\r\n");
      out.write("\t\talert(\"查看...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doDelete(){\r\n");
      out.write("\t\t//获取数据表格中所有选中的行，返回数组对象\r\n");
      out.write("\t\tvar rows = $(\"#grid\").datagrid(\"getSelections\");\r\n");
      out.write("\t\tif(rows.length == 0){\r\n");
      out.write("\t\t\t//没有选中记录，弹出提示\r\n");
      out.write("\t\t\t$.messager.alert(\"提示信息\",\"请选择需要删除的取派员！\",\"warning\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t//选中了取派员,弹出确认框\r\n");
      out.write("\t\t\t$.messager.confirm(\"删除确认\",\"你确定要删除选中的取派员吗？\",function(r){\r\n");
      out.write("\t\t\t\tif(r){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar array = new Array();\r\n");
      out.write("\t\t\t\t\t//确定,发送请求\r\n");
      out.write("\t\t\t\t\t//获取所有选中的取派员的id\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<rows.length;i++){\r\n");
      out.write("\t\t\t\t\t\tvar staff = rows[i];//json对象\r\n");
      out.write("\t\t\t\t\t\tvar id = staff.id;\r\n");
      out.write("\t\t\t\t\t\tarray.push(id);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar ids = array.join(\",\");//1,2,3,4,5\r\n");
      out.write("\t\t\t\t\tlocation.href = \"staffAction_deleteBatch.action?ids=\"+ids;\r\n");
      out.write("\t\t\t\t\t/**\r\n");
      out.write("\t\t\t\t\t$.post(\"staffAction_deleteBatch.action\",{\"ids\":ids},function(data){\r\n");
      out.write("\t\t\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t**/\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doRestore(){\r\n");
      out.write("\t\talert(\"将取派员还原...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t//工具栏\r\n");
      out.write("\tvar toolbar = [ {\r\n");
      out.write("\t\tid : 'button-view',\t\r\n");
      out.write("\t\ttext : '查询',\r\n");
      out.write("\t\ticonCls : 'icon-search',\r\n");
      out.write("\t\thandler : doView\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-add',\r\n");
      out.write("\t\ttext : '增加',\r\n");
      out.write("\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\thandler : doAdd\r\n");
      out.write("\t}, \r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t{\r\n");
      out.write("\t\tid : 'button-save',\r\n");
      out.write("\t\ttext : '还原',\r\n");
      out.write("\t\ticonCls : 'icon-save',\r\n");
      out.write("\t\thandler : doRestore\r\n");
      out.write("\t}];\r\n");
      out.write("\t// 定义列\r\n");
      out.write("\tvar columns = [ [ {\r\n");
      out.write("\t\tfield : 'id',\r\n");
      out.write("\t\tcheckbox : true,\r\n");
      out.write("\t},{\r\n");
      out.write("\t\tfield : 'name',\r\n");
      out.write("\t\ttitle : '姓名',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'telephone',\r\n");
      out.write("\t\ttitle : '手机号',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'haspda',\r\n");
      out.write("\t\ttitle : '是否有PDA',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row, index){\r\n");
      out.write("\t\t\tif(data==\"1\"){\r\n");
      out.write("\t\t\t\treturn \"有\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn \"无\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'deltag',\r\n");
      out.write("\t\ttitle : '是否删除',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row, index){\r\n");
      out.write("\t\t\tif(data==\"0\"){\r\n");
      out.write("\t\t\t\treturn \"正常使用\"\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn \"已删除\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'standard',\r\n");
      out.write("\t\ttitle : '取派标准',\r\n");
      out.write("\t\twidth : 120,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'station',\r\n");
      out.write("\t\ttitle : '所谓单位',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 取派员信息表格\r\n");
      out.write("\t\t$('#grid').datagrid( {\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : false,\r\n");
      out.write("\t\t\tpageList: [10],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\turl : \"staffAction_pageQuery.action\",\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\t//为数据表格绑定双击事件\r\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 添加取派员窗口\r\n");
      out.write("\t\t$('#addStaffWindow').window({\r\n");
      out.write("\t        title: '添加取派员',\r\n");
      out.write("\t        width: 400,\r\n");
      out.write("\t        modal: true,//遮罩效果\r\n");
      out.write("\t        shadow: true,//阴影效果\r\n");
      out.write("\t        closed: true,//关闭\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 修改取派员窗口\r\n");
      out.write("\t\t$('#editStaffWindow').window({\r\n");
      out.write("\t        title: '修改取派员',\r\n");
      out.write("\t        width: 400,\r\n");
      out.write("\t        modal: true,//遮罩效果\r\n");
      out.write("\t        shadow: true,//阴影效果\r\n");
      out.write("\t        closed: true,//关闭\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//数据表格绑定的双击行事件对应的函数\r\n");
      out.write("\tfunction doDblClickRow(rowIndex, rowData){\r\n");
      out.write("\t\t//打开修改取派员窗口\r\n");
      out.write("\t\t$('#editStaffWindow').window(\"open\");\r\n");
      out.write("\t\t//使用form表单对象的load方法回显数据\r\n");
      out.write("\t\t$(\"#editStaffForm\").form(\"load\",rowData);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("    \t<table id=\"grid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"对收派员进行添加或者修改\" id=\"addStaffWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"addStaffForm\" action=\"staffAction_add.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">收派员信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>手机</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//为保存按钮绑定事件\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#save\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//表单校验，如果通过，提交表单\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar v = $(\"#addStaffForm\").form(\"validate\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(v){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//$(\"#addStaffForm\").form(\"submit\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#addStaffForm\").submit();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar reg = /^1[3|4|5|7|8][0-9]{9}$/;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//扩展手机号校验规则\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.extend($.fn.validatebox.defaults.rules, { \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttelephone: { \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalidator: function(value,param){ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn reg.test(value);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmessage: '手机号输入有误！' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" data-options=\"validType:'telephone'\" \r\n");
      out.write("\t\t\t\t\t\t\tname=\"telephone\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>单位</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"station\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"haspda\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t是否有PDA</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>取派标准</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"standard\" class=\"easyui-validatebox\" required=\"true\"/>  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 修改取派员窗口 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"对收派员进行添加或者修改\" id=\"editStaffWindow\" collapsible=\"false\" \r\n");
      out.write("\t\tminimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"edit\" icon=\"icon-edit\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"editStaffForm\" action=\"staffAction_edit.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"id\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">收派员信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>手机</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//为保存按钮绑定事件\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#edit\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//表单校验，如果通过，提交表单\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar v = $(\"#editStaffForm\").form(\"validate\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(v){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//$(\"#addStaffForm\").form(\"submit\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#editStaffForm\").submit();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar reg = /^1[3|4|5|7|8][0-9]{9}$/;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t//扩展手机号校验规则\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.extend($.fn.validatebox.defaults.rules, { \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttelephone: { \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalidator: function(value,param){ \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn reg.test(value);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmessage: '手机号输入有误！' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}); \r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" data-options=\"validType:'telephone'\" \r\n");
      out.write("\t\t\t\t\t\t\tname=\"telephone\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>单位</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"station\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"haspda\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t是否有PDA</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>取派标准</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"standard\" class=\"easyui-validatebox\" required=\"true\"/>  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t");
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

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/pages/base/staff.jsp(87,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("staff-delete");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t{\r\n");
        out.write("\t\tid : 'button-delete',\r\n");
        out.write("\t\ttext : '删除',\r\n");
        out.write("\t\ticonCls : 'icon-cancel',\r\n");
        out.write("\t\thandler : doDelete\r\n");
        out.write("\t},\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }
}
