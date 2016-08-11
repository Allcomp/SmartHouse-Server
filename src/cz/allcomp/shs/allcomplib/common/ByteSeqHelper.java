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

package cz.allcomp.shs.allcomplib.common;


/**
* common/ByteSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/petr/secret/ewa/idl
* Tuesday, 3 February 2015 19:18:16 o'clock CET
*/


/** The type for a Switch arrays and for a Gratebar positions. */
abstract public class ByteSeqHelper
{
  private static String  _id = "IDL:common/ByteSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, byte[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static byte[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ByteSeqHelper.id (), "ByteSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static byte[] read (org.omg.CORBA.portable.InputStream istream)
  {
    byte value[] = null;
    int _len0 = istream.read_long ();
    value = new byte[_len0];
    istream.read_octet_array (value, 0, _len0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, byte[] value)
  {
    ostream.write_long (value.length);
    ostream.write_octet_array (value, 0, value.length);
  }

}
