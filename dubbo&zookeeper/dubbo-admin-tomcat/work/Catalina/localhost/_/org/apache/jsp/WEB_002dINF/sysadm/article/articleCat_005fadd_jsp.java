/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-08-12 08:22:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.sysadm.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class articleCat_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1376277765500L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1376277774218L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody.release();
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
      out.write("  <head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <title>添加文章类</title>    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/sysadm/css/base.css\">\r\n");
      out.write("\t<script language=\"javascript\" src=\"/js/jquery-1.4.4.min.js\" ></script>\r\n");
      out.write("\t<script language=\"javascript\" >\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\t\t\r\n");
      out.write("\t\t$(\"select[name='parentId']\").find(\"option[value='0']\").text(\"顶级分类\"); \t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction  checkForm(){\t\t\t\r\n");
      out.write("\t\t\t$(\"form\").submit();\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t   async : false,\r\n");
      out.write("\t\t\t\t   cache : false,\t\r\n");
      out.write("\t\t\t\t   type: \"POST\",\r\n");
      out.write("\t\t\t\t   url: \"/sysadm/article/saveArticleCat.do\",\r\n");
      out.write("\t\t\t\t   data: $(\"form\").serialize(),\r\n");
      out.write("\t\t\t\t   success: function(msg){\r\n");
      out.write("\t\t\t\t     if(msg=='yes'){\t\t\r\n");
      out.write("\t\t\t\t    \t alert(\"保存成功\");\t\t\t    \t \r\n");
      out.write("\t\t\t\t   \t\t window.parent.$(\"#mainFrame\").attr(\"src\",\"/sysadm/article/articleCatList.do\");\t\t    \t \r\n");
      out.write("\t\t\t\t     }\t     \r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"/sysadm/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"center\">\r\n");
      out.write("    <input type='button' class=\"coolbg np\"  value='dqshop管理中心-添加文章类' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/article/articleCatList.do';\" value='文章类列表' />    \r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"/sysadm/article/saveArticleCat.do\"  method=\"post\"   id=\"form1\">\r\n");
      out.write("\t\t<table width=\"70%\" align=\"center\" border=\"0\" cellpadding=\"4\"\r\n");
      out.write("\t\t\tcellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td width=\"40%\" align=\"right\">文章分类名称</td>\r\n");
      out.write("\t\t\t\t<td width=\"60%\"  align=\"left\"><input id=\"catName\"\r\n");
      out.write("\t\t\t\t\tname=\"catName\" /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"right\">上级分类</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t<td   align=\"left\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_dq_005fListMenu_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"right\">排序</td>\t\r\n");
      out.write("\t\t\t\t<td   align=\"left\"><input id=\"sortOrder\"\r\n");
      out.write("\t\t\t\t\tname=\"sortOrder\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"right\">是否显示在导航栏</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t<td  align=\"left\">\r\n");
      out.write("\t\t\t\t<input type=\"radio\"  name=\"showInNav\" value=\"1\"  checked=\"checked\"/>是<input type=\"radio\" name=\"showInNav\" value=\"0\"/>否\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"right\">关键字</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t<td   align=\"left\"><input id=\"keywords\"\r\n");
      out.write("\t\t\t\t\tname=\"keywords\" /><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t</td> \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"center\"  colspan=\"2\">关键字为选填项，其目的在于方便外部搜索引擎搜索</td>\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t<td  align=\"right\">描述</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t<td  align=\"left\">\r\n");
      out.write("\t\t\t\t<textarea rows=\"4\" id=\"catDesc\" name=\"catDesc\"></textarea>\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr bgcolor=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"\" value=\"确认\"   onclick=\"checkForm()\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t<input type=\"reset\" id=\"\" value=\"重置\" />\r\n");
      out.write("\t\t\t   </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_dq_005fListMenu_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dq:ListMenu
    com.doqian.web.tag.db.MenuListTag _jspx_th_dq_005fListMenu_005f0 = (com.doqian.web.tag.db.MenuListTag) _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody.get(com.doqian.web.tag.db.MenuListTag.class);
    _jspx_th_dq_005fListMenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_dq_005fListMenu_005f0.setParent(null);
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setName("parentId");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = tablename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setTablename("article_cat");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = fieldid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setFieldid("cat_id");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = fieldfid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setFieldfid("parent_id");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = selectname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setSelectname("cat_name");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = selectproperty type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setSelectproperty("cat_id");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = fieldname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setFieldname("cat_name");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = fidvalue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setFidvalue("cat_id");
    // /WEB-INF/sysadm/article/articleCat_add.jsp(81,4) name = selectid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_dq_005fListMenu_005f0.setSelectid("0");
    int _jspx_eval_dq_005fListMenu_005f0 = _jspx_th_dq_005fListMenu_005f0.doStartTag();
    if (_jspx_th_dq_005fListMenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody.reuse(_jspx_th_dq_005fListMenu_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdq_005fListMenu_0026_005ftablename_005fselectproperty_005fselectname_005fselectid_005fname_005ffieldname_005ffieldid_005ffieldfid_005ffidvalue_005fnobody.reuse(_jspx_th_dq_005fListMenu_005f0);
    return false;
  }
}
