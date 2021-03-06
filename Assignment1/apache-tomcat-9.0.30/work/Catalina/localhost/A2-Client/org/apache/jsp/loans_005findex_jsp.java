/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-04-09 18:59:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loans_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Loan Service Client JSP</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        try {
            if (session != null) {
                if(!session.getAttribute("username").equals("jasmine"))
                response.sendRedirect("login.jsp");
            }
        }
        catch(Exception e){
            response.sendRedirect("login.jsp");
        }
     
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h3><a href=\"home.jsp\">Available Services</a></h3>\n");
      out.write("        <h3><a href=\"Logout\">Logout</a></h3>\n");
      out.write("        \n");
      out.write("        <h4>Link to: <a href=\"./librarySystem.jsp\">Library System</a></h4>\n");
      out.write("\n");
      out.write("        <h2>Member Manager</h2>\n");
      out.write("        <h3>Check Member Information</h3>\n");
      out.write("        <form action=\"MemberManagerController\" method=\"GET\">\n");
      out.write("            View All Members: <input type=\"submit\" name=\"members\" value=\"displayAll\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form action=\"MemberManagerController\" method=\"GET\">\n");
      out.write("            View Member with ID:<input type=\"text\" name=\"viewMemberID\">\n");
      out.write("            <input type=\"submit\" name=\"members\" value=\"displayMember\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>Add a Member</h3>\n");
      out.write("        <form action=\"MemberManagerController\" method=\"POST\">\n");
      out.write("            Member Name: <input type=\"text\" name=\"addMemberName\"><br>\n");
      out.write("            Member Contact Info: <input type=\"text\" name=\"addMemberContact\"><br>\n");
      out.write("            <input type=\"submit\" name=\"members\" value=\"addMember\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>Update a Member</h3>\n");
      out.write("        <form action=\"MemberManagerController\" method=\"POST\">\n");
      out.write("            Member ID: <input type=\"text\" name=\"updateMemberID\"><br>\n");
      out.write("            Member Name: <input type=\"text\" name=\"updateMemberName\"><br>\n");
      out.write("            Member Contact Info: <input type=\"text\" name=\"updateMemberContact\"><br>\n");
      out.write("            <input type=\"submit\" name=\"members\" value=\"updateMember\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>Delete a Member</h3>\n");
      out.write("        <form action=\"MemberManagerController\" method=\"GET\">\n");
      out.write("            Delete member with memberID:<input type=\"text\" name=\"deleteMemberID\">\n");
      out.write("            <input type=\"submit\" name=\"members\" value=\"deleteMember\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h2>Loan Manager</h2>\n");
      out.write("        <h3>Borrow Book</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"POST\">\n");
      out.write("            Call Number: <input type=\"text\" name=\"addCallNumber\"/><br>\n");
      out.write("            Member ID: <input type=\"text\" name=\"addBorrowMemberID\"/><br>\n");
      out.write("            Borrow Date: <input type=\"text\" name=\"addBorrowDate\"/><br>\n");
      out.write("            Return Date: <input type=\"text\" name=\"addReturnDate\"/><br>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"borrowBook\"/><br>\n");
      out.write("        </form>\n");
      out.write("        <h3>Edit Book Loan</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"POST\">\n");
      out.write("            Loan ID: <input type=\"text\" name=\"editLoanID\"/><br>\n");
      out.write("            Borrow Date: <input type=\"text\" name=\"editBorrowDate\"/><br>\n");
      out.write("            Return Date: <input type=\"text\" name=\"editReturnDate\"/><br>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"editBookLoan\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>Return Book</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"POST\">\n");
      out.write("            Loan ID: <input type=\"text\" name=\"returnLoanID\"/>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"returnBookLoan\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>Delete Book Loan</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"GET\">\n");
      out.write("            Loan ID: <input type=\"text\" name=\"deleteLoanID\"/>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"deleteBookLoan\"/><br>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h3>List Loan with memberID:</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"GET\">\n");
      out.write("            Member ID: <input type=\"text\" name=\"listLoanID\"/>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"listLoan1\"/><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h3>List Loan with Book Title:</h3>\n");
      out.write("        <form action=\"LoanManagerController\" method=\"GET\">\n");
      out.write("            Book Title: <input type=\"text\" name=\"listLoanBook\"/>\n");
      out.write("            <input type=\"submit\" name=\"loans\" value=\"listLoan2\"/><br>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <p>Check if the WSDLs exists:</p>\n");
      out.write("        <p><a href=\"http://localhost:8080/A2-LoanService/LoanServiceMemberManagerImpl?wsdl\">MemberManager WSDL</a></p>\n");
      out.write("        <p><a href=\"http://localhost:8080/A2-LoanService/LoanServiceLoanManagerImpl1?wsdl\">LoanManager WSDL</a></p>\n");
      out.write("        <p><a href=\"http://localhost:8080/A2-LoanService/LoanServiceLibraryManagerImpl?wsdl\">LibraryManager WSDL</a></p>\n");
      out.write("    </body>  \n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
