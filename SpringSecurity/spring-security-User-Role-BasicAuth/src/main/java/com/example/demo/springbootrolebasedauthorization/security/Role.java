package com.example.demo.springbootrolebasedauthorization.security;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "roles2")

public class Role implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(length = 60)
	    private String name;

		public Role(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Role() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    

}
