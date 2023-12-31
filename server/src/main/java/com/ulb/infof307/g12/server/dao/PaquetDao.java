package com.ulb.infof307.g12.server.dao;

import com.ulb.infof307.g12.server.model.Paquet;
import com.ulb.infof307.g12.server.model.STATUS;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface PaquetDao {

    void save() throws IOException;
    /**
     * Crée un paquet avec l'id et le nom donné
     * @param paquetString nom du paquet
     */
    STATUS createPaquet(String paquetString);

    /**
     * Renvoie le paquet correspondant à l'id
     * @param id id du paquet
     * @return le paquet correspondant à l'id ou null s'il n'existe pas
     */
    Paquet getPaquet(UUID id);

    /**
     * @return la liste de tous les paquets
     */
    List<Paquet> getAllPaquets();

    STATUS syncPaquets(String paquetsEnString);

    /**
     * Renvoie les paquets de l'utilisateur sous forme de string
     * @param username nom de l'utilisateur
     * @return les paquets de l'utilisateur sous forme de string
     */
    String getUserPaquet(String username);

    /**
     * Supprime le paquet correspondant à l'id
     * @param id id du paquet
     * @return le statut de la suppression du paquet
     */
    STATUS deletePaquet(UUID id);
}
