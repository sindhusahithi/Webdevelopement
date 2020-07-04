<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeserviceProxyid" scope="session" class="com.Service.EmployeeserviceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeserviceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmployeeserviceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmployeeserviceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.Service.Employeeservice getEmployeeservice10mtemp = sampleEmployeeserviceProxyid.getEmployeeservice();
if(getEmployeeservice10mtemp == null){
%>
<%=getEmployeeservice10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String empId_1id=  request.getParameter("empId18");
        int empId_1idTemp  = Integer.parseInt(empId_1id);
        boolean deleteEmployee15mtemp = sampleEmployeeserviceProxyid.deleteEmployee(empId_1idTemp);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteEmployee15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 20:
        gotMethod = true;
        String empSalary_3id=  request.getParameter("empSalary25");
        int empSalary_3idTemp  = Integer.parseInt(empSalary_3id);
        String empName_4id=  request.getParameter("empName27");
            java.lang.String empName_4idTemp = null;
        if(!empName_4id.equals("")){
         empName_4idTemp  = empName_4id;
        }
        String empId_5id=  request.getParameter("empId29");
        int empId_5idTemp  = Integer.parseInt(empId_5id);
        %>
        <jsp:useBean id="com1model1Employee_2id" scope="session" class="com.model.Employee" />
        <%
        com1model1Employee_2id.setEmpSalary(empSalary_3idTemp);
        com1model1Employee_2id.setEmpName(empName_4idTemp);
        com1model1Employee_2id.setEmpId(empId_5idTemp);
        boolean addEmployee20mtemp = sampleEmployeeserviceProxyid.addEmployee(com1model1Employee_2id);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addEmployee20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 31:
        gotMethod = true;
        String empId_6id=  request.getParameter("empId40");
        int empId_6idTemp  = Integer.parseInt(empId_6id);
        com.model.Employee getEmployee31mtemp = sampleEmployeeserviceProxyid.getEmployee(empId_6idTemp);
if(getEmployee31mtemp == null){
%>
<%=getEmployee31mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empSalary:</TD>
<TD>
<%
if(getEmployee31mtemp != null){
%>
<%=getEmployee31mtemp.getEmpSalary()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empName:</TD>
<TD>
<%
if(getEmployee31mtemp != null){
java.lang.String typeempName36 = getEmployee31mtemp.getEmpName();
        String tempResultempName36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeempName36));
        %>
        <%= tempResultempName36 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empId:</TD>
<TD>
<%
if(getEmployee31mtemp != null){
%>
<%=getEmployee31mtemp.getEmpId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 42:
        gotMethod = true;
        com.model.Employee[] getAllEmployees42mtemp = sampleEmployeeserviceProxyid.getAllEmployees();
if(getAllEmployees42mtemp == null){
%>
<%=getAllEmployees42mtemp %>
<%
}else{
        String tempreturnp43 = null;
        if(getAllEmployees42mtemp != null){
        java.util.List listreturnp43= java.util.Arrays.asList(getAllEmployees42mtemp);
        for(com.model.Employee e:getAllEmployees42mtemp){
        	int EmpId = e.getEmpId();
        	String EmpName = e.getEmpName();
        	String name=e.getEmpName();
        	%>
        	<%=EmpId%>::<%=name %>::<%=EmpName %>
        	<%
        	}
        }
        }      
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>