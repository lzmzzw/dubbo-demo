/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-07-01 09:09:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.sysadm.finance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class recordInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>    \r\n");
      out.write("    <title>会员列表</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sysadm/css/base.css\">\r\n");
      out.write("<script language=\"javascript\" src=\"/js/jquery-1.4.4.min.js\" ></script>\r\n");
      out.write("<script src=\"/js/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.4.4.min.js\"></script>\t\r\n");
      out.write("<script language=\"javascript\" src=\"/js/xheditor/xheditor-1.1.14-zh-cn.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("function checkForm(){\t\r\n");
      out.write("\t/*\r\n");
      out.write("\tvar  areaid=$(\"select[name='areaid']\").val();\r\n");
      out.write("\tif(areaid=='-1'){\r\n");
      out.write("\t\talert(\"请选择所在地区\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar name=$.trim($(\"#name\").val());\r\n");
      out.write("\tif(name.length==0){\r\n");
      out.write("\t\talert(\"分站名称不能为空！\");\r\n");
      out.write("\t\treturn  false;\r\n");
      out.write("\t}\r\n");
      out.write("\t*/\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\tcache : false,\t\t\r\n");
      out.write("\t\turl:\"/sysadm/record/saveRecord.do\",\r\n");
      out.write("\t\tdata: $(\"form\").serialize(),\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\tif(data=='success'){\r\n");
      out.write("\t\t\t\t window.location.href='/sysadm/record/recordList.do';\t\t\t\t \r\n");
      out.write("\t\t\t}else if(data=='isNotExist'){\r\n");
      out.write("\t\t\t\talert(\"会员不存在！\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"网络超时\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t//return  true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='/sysadm/images/allbg.gif'>\r\n");
      out.write("\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"/sysadm/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"left\">\r\n");
      out.write("      <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/record/recordInfo.do';\" value='资金增减' />\r\n");
      out.write("  \t <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/record/recordList.do';\" value='资金流水' />    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=\"form\"  id=\"form\" action=\"/sysadm/record/saveRecord.do\"   method=\"post\" enctype=\"multipart/form-data\"   >\r\n");
      out.write("\t\t\r\n");
      out.write("<table   id=\"tablecompany\"  width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\r\n");
      out.write("  <tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("    <td colspan=\"2\" background=\"/sysadm/images/wbg.gif\" class='title'><span>资金增减</span></td>\r\n");
      out.write("     \r\n");
      out.write("  </tr> \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"> <font  color=\"red\" >*</font>   会员名</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\">     \t\r\n");
      out.write("    \t<input   name=\"username\" id=\"username\"  />      \t\r\n");
      out.write("        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font> 类型</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\">   \r\n");
      out.write("    \t\r\n");
      out.write("    \t      \t\r\n");
      out.write("    \t<input type=\"radio\" name=\"cashtype\" id=\"cashtype\"  value=\"1\" checked=\"checked\" /> 收入\r\n");
      out.write("    \t<input type=\"radio\" name=\"cashtype\" id=\"cashtype\"  value=\"0\" />支出\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font> 金额</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\"> \r\n");
      out.write("    \t<input   name=\"amount\" id=\"amount\"  />\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font> 支付方式</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\">     \t\r\n");
      out.write("    \t<select name=\"bank\" id=\"bank\">    \t\r\n");
      out.write("    \t<option value=\"-1\">请选择</option>      \t\r\n");
      out.write("    \t<option value=\"现金\">现金</option>\r\n");
      out.write("    \t<option value=\"网银在线\">网银在线</option>\r\n");
      out.write("    \t<option value=\"贝宝\">贝宝</option>\r\n");
      out.write("    \t<option value=\"支付宝\">支付宝</option>\r\n");
      out.write("    \t<option value=\"财付通\">财付通</option>\r\n");
      out.write("    \t<option value=\"招商银行\">招商银行</option>\r\n");
      out.write("    \t<option value=\"中国工商银行\">中国工商银行</option>\r\n");
      out.write("    \t<option value=\"中国农业银行\">中国农业银行</option>\r\n");
      out.write("    \t<option value=\"中国建设银行\">中国建设银行</option>\r\n");
      out.write("    \t<option value=\"中国交通银行\">中国交通银行</option>\r\n");
      out.write("    \t<option value=\"中国银行\">中国银行</option>\r\n");
      out.write("    \t<option value=\"邮政储蓄\">邮政储蓄</option>\r\n");
      out.write("    \t<option value=\"邮政汇款\">邮政汇款</option>\r\n");
      out.write("    \t<option value=\"其他\">其他</option>\r\n");
      out.write("    \t</select>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font> 事由</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\"> \r\n");
      out.write("    \t<input   name=\"reason\" id=\"reason\"  />\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"> 备注</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\"> \r\n");
      out.write("    \t<input   name=\"note\" id=\"note\"  />\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("    <td width=\"25%\" bgcolor=\"#FFFFFF\"> 注意</td>\r\n");
      out.write("    <td width=\"75%\" bgcolor=\"#FFFFFF\"> \r\n");
      out.write("    \t此表单一经提交，将不可再修改或删除，请务必谨慎操作\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>   \r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" width=\"50px;\"><input type=\"button\" value=\"确定\"   onclick=\"checkForm()\"/></td>\r\n");
      out.write("\t\t<td align=\"center\" width=\"50px;\"><input type=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
