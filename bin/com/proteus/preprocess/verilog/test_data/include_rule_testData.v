`include "include.vh"
module include_rule_testData(input clk, input  in1, output reg q);
always @(posedge clk) q <= {4{in1}};
`include "include.vh"
endmodule