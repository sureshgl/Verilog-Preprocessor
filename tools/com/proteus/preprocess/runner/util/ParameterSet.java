package com.proteus.preprocess.runner.util;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import lombok.Data;

import com.proteus.common.util.Utils;
import com.proteus.common.util.Utils.Pair;

@Data
public class ParameterSet {
	private final Map<String,Object> map = new TreeMap<String, Object>();
	
	@Override
	public String toString() {
		return Utils.summary(map);
	}
	public void add(String name,Object ob){
		map.put(name, ob);
	}
	public void add(Pair<String,Object> pair){
		map.put(pair.first(), pair.second());
	}
	public void addAll(Map<String,Object> add){
		map.putAll(add);
	}
	public Object get(String name){
		if(map.containsKey(name)){
			return map.get(name);
		}
		throw new IllegalArgumentException("Parameter "+name +" is not set");
	}
	
	public boolean contains(String name){
		return map.containsKey(name);
	}
	
	public String moduleSuffix(String cutname){
		StringBuilder sb = new StringBuilder();
		for(Entry<String, Object> entry:map.entrySet()){
			sb.append("_"+entry.getKey()+"_"+entry.getValue());
		}
		return "_"+cutname+"_"+Utils.simpleDigest(sb.toString());
	}
	
}
