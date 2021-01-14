/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2021-01-11")
public class TxNodeStartRequest implements org.apache.thrift.TBase<TxNodeStartRequest, TxNodeStartRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TxNodeStartRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TxNodeStartRequest");

  private static final org.apache.thrift.protocol.TField XID_FIELD_DESC = new org.apache.thrift.protocol.TField("xid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TX_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("txName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TxNodeStartRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TxNodeStartRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TxXID xid; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String txName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    XID((short)1, "xid"),
    TX_NAME((short)2, "txName");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // XID
          return XID;
        case 2: // TX_NAME
          return TX_NAME;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.XID, new org.apache.thrift.meta_data.FieldMetaData("xid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TxXID.class)));
    tmpMap.put(_Fields.TX_NAME, new org.apache.thrift.meta_data.FieldMetaData("txName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TxNodeStartRequest.class, metaDataMap);
  }

  public TxNodeStartRequest() {
  }

  public TxNodeStartRequest(
    TxXID xid,
    java.lang.String txName)
  {
    this();
    this.xid = xid;
    this.txName = txName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TxNodeStartRequest(TxNodeStartRequest other) {
    if (other.isSetXid()) {
      this.xid = new TxXID(other.xid);
    }
    if (other.isSetTxName()) {
      this.txName = other.txName;
    }
  }

  public TxNodeStartRequest deepCopy() {
    return new TxNodeStartRequest(this);
  }

  @Override
  public void clear() {
    this.xid = null;
    this.txName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TxXID getXid() {
    return this.xid;
  }

  public TxNodeStartRequest setXid(@org.apache.thrift.annotation.Nullable TxXID xid) {
    this.xid = xid;
    return this;
  }

  public void unsetXid() {
    this.xid = null;
  }

  /** Returns true if field xid is set (has been assigned a value) and false otherwise */
  public boolean isSetXid() {
    return this.xid != null;
  }

  public void setXidIsSet(boolean value) {
    if (!value) {
      this.xid = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTxName() {
    return this.txName;
  }

  public TxNodeStartRequest setTxName(@org.apache.thrift.annotation.Nullable java.lang.String txName) {
    this.txName = txName;
    return this;
  }

  public void unsetTxName() {
    this.txName = null;
  }

  /** Returns true if field txName is set (has been assigned a value) and false otherwise */
  public boolean isSetTxName() {
    return this.txName != null;
  }

  public void setTxNameIsSet(boolean value) {
    if (!value) {
      this.txName = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case XID:
      if (value == null) {
        unsetXid();
      } else {
        setXid((TxXID)value);
      }
      break;

    case TX_NAME:
      if (value == null) {
        unsetTxName();
      } else {
        setTxName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case XID:
      return getXid();

    case TX_NAME:
      return getTxName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case XID:
      return isSetXid();
    case TX_NAME:
      return isSetTxName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TxNodeStartRequest)
      return this.equals((TxNodeStartRequest)that);
    return false;
  }

  public boolean equals(TxNodeStartRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_xid = true && this.isSetXid();
    boolean that_present_xid = true && that.isSetXid();
    if (this_present_xid || that_present_xid) {
      if (!(this_present_xid && that_present_xid))
        return false;
      if (!this.xid.equals(that.xid))
        return false;
    }

    boolean this_present_txName = true && this.isSetTxName();
    boolean that_present_txName = true && that.isSetTxName();
    if (this_present_txName || that_present_txName) {
      if (!(this_present_txName && that_present_txName))
        return false;
      if (!this.txName.equals(that.txName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetXid()) ? 131071 : 524287);
    if (isSetXid())
      hashCode = hashCode * 8191 + xid.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxName()) ? 131071 : 524287);
    if (isSetTxName())
      hashCode = hashCode * 8191 + txName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TxNodeStartRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetXid()).compareTo(other.isSetXid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xid, other.xid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTxName()).compareTo(other.isSetTxName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txName, other.txName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TxNodeStartRequest(");
    boolean first = true;

    sb.append("xid:");
    if (this.xid == null) {
      sb.append("null");
    } else {
      sb.append(this.xid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("txName:");
    if (this.txName == null) {
      sb.append("null");
    } else {
      sb.append(this.txName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (xid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'xid' was not present! Struct: " + toString());
    }
    if (txName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (xid != null) {
      xid.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TxNodeStartRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TxNodeStartRequestStandardScheme getScheme() {
      return new TxNodeStartRequestStandardScheme();
    }
  }

  private static class TxNodeStartRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TxNodeStartRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TxNodeStartRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // XID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.xid = new TxXID();
              struct.xid.read(iprot);
              struct.setXidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TX_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.txName = iprot.readString();
              struct.setTxNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TxNodeStartRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.xid != null) {
        oprot.writeFieldBegin(XID_FIELD_DESC);
        struct.xid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.txName != null) {
        oprot.writeFieldBegin(TX_NAME_FIELD_DESC);
        oprot.writeString(struct.txName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TxNodeStartRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TxNodeStartRequestTupleScheme getScheme() {
      return new TxNodeStartRequestTupleScheme();
    }
  }

  private static class TxNodeStartRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TxNodeStartRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TxNodeStartRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.xid.write(oprot);
      oprot.writeString(struct.txName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TxNodeStartRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.xid = new TxXID();
      struct.xid.read(iprot);
      struct.setXidIsSet(true);
      struct.txName = iprot.readString();
      struct.setTxNameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

