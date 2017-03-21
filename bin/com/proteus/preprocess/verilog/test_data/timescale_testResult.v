module timescale_testData;
reg i; 
initial 
begin 
i=0; 
#7.7212; 
i=1;
$display("STATEMENT 1 :: time is ",$stime); 
#7.123; 
$finish; 
end 

endmodule