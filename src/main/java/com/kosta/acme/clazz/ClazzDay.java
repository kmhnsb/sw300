/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Hunseob Kim
 * License Type: Purchased
 */
package com.kosta.acme.clazz;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="ClazzDay")
public class ClazzDay implements Serializable {
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_CLAZZ_CLAZZDAY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_CLAZZ_CLAZZDAY_ID_GENERATOR", strategy="native")	
	private long id;
	
	@ManyToOne(targetEntity=com.kosta.acme.clazz.Venue.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VenueId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKClazzDay78084"))	
	private com.kosta.acme.clazz.Venue venue;
	
	@OneToOne(targetEntity=com.kosta.acme.clazz.Clazz.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ClazzId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKClazzDay561609"))	
	private com.kosta.acme.clazz.Clazz clazz;
	
	@Column(name="Number", nullable=false, length=10)	
	private int number;
	
	@Column(name="`Date`", nullable=true)	
//	@Temporal(TemporalType.DATE)
	private LocalDate date;

	@Column(name="StartTime", nullable=true)	
//	@Temporal(TemporalType.DATE)
	private LocalTime startTime;
	
	@Column(name="EndTime", nullable=true)	
//	@Temporal(TemporalType.DATE)
	private LocalTime endTime;

	@Column(name="InstructorPay", nullable=false, length=10)	
	private int instructorPay;
	
	@ManyToMany(targetEntity=com.kosta.acme.sme.Instructor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Instructor_ClazzDay", joinColumns={ @JoinColumn(name="ClazzDayId") }, inverseJoinColumns={ @JoinColumn(name="InstructorId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set instructors = new java.util.HashSet();

	public ClazzDay() {
		this.date = LocalDate.now();
	}
	public ClazzDay(LocalDate date) {
		this.date = date;
	}

	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setNumber(int value) {
		this.number = value;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setDate(LocalDate value) {
		this.date = value;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public void setInstructorPay(int value) {
		this.instructorPay = value;
	}
	
	public int getInstructorPay() {
		return instructorPay;
	}
	
	public void setClazz(com.kosta.acme.clazz.Clazz value) {
		this.clazz = value;
	}
	
	public com.kosta.acme.clazz.Clazz getClazz() {
		return clazz;
	}
	
	public void setInstructors(java.util.Set value) {
		this.instructors = value;
	}
	
	public java.util.Set getInstructors() {
		return instructors;
	}
	
	
	public void setVenue(com.kosta.acme.clazz.Venue value) {
		this.venue = value;
	}
	
	public com.kosta.acme.clazz.Venue getVenue() {
		return venue;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
