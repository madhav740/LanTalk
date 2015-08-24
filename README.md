# LanTalk
A client server based audio chat and text chat module

Lantalk offers audio and text chat over LAN and WIFI networks. The underlying model is very simple; client-server based. the server runs on 6035 port and listen to all connection and chat requests. At a time multiple people can talk but only one will be allowed to talk.

ChatServer.java is the server which should be started on one machine.
ChatClient.java is chat client wherein you need to provide teh address of server to which it has to connect and also the ipv4 address of communicating client.

STEPS TO COMPILE:
1. download the project
2. where the pom.xml file is located do a mvn clean install
