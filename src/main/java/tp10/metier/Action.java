/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Copyright 2022 user.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp10.metier;

/**
 *
 * @author perussel
 * this abstract class is the base of any kind of share.
 */
public abstract class Action {

    private String nom;

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }
    /**
    * this methode provide the value of the share for a given day.
    *
     * @param nom
    */
    public Action(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param j
     * @return
     */
    public abstract float valeur(Jour j);

    @Override
    public boolean equals(Object obj) {
        Action actionAComparer;
        
        actionAComparer = (Action)obj;
       return (this.getNom().compareToIgnoreCase(actionAComparer.getNom()) == 0);
    }

    @Override
    public int hashCode() {
        return this.getNom().toUpperCase().hashCode();
    }
    
    @Override
    public String toString() {
        return this.getNom();
    }
}
