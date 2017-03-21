package com.proteus.preprocess.verilog.jsonwriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.proteus.common.util.Utils;
import com.proteus.common.util.Utils.Pair;

public class Email {

	private List<String> ids;
	private Utils.Pair<String, List<String>> email;

	public Email(List<String> ids){
		this.ids = ids;
	}

	public Email(String email){
		ids = new ArrayList<String>();
		ids.add(email);
	}

	public Pair<String, List<String>> getEmail(){
		if(email == null){
			email = new Utils.Pair<String,List<String>>("email",ids);
		}
		return email;
	}
}
