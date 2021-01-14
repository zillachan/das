/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2021-01-11")
public class DasParameter implements org.apache.thrift.TBase<DasParameter, DasParameter._Fields>, java.io.Serializable, Cloneable, Comparable<DasParameter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasParameter");

  private static final org.apache.thrift.protocol.TField DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("direction", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField JDBC_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jdbcType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField IN_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("inValues", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasParameterStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasParameterTupleSchemeFactory();

  /**
   * 
   * @see DasParameterDirection
   */
  public @org.apache.thrift.annotation.Nullable DasParameterDirection direction; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public int index; // required
  public int jdbcType; // required
  public boolean inValues; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String value; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> values; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see DasParameterDirection
     */
    DIRECTION((short)1, "direction"),
    NAME((short)2, "name"),
    INDEX((short)3, "index"),
    JDBC_TYPE((short)4, "jdbcType"),
    IN_VALUES((short)5, "inValues"),
    VALUE((short)6, "value"),
    VALUES((short)7, "values");

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
        case 1: // DIRECTION
          return DIRECTION;
        case 2: // NAME
          return NAME;
        case 3: // INDEX
          return INDEX;
        case 4: // JDBC_TYPE
          return JDBC_TYPE;
        case 5: // IN_VALUES
          return IN_VALUES;
        case 6: // VALUE
          return VALUE;
        case 7: // VALUES
          return VALUES;
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
  private static final int __INDEX_ISSET_ID = 0;
  private static final int __JDBCTYPE_ISSET_ID = 1;
  private static final int __INVALUES_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.VALUE,_Fields.VALUES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DIRECTION, new org.apache.thrift.meta_data.FieldMetaData("direction", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DasParameterDirection.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JDBC_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jdbcType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IN_VALUES, new org.apache.thrift.meta_data.FieldMetaData("inValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasParameter.class, metaDataMap);
  }

  public DasParameter() {
  }

  public DasParameter(
    DasParameterDirection direction,
    int index,
    int jdbcType,
    boolean inValues)
  {
    this();
    this.direction = direction;
    this.index = index;
    setIndexIsSet(true);
    this.jdbcType = jdbcType;
    setJdbcTypeIsSet(true);
    this.inValues = inValues;
    setInValuesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasParameter(DasParameter other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDirection()) {
      this.direction = other.direction;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.index = other.index;
    this.jdbcType = other.jdbcType;
    this.inValues = other.inValues;
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetValues()) {
      java.util.List<java.lang.String> __this__values = new java.util.ArrayList<java.lang.String>(other.values);
      this.values = __this__values;
    }
  }

  public DasParameter deepCopy() {
    return new DasParameter(this);
  }

  @Override
  public void clear() {
    this.direction = null;
    this.name = null;
    setIndexIsSet(false);
    this.index = 0;
    setJdbcTypeIsSet(false);
    this.jdbcType = 0;
    setInValuesIsSet(false);
    this.inValues = false;
    this.value = null;
    this.values = null;
  }

  /**
   * 
   * @see DasParameterDirection
   */
  @org.apache.thrift.annotation.Nullable
  public DasParameterDirection getDirection() {
    return this.direction;
  }

  /**
   * 
   * @see DasParameterDirection
   */
  public DasParameter setDirection(@org.apache.thrift.annotation.Nullable DasParameterDirection direction) {
    this.direction = direction;
    return this;
  }

  public void unsetDirection() {
    this.direction = null;
  }

  /** Returns true if field direction is set (has been assigned a value) and false otherwise */
  public boolean isSetDirection() {
    return this.direction != null;
  }

  public void setDirectionIsSet(boolean value) {
    if (!value) {
      this.direction = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public DasParameter setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getIndex() {
    return this.index;
  }

  public DasParameter setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  public int getJdbcType() {
    return this.jdbcType;
  }

  public DasParameter setJdbcType(int jdbcType) {
    this.jdbcType = jdbcType;
    setJdbcTypeIsSet(true);
    return this;
  }

  public void unsetJdbcType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JDBCTYPE_ISSET_ID);
  }

  /** Returns true if field jdbcType is set (has been assigned a value) and false otherwise */
  public boolean isSetJdbcType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JDBCTYPE_ISSET_ID);
  }

  public void setJdbcTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JDBCTYPE_ISSET_ID, value);
  }

  public boolean isInValues() {
    return this.inValues;
  }

  public DasParameter setInValues(boolean inValues) {
    this.inValues = inValues;
    setInValuesIsSet(true);
    return this;
  }

  public void unsetInValues() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INVALUES_ISSET_ID);
  }

  /** Returns true if field inValues is set (has been assigned a value) and false otherwise */
  public boolean isSetInValues() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INVALUES_ISSET_ID);
  }

  public void setInValuesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INVALUES_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValue() {
    return this.value;
  }

  public DasParameter setValue(@org.apache.thrift.annotation.Nullable java.lang.String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(java.lang.String elem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    this.values.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getValues() {
    return this.values;
  }

  public DasParameter setValues(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DIRECTION:
      if (value == null) {
        unsetDirection();
      } else {
        setDirection((DasParameterDirection)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((java.lang.Integer)value);
      }
      break;

    case JDBC_TYPE:
      if (value == null) {
        unsetJdbcType();
      } else {
        setJdbcType((java.lang.Integer)value);
      }
      break;

    case IN_VALUES:
      if (value == null) {
        unsetInValues();
      } else {
        setInValues((java.lang.Boolean)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.String)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DIRECTION:
      return getDirection();

    case NAME:
      return getName();

    case INDEX:
      return getIndex();

    case JDBC_TYPE:
      return getJdbcType();

    case IN_VALUES:
      return isInValues();

    case VALUE:
      return getValue();

    case VALUES:
      return getValues();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DIRECTION:
      return isSetDirection();
    case NAME:
      return isSetName();
    case INDEX:
      return isSetIndex();
    case JDBC_TYPE:
      return isSetJdbcType();
    case IN_VALUES:
      return isSetInValues();
    case VALUE:
      return isSetValue();
    case VALUES:
      return isSetValues();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DasParameter)
      return this.equals((DasParameter)that);
    return false;
  }

  public boolean equals(DasParameter that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_direction = true && this.isSetDirection();
    boolean that_present_direction = true && that.isSetDirection();
    if (this_present_direction || that_present_direction) {
      if (!(this_present_direction && that_present_direction))
        return false;
      if (!this.direction.equals(that.direction))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_jdbcType = true;
    boolean that_present_jdbcType = true;
    if (this_present_jdbcType || that_present_jdbcType) {
      if (!(this_present_jdbcType && that_present_jdbcType))
        return false;
      if (this.jdbcType != that.jdbcType)
        return false;
    }

    boolean this_present_inValues = true;
    boolean that_present_inValues = true;
    if (this_present_inValues || that_present_inValues) {
      if (!(this_present_inValues && that_present_inValues))
        return false;
      if (this.inValues != that.inValues)
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDirection()) ? 131071 : 524287);
    if (isSetDirection())
      hashCode = hashCode * 8191 + direction.getValue();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + index;

    hashCode = hashCode * 8191 + jdbcType;

    hashCode = hashCode * 8191 + ((inValues) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + ((isSetValues()) ? 131071 : 524287);
    if (isSetValues())
      hashCode = hashCode * 8191 + values.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasParameter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDirection()).compareTo(other.isSetDirection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direction, other.direction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIndex()).compareTo(other.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, other.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJdbcType()).compareTo(other.isSetJdbcType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdbcType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdbcType, other.jdbcType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInValues()).compareTo(other.isSetInValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inValues, other.inValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DasParameter(");
    boolean first = true;

    sb.append("direction:");
    if (this.direction == null) {
      sb.append("null");
    } else {
      sb.append(this.direction);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jdbcType:");
    sb.append(this.jdbcType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inValues:");
    sb.append(this.inValues);
    first = false;
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetValues()) {
      if (!first) sb.append(", ");
      sb.append("values:");
      if (this.values == null) {
        sb.append("null");
      } else {
        sb.append(this.values);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (direction == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'direction' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'index' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'jdbcType' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'inValues' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DasParameterStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasParameterStandardScheme getScheme() {
      return new DasParameterStandardScheme();
    }
  }

  private static class DasParameterStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasParameter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DIRECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.direction = com.ppdai.das.service.DasParameterDirection.findByValue(iprot.readI32());
              struct.setDirectionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index = iprot.readI32();
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JDBC_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jdbcType = iprot.readI32();
              struct.setJdbcTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IN_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.inValues = iprot.readBool();
              struct.setInValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list150 = iprot.readListBegin();
                struct.values = new java.util.ArrayList<java.lang.String>(_list150.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem151;
                for (int _i152 = 0; _i152 < _list150.size; ++_i152)
                {
                  _elem151 = iprot.readString();
                  struct.values.add(_elem151);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
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
      if (!struct.isSetIndex()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'index' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetJdbcType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'jdbcType' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetInValues()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'inValues' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasParameter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.direction != null) {
        oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
        oprot.writeI32(struct.direction.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeI32(struct.index);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JDBC_TYPE_FIELD_DESC);
      oprot.writeI32(struct.jdbcType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IN_VALUES_FIELD_DESC);
      oprot.writeBool(struct.inValues);
      oprot.writeFieldEnd();
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.values != null) {
        if (struct.isSetValues()) {
          oprot.writeFieldBegin(VALUES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.values.size()));
            for (java.lang.String _iter153 : struct.values)
            {
              oprot.writeString(_iter153);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasParameterTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasParameterTupleScheme getScheme() {
      return new DasParameterTupleScheme();
    }
  }

  private static class DasParameterTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasParameter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.direction.getValue());
      oprot.writeI32(struct.index);
      oprot.writeI32(struct.jdbcType);
      oprot.writeBool(struct.inValues);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetValues()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (java.lang.String _iter154 : struct.values)
          {
            oprot.writeString(_iter154);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.direction = com.ppdai.das.service.DasParameterDirection.findByValue(iprot.readI32());
      struct.setDirectionIsSet(true);
      struct.index = iprot.readI32();
      struct.setIndexIsSet(true);
      struct.jdbcType = iprot.readI32();
      struct.setJdbcTypeIsSet(true);
      struct.inValues = iprot.readBool();
      struct.setInValuesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list155 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new java.util.ArrayList<java.lang.String>(_list155.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem156;
          for (int _i157 = 0; _i157 < _list155.size; ++_i157)
          {
            _elem156 = iprot.readString();
            struct.values.add(_elem156);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

