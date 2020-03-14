package org.example.Repository.MemoryRepository;

import  org.example.Domain.Student;
import  org.example.Validator.IValidator;

public class StudentRepo extends AbstractCrudRepo<String, Student> {
    public StudentRepo(IValidator<Student> v){ super(v);
    }
}