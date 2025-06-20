<%@ page import="br.com.jeb.ContatoServlet, br.com.jeb.Contato" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Lista de Contatos</h2>
<a href="formulario.jsp">Novo contato</a>
<table border="1">
    <tr>
        <th>ID</th><th>Nome</th><th>Email</th><th>Telefone</th><th>Ação</th>
    </tr>
    <%
        for (Contato c : ContatoServlet.getContatos()) {
    %>
        <tr>
            <td><%= c.getId() %></td>
            <td><%= c.getNome() %></td>
            <td><%= c.getEmail() %></td>
            <td><%= c.getTelefone() %></td>
            <td><a href="excluir?id=<%= c.getId() %>">Excluir</a></td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
