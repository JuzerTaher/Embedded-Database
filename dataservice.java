package com.noesisinformatica.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataService {

    private Map<Long, String> data = new HashMap<Long, String>();
    private long lastUsedId = 1000;

    public DataService(){

        // save some initial data
        
    }

    String getTermForId(Long id){
        return data.get(id);
    }

    void saveTerm(String term){
       //Assuming the term to be present in database already.
        }
    }

    public void getAllTerm(){
	
	Statement statement = connection.createStatement();
 
	ResultSet results = statement.executeQuery("SELECT * FROM test_table");
 
 
	// For each row of the result set ...
 
	while (results.next()) {
 
 
  		// Get the data from the current row using the column index - column data are in the VARCHAR format
 
  		String data = results.getString(1);
 
  		System.out.println("Fetching data by column index for row " + results.getRow() + " : " + data);
 
 
		}        
    }

    public long getLastUsedId() {
        return lastUsedId;
    }

    public void setLastUsedId(long lastUsedId) {
        this.lastUsedId = lastUsedId;
    }
}