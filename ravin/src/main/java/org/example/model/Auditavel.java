/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

import java.sql.Timestamp;

/**
 *
 * @author frete
 */
public class Auditavel {

    private Timestamp CriedoEm;
    private Timestamp AlteradoEm;
    private Funcionario CriadoPor;
    private Funcionario AlteradoPor;

    public Auditavel() {
    }

    public Auditavel(Timestamp CriedoEm, Timestamp AlteradoEm, Funcionario CriadoPor, Funcionario AlteradoPor) {
        this.CriedoEm = CriedoEm;
        this.AlteradoEm = AlteradoEm;
        this.CriadoPor = CriadoPor;
        this.AlteradoPor = AlteradoPor;
    }

    public Timestamp getCriedoEm() {
        return CriedoEm;
    }

    public void setCriedoEm(Timestamp CriedoEm) {
        this.CriedoEm = CriedoEm;
    }

    public Timestamp getAlteradoEm() {
        return AlteradoEm;
    }

    public void setAlteradoEm(Timestamp AlteradoEm) {
        this.AlteradoEm = AlteradoEm;
    }

    public Funcionario getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(Funcionario CriadoPor) {
        this.CriadoPor = CriadoPor;
    }

    public Funcionario getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(Funcionario AlteradoPor) {
        this.AlteradoPor = AlteradoPor;
    }

    
}
