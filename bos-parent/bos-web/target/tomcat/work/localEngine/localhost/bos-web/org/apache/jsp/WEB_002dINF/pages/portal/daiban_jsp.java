package org.apache.jsp.WEB_002dINF.pages.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class daiban_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div style=\"padding:10px;\">\r\n");
      out.write("\t<table class=\"easyui-datagrid\" style=\"height:auto\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'priority'\">优先级</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'state'\">状态</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'subject'\">主题</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'type'\">单据类型</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'sender'\">发送人</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'senddate'\">发送日期</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>重要</td>\r\n");
      out.write("\t\t\t\t<td>未查看</td>\r\n");
      out.write("\t\t\t\t<td>工作单录入</td>\r\n");
      out.write("\t\t\t\t<td>456976554工作单信息不全</td>\r\n");
      out.write("\t\t\t\t<td>黄海泉</td>\r\n");
      out.write("\t\t\t\t<td>2013-01-04 15:32:23</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>重要</td>\r\n");
      out.write("\t\t\t\t<td>未查看</td>\r\n");
      out.write("\t\t\t\t<td>工作单录入</td>\r\n");
      out.write("\t\t\t\t<td>456976554工作单信息不全</td>\r\n");
      out.write("\t\t\t\t<td>黄海泉</td>\r\n");
      out.write("\t\t\t\t<td>2013-01-04 15:32:23</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>");
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
