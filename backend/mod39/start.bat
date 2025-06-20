@echo off
echo ===== Iniciando a Aplicacao =====

SET TOMCAT_PATH=bin\apache-tomcat-9.0.106
SET CATALINA_HOME=%CD%\%TOMCAT_PATH%

echo 1. Verificando Java...
java -version
echo.

echo 2. Configurando permissoes...
icacls "%TOMCAT_PATH%\bin\*.bat" /grant Everyone:F

echo 3. Copiando o WAR para o Tomcat...
if not exist "%TOMCAT_PATH%\webapps" mkdir "%TOMCAT_PATH%\webapps"
copy /Y "target\modulo39.war" "%TOMCAT_PATH%\webapps\"

echo 4. Limpando trabalhos anteriores...
IF EXIST "%TOMCAT_PATH%\webapps\modulo39" rmdir /S /Q "%TOMCAT_PATH%\webapps\modulo39"

echo 5. Iniciando o Tomcat...
cd "%TOMCAT_PATH%\bin"
set CATALINA_OPTS=-Dfile.encoding=UTF-8
call catalina.bat run

echo 6. Servidor iniciado! Pressione CTRL+C para parar
echo A aplicacao deve estar disponivel em: http://localhost:8080/modulo39
start http://localhost:8080/modulo39
