package com.ulb.infof307.g12.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class CardQcm extends Card {

    /**
     * Constructeur de la carte QCM
     */
    @Getter
    @JsonProperty("question")
    private final String question;

    @Getter
    @JsonProperty("answer")
    private String answer = this.getVerso();

    @Getter
    @JsonProperty("propositions")
    private final String[] propositions;

    /** Constructeur pour la désérialisation avec jackson
     * @param id id de la carte qcm
     * @param recto recto
     * @param verso verso
     * @param propositions propositions
     */
    @JsonCreator
    public CardQcm(@JsonProperty("id") int id, @JsonProperty("recto") String recto, @JsonProperty("verso") String verso, @JsonProperty("propositions") String[] propositions) {
        super(id, recto, verso,"QCM");
        validate(verso);
        editRecto(recto);
        this.verso = verso;
        this.propositions = propositions;
        this.question = recto;
        this.answer = verso;
    }
}
