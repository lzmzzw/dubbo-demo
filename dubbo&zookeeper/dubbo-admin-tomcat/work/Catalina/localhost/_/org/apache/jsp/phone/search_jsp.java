/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-07-09 07:51:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/phone/inc/foot_inc.jsp", Long.valueOf(1373330415890L));
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html><html><head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>商品搜索 </title>\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\">\r\n");
      out.write("<meta content=\"yes\" name=\"apple-mobile-web-app-capable\">\r\n");
      out.write("<meta content=\"black\" name=\"apple-mobile-web-app-status-bar-style\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/phone/css/1379217.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/phone/css/16251628.css\">\r\n");
      out.write("<link><script type=\"text/javascript\" async=\"\" id=\"tb-beacon-aplus\" exparams=\"req_url=http%3a%2f%2flogin%2em%2etaobao%2ecom%2flogin%2ehtm%3fttid%3deguc01%26sid%3d6a94650e8527c1c2%26tpl%5fredirect%5furl%3dhttp%253A%252F%252Fcaipiao%2em%2etaobao%2ecom%252Flottery%252Fwap%252Findex%2ehtm%253Fsid%253D6a94650e8527c1c2%2526ttid%253Deguc01%2526spm%253D41%2e351606%2e292993%2e8%2526sprefer%253Dp23597%26lsid%3dd3610ffa8e657d2d719f&amp;amp;cna=V7pbCmI92yACAQEAAH8kReXV&amp;amp;category=&amp;amp;pre=http%3a%2f%2fcaipiao%2em%2etaobao%2ecom%2f%3fsid%3d6a94650e8527c1c2%26ttid%3deguc01%26spm%3d41%2e351606%2e292993%2e8%26sprefer%3dp23597&amp;amp;userid=&amp;amp;b2c_orid=&amp;amp;b2c_auction=&amp;amp;at_isb=atp_isdpp=&amp;amp;at_ssid=&amp;amp;aplus&amp;amp;at_cart=&amp;amp;at_alitrackid=&amp;amp;at_udid=&amp;amp;sc=&amp;amp;wp=aXBob25l&amp;amp;sell=&amp;amp;TBTrack_Id=du%3d6a94650e8527c1c2\" src=\"/phone/js/8989722.js\"></script></head>\r\n");
      out.write("<body scroll=\"none\">\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t$(\"document\").ready(function(){\r\n");
      out.write("\t\t\t$(\"#fffff\").html(\"hhhh\")\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\tasync : false,\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\turl:\"/phone/category/CategoryList.do\",\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\tvar size = data.length;\r\n");
      out.write("\t\t\t\t\t//迭代\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<size;i++){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar $tradeF = $(\"<option value='\"+data[i].catId+\"'>\"+data[i].catName+\"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#cat\").append($tradeF);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//var tradeId = $(\"#tradeF option:selected\").val();\r\n");
      out.write("\t\t\t\t\t//getTradeTowLevel(tradeId);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("(function (d) {\r\n");
      out.write("var t=d.createElement(\"script\");t.type=\"text/javascript\";t.async=true;t.id=\"tb-beacon-aplus\";\r\n");
      out.write("t.setAttribute(\"exparams\",\"req_url=http%3a%2f%2flogin%2em%2etaobao%2ecom%2flogin%2ehtm%3fttid%3deguc01%26sid%3d6a94650e8527c1c2%26tpl%5fredirect%5furl%3dhttp%253A%252F%252Fcaipiao%2em%2etaobao%2ecom%252Flottery%252Fwap%252Findex%2ehtm%253Fsid%253D6a94650e8527c1c2%2526ttid%253Deguc01%2526spm%253D41%2e351606%2e292993%2e8%2526sprefer%253Dp23597%26lsid%3dd3610ffa8e657d2d719f&amp;cna=V7pbCmI92yACAQEAAH8kReXV&amp;category=&amp;pre=http%3a%2f%2fcaipiao%2em%2etaobao%2ecom%2f%3fsid%3d6a94650e8527c1c2%26ttid%3deguc01%26spm%3d41%2e351606%2e292993%2e8%26sprefer%3dp23597&amp;userid=&amp;b2c_orid=&amp;b2c_auction=&amp;at_isb=atp_isdpp=&amp;at_ssid=&amp;aplus&amp;at_cart=&amp;at_alitrackid=&amp;at_udid=&amp;sc=&amp;wp=aXBob25l&amp;sell=&amp;TBTrack_Id=du%3d6a94650e8527c1c2\");\r\n");
      out.write("if(\"https:\"==d.location.protocol){t.src=\"https://s.tbcdn.cn/s/aplus_wap.js\";}else{t.src=\"http://a.tbcdn.cn/s/aplus_wap.js\";}\r\n");
      out.write("d.getElementsByTagName(\"head\")[0].appendChild(t);\r\n");
      out.write("})(document);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function checkForm(){\r\n");
      out.write("\t\r\n");
      out.write("\tif(checkMobilePhone() &&checkUserName() &&check_password() &&check_conform_password()){\t\t\r\n");
      out.write("\t\tcheckForm2();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function checkForm2(){\t\r\n");
      out.write("\tvar userName=$.trim($(\"input[name='userName']\").val());\r\n");
      out.write("\tvar password=$.trim($(\"#password1\").val());\t\r\n");
      out.write("\tvar mobilePhone=$(\"#mobilePhone\").val();\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t   async : false,\r\n");
      out.write("\t\t   cache : false,\r\n");
      out.write("\t\t   type: \"GET\",\r\n");
      out.write("\t\t   url: \"/phone/user/regist.do?userName=\"+userName+\"&password=\"+password+\"&mobilePhone=\"+mobilePhone,\r\n");
      out.write("\t\t   success: function(msg){\r\n");
      out.write("\t\t     if(msg=='success'){\t\t    \t\r\n");
      out.write("\t\t    \twindow.location.href='/regist_success.jspf';\r\n");
      out.write("\t\t     }else if(msg=='fail'){\t\t  \r\n");
      out.write("\t\t    \t $(\"#ts\").html(\"保存失败，请重新输入！\");\r\n");
      out.write("\t\t     }\t\t     \r\n");
      out.write("\t\t   }\r\n");
      out.write("\t});\t\r\n");
      out.write("}\r\n");
      out.write("function  checkMobilePhone(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar mobilePhone=$(\"#mobilePhone\").val();\r\n");
      out.write("\tif(mobilePhone.length<1){\r\n");
      out.write("\t\t$(\"#ts\").html(\"手机号不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\t\t\r\n");
      out.write("\t\t var reg = /^(1[3|5|8|]\\d{9})$/;\r\n");
      out.write("\t\t if(!reg.test(mobilePhone)){\r\n");
      out.write("\t\t\t $(\"#ts\").html(\"手机号格式不正确\");\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t\tvar flag=false;\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t   async : false,\r\n");
      out.write("\t\t\t\t\t   cache : false,\r\n");
      out.write("\t\t\t\t\t   type: \"GET\",\r\n");
      out.write("\t\t\t\t\t   url: \"/phone/user/checkMobilePhone.do?mobilePhone=\"+mobilePhone,\t\t  \r\n");
      out.write("\t\t\t\t\t   success: function(msg){\r\n");
      out.write("\t\t\t\t\t     if(msg=='success'){\t\r\n");
      out.write("\t\t\t\t\t    \t flag=true;\t\t\t    \t \r\n");
      out.write("\t\t\t\t\t     }else if(msg=='existObj'){\t\t\r\n");
      out.write("\t\t\t\t\t    \t $(\"#ts\").html(\"手机号已注册\");\r\n");
      out.write("\t\t\t\t\t \t\t flag=false;\r\n");
      out.write("\t\t\t\t\t    \t return false;\r\n");
      out.write("\t\t\t\t\t     }else{\t\t\r\n");
      out.write("\t\t\t\t\t    \t $(\"#ts\").html(\"手机号验证异常\");\t\r\n");
      out.write("\t\t\t\t\t    \t flag=false;\r\n");
      out.write("\t\t\t\t\t\t\t  return false;\r\n");
      out.write("\t\t\t\t\t\t }\t\t\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t   }\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\t\t\t\tif(flag){\r\n");
      out.write("\t\t\t\t\t$(\"#ts\").html(\"\");\r\n");
      out.write("\t\t\t\t\t return true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("//\r\n");
      out.write("function  checkUserName(){\r\n");
      out.write("\r\n");
      out.write("\tvar userName=$.trim($(\"input[name='userName']\").val());\r\n");
      out.write("\tif(userName.length<1){\r\n");
      out.write("\t\t$(\"#ts\").html(\"用户名不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else if(userName.length>18||userName.length<6){\r\n");
      out.write("\t\t$(\"#ts\").html(\"用户名为6~18位，请重新输入\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tvar flag=false;\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t   async : false,\r\n");
      out.write("\t\t\t   cache : false,\r\n");
      out.write("\t\t\t   type: \"GET\",\r\n");
      out.write("\t\t\t   url: \"/phone/user/checkUserName.do?userName=\"+userName,\t\t  \r\n");
      out.write("\t\t\t   success: function(msg){\r\n");
      out.write("\t\t\t     if(msg=='success'){\t\t    \t\r\n");
      out.write("\t\t\t    \t flag= true;\t\t    \r\n");
      out.write("\t\t\t     }else if(msg=='existObj'){\t\t\r\n");
      out.write("\t\t\t    \t $(\"#ts\").html(\"用户名已存在\");\r\n");
      out.write("\t\t\t \t\tflag= false;\r\n");
      out.write("\t\t\t \t\t  return false;\r\n");
      out.write("\t\t\t     }else{\t\t\r\n");
      out.write("\t\t\t    \t $(\"#ts\").html(\"用户名验证异常\");\t\r\n");
      out.write("\t\t\t    \t flag= false;\r\n");
      out.write("\t\t\t\t\t  return false;\r\n");
      out.write("\t\t\t\t }\t\t\r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\tif(flag){\r\n");
      out.write("\t\t\t$(\"#ts\").html(\"\");\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function check_password(){\r\n");
      out.write("\tvar password=$.trim($(\"#password1\").val());\t\r\n");
      out.write("\tvar password2=$.trim($(\"#conform_password\").val());\r\n");
      out.write("\t\r\n");
      out.write("\tif(password.length<1){\t\t\r\n");
      out.write("\t\t $(\"#ts\").html(\"密码不能为空\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif(password.length>18||password.length<6){\t\t\t\r\n");
      out.write("\t\t\t $(\"#ts\").html(\"密码长度为6~18位，请重新输入\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#ts\").html(\"\");\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function check_conform_password(){\r\n");
      out.write("\tvar password1=$(\"#password1\").val();\t\r\n");
      out.write("\tvar conform_password=$(\"#conform_password\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tif(conform_password.length<1){\r\n");
      out.write("\t\t $(\"#ts\").html(\"密码不能为空\");\r\n");
      out.write("\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif(conform_password.length>18||conform_password.length<6){\r\n");
      out.write("\t\t\t $(\"#ts\").html(\"确认密码长度为6~18位，请重新输入\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t\tif(password1!=conform_password){\r\n");
      out.write("\t\t\t $(\"#ts\").html(\"两次输入密码不一致\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t\t$(\"#ts\").html(\"\");\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<font color=\"red\" id=\"fffff\"></font>\r\n");
      out.write("<div id=\"tbh5v0\">\r\n");
      out.write("<div class=\"screen-wrap fullscreen login\">\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("<div class=\"c-inav\">\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("<button class=\"back\">\r\n");
      out.write("<span><em></em></span><a href=\"/phone/index.jsp\">首页</a>\r\n");
      out.write("                    </button>\r\n");
      out.write("</section>\r\n");
      out.write("<section>\r\n");
      out.write("<span>商品搜索</span>\r\n");
      out.write("</section>\r\n");
      out.write("<section></section>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("       <form action=\"/search.do\" method=\"get\">\r\n");
      out.write("       <div style=\"margin-left: 20px;margin-top: 20px;margin-right: 20px;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"textfield\" id=\"textfield\" placeholder=\"商品名\" value=\"\" style=\"height: 35px;width: 100%;margin-bottom: 20px;font-size: 18px;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"minPrice\" id=\"minPrice\" placeholder=\"价格\" value=\"\" style=\"height: 35px;width: 48%;margin-bottom: 20px;font-size: 18px;\">~\r\n");
      out.write("\t\t<input type=\"text\" name=\"maxPrice\" id=\"maxPrice\" placeholder=\"价格\" value=\"\" style=\"height: 35px;width: 48%;margin-bottom: 20px;font-size: 18px;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"minTime\" id=\"minTime\" placeholder=\"添加时间\" value=\"\" style=\"height: 35px;width: 48%;margin-bottom: 20px;font-size: 18px;\">~\r\n");
      out.write("\t\t<input type=\"text\" name=\"minTime\" id=\"minTime\" placeholder=\"添加时间\" value=\"\" style=\"height: 35px;width: 48%;margin-bottom: 20px;font-size: 18px;\">\r\n");
      out.write("    \t<select name=\"cat\" id=\"cat\" style=\"height: 35px;font-size: 18px; \">\r\n");
      out.write("\t\t\t<option value=\"0\">选择分类</option>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</select>\r\n");
      out.write("    \t<select name=\"sort\" id=\"sort\" style=\"height: 35px;font-size: 18px; \">\r\n");
      out.write("\t\t\t<option value=\"0\">选择排序</option>\r\n");
      out.write("\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 1 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按价格升序</option>\r\n");
      out.write("\t\t\t<option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 2 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按价格降序</option>\r\n");
      out.write("\t\t\t<option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 3 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按添加时间升序</option>\r\n");
      out.write("\t\t\t<option value=\"4\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 4 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按添加时间降序</option>\r\n");
      out.write("\t\t\t<option value=\"5\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 5 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按销量升序</option>\r\n");
      out.write("\t\t\t<option value=\"6\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 6 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按销量降序</option>\r\n");
      out.write("\t\t\t<option value=\"7\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 7 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按点击率升序</option>\r\n");
      out.write("\t\t\t<option value=\"8\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sort == 8 ? \"selected\" : \"\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">按点击率降序</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div class=\"field submit-btn\">\r\n");
      out.write("                        <input type=\"submit\" class=\"c-btn-oran-big\" value=\"搜索\">\r\n");
      out.write("                    </div>\r\n");
      out.write("    </form>                                                                      \r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("<script src=\"/phone/js/5800517.js\"></script>\r\n");
      out.write("<script src=\"/phone/js/1457736.js\"></script>        \r\n");
      out.write("<script src=\"/phone/js/4824878.js\"></script>\r\n");
      out.write("<script src=\"/phone/js/6867676.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("try{\r\n");
      out.write("if(getSpecificCookie('new_wud') != 'wud67200'){\r\n");
      out.write("document.getElementById('cookie-support-div').style.display = 'block';\r\n");
      out.write("}\r\n");
      out.write("}catch(e){// 有异常时不做任何处理\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        var Login = new Login();\r\n");
      out.write("        Login.loginForm();\r\n");
      out.write("\r\n");
      out.write("    //设置nickValue\r\n");
      out.write("if(window.localStorage && document.getElementById('J_UserNameTxt').value =='')\r\n");
      out.write("{\r\n");
      out.write(" document.getElementById('J_UserNameTxt').value = window.localStorage.getItem('lastNick');\r\n");
      out.write("}\r\n");
      out.write("   \r\n");
      out.write("    /*\r\n");
      out.write("         * 读取特定Cookie的通用函数\r\n");
      out.write("         */\r\n");
      out.write("        function getSpecificCookie(name) {\r\n");
      out.write("              if(document.cookie.length > 0) {\r\n");
      out.write("                    start = document.cookie.indexOf(name + \"=\");\r\n");
      out.write("                    if( start != -1) {\r\n");
      out.write("                          start = start + name.length + 1;\r\n");
      out.write("                          end = document.cookie.indexOf(\";\",start);\r\n");
      out.write("                          if( end == -1) {\r\n");
      out.write("                                end = document.cookie.length;\r\n");
      out.write("                          }\r\n");
      out.write("                    }\r\n");
      out.write("                    return decodeURI(document.cookie.substring(start,end));\r\n");
      out.write("              }\r\n");
      out.write("              return \"\";\r\n");
      out.write("        }\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                 <footer class=\"footer c-footer \">\r\n");
      out.write("            \r\n");
      out.write("               ");
      out.write('\r');
      out.write('\n');
      out.write("<p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tCopyright 2013<br>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.doqian.com/\">广州度阡信息科技有限公司</a>\r\n");
      out.write("\t\t\t</p>");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"/phone/js/7108814.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("window.addEventListener('load', function(){\r\n");
      out.write("//set webp\r\n");
      out.write("MH5.webp.detectAndSetCookie();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<input type=\"hidden\" id=\"J_app_key\" value=\"12574478\">        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body></html>");
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
