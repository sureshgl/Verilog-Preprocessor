package com.proteus.preprocess.verilog.generator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
public class Pair<E1,E2> {

	@Getter private E1 first;
	@Getter private E2 second;
	@Override public String toString(){ return "<" + first + ":" +second + ">"; }
}
