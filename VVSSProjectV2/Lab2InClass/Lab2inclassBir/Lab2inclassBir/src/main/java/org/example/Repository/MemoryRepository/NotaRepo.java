package org.example.Repository.MemoryRepository;

import  org.example.Domain.Nota;
import  org.example.Validator.IValidator;

public class NotaRepo extends AbstractCrudRepo<Integer,Nota > {
    public NotaRepo(IValidator<Nota> v){ super(v);
    }
}