# Use official Tomcat base image
FROM tomcat:9.0

# Set the working directory
WORKDIR /usr/local/tomcat/webapps

# Expose Tomcat port (default 8080)
EXPOSE 8080
