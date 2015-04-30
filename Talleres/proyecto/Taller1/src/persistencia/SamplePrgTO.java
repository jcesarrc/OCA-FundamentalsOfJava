/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.io.Serializable;

/**
 *
 * <p>E-Mail: denovatoaprofesionaljava@gmail.com</p>
 * @author Javier Capera
 * @version 1.0
 * 
 */
public class SamplePrgTO implements Serializable{
    private int id;
    private String document;
    private String lastName;
    private String firsName;
    private String phone;
    
    public SamplePrgTO(){
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getDocument() {
	return document;
    }

    public void setDocument(String document) {
	this.document = document;
    }
    
    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirsName() {
	return firsName;
    }

    public void setFirsName(String firsName) {
	this.firsName = firsName;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
}
