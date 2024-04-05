# Étape 1: Construire l'application React
FROM node:16 AS build

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier les fichiers package.json et package-lock.json
COPY package*.json ./

# Installer les dépendances
RUN npm install

# Copier le reste du code source de l'application
COPY . .

# Construire l'application
RUN npm run build

# Étape 2: Configurer Nginx pour servir l'application
FROM nginx:stable-alpine

# Copier les fichiers statiques depuis l'étape de build vers le répertoire de serveur de Nginx
COPY --from=build /app/dist /usr/share/nginx/html

# Exposer le port 80 pour l'accès HTTP
EXPOSE 80

# Lancer Nginx en mode foreground
CMD ["nginx", "-g", "daemon off;"]
