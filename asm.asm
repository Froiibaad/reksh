   GRP:   INC   GX
   ADD AX,[BX]FFFF
   RTI
   JMP GRP
   INT #10
   ASR [CX]
   MOVS AX,[BX]pomeraj
   END