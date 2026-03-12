package com.example.demo2.dto.response;

public class StudentResponse {
    private String name;
    private Long id;
    private String register_id;
    
    public StudentResponse(String name, Long id, String register_id) {
        this.name = name;
        this.id = id;
        this.register_id = register_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegister_id() {
        return register_id;
    }

    public void setRegister_id(String register_id) {
        this.register_id = register_id;
    }

    
    
}
