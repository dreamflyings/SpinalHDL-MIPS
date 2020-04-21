package mylib

import spinal.core._
import spinal.lib._

object MIPS{
    //------------------------------------
    //指令全码
    //|==================================================|
    //|31----26|25----21|20----16|15----11|10----6|5----0|
    //|___OP___|___RS___|___RT___|___RD___|___SA__|_FUNC_|-----R类型-----
    //|==================================================|
    //|31----26|25----21|20----16|15--------------------0|
    //|___OP___|___RS___|___RT___|______IMMEDIATE________|-----I类型-----
    //|==================================================|
    //|31----26|25--------------------------------------0|
    //|___OP___|_________________ADDRESS_________________|-----J类型-----
    //|==================================================|
    def ORI   = M"001101--------------------------"
    def AND   = M"000000---------------00000100100"
    def OR    = M"000000---------------00000100101"
    def XOR   = M"000000---------------00000100110"
    def NOR   = M"000000---------------00000100111"
    def ANDI  = M"001100--------------------------"
    def XORI  = M"001110--------------------------"
    def LUI   = M"00111100000---------------------"
    def SLL   = M"00000000000---------------000000"
    def SRL   = M"00000000000---------------000010"
    def SRA   = M"00000000000---------------000011"
    def SLLV  = M"000000---------------00000000100"
    def SRLV  = M"000000---------------00000000110"
    def SRAV  = M"000000---------------00000000111"
    def NOP   = M"00000000000000000000000000000000"
    def SSNOP = M"00000000000000000000000001000000"
    def SYNC  = M"00000000000000000000000001001111"
    def PREF  = M"110011--------------------------"

    //------------------------------------
    //指令中的要操作的位
    def RS = 25 downto 21
    def RT = 20 downto 16
    def RD = 15 downto 11
    def SA = 10 downto 6
    def IMM = 15 downto 0
    def SHIFT = 4 downto 0
    //------------------------------------
    //aluOp
    //注释掉的是EX中没有实现的，因为与未被注释的功能
    //相同，只是运算时使用的寄存器不同，所以使用同一
    //个aluOp了。
    //def ORI_Op  = U"8'b01011010"
    def AND_Op  = U"8'b00100100"
    def OR_Op   = U"8'b00100101"
    def XOR_Op  = U"8'b00100110"
    def NOR_Op  = U"8'b00100111"
    //def ANDI_Op = U"8'b01011001"
    //def XORI_Op = U"8'b01011011"
    //def LUI_Op  = U"8'b01011100"
    def SLL_Op  = U"8'b01111100"
    def SRL_Op  = U"8'b00000010"
    def SRA_Op  = U"8'b00000011"
    //def SLLV_Op = U"8'b00000100"
    //def SRLV_Op = U"8'b00000110"
    //def SRAV_Op = U"8'b00000111"
    def NOP_Op  = U"8'b00000000"

    //------------------------------------
    //aluSel
    def RES_Logic = U"3'b001"
    def RES_Shift = U"3'b010"
    def RES_Nop   = U"3'b000"
}