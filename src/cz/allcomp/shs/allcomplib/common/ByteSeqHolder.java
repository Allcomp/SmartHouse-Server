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
* common/ByteSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/petr/secret/ewa/idl
* Tuesday, 3 February 2015 19:18:16 o'clock CET
*/


/** The type for a Switch arrays and for a Gratebar positions. */
public final class ByteSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public ByteSeqHolder ()
  {
  }

  public ByteSeqHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ByteSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ByteSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ByteSeqHelper.type ();
  }

}