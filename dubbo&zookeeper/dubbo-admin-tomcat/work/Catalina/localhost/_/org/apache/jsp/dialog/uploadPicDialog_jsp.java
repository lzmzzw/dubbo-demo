/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-06-25 12:43:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.dialog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class uploadPicDialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1372164090593L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1372164091078L));
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"center\" id=\"uploadFile\"><input type=\"file\" id=\"newsImgFile\" name=\"pic\" onchange=\"uploadImage()\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td align=\"center\" id=\"uploadButton\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var api = lhgdialog.focus, W = api.opener;\r\n");
      out.write("var imgSrc;\r\n");
      out.write("var picNum = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.picNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("var serviceUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.serviceUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("function canlen(){\r\n");
      out.write("\t $.dialog.focus.close(); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function xx(){\r\n");
      out.write("\tW.document.getElementById('img'+picNum).src = imgSrc;\r\n");
      out.write("\t$.dialog.focus.close(); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function uploadImage() {\r\n");
      out.write("\tif($(\"#newsImgFile\").val() == \"\"){\r\n");
      out.write("\t\talert(\"请选择图片！！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#uploadFile\").hide();\r\n");
      out.write("\t$(\"#uploadButton\").append(\"<input type='button' value='正在上传中请稍后......' />\")\r\n");
      out.write("   // if(validateImage()) {\r\n");
      out.write("        $.ajaxFileUpload({\r\n");
      out.write("            url:serviceUrl,       //需要链接到服务器地址\r\n");
      out.write("            secureuri:false,\r\n");
      out.write("            fileElementId:'newsImgFile',                            //文件选择框的id属性\r\n");
      out.write("            dataType: 'text',                                   //服务器返回的格式，可以是json\r\n");
      out.write("            success: function (data) {               //相当于java中try语句块的用法\r\n");
      out.write("            \t W.document.getElementById('pic'+picNum).value = data;\r\n");
      out.write("            \t imgSrc = data;\r\n");
      out.write("            \t setTimeout('xx()',3000);\r\n");
      out.write("            \t\r\n");
      out.write("            },\r\n");
      out.write("            error: function (data, status, e) {           //相当于java中catch语句块的用法\r\n");
      out.write("            \talert(\"上传图片失败！\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("   // }\r\n");
      out.write("}\r\n");
      out.write("//校验图片格式及大小 Add Date 2012-6-14 LIUYI\r\n");
      out.write("function validateImage() {\r\n");
      out.write("    var file = $(\"#newsImgFile\");\r\n");
      out.write("    var tmpFileValue = file.value;\r\n");
      out.write("    alert(\"fffffffffff\")\r\n");
      out.write("    //校验图片格式\r\n");
      out.write("    if(/^.*?\\.(gif|png|jpg|jpeg|bmp)$/.test(tmpFileValue.toLowerCase())){\r\n");
      out.write("        return true;\r\n");
      out.write("    } else {\r\n");
      out.write("        alert(\"只能上传jpg、jpeg、png、bmp或gif格式的图片！\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //校验图片大小,这段代码需调整浏览器安全级别(调到底级)和添加可信站点(将服务器站点添加到可信站点中)\r\n");
      out.write("    //var imgSize = 1024 * 100; //最大100K\r\n");
      out.write("    //var img = new Image();\r\n");
      out.write("    if(file.value != \"\"){\r\n");
      out.write("        \r\n");
      out.write("    //    img.onreadystatechange = function(){\r\n");
      out.write("    //        if(img.readyState == \"complete\"){\r\n");
      out.write("    //            if(img.fileSize <=0 || img.fileSize > imgSize){\r\n");
      out.write("    //                alert(\"当前文件大小\" + img.fileSize / 1024 + \"KB, 超出最大限制 \" + imgSize / 1024 + \"KB\");\r\n");
      out.write("    //                return false;\r\n");
      out.write("    //            }else{\r\n");
      out.write("    //                alert(\"OK\");\r\n");
      out.write("    //                return true;\r\n");
      out.write("    //            }\r\n");
      out.write("    //        }\r\n");
      out.write("    //    }\r\n");
      out.write("        \r\n");
      out.write("    //    img.src = file.value;\r\n");
      out.write("        //return true;\r\n");
      out.write("    }else{\r\n");
      out.write("        alert(\"请选择上传的文件!\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
