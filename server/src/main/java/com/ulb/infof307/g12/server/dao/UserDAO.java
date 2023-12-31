package com.ulb.infof307.g12.server.dao;

import com.ulb.infof307.g12.server.model.STATUS;
import com.ulb.infof307.g12.server.model.User;

import java.io.IOException;
import java.util.List;

public interface UserDAO {

    /**
     * Crée un compte utilisateur sur le serveur
     * @param username pseudo
     * @param password mot de passe
     */
    void createUser(String username, String password);

    /**
     * Crée un utilisateur sur le serveur
     *
     * @param user l'utilisateur
     * @return le status de la création
     */
    STATUS createUser(User user);

    /**
     * Récupère le mot de passe d'un utilisateur
     * @param username pseudo de l'utilisateur
     * @return le mot de passe de l'utilisateur
     */
    String getPassword(String username);

    /**
     * Met à jour un utilisateur
     * @param user l'utilisateur
     */
    STATUS updateUser(User user);


    List<User> getAllUsers();

    /**
     * Sauvegarde les utilisateurs dans le fichier
     * @throws IOException si la sauvegarde échoue
     *
     */
    void save() throws IOException;

    /**
     * Supprime un utilisateur
     * @param username nom de l'utilisateur
     * @return le statut de la suppression de l'utilisateur
     */
    STATUS deleteUser(String username);
}
