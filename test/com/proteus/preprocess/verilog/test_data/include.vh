function [M-1:0] decode(input [N-1:0] sel, input valid, input value)
reg [M-1:0] tmp;
begin
tmp = ~{M{value}};
//initialize to inactive value
if (valid) tmp[sel] = value;
decode = tmp;
end
endfunction