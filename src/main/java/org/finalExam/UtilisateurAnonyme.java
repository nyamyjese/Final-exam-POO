package org.finalExam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UtilisateurAnonyme extends Utilisateur {
    public UtilisateurAnonyme(String id, String prenom, String nom, String mail) {
        super(id, prenom, nom, mail);
    }
}
