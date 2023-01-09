<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.mysql.jdbc.Driver" %>
<%@page import="CONFIG.Conexao" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeiro Projeto</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
        <link href="CSS/style.css" rel="stylesheet"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>        
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    </head>

    <body>
        <div class="container">
            <form method="post" action="index.jsp">
                <div class="wrapper fadeInDown">
                    <div id="formContent">
                        <div class="fadeIn first">
                            <img src="https://cdn-icons-png.flaticon.com/512/181/181534.png" id="icon" alt="User Icon" />
                        </div>
                        <input type="text" id="inputEmail" class="fadeIn second" name="inputEmail" placeholder="Informe seu email..." required>
                        <input type="password" id="inputSenha" class="fadeIn third" name="inputSenha" placeholder="Informe sua senha..." required>
                        <input type="submit" class="fadeIn fourth" value="Log In">
                        <div id="formFooter">
                            <a class="underlineHover" href="#">Não é cadastrado? Cadastre-se</a>
                        </div>
                    </div>
                </div>
            </form>
            <p align="center" class="text-muted fadeInDown">
                <%
                    Statement st = null;
                    ResultSet rs = null;
                    
                    String emailInformado = request.getParameter("inputEmail");
                    String senhaInformada = request.getParameter("inputSenha");
                    
                    String nomeBanco = "";
                    String emailBanco = "";
                    String senhaBanco = "";
                    String nivelBanco = "";
                    
                    int verificador = 0;
                    
                    if(emailInformado == null || senhaInformada == null){
                        out.print("Preencha seus dados");
                    } else {
                        try {
                            st = new Conexao().conectar().createStatement();
                            rs = st.executeQuery("select * from usuarios where usuario = '" + emailInformado + "' and senha = '" + senhaInformada + "'");

                            while(rs.next()){
                                nomeBanco = rs.getString(2);
                                emailBanco = rs.getString(3);
                                senhaBanco = rs.getString(4);
                                nivelBanco = rs.getString(5);

                                rs.last();
                                verificador = rs.getRow();
                            }
                        } catch(Exception e) {
                            out.print(e);
                        }
                        
                        if(verificador > 0){
                            session.setAttribute("nomeUsuario", nomeBanco);
                            session.setAttribute("nivelUsuario", nivelBanco);
                            response.sendRedirect("usuarios.jsp");
                        } else {
                            out.print("Dados Inválidos");
                        }
                    }
                %>
            </p>
        </div>
    </body>
</html>