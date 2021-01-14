/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2021-01-11")
public class TxGeneralRequest implements org.apache.thrift.TBase<TxGeneralRequest, TxGeneralRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TxGeneralRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TxGeneralRequest");

  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("appId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TX_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("txType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_FIELD_DESC = new org.apache.thrift.protocol.TField("node", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField XID_FIELD_DESC = new org.apache.thrift.protocol.TField("xid", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TxGeneralRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TxGeneralRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String appId; // required
  /**
   * 
   * @see TxType
   */
  public @org.apache.thrift.annotation.Nullable TxType txType; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String node; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String ip; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String xid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APP_ID((short)1, "appId"),
    /**
     * 
     * @see TxType
     */
    TX_TYPE((short)2, "txType"),
    NODE((short)3, "node"),
    IP((short)4, "ip"),
    XID((short)5, "xid");

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
        case 1: // APP_ID
          return APP_ID;
        case 2: // TX_TYPE
          return TX_TYPE;
        case 3: // NODE
          return NODE;
        case 4: // IP
          return IP;
        case 5: // XID
          return XID;
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
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TX_TYPE, new org.apache.thrift.meta_data.FieldMetaData("txType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TxType.class)));
    tmpMap.put(_Fields.NODE, new org.apache.thrift.meta_data.FieldMetaData("node", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.XID, new org.apache.thrift.meta_data.FieldMetaData("xid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TxGeneralRequest.class, metaDataMap);
  }

  public TxGeneralRequest() {
  }

  public TxGeneralRequest(
    java.lang.String appId,
    TxType txType,
    java.lang.String node,
    java.lang.String ip,
    java.lang.String xid)
  {
    this();
    this.appId = appId;
    this.txType = txType;
    this.node = node;
    this.ip = ip;
    this.xid = xid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TxGeneralRequest(TxGeneralRequest other) {
    if (other.isSetAppId()) {
      this.appId = other.appId;
    }
    if (other.isSetTxType()) {
      this.txType = other.txType;
    }
    if (other.isSetNode()) {
      this.node = other.node;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
    if (other.isSetXid()) {
      this.xid = other.xid;
    }
  }

  public TxGeneralRequest deepCopy() {
    return new TxGeneralRequest(this);
  }

  @Override
  public void clear() {
    this.appId = null;
    this.txType = null;
    this.node = null;
    this.ip = null;
    this.xid = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAppId() {
    return this.appId;
  }

  public TxGeneralRequest setAppId(@org.apache.thrift.annotation.Nullable java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  public void unsetAppId() {
    this.appId = null;
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return this.appId != null;
  }

  public void setAppIdIsSet(boolean value) {
    if (!value) {
      this.appId = null;
    }
  }

  /**
   * 
   * @see TxType
   */
  @org.apache.thrift.annotation.Nullable
  public TxType getTxType() {
    return this.txType;
  }

  /**
   * 
   * @see TxType
   */
  public TxGeneralRequest setTxType(@org.apache.thrift.annotation.Nullable TxType txType) {
    this.txType = txType;
    return this;
  }

  public void unsetTxType() {
    this.txType = null;
  }

  /** Returns true if field txType is set (has been assigned a value) and false otherwise */
  public boolean isSetTxType() {
    return this.txType != null;
  }

  public void setTxTypeIsSet(boolean value) {
    if (!value) {
      this.txType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNode() {
    return this.node;
  }

  public TxGeneralRequest setNode(@org.apache.thrift.annotation.Nullable java.lang.String node) {
    this.node = node;
    return this;
  }

  public void unsetNode() {
    this.node = null;
  }

  /** Returns true if field node is set (has been assigned a value) and false otherwise */
  public boolean isSetNode() {
    return this.node != null;
  }

  public void setNodeIsSet(boolean value) {
    if (!value) {
      this.node = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIp() {
    return this.ip;
  }

  public TxGeneralRequest setIp(@org.apache.thrift.annotation.Nullable java.lang.String ip) {
    this.ip = ip;
    return this;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getXid() {
    return this.xid;
  }

  public TxGeneralRequest setXid(@org.apache.thrift.annotation.Nullable java.lang.String xid) {
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

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((java.lang.String)value);
      }
      break;

    case TX_TYPE:
      if (value == null) {
        unsetTxType();
      } else {
        setTxType((TxType)value);
      }
      break;

    case NODE:
      if (value == null) {
        unsetNode();
      } else {
        setNode((java.lang.String)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((java.lang.String)value);
      }
      break;

    case XID:
      if (value == null) {
        unsetXid();
      } else {
        setXid((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case APP_ID:
      return getAppId();

    case TX_TYPE:
      return getTxType();

    case NODE:
      return getNode();

    case IP:
      return getIp();

    case XID:
      return getXid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case APP_ID:
      return isSetAppId();
    case TX_TYPE:
      return isSetTxType();
    case NODE:
      return isSetNode();
    case IP:
      return isSetIp();
    case XID:
      return isSetXid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TxGeneralRequest)
      return this.equals((TxGeneralRequest)that);
    return false;
  }

  public boolean equals(TxGeneralRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_appId = true && this.isSetAppId();
    boolean that_present_appId = true && that.isSetAppId();
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (!this.appId.equals(that.appId))
        return false;
    }

    boolean this_present_txType = true && this.isSetTxType();
    boolean that_present_txType = true && that.isSetTxType();
    if (this_present_txType || that_present_txType) {
      if (!(this_present_txType && that_present_txType))
        return false;
      if (!this.txType.equals(that.txType))
        return false;
    }

    boolean this_present_node = true && this.isSetNode();
    boolean that_present_node = true && that.isSetNode();
    if (this_present_node || that_present_node) {
      if (!(this_present_node && that_present_node))
        return false;
      if (!this.node.equals(that.node))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    boolean this_present_xid = true && this.isSetXid();
    boolean that_present_xid = true && that.isSetXid();
    if (this_present_xid || that_present_xid) {
      if (!(this_present_xid && that_present_xid))
        return false;
      if (!this.xid.equals(that.xid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAppId()) ? 131071 : 524287);
    if (isSetAppId())
      hashCode = hashCode * 8191 + appId.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxType()) ? 131071 : 524287);
    if (isSetTxType())
      hashCode = hashCode * 8191 + txType.getValue();

    hashCode = hashCode * 8191 + ((isSetNode()) ? 131071 : 524287);
    if (isSetNode())
      hashCode = hashCode * 8191 + node.hashCode();

    hashCode = hashCode * 8191 + ((isSetIp()) ? 131071 : 524287);
    if (isSetIp())
      hashCode = hashCode * 8191 + ip.hashCode();

    hashCode = hashCode * 8191 + ((isSetXid()) ? 131071 : 524287);
    if (isSetXid())
      hashCode = hashCode * 8191 + xid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TxGeneralRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTxType()).compareTo(other.isSetTxType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txType, other.txType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNode()).compareTo(other.isSetNode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.node, other.node);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIp()).compareTo(other.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, other.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TxGeneralRequest(");
    boolean first = true;

    sb.append("appId:");
    if (this.appId == null) {
      sb.append("null");
    } else {
      sb.append(this.appId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("txType:");
    if (this.txType == null) {
      sb.append("null");
    } else {
      sb.append(this.txType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("node:");
    if (this.node == null) {
      sb.append("null");
    } else {
      sb.append(this.node);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("xid:");
    if (this.xid == null) {
      sb.append("null");
    } else {
      sb.append(this.xid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (appId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'appId' was not present! Struct: " + toString());
    }
    if (txType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txType' was not present! Struct: " + toString());
    }
    if (node == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'node' was not present! Struct: " + toString());
    }
    if (ip == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ip' was not present! Struct: " + toString());
    }
    if (xid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'xid' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class TxGeneralRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TxGeneralRequestStandardScheme getScheme() {
      return new TxGeneralRequestStandardScheme();
    }
  }

  private static class TxGeneralRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TxGeneralRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TxGeneralRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appId = iprot.readString();
              struct.setAppIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TX_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.txType = com.ppdai.das.service.TxType.findByValue(iprot.readI32());
              struct.setTxTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.node = iprot.readString();
              struct.setNodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // XID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.xid = iprot.readString();
              struct.setXidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TxGeneralRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.appId != null) {
        oprot.writeFieldBegin(APP_ID_FIELD_DESC);
        oprot.writeString(struct.appId);
        oprot.writeFieldEnd();
      }
      if (struct.txType != null) {
        oprot.writeFieldBegin(TX_TYPE_FIELD_DESC);
        oprot.writeI32(struct.txType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.node != null) {
        oprot.writeFieldBegin(NODE_FIELD_DESC);
        oprot.writeString(struct.node);
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      if (struct.xid != null) {
        oprot.writeFieldBegin(XID_FIELD_DESC);
        oprot.writeString(struct.xid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TxGeneralRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TxGeneralRequestTupleScheme getScheme() {
      return new TxGeneralRequestTupleScheme();
    }
  }

  private static class TxGeneralRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TxGeneralRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TxGeneralRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.appId);
      oprot.writeI32(struct.txType.getValue());
      oprot.writeString(struct.node);
      oprot.writeString(struct.ip);
      oprot.writeString(struct.xid);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TxGeneralRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.appId = iprot.readString();
      struct.setAppIdIsSet(true);
      struct.txType = com.ppdai.das.service.TxType.findByValue(iprot.readI32());
      struct.setTxTypeIsSet(true);
      struct.node = iprot.readString();
      struct.setNodeIsSet(true);
      struct.ip = iprot.readString();
      struct.setIpIsSet(true);
      struct.xid = iprot.readString();
      struct.setXidIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

