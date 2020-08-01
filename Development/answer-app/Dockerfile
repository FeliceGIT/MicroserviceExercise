# STAGE 1
# node Docker Image
FROM node:11-alpine as builder

# /app wird als Arbeitsverzeichnis ausgewählt
WORKDIR /app

# package json kopieren damit dependencies installiert werden können
COPY package*.json /app/

# installiert dependencies
RUN npm install

# kopiert Angular App in den Docker Container
COPY . .

# buildet die Angular App im Docker Container
RUN npm run build -- --output-path=./dist/out --configuration $configuration

# STAGE 2
# nginx Docker Image
FROM nginx:alpine

# löscht bestehende Dateien z.B. index.html aus dem html Ordner im Docker Container
RUN rm -rf /usr/share/nginx/html/*

# fügt die nginx config Datei dem Docker Container hinzu
ADD nginx-default.conf /etc/nginx/conf.d/default.conf

# kopiert Angular build aus Stage 1 in den nginx Ordner

COPY --from=builder /app/dist/out/ /usr/share/nginx/html