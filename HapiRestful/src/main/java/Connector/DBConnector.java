package Connector;

import java.util.List;

import Interfaces.Connector;
import Utils.Identifier;
import Utils.MessageObject;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.primitive.IdDt;

public class DBConnector implements Connector {

	public Patient addPatient(MessageObject patient) {
		// TODO Auto-generated method stub
		return null;
	}


	public Patient searchPatient(MessageObject patient) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getConnection() {
		// TODO Auto-generated method stub
		
	}

	public void setConnection(String url) {
		// TODO Auto-generated method stub
		
	}

	public Patient updatePatient(Identifier id, MessageObject patient) {
		// TODO Auto-generated method stub
		return null;
	}

}
