/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-29 03:32:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class district_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>区域管理</title>\r\n");
      out.write("    <link href=\"Css/default.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyUI/themes/default/easyui.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"easyUI/themes/icon.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.3.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script language=\"JavaScript\" src=\"js/district.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("实现区域管理\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" value=\"点击事件\" id=\"but1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table id=\"dg\"></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--制作工具栏-->\r\n");
      out.write("<div id=\"ToolBar\">\r\n");
      out.write("    <div style=\"height: 40px;\">\r\n");
      out.write("        <a href=\"javascript:Add()\" class=\"easyui-linkbutton\"\r\n");
      out.write("           iconCls=\"icon-add\" plain=\"true\">添加</a> <a\r\n");
      out.write("            href=\"javascript:updateDialog()\" class=\"easyui-linkbutton\"\r\n");
      out.write("            iconCls=\"icon-edit\" plain=\"true\">修改</a> <a\r\n");
      out.write("            href=\"javascript:DeleteByFruitName()\" class=\"easyui-linkbutton\"\r\n");
      out.write("            iconCls=\"icon-remove\" plain=\"true\">多项删除</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--添加对话框-->\r\n");
      out.write("<div id=\"AddDialog\" class=\"easyui-dialog\" buttons=\"#AddDialogButtons\"\r\n");
      out.write("     style=\"width: 280px; height: 250px; padding: 10px 20px;\" closed=\"true\">\r\n");
      out.write("    <form method=\"post\" action=\"\" name=\"form1\" id=\"form1\">\r\n");
      out.write("        区域名称:<input type=\"text\" name=\"name\" id=\"name2\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<!--添加对话框的按钮-->\r\n");
      out.write("<div id=\"AddDialogButtons\">\r\n");
      out.write("    <a href=\"javascript:SaveDialog()\" class=\"easyui-linkbutton\"\r\n");
      out.write("       iconCls=\"icon-ok\">保存</a> <a href=\"javascript:CloseAddDialog()\"\r\n");
      out.write("                                   class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--修改对话框-->\r\n");
      out.write("<div id=\"updateDialog\" class=\"easyui-dialog\" buttons=\"#updateDialogButtons\"\r\n");
      out.write("     style=\"width: 280px; height: 250px; padding: 10px 20px;\" closed=\"true\">\r\n");
      out.write("    <form method=\"post\" action=\"\" id=\"form2\" name=\"form1\">\r\n");
      out.write("        <input type=\"hidden\" name=\"id\">\r\n");
      out.write("        区域名称:<input type=\"text\" name=\"name\" id=\"name3\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<!--添加修改对话框的按钮-->\r\n");
      out.write("<div id=\"updateDialogButtons\">\r\n");
      out.write("    <a href=\"javascript:SaveDistrict()\" class=\"easyui-linkbutton\"\r\n");
      out.write("       iconCls=\"icon-ok\">更新</a> <a href=\"javascript:CloseUPDATADialog('updateDialog')\"\r\n");
      out.write("                                   class=\"easyui-linkbutton\" iconCls=\"icon-cancel\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--显示街道的窗口-->\r\n");
      out.write("<div id=\"Streetwindows\" class=\"easyui-dialog\" buttons=\"#updateDialogButtons\"\r\n");
      out.write("     style=\"width: 700px; height: 700px; padding: 10px 20px;\" closed=\"true\">\r\n");
      out.write("\r\n");
      out.write("    <table id=\"Streetdg\"></table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
