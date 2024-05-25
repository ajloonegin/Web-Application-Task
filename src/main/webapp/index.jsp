<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
</head>
<body>

    <h:form>
        Name : <h:inputText value="#{helloBean.name}" /> <br/>
<%--        <h:commandButton actionListener="" value="#{helloBean.doGreeting()}"/><br/>--%>
        <h:outputText value="#{helloBean.greeting}" />
    </h:form>


<%--    <div class="card">--%>
<%--        <div class="card">--%>
<%--            <h5>Choose Operation:</h5>--%>
<%--            <p:linkButton outcome="insertPersonnel" value="1: Insert personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="10"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="findPersonnel" value="2: Find personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="10"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="insertVacation" value="3: Insert vacation of personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="20"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="findVacation" value="4: Find vacation of personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="30"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="updatePersonnel" value="5: Update personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="40"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="updateVacation" value="6: Update vacation of personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="50"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="deletePersonnel" value="7: Delete Personnel" style="margin-right:20px;" >--%>
<%--                <f:param name="productId" value="60"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="deleteVacation" value="8 :delete vacation of personnel" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="10"/>--%>
<%--            </p:linkButton>--%>

<%--            <p:linkButton outcome="productDetail" value="9: Exit" style="margin-right:20px;">--%>
<%--                <f:param name="productId" value="10"/>--%>
<%--            </p:linkButton>--%>
<%--        </div>--%>
<%--&lt;%&ndash;        <h1><%= "Application" %></h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <p:linkButton outcome="chooseOp" value="Start" style="margin-right:20px;">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <f:param name="productId" value="10"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </p:linkButton>&ndash;%&gt;--%>
<%--    </div>--%>
</body>
</html>