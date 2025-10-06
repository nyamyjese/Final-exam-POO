package org.finalExam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Utilisateur {
    private String id;
    private String prenom;
    private String nom;
    private String mail;
}
