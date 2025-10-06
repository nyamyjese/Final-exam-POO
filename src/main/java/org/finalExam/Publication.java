package org.finalExam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Publication extends Message{
    private Message message;

    public Publication(String id, String prenom, String nom, String mail) {
        super(id, prenom, nom, mail);
    }
    public void afficher (String id , String prenom , String nom , String mail){

    }
}
