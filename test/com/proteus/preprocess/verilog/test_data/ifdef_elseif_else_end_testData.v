module ifdef_elseif_else_end_testData();

initial
begin
`define TYPE_1 type1
`define TYPE_2 type2
`define TYPE_4 type4
`define TYPE_5 type5
`define TYPE_7 type7

`ifdef TYPE_1
`define ABC abc_type_1
	$display(" TYPE_1 message ");
	`ABC
`else
	`ifdef TYPE_2
	$display(" TYPE_2 message ");
	`endif
`endif
end

begin
`ifdef TYPE_8
	$display(" TYPE_8 message ");
	module ifdef_in_statement();
`else
	`ifdef TYPE_2
	$display(" TYPE_8 message ");
	module ifdef_in_statement_else();
	`endif
`endif
endmodule;
end

`ifdef TYPE_2 
	type2
    tmp_data[8:0] = {write_data[8:0]}
    tmp = abcccc;
`else
    tmp_data[8:0] = {write_data[8:0]};
`endif

`ifdef TYPE_3
  `timescale 1ns/1fs
`elsif resol_10ps
  `timescale 1ns/10ps
`else
  entered else in type_3
  `timescale 1ns/1ps
`endif


`ifdef TYPE_4
assign power = (VDD_buf=== 1'b1 && VSS_buf=== 1'b0) ? 1:0;

always @(VDD_buf or VSS_buf )
begin // {
        if(VDD_buf !== 1'b1) begin // {
                uut.task_corrupt_memory_x;
                uut.task_corrupt_output_x;
                if( MES_CNTRL >= ERROR )
                begin // {
                  $display("<<LSI_MEM_111HS_ERROR: VDD is invalid. Corrupting Memory & output>> at time=%t; instance=%m\n",$realtime);
                end // }
        end // }
        if(VSS_buf !== 1'b0) begin // {
                uut.task_corrupt_memory_x;
                uut.task_corrupt_output_x;
                if( MES_CNTRL >= ERROR )
                begin // {
                  $display("<<LSI_MEM_111HS_ERROR: VSS is invalid. Corrupting Memory & output>> at time=%t; instance=%m\n",$realtime);
                end // }
        end // }
end     // }
`else
assign power = 1'b1;
`endif

`ifdef TYPE_5
 `ifndef NO_GENERIC_WRAPPER_DMA
   `ifndef USE_GENERIC_WRAPPER_DMA
//something useful
`endif
 `endif
`endif

`ifndef TYPE_6
	in ifndef type6
`else
	in ifndef else type6
`endif


`ifdef TYPE_7
	begin
	`ifndef TYPE_5
               tmp_data[36:28] = {write_data[8:0]};
                `ifdef TYPE_5
                        begin in if type_5
                        tmp_data= 111;
                        end
                `endif
	`else
	in else of ifndef TYPE_5
       			`ifndef ABC
                        begin in ifndef ABC
                        tmp_data= 111;
                        end
                `endif
     `endif
`else
   tmp_data = 0;
end
`endif


`ifdef ABC
        tmp_data= 1111;
                 `ifndef PQR
                        tmp_data = 7777777;
                `else
                        `ifndef ABC
                                tmp_data = 88888;
                                `ifndef ABC
                                        tmp_data = 88888;
                                `endif
                        `endif
                `endif

`else
        tmp_data = 2222;
        `ifndef TYPE_8
                tmp_data = 3333;
        `else
                `ifdef PQR
                        tmp_data = 4444;
                `else
                        `ifndef TYPE_7
                                tmp_data = 66666;
                        `endif
                `endif
        `endif

`endif

`ifdef TYPE_7
  begin
    `ifndef TYPE_7
               tmp_data[36:28] = {write_data[8:0]};
                `ifndef ABC
                        begin
                        tmp_data= 111;
                        end
                `else
                        begin
                        tmp_data = 2222;
                        end
                `endif
     `else
               tmp_data[43:0] =ABC;
                `ifndef ABC
                        begin
                        tmp_data= 111;
                        end
                `else
                        tmp_data = 555;
                `endif
     `endif
`else
  tmp_data = 0;
  end
`endif

endmodule