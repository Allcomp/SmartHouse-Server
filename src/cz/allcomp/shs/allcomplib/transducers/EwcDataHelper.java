/**
 * Copyright (c) 2015, Václav Vilímek
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 	- Redistributions of source code must retain the above copyright notice, this list 
 * 	  of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright , this list 
 *    of conditions and the following disclaimer in the documentation and/or other materials 
 *    provided with the distribution.
 *  - Neither the name of the ALLCOMP a.s. nor the of its contributors may be used to endorse 
 *    or promote products from this software without specific prior written permission.
 *    
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL VÁCLAV VILÍMEK BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package cz.allcomp.shs.allcomplib.transducers;

import cz.allcomp.shs.allcomplib.common.ByteSeqHelper;
import cz.allcomp.shs.allcomplib.common.IntSeqHelper;
import cz.allcomp.shs.allcomplib.common.LongSeqHelper;
import cz.allcomp.shs.allcomplib.common.ShortSeqHelper;


/**
* transducers/EwcDataHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/petr/secret/ewa/AllNet.idl
* Sunday, 15 February 2015 11:26:13 o'clock CET
*/


/** 
  * The <code>EwcData</code> class serves to getting all the Ewc data at once.
  * <p> It is usable mainly for diagnostic purposes.
  * <p> No setter method are found here, since it has no sense to set anything on 
  * a hard copy of the Ewc data.
  */
abstract public class EwcDataHelper
{
  private static String  _id = "IDL:transducers/EwcData:1.0";


  public static void insert (org.omg.CORBA.Any a, EwcData that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EwcData extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.ValueMember[] _members0 = new org.omg.CORBA.ValueMember[13];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          // ValueMember instance for ewcTypeSign
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[0] = new org.omg.CORBA.ValueMember ("ewcTypeSign", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for status
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[1] = new org.omg.CORBA.ValueMember ("status", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for hwVersion
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[2] = new org.omg.CORBA.ValueMember ("hwVersion", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for swVersion
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[3] = new org.omg.CORBA.ValueMember ("swVersion", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for lastTime
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[4] = new org.omg.CORBA.ValueMember ("lastTime", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for posInLenght
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[5] = new org.omg.CORBA.ValueMember ("posInLenght", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for backOutIndex
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[6] = new org.omg.CORBA.ValueMember ("backOutIndex", 
              "", 
              _id, 
              "", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for hallIn
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_recursive_tc ("");
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IntSeqHelper.id (), "IntSeq", _tcOf_members0);
          _members0[7] = new org.omg.CORBA.ValueMember ("hallIn", 
              IntSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for switchOut
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ByteSeqHelper.id (), "ByteSeq", _tcOf_members0);
          _members0[8] = new org.omg.CORBA.ValueMember ("switchOut", 
              ByteSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for analogOut
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_recursive_tc ("");
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ShortSeqHelper.id (), "ShortSeq", _tcOf_members0);
          _members0[9] = new org.omg.CORBA.ValueMember ("analogOut", 
              ShortSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for analogIn
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_recursive_tc ("");
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (ShortSeqHelper.id (), "ShortSeq", _tcOf_members0);
          _members0[10] = new org.omg.CORBA.ValueMember ("analogIn", 
              ShortSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for timerIn
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_recursive_tc ("");
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IntSeqHelper.id (), "IntSeq", _tcOf_members0);
          _members0[11] = new org.omg.CORBA.ValueMember ("timerIn", 
              IntSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          // ValueMember instance for longIn
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulonglong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (LongSeqHelper.id (), "LongSeq", _tcOf_members0);
          _members0[12] = new org.omg.CORBA.ValueMember ("longIn", 
              LongSeqHelper.id (), 
              _id, 
              "1.0", 
              _tcOf_members0, 
              null, 
              org.omg.CORBA.PRIVATE_MEMBER.value);
          __typeCode = org.omg.CORBA.ORB.init ().create_value_tc (_id, "EwcData", org.omg.CORBA.VM_NONE.value, EwcResultHelper.type (), _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EwcData read (org.omg.CORBA.portable.InputStream istream)
  {
    return (EwcData)((org.omg.CORBA_2_3.portable.InputStream) istream).read_value (id ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EwcData value)
  {
    ((org.omg.CORBA_2_3.portable.OutputStream) ostream).write_value (value, id ());
  }


}
