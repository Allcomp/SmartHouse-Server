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
* transducers/EwcData.java .
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
public abstract class EwcData implements EwcResult
{

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/** Ewc class signature. */
  protected int ewcTypeSign = (int)0;

 /** Ewc communication status flags bitmap*/
  protected int status = (int)0;

 /** Ewc's hardware identification number. */
  protected int hwVersion = (int)0;

 /** Ewc's software version number. */
  protected int swVersion = (int)0;

 /** How long is it when the last data from this Ewc was received in millis. */
  protected long lastTime = (long)0;

 /** Ewc's number of digital inputs. */
  protected short posInLenght = (short)0;

 /** Index to the hallIn bit field where outputs may be read back. */
  protected short backOutIndex = (short)0;

 /** A bit field in which all the digital inputs are stored. */
  protected int hallIn[] = null;

 /** An array in which current setting of switching outputs is stored. */
  protected byte switchOut[] = null;

 /** An array in which current setting of analog outputs is stored. */
  protected short analogOut[] = null;

 /** An array in which analog input data are stored. */
  protected short analogIn[] = null;

 /** An array in which timers and counters input data are stored. */
  protected int timerIn[] = null;

 /** An array in which long long input data are stored. */
  protected long longIn[] = null;

  private static String[] _truncatable_ids = {
    EwcDataHelper.id ()
  };

  public String[] _truncatable_ids() {
    return _truncatable_ids;
  }

  public void _read (org.omg.CORBA.portable.InputStream istream)
  {
    this.ewcTypeSign = istream.read_ulong ();
    this.status = istream.read_ulong ();
    this.hwVersion = istream.read_ulong ();
    this.swVersion = istream.read_ulong ();
    this.lastTime = istream.read_longlong ();
    this.posInLenght = istream.read_ushort ();
    this.backOutIndex = istream.read_ushort ();
    this.hallIn = IntSeqHelper.read (istream);
    this.switchOut = ByteSeqHelper.read (istream);
    this.analogOut = ShortSeqHelper.read (istream);
    this.analogIn = ShortSeqHelper.read (istream);
    this.timerIn = IntSeqHelper.read (istream);
    this.longIn = LongSeqHelper.read (istream);
  }

  public void _write (org.omg.CORBA.portable.OutputStream ostream)
  {
    ostream.write_ulong (this.ewcTypeSign);
    ostream.write_ulong (this.status);
    ostream.write_ulong (this.hwVersion);
    ostream.write_ulong (this.swVersion);
    ostream.write_longlong (this.lastTime);
    ostream.write_ushort (this.posInLenght);
    ostream.write_ushort (this.backOutIndex);
    IntSeqHelper.write (ostream, this.hallIn);
    ByteSeqHelper.write (ostream, this.switchOut);
    ShortSeqHelper.write (ostream, this.analogOut);
    ShortSeqHelper.write (ostream, this.analogIn);
    IntSeqHelper.write (ostream, this.timerIn);
    LongSeqHelper.write (ostream, this.longIn);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EwcDataHelper.type ();
  }
} // class EwcData