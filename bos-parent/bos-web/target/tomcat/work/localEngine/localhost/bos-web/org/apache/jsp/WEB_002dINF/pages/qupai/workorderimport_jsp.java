package org.apache.jsp.WEB_002dINF.pages.qupai;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class workorderimport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>工作单批量导入</title>\r\n");
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
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ocupload/jquery.ocupload-1.1.2.js\"></script>\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#grid\").datagrid({\r\n");
      out.write("\t\t\turl : '',\r\n");
      out.write("\t\t\ttoolbar : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tid : 'btn-download',\r\n");
      out.write("\t\t\t\t\ttext : '模板下载',\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-save',\r\n");
      out.write("\t\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/download.action?filename=工作单导入模板.xls\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tid : 'btn-upload',\r\n");
      out.write("\t\t\t\t\ttext : '批量导入',\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-redo'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tid : 'btn-refresh',\r\n");
      out.write("\t\t\t\t\ttext : '刷新',\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-reload',\r\n");
      out.write("\t\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t\t$(\"#grid\").datagrid('reload');\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}        \r\n");
      out.write("\t\t\t],\r\n");
      out.write("\t\t\tcolumns : [[\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'product',\r\n");
      out.write("\t\t\t\t\ttitle : '产品',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'prodtimelimit',\r\n");
      out.write("\t\t\t\t\ttitle : '产品时限',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'prodtype',\r\n");
      out.write("\t\t\t\t\ttitle : '产品类型',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'sendername',\r\n");
      out.write("\t\t\t\t\ttitle : '发件人姓名',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'senderphone',\r\n");
      out.write("\t\t\t\t\ttitle : '发件人电话',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'senderaddr',\r\n");
      out.write("\t\t\t\t\ttitle : '发件人地址',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'receivername',\r\n");
      out.write("\t\t\t\t\ttitle : '收件人姓名',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'receiverphone',\r\n");
      out.write("\t\t\t\t\ttitle : '收件人电话',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'receiveraddr',\r\n");
      out.write("\t\t\t\t\ttitle : '收件人地址',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\tfield : 'actlweit',\r\n");
      out.write("\t\t\t\t\ttitle : '实际重量',\r\n");
      out.write("\t\t\t\t\twidth : 120 ,\r\n");
      out.write("\t\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t]],\r\n");
      out.write("\t\t\tpageList: [10,20,30],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\tsingleSelect: true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tfit : true // 占满容器\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 一键上传\r\n");
      out.write("\t\t$(\"#btn-upload\").upload({\r\n");
      out.write("\t\t\t name: 'upload',  // <input name=\"file\" />\r\n");
      out.write("\t\t     action: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/workOrderManage_batchImport.action',  // 提交请求action路径\r\n");
      out.write("\t\t     enctype: 'multipart/form-data', // 编码格式\r\n");
      out.write("\t\t     autoSubmit: true, // 选中文件提交表单\r\n");
      out.write("\t\t     onComplete: function(response) {\r\n");
      out.write("\t\t        \tif(response==\"success\"){\r\n");
      out.write("\t\t        \t\t$.messager.alert(\"提示信息\",\"数据导入成功！\",\"info\");\r\n");
      out.write("\t\t        \t\t$(\"#grid\").datagrid(\"reload\");\r\n");
      out.write("\t\t        \t}else{\r\n");
      out.write("\t\t        \t\t$.messager.alert(\"错误提示\",response,\"error\");\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t     }// 请求完成时 调用函数\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" >\r\n");
      out.write("\t<div region=\"center\">\r\n");
      out.write("\t\t<table id=\"grid\"></table>\r\n");
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
