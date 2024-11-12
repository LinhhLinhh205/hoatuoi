
<%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page import="dao.ChuDeDAO"%>
<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<ChuDe> dsChuDe = (ArrayList<ChuDe>) request.getAttribute("dsChuDe");
%>
<div class="card mb-3">
    <h3 class="card-header">Chủ đề sách</h3>  
    <ul class="list-group list-group-flush">
        <%
            if (dsChuDe != null) {
                for (ChuDe chude : dsChuDe) {
        %>
        <li class="list-group-item"> <a href="san-pham?macd=<%=chude.getMaCd()%>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i><%=chude.getTenCd()%> </a> </li>
            <%
                    }
                }
            %>
    </ul>   

</div>
