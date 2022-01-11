package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u121/8372/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, December 12, 2016 6:22:53 PM PST
*/


/**
    * DynArray objects support the manipulation of IDL arrays.
    * Note that the dimension of the array is contained in the TypeCode which is accessible
    * through the type attribute. It can also be obtained by calling the component_count operation.
    */
abstract public class DynArrayHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/DynArray:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.DynamicAny.DynArray that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.DynamicAny.DynArray extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.DynamicAny.DynArrayHelper.id (), "DynArray");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.DynamicAny.DynArray read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.DynamicAny.DynArray value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.DynamicAny.DynArray narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.DynamicAny.DynArray)
      return (org.omg.DynamicAny.DynArray)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.DynamicAny._DynArrayStub stub = new org.omg.DynamicAny._DynArrayStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.DynamicAny.DynArray unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.DynamicAny.DynArray)
      return (org.omg.DynamicAny.DynArray)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.DynamicAny._DynArrayStub stub = new org.omg.DynamicAny._DynArrayStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
