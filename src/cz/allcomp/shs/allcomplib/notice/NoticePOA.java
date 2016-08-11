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

package cz.allcomp.shs.allcomplib.notice;


/**
* notice/NoticePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/petr/secret/ewa/notice.idl
* Sunday, 15 February 2015 11:26:05 o'clock CET
*/


/** 
  * The <code>Notice</code> is the experimental interface to provide change notification by server.
  * <p> The Ewc address is specified by short (two bytes) value, while Ewc address is 255 maximum.
  * The higher byte is reserved to specify the Ewc net when more then one is present on single server.
  */
public abstract class NoticePOA extends org.omg.PortableServer.Servant
 implements NoticeOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable<String, Integer> _methods = new java.util.Hashtable<String, Integer> ();
  static
  {
    _methods.put ("hall", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = _methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
      * Method called if some binary input is changed.
      * <p>Param value holds a bit field with up to 32 first digital inputs. 
      * If the Ewc has less then 32 digital inputs,
      * the bits not used for digital inputs may hold another information,
      * for example the first analog input. But this is implementation dependant.
      * @param ewc the address of the Ewc where the inputs was changed
      * @param value is record 1 from the file 0x10 TTPA of that EWC
      */
       case 0:  // notice/Notice/hall
       {
         short ewc = in.read_short ();
         int value = in.read_long ();
         this.hall (ewc, value);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:notice/Notice:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Notice _this() 
  {
    return NoticeHelper.narrow(
    super._this_object());
  }

  public Notice _this(org.omg.CORBA.ORB orb) 
  {
    return NoticeHelper.narrow(
    super._this_object(orb));
  }


} // class NoticePOA
