/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2015-06-08 10:04:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.sysadm.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1433752800603L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1433752800901L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>添加管理员</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"/sysadm/css/base.css\">\r\n");
      out.write("<script language=\"javascript\" src=\"/js/jquery-1.4.4.min.js\" ></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"/js/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("function checkForm(){\t\r\n");
      out.write("\tvar userName=$.trim($(\"input[name='userName']\").val());\r\n");
      out.write("\tvar email=$.trim($(\"input[name='email']\").val());\r\n");
      out.write("\tvar password=$.trim($(\"input[name='passwordnew']\").val());\t\r\n");
      out.write("\tvar password2=$.trim($(\"input[name='password2']\").val());\t\r\n");
      out.write("\tvar userRank = $(\"#userRank\").val();\r\n");
      out.write("\tif(userName.length>18||userName.length<3){\r\n");
      out.write("\t\talert(\"用户账号为3~18位，请重新输入！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\t\t\r\n");
      out.write("\t\r\n");
      out.write("\tif(email.length<0){\r\n");
      out.write("\t\talert(\"邮箱不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t var reg = /^([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$/;\r\n");
      out.write("\t\t if(!reg.test(email)){\r\n");
      out.write("\t\t\t alert(\"邮箱格式不正确\");\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t }\r\n");
      out.write("\t}\t\r\n");
      out.write("\tif(password.length>18||password.length<6){\r\n");
      out.write("\t\talert(\"密码长度为6~18位，请重新输入！\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(password.length<0){\r\n");
      out.write("\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif(password2.length<0){\r\n");
      out.write("\t\t\talert(\"确认密码不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif(password!=password2){\r\n");
      out.write("\t\t\t\talert(\"两次输入密码不一致\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(userRank == -1){\r\n");
      out.write("\t\talert(\"请选择等级\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function submitForm(){\r\n");
      out.write("\tif(checkForm()){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t   async : false,\r\n");
      out.write("\t\t\t   cache : false,\r\n");
      out.write("\t\t\t   type: \"POST\",\r\n");
      out.write("\t\t\t   url: \"/sysadm/user/saveUser.do\",\r\n");
      out.write("\t\t\t   data: $(\"form\").serialize(),\r\n");
      out.write("\t\t\t   success: function(msg){\r\n");
      out.write("\t\t\t     if(msg=='success'){\t\t\r\n");
      out.write("\t\t\t    \t alert(\"保存成功\");\r\n");
      out.write("\t\t\t    \twindow.parent.$(\"#mainFrame\").attr(\"src\",\"/sysadm/user/userList.do\");\t\t    \t \r\n");
      out.write("\t\t\t     }else if(msg=='fail'){\t\t    \t \r\n");
      out.write("\t\t\t    \t alert(\"保存失败，请重新输入！\");\t\t    \t \r\n");
      out.write("\t\t\t     }else if(msg == \"exists\"){\r\n");
      out.write("\t\t\t    \t alert(\"用户名已存在，请重新输入！\");\t\t    \r\n");
      out.write("\t\t\t     }     \r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function recommendType(){\r\n");
      out.write("\tvar recommendType = $(\"#recommendSelect option:selected\").val();\r\n");
      out.write("\tif(recommendType == 0){\r\n");
      out.write("\t\t$(\"#recommendSpan\").hide();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#recommendSpan\").show();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function recommendHandle(){\r\n");
      out.write("\tvar recommend = $(\"#recommend\").val();\r\n");
      out.write("\tvar recommendType = $(\"#recommendSelect option:selected\").val();\r\n");
      out.write("\tif(recommend == \"\"){\r\n");
      out.write("\t\talert(\"推荐人必填！\")\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tvar recommend = encodeURI(recommend);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tdataType:\"text\",\r\n");
      out.write("\t\t\turl:\"/setRecommend.dq?recommend=\"+recommend+\"&recommendType=\"+recommendType,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data == \"not\"){\r\n");
      out.write("\t\t\t\t\talert(\"没有此用户！\")\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#parentId\").val(data);\r\n");
      out.write("\t\t\t\t\talert(\"设置成功！\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"/sysadm/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("    <input type='button' class=\"coolbg np\"  value='dqshop管理中心-添加会员' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/user/userList.do';\" value='会员列表' />    \r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"\"   >\r\n");
      out.write("    <input id=\"userId\" name=\"userId\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"hidden\"/>\t\t\t\t\t\r\n");
      out.write("\t\t<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\"\r\n");
      out.write("\t\t\tcellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">会员名称：</td>\r\n");
      out.write("\t\t\t\t<td width=\"75%\" bgcolor=\"#FFFFFF\"><input id=\"userName\"\r\n");
      out.write("\t\t\t\t\tname=\"userName\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">邮件地址:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"email\" name=\"email\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">登录密码:</td>\r\n");
      out.write("\t\t\t\t<td>\t\t\t\t\r\n");
      out.write("\t\t\t\t<input id=\"passwordnew\"   name=\"passwordnew\" type=\"password\"  /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">确认密码</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"password2\" name=\"password2\" type=\"password\"   /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">会员等级:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t  <select  name=\"userRank\" id=\"userRank\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<option value=\"-1\">请选择...</option>\r\n");
      out.write("          \t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           \t\t</select>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">性别:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"radio\"  name=\"userSex\" value=\"2\"  checked=\"checked\"/>保密\r\n");
      out.write("\t\t\t\t<input type=\"radio\"  name=\"userSex\" value=\"1\" />男\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"userSex\" value=\"0\"/>女\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">出生日期:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t  <input type=\"text\" name=\"birthday\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"birthday\" class=\"Wdate\"  onClick=\"WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})\" style=\"cursor: pointer;\" readonly=\"readonly\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">QQ:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"qq\" name=\"qq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.qq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">办公电话:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"officePhone\" name=\"officePhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.officePhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">家庭电话:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"homePhone\" name=\"homePhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.homePhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">手机:</td>\r\n");
      out.write("\t\t\t\t<td><input id=\"mobilePhone\" name=\"mobilePhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.mobilePhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">推荐人:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<select onchange=\"recommendType()\" id=\"recommendSelect\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">请选择...</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">用户名</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">电子邮箱</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">电话号码</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<span id=\"recommendSpan\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"recommend\" title=\"请根据选项输入推荐人\" type=\"text\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"确定\" onclick=\"recommendHandle()\"/>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"parentId\" name=\"parentId\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"\" value=\"确认\"   onclick=\"submitForm()\"/> \r\n");
      out.write("\t\t\t\t</td><td >\r\n");
      out.write("\t\t\t\t<input type=\"reset\" id=\"\" value=\"重置\" />\r\n");
      out.write("\t\t\t   </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/sysadm/user/userInfo.jsp(169,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/sysadm/user/userInfo.jsp(169,13) '${userRankList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userRankList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/sysadm/user/userInfo.jsp(169,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("userRank");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          \t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userRank.rankId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userRank.rankName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("          \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
