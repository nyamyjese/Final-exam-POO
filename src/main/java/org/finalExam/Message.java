package org.finalExam;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor

public class Message extends Utilisateur {
    public Message(String id, String prenom, String nom, String mail) {
        super(id, prenom, nom, mail);
    }
    private String texte;
    private LocalDateTime dateEtHeureDeCreation;
    private Publication publication;
}