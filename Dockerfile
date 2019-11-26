# Derived from official mysql image (our base image)
FROM mysql
# Add a database
ENV MYSQL_DATABASE=music
ENV MYSQL_ROOT_PASSWORD=oroot