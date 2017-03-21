module instantiation_part2;

	present in instantiation_part2;
	`define in_part2 in_part2
	using define macro here from the first;
	`inside

	preprocessing all the contents in this instantiation_part2;
	`ifdef inside
		$display(" TYPE_1 message ");
	`else
		`ifdef inside
		$display(" TYPE_2 message ");
		`endif
	`endif
	end

endmodule

module instantiation_part2_second;

	this is to be ignored;
	
endmodule

after instantiation_part2_second;
`define after_second after_second

module instantiation_part2_third;

	present in instantiation_part2_third;
	`after_second
endmodule