<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.mysql.jdbc.Driver" %>
<%@page import="CONFIG.Conexao" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Usuários</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
        <link href="CSS/usuarios.css" rel="stylesheet"/>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    </head>

    <body>
        <%
            Statement st = null;
            ResultSet rs = null;
        %>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="usuarios.jsp">Lista de Usuários</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <small>
                            <p class="text-muted">
                                <%
                                    String nomeUsuario = (String) session.getAttribute("nomeUsuario");
                                    String nivelUsuario = (String) session.getAttribute("nivelUsuario");
                                    
                                    if(nomeUsuario == null){
                                        response.sendRedirect("index.jsp");
                                    } else {
                                        out.print(nivelUsuario.toUpperCase() + " - " + nomeUsuario);
                                %>
                            </p>
                        </small>
                        &nbsp;&nbsp;
                        <a href="logout.jsp"><i class="fa-solid fa-arrow-right-from-bracket ml-10"></i></a>
                    </form>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="containerForm">
                <a href="usuarios.jsp?funcao=novo"><button class="btn btn-primary" type="button">Novo Usuário</button></a>

                <!-- Modal Criar -->
                <div class="modal fade" id="modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <%
                                    String titulo = "";
                                    String descricaoBotao = "";
                                    String btn = ""; 
                                    
                                    String idBanco = "";
                                    String nomeBanco = "";
                                    String emailBanco = "";
                                    String senhaBanco = "";
                                    String nivelBanco = "";
                                    if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("edit")){
                                        titulo = "Editar Usuário";
                                        descricaoBotao = "Editar";
                                        btn = "btn-editar";
                                        idBanco = request.getParameter("id");
                                        
                                        try {
                                            st = new Conexao().conectar().createStatement();
                                            rs = st.executeQuery("select * from usuarios where id = '" + idBanco + "'");

                                            while(rs.next()){
                                                nomeBanco = rs.getString(2);
                                                emailBanco = rs.getString(3);
                                                senhaBanco = rs.getString(4);
                                                nivelBanco = rs.getString(5);
                                            }
                                        } catch(Exception e) {
                                            out.print(e);
                                        }
                                    } else {
                                        titulo = "Adicionar Usuário";
                                        descricaoBotao = "Adicionar";
                                        btn = "btn-cadastro";
                                    }
                                %>
                                <h5 class="modal-title" id="exampleModalLabel"><%=titulo%></h5>
                                <a href="usuarios.jsp?funcao=close"><button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button></a>
                            </div>
                            <form id="cadastro-form" method="post" action="usuarios.jsp">
                                <div class="modal-body">
                                    <div class="mb-3">
                                        <label for="exampleFormControlInput1" class="form-label">Nome</label>
                                        <input value="<%=nomeBanco%>" type="text" class="form-control" name="nomeCriarInput" id="exampleFormControlInput1" placeholder="Informe o nome..." required>
                                    </div>
                                    
                                    <input value="<%=emailBanco%>" type="hidden" name="emailAntigo">
                                    <input value="<%=idBanco%>" type="hidden" name="idRecuperadoPeloBanco">
                                    
                                    <div class="mb-3">
                                        <label for="exampleFormControlInput2" class="form-label">Email</label>
                                        <input value="<%=emailBanco%>" type="email" class="form-control" name="emailCriarInput" id="exampleFormControlInput2" placeholder="Informe o email..." required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleFormControlInput3" class="form-label">Senha</label>
                                        <input value="<%=senhaBanco%>" type="password" class="form-control" name="senhaCriarInput" id="exampleFormControlInput3" placeholder="Informe a senha..." required>
                                    </div>
                                    <label for="exampleFormControlInput4" class="form-label">Nível</label>
                                    <select class="form-select" aria-label="Default select example" name="nivelCriarInput" id="exampleFormControlInput4" required>
                                        <%
                                            if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("edit")){
                                        %>
                                        <option value=<%=nivelBanco%> selected><%=nivelBanco%></option>
                                        <%
                                            } else {
                                                out.print("<option value='Comum' selected>Comum</option>");
                                                if(nivelUsuario.equalsIgnoreCase("comum")){
                                                    out.print("<option value='Admin' disabled>Admin</option>");
                                                } else {
                                                    out.print("<option value='Admin'>Admin</option>");
                                                }
                                            }
                                        %>
                                    </select>
                                </div>
                                <div class="modal-footer">
                                    <a href="usuarios.jsp?funcao=close"><button type="button" class="btn btn-danger" data-bs-dismiss="modal">Fechar</button></a>
                                    <button type="submit" name=<%=btn%> class="btn btn-primary"><%=descricaoBotao%></button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <form class="d-flex containerPesquisaForm" method="post" action="usuarios.jsp">
                    <input class="form-control me-2" type="text" name="txtbuscar" placeholder="Buscar usuário...">
                    <button class="btn btn-outline-success" name="btn-buscar" type="submit">Buscar</button>
                </form>
            </div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Nome</th>
                        <th scope="col">Email</th>
                        <th scope="col">Senha</th>
                        <th scope="col">Nível</th>
                        <th scope="col">Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        try {
                            st = new Conexao().conectar().createStatement();
                            
                            if(request.getParameter("btn-buscar") != null){
                                String nome = '%' + request.getParameter("txtbuscar") + '%';
                                rs = st.executeQuery("select * from usuarios where nome like '" + nome + "' order by nome asc");
                            } else {
                                rs = st.executeQuery("select * from usuarios order by nome asc");
                            }
                            
                            while(rs.next()){
                    %>
                    <tr>
                        <td>
                            <%= rs.getString(2)%>
                        </td>
                        <td>
                            <%= rs.getString(3)%>
                        </td>
                        <td>
                            <%= rs.getString(4)%>
                        </td>
                        <td>
                            <%= rs.getString(5)%>
                        </td>
                        <td>
                            <a href="usuarios.jsp?funcao=edit&id=<%= rs.getString(1)%>" class="text-primary"><i class="fa-regular fa-pen-to-square"></i></a>
                            <a href="usuarios.jsp?funcao=excluir&id=<%= rs.getString(1)%>"  class="text-danger"><i class="fa-solid fa-user-slash"></i></a>
                        </td>
                    </tr>
                    <%
                            }
                        } catch(Exception e) {
                            out.print(e);
                        }
                    %>
                </tbody>
            </table>
        </div>
        <p class="text-muted" align="center">
            <%
                if(request.getParameter("btn-cadastro") != null){
                    String nomeInformado = request.getParameter("nomeCriarInput");
                    String emailInformado = request.getParameter("emailCriarInput");
                    String senhaInformada = request.getParameter("senhaCriarInput");
                    String nivelInformado = request.getParameter("nivelCriarInput");
                    
                    int verificador = 0;
                    
                    try {
                        st = new Conexao().conectar().createStatement();
                        rs = st.executeQuery("select * from usuarios where usuario = '" + emailInformado + "'");
                        while(rs.next()){
                            if(rs.getRow() > 0){
                                out.print("<script>alert('Operação inválida! Não é possivel criar mais de um usuário com o mesmo email.');</script>");
                                return;
                            }
                        }
                        
                        st.executeUpdate("insert into usuarios(nome, usuario, senha, nivel) values ('" + nomeInformado + "','" + emailInformado + "','" + senhaInformada + "','" + nivelInformado + "')");
                        response.sendRedirect("usuarios.jsp");
                    } catch(Exception e) {
                        out.print(e.getMessage());
                    }
                }
            %>
        </p>
        <div class="modal fade" id="modalExemplo" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Nova modal</h5>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

<%
    if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("excluir")){        
        int id = Integer.parseInt(request.getParameter("id"));
        
        try {
            st = new Conexao().conectar().createStatement();
            st.executeUpdate("delete from usuarios where id = " + id);
            response.sendRedirect("usuarios.jsp");
        } catch(Exception e) {
            out.print(e.getMessage());
        }
    }
%>

<%
    if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("edit")){
        out.print("<script>$('#modal').modal('show')</script>");
    }
%>

<%
    if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("novo")){
        out.print("<script>$('#modal').modal('show')</script>");
    }
%>

<%
    if(request.getParameter("funcao") != null && request.getParameter("funcao").equals("close")){
        out.print("<script>$('#modal').modal('hide')</script>");
    }
%>

<%
    if(request.getParameter("btn-editar") != null){
        int idInformado = Integer.parseInt(request.getParameter("idRecuperadoPeloBanco"));
        String nomeInformado = request.getParameter("nomeCriarInput");
        String emailInformado = request.getParameter("emailCriarInput");
        String emailAntigo = request.getParameter("emailAntigo");
        String senhaInformada = request.getParameter("senhaCriarInput");
        String nivelInformado = request.getParameter("nivelCriarInput");
        
        try {
            st = new Conexao().conectar().createStatement();
            if(!emailAntigo.equals(emailInformado)) {
                rs = st.executeQuery("select * from usuarios where usuario = '" + emailInformado + "'");
                while(rs.next()){
                    if(rs.getRow() > 0){
                        out.print("<script>alert('Operação inválida! Usuário já cadastrado.');</script>");
                        return;
                    }
                }
            }
            
            st.executeUpdate("update usuarios set nome = '" + nomeInformado + "', usuario = '" + emailInformado + "', senha = '" + senhaInformada + "', nivel = '" + nivelInformado + "' where id = " + idInformado);
            response.sendRedirect("usuarios.jsp");
        } catch(Exception e) {
            out.print(e.getMessage());
        }
        
    }
    }
%>