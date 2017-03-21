 some text before instantiation_testData;
abc abc ;
xyz xyz ;

module instantiation_testData;
	some text inside instantiation_testData;

	`define inside inside_instantiation_testData

	instantiation_part2#(.a(12),.b(34)) nameofinstance ();

	processing next **********;
	`define after define in instatiation_testData

	second_declaration#() second();
	
	search_path_testData search_path_testInstance();
	
	after search path;

endmodule

module second_declaration;
	present in second_declaration;
	`define in_second in_second_declaration
	`inside
endmodule