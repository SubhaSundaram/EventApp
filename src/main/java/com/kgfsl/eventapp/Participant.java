package com.kgfsl.eventapp;

import javax.persistence.*;

@Entity
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pId;

	@Column
	private String firstname;

	@Column
	private String lastname;

	@Column
	private int phone;

	@Column
	private int duration;


	@Column
	private String email;

	@Column
	private String abstracts;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eventId", updatable = false, insertable = true)
	private Event event;

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getaId() {
		return pId;
	}

	public void setaId(Long agendaId) {
		this.pId = agendaId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration =duration;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone =phone;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbstracts() {
		return abstracts;
	}

	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}

	public void setEvent(Event event) {
		this.event = event;}
	}