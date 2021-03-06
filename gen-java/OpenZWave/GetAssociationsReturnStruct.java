/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package OpenZWave;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetAssociationsReturnStruct implements org.apache.thrift.TBase<GetAssociationsReturnStruct, GetAssociationsReturnStruct._Fields>, java.io.Serializable, Cloneable, Comparable<GetAssociationsReturnStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetAssociationsReturnStruct");

  private static final org.apache.thrift.protocol.TField RETVAL_FIELD_DESC = new org.apache.thrift.protocol.TField("retval", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField O_ASSOCIATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("o_associations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetAssociationsReturnStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetAssociationsReturnStructTupleSchemeFactory());
  }

  public int retval; // required
  public List<Byte> o_associations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RETVAL((short)1, "retval"),
    O_ASSOCIATIONS((short)2, "o_associations");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RETVAL
          return RETVAL;
        case 2: // O_ASSOCIATIONS
          return O_ASSOCIATIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETVAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RETVAL, new org.apache.thrift.meta_data.FieldMetaData("retval", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.O_ASSOCIATIONS, new org.apache.thrift.meta_data.FieldMetaData("o_associations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetAssociationsReturnStruct.class, metaDataMap);
  }

  public GetAssociationsReturnStruct() {
  }

  public GetAssociationsReturnStruct(
    int retval,
    List<Byte> o_associations)
  {
    this();
    this.retval = retval;
    setRetvalIsSet(true);
    this.o_associations = o_associations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetAssociationsReturnStruct(GetAssociationsReturnStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.retval = other.retval;
    if (other.isSetO_associations()) {
      List<Byte> __this__o_associations = new ArrayList<Byte>(other.o_associations);
      this.o_associations = __this__o_associations;
    }
  }

  public GetAssociationsReturnStruct deepCopy() {
    return new GetAssociationsReturnStruct(this);
  }

  @Override
  public void clear() {
    setRetvalIsSet(false);
    this.retval = 0;
    this.o_associations = null;
  }

  public int getRetval() {
    return this.retval;
  }

  public GetAssociationsReturnStruct setRetval(int retval) {
    this.retval = retval;
    setRetvalIsSet(true);
    return this;
  }

  public void unsetRetval() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETVAL_ISSET_ID);
  }

  /** Returns true if field retval is set (has been assigned a value) and false otherwise */
  public boolean isSetRetval() {
    return EncodingUtils.testBit(__isset_bitfield, __RETVAL_ISSET_ID);
  }

  public void setRetvalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETVAL_ISSET_ID, value);
  }

  public int getO_associationsSize() {
    return (this.o_associations == null) ? 0 : this.o_associations.size();
  }

  public java.util.Iterator<Byte> getO_associationsIterator() {
    return (this.o_associations == null) ? null : this.o_associations.iterator();
  }

  public void addToO_associations(byte elem) {
    if (this.o_associations == null) {
      this.o_associations = new ArrayList<Byte>();
    }
    this.o_associations.add(elem);
  }

  public List<Byte> getO_associations() {
    return this.o_associations;
  }

  public GetAssociationsReturnStruct setO_associations(List<Byte> o_associations) {
    this.o_associations = o_associations;
    return this;
  }

  public void unsetO_associations() {
    this.o_associations = null;
  }

  /** Returns true if field o_associations is set (has been assigned a value) and false otherwise */
  public boolean isSetO_associations() {
    return this.o_associations != null;
  }

  public void setO_associationsIsSet(boolean value) {
    if (!value) {
      this.o_associations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RETVAL:
      if (value == null) {
        unsetRetval();
      } else {
        setRetval((Integer)value);
      }
      break;

    case O_ASSOCIATIONS:
      if (value == null) {
        unsetO_associations();
      } else {
        setO_associations((List<Byte>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RETVAL:
      return Integer.valueOf(getRetval());

    case O_ASSOCIATIONS:
      return getO_associations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RETVAL:
      return isSetRetval();
    case O_ASSOCIATIONS:
      return isSetO_associations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetAssociationsReturnStruct)
      return this.equals((GetAssociationsReturnStruct)that);
    return false;
  }

  public boolean equals(GetAssociationsReturnStruct that) {
    if (that == null)
      return false;

    boolean this_present_retval = true;
    boolean that_present_retval = true;
    if (this_present_retval || that_present_retval) {
      if (!(this_present_retval && that_present_retval))
        return false;
      if (this.retval != that.retval)
        return false;
    }

    boolean this_present_o_associations = true && this.isSetO_associations();
    boolean that_present_o_associations = true && that.isSetO_associations();
    if (this_present_o_associations || that_present_o_associations) {
      if (!(this_present_o_associations && that_present_o_associations))
        return false;
      if (!this.o_associations.equals(that.o_associations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(GetAssociationsReturnStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRetval()).compareTo(other.isSetRetval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetval()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retval, other.retval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetO_associations()).compareTo(other.isSetO_associations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetO_associations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.o_associations, other.o_associations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetAssociationsReturnStruct(");
    boolean first = true;

    sb.append("retval:");
    sb.append(this.retval);
    first = false;
    if (!first) sb.append(", ");
    sb.append("o_associations:");
    if (this.o_associations == null) {
      sb.append("null");
    } else {
      sb.append(this.o_associations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetAssociationsReturnStructStandardSchemeFactory implements SchemeFactory {
    public GetAssociationsReturnStructStandardScheme getScheme() {
      return new GetAssociationsReturnStructStandardScheme();
    }
  }

  private static class GetAssociationsReturnStructStandardScheme extends StandardScheme<GetAssociationsReturnStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetAssociationsReturnStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RETVAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.retval = iprot.readI32();
              struct.setRetvalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // O_ASSOCIATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.o_associations = new ArrayList<Byte>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  byte _elem42;
                  _elem42 = iprot.readByte();
                  struct.o_associations.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setO_associationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetAssociationsReturnStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RETVAL_FIELD_DESC);
      oprot.writeI32(struct.retval);
      oprot.writeFieldEnd();
      if (struct.o_associations != null) {
        oprot.writeFieldBegin(O_ASSOCIATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, struct.o_associations.size()));
          for (byte _iter43 : struct.o_associations)
          {
            oprot.writeByte(_iter43);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetAssociationsReturnStructTupleSchemeFactory implements SchemeFactory {
    public GetAssociationsReturnStructTupleScheme getScheme() {
      return new GetAssociationsReturnStructTupleScheme();
    }
  }

  private static class GetAssociationsReturnStructTupleScheme extends TupleScheme<GetAssociationsReturnStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetAssociationsReturnStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRetval()) {
        optionals.set(0);
      }
      if (struct.isSetO_associations()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRetval()) {
        oprot.writeI32(struct.retval);
      }
      if (struct.isSetO_associations()) {
        {
          oprot.writeI32(struct.o_associations.size());
          for (byte _iter44 : struct.o_associations)
          {
            oprot.writeByte(_iter44);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetAssociationsReturnStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.retval = iprot.readI32();
        struct.setRetvalIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, iprot.readI32());
          struct.o_associations = new ArrayList<Byte>(_list45.size);
          for (int _i46 = 0; _i46 < _list45.size; ++_i46)
          {
            byte _elem47;
            _elem47 = iprot.readByte();
            struct.o_associations.add(_elem47);
          }
        }
        struct.setO_associationsIsSet(true);
      }
    }
  }

}

