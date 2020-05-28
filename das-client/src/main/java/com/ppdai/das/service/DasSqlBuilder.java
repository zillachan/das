/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-25")
public class DasSqlBuilder implements org.apache.thrift.TBase<DasSqlBuilder, DasSqlBuilder._Fields>, java.io.Serializable, Cloneable, Comparable<DasSqlBuilder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasSqlBuilder");

  private static final org.apache.thrift.protocol.TField PARTIALS_FIELD_DESC = new org.apache.thrift.protocol.TField("partials", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DEFINITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("definitions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ENTITY_META_FIELD_DESC = new org.apache.thrift.protocol.TField("entityMeta", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField NULLABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("nullable", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ENTITY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("entityType", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasSqlBuilderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasSqlBuilderTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String partials; // optional
  public @org.apache.thrift.annotation.Nullable DasParameters parameters; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<DasParameterDefinition> definitions; // optional
  public @org.apache.thrift.annotation.Nullable EntityMeta entityMeta; // optional
  public boolean nullable; // required
  public @org.apache.thrift.annotation.Nullable String entityType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTIALS((short)1, "partials"),
    PARAMETERS((short)2, "parameters"),
    DEFINITIONS((short)3, "definitions"),
    ENTITY_META((short)4, "entityMeta"),
    NULLABLE((short)5, "nullable"),
    ENTITY_TYPE((short)6, "entityType");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

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
        case 1: // PARTIALS
          return PARTIALS;
        case 2: // PARAMETERS
          return PARAMETERS;
        case 3: // DEFINITIONS
          return DEFINITIONS;
        case 4: // ENTITY_META
          return ENTITY_META;
        case 5: // NULLABLE
          return NULLABLE;
        case 6: // ENTITY_TYPE
          return ENTITY_TYPE;
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
      if (fields == null) {
          throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      }
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
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
  private static final int __NULLABLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTIALS,_Fields.PARAMETERS,_Fields.DEFINITIONS,_Fields.ENTITY_META,_Fields.ENTITY_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTIALS, new org.apache.thrift.meta_data.FieldMetaData("partials", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "DasParameters")));
    tmpMap.put(_Fields.DEFINITIONS, new org.apache.thrift.meta_data.FieldMetaData("definitions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "DasParameterDefinition"))));
    tmpMap.put(_Fields.ENTITY_META, new org.apache.thrift.meta_data.FieldMetaData("entityMeta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EntityMeta.class)));
    tmpMap.put(_Fields.NULLABLE, new org.apache.thrift.meta_data.FieldMetaData("nullable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ENTITY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("entityType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasSqlBuilder.class, metaDataMap);
  }

  public DasSqlBuilder() {
  }

  public DasSqlBuilder(
    boolean nullable)
  {
    this();
    this.nullable = nullable;
    setNullableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasSqlBuilder(DasSqlBuilder other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartials()) {
      this.partials = other.partials;
    }
    if (other.isSetParameters()) {
      this.parameters = new DasParameters(other.parameters);
    }
    if (other.isSetDefinitions()) {
      java.util.List<DasParameterDefinition> __this__definitions = new java.util.ArrayList<DasParameterDefinition>(other.definitions.size());
      for (DasParameterDefinition other_element : other.definitions) {
        __this__definitions.add(new DasParameterDefinition(other_element));
      }
      this.definitions = __this__definitions;
    }
    if (other.isSetEntityMeta()) {
      this.entityMeta = new EntityMeta(other.entityMeta);
    }
    this.nullable = other.nullable;
    if (other.isSetEntityType()) {
      this.entityType = other.entityType;
    }
  }

  public DasSqlBuilder deepCopy() {
    return new DasSqlBuilder(this);
  }

  @Override
  public void clear() {
    this.partials = null;
    this.parameters = null;
    this.definitions = null;
    this.entityMeta = null;
    setNullableIsSet(false);
    this.nullable = false;
    this.entityType = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getPartials() {
    return this.partials;
  }

  public DasSqlBuilder setPartials(@org.apache.thrift.annotation.Nullable String partials) {
    this.partials = partials;
    return this;
  }

  public void unsetPartials() {
    this.partials = null;
  }

  /** Returns true if field partials is set (has been assigned a value) and false otherwise */
  public boolean isSetPartials() {
    return this.partials != null;
  }

  public void setPartialsIsSet(boolean value) {
    if (!value) {
      this.partials = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public DasParameters getParameters() {
    return this.parameters;
  }

  public DasSqlBuilder setParameters(@org.apache.thrift.annotation.Nullable DasParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  public int getDefinitionsSize() {
    return (this.definitions == null) ? 0 : this.definitions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<DasParameterDefinition> getDefinitionsIterator() {
    return (this.definitions == null) ? null : this.definitions.iterator();
  }

  public void addToDefinitions(DasParameterDefinition elem) {
    if (this.definitions == null) {
      this.definitions = new java.util.ArrayList<DasParameterDefinition>();
    }
    this.definitions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<DasParameterDefinition> getDefinitions() {
    return this.definitions;
  }

  public DasSqlBuilder setDefinitions(@org.apache.thrift.annotation.Nullable java.util.List<DasParameterDefinition> definitions) {
    this.definitions = definitions;
    return this;
  }

  public void unsetDefinitions() {
    this.definitions = null;
  }

  /** Returns true if field definitions is set (has been assigned a value) and false otherwise */
  public boolean isSetDefinitions() {
    return this.definitions != null;
  }

  public void setDefinitionsIsSet(boolean value) {
    if (!value) {
      this.definitions = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public EntityMeta getEntityMeta() {
    return this.entityMeta;
  }

  public DasSqlBuilder setEntityMeta(@org.apache.thrift.annotation.Nullable EntityMeta entityMeta) {
    this.entityMeta = entityMeta;
    return this;
  }

  public void unsetEntityMeta() {
    this.entityMeta = null;
  }

  /** Returns true if field entityMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityMeta() {
    return this.entityMeta != null;
  }

  public void setEntityMetaIsSet(boolean value) {
    if (!value) {
      this.entityMeta = null;
    }
  }

  public boolean isNullable() {
    return this.nullable;
  }

  public DasSqlBuilder setNullable(boolean nullable) {
    this.nullable = nullable;
    setNullableIsSet(true);
    return this;
  }

  public void unsetNullable() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NULLABLE_ISSET_ID);
  }

  /** Returns true if field nullable is set (has been assigned a value) and false otherwise */
  public boolean isSetNullable() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NULLABLE_ISSET_ID);
  }

  public void setNullableIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NULLABLE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public String getEntityType() {
    return this.entityType;
  }

  public DasSqlBuilder setEntityType(@org.apache.thrift.annotation.Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  public void unsetEntityType() {
    this.entityType = null;
  }

  /** Returns true if field entityType is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityType() {
    return this.entityType != null;
  }

  public void setEntityTypeIsSet(boolean value) {
    if (!value) {
      this.entityType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case PARTIALS:
      if (value == null) {
        unsetPartials();
      } else {
        setPartials((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((DasParameters)value);
      }
      break;

    case DEFINITIONS:
      if (value == null) {
        unsetDefinitions();
      } else {
        setDefinitions((java.util.List<DasParameterDefinition>)value);
      }
      break;

    case ENTITY_META:
      if (value == null) {
        unsetEntityMeta();
      } else {
        setEntityMeta((EntityMeta)value);
      }
      break;

    case NULLABLE:
      if (value == null) {
        unsetNullable();
      } else {
        setNullable((Boolean)value);
      }
      break;

    case ENTITY_TYPE:
      if (value == null) {
        unsetEntityType();
      } else {
        setEntityType((String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTIALS:
      return getPartials();

    case PARAMETERS:
      return getParameters();

    case DEFINITIONS:
      return getDefinitions();

    case ENTITY_META:
      return getEntityMeta();

    case NULLABLE:
      return isNullable();

    case ENTITY_TYPE:
      return getEntityType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTIALS:
      return isSetPartials();
    case PARAMETERS:
      return isSetParameters();
    case DEFINITIONS:
      return isSetDefinitions();
    case ENTITY_META:
      return isSetEntityMeta();
    case NULLABLE:
      return isSetNullable();
    case ENTITY_TYPE:
      return isSetEntityType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) {
        return false;
    }
    if (that instanceof DasSqlBuilder) {
        return this.equals((DasSqlBuilder)that);
    }
    return false;
  }

  public boolean equals(DasSqlBuilder that) {
    if (that == null) {
        return false;
    }
    if (this == that) {
        return true;
    }

    boolean this_present_partials = true && this.isSetPartials();
    boolean that_present_partials = true && that.isSetPartials();
    if (this_present_partials || that_present_partials) {
      if (!(this_present_partials && that_present_partials)) {
          return false;
      }
      if (!this.partials.equals(that.partials)) {
          return false;
      }
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters)) {
          return false;
      }
      if (!this.parameters.equals(that.parameters)) {
          return false;
      }
    }

    boolean this_present_definitions = true && this.isSetDefinitions();
    boolean that_present_definitions = true && that.isSetDefinitions();
    if (this_present_definitions || that_present_definitions) {
      if (!(this_present_definitions && that_present_definitions)) {
          return false;
      }
      if (!this.definitions.equals(that.definitions)) {
          return false;
      }
    }

    boolean this_present_entityMeta = true && this.isSetEntityMeta();
    boolean that_present_entityMeta = true && that.isSetEntityMeta();
    if (this_present_entityMeta || that_present_entityMeta) {
      if (!(this_present_entityMeta && that_present_entityMeta)) {
          return false;
      }
      if (!this.entityMeta.equals(that.entityMeta)) {
          return false;
      }
    }

    boolean this_present_nullable = true;
    boolean that_present_nullable = true;
    if (this_present_nullable || that_present_nullable) {
      if (!(this_present_nullable && that_present_nullable)) {
          return false;
      }
      if (this.nullable != that.nullable) {
          return false;
      }
    }

    boolean this_present_entityType = true && this.isSetEntityType();
    boolean that_present_entityType = true && that.isSetEntityType();
    if (this_present_entityType || that_present_entityType) {
      if (!(this_present_entityType && that_present_entityType)) {
          return false;
      }
      if (!this.entityType.equals(that.entityType)) {
          return false;
      }
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartials()) ? 131071 : 524287);
    if (isSetPartials()) {
        hashCode = hashCode * 8191 + partials.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetParameters()) ? 131071 : 524287);
    if (isSetParameters()) {
        hashCode = hashCode * 8191 + parameters.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetDefinitions()) ? 131071 : 524287);
    if (isSetDefinitions()) {
        hashCode = hashCode * 8191 + definitions.hashCode();
    }

    hashCode = hashCode * 8191 + ((isSetEntityMeta()) ? 131071 : 524287);
    if (isSetEntityMeta()) {
        hashCode = hashCode * 8191 + entityMeta.hashCode();
    }

    hashCode = hashCode * 8191 + ((nullable) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetEntityType()) ? 131071 : 524287);
    if (isSetEntityType()) {
        hashCode = hashCode * 8191 + entityType.hashCode();
    }

    return hashCode;
  }

  @Override
  public int compareTo(DasSqlBuilder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartials()).compareTo(other.isSetPartials());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartials()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partials, other.partials);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameters()).compareTo(other.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, other.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefinitions()).compareTo(other.isSetDefinitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefinitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.definitions, other.definitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityMeta()).compareTo(other.isSetEntityMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityMeta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityMeta, other.entityMeta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNullable()).compareTo(other.isSetNullable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nullable, other.nullable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityType()).compareTo(other.isSetEntityType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityType, other.entityType);
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
  public String toString() {
    StringBuilder sb = new StringBuilder("DasSqlBuilder(");
    boolean first = true;

    if (isSetPartials()) {
      sb.append("partials:");
      if (this.partials == null) {
        sb.append("null");
      } else {
        sb.append(this.partials);
      }
      first = false;
    }
    if (isSetParameters()) {
      if (!first) {
          sb.append(", ");
      }
      sb.append("parameters:");
      if (this.parameters == null) {
        sb.append("null");
      } else {
        sb.append(this.parameters);
      }
      first = false;
    }
    if (isSetDefinitions()) {
      if (!first) {
          sb.append(", ");
      }
      sb.append("definitions:");
      if (this.definitions == null) {
        sb.append("null");
      } else {
        sb.append(this.definitions);
      }
      first = false;
    }
    if (isSetEntityMeta()) {
      if (!first) {
          sb.append(", ");
      }
      sb.append("entityMeta:");
      if (this.entityMeta == null) {
        sb.append("null");
      } else {
        sb.append(this.entityMeta);
      }
      first = false;
    }
    if (!first) {
        sb.append(", ");
    }
    sb.append("nullable:");
    sb.append(this.nullable);
    first = false;
    if (isSetEntityType()) {
      if (!first) {
          sb.append(", ");
      }
      sb.append("entityType:");
      if (this.entityType == null) {
        sb.append("null");
      } else {
        sb.append(this.entityType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'nullable' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (entityMeta != null) {
      entityMeta.validate();
    }
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

  private static class DasSqlBuilderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasSqlBuilderStandardScheme getScheme() {
      return new DasSqlBuilderStandardScheme();
    }
  }

  private static class DasSqlBuilderStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasSqlBuilder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasSqlBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTIALS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partials = iprot.readString();
              struct.setPartialsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.parameters = new DasParameters();
              struct.parameters.read(iprot);
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEFINITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list110 = iprot.readListBegin();
                struct.definitions = new java.util.ArrayList<DasParameterDefinition>(_list110.size);
                @org.apache.thrift.annotation.Nullable DasParameterDefinition _elem111;
                for (int _i112 = 0; _i112 < _list110.size; ++_i112)
                {
                  _elem111 = new DasParameterDefinition();
                  _elem111.read(iprot);
                  struct.definitions.add(_elem111);
                }
                iprot.readListEnd();
              }
              struct.setDefinitionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENTITY_META
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entityMeta = new EntityMeta();
              struct.entityMeta.read(iprot);
              struct.setEntityMetaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NULLABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.nullable = iprot.readBool();
              struct.setNullableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENTITY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entityType = iprot.readString();
              struct.setEntityTypeIsSet(true);
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
      if (!struct.isSetNullable()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nullable' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasSqlBuilder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partials != null) {
        if (struct.isSetPartials()) {
          oprot.writeFieldBegin(PARTIALS_FIELD_DESC);
          oprot.writeString(struct.partials);
          oprot.writeFieldEnd();
        }
      }
      if (struct.parameters != null) {
        if (struct.isSetParameters()) {
          oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
          struct.parameters.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.definitions != null) {
        if (struct.isSetDefinitions()) {
          oprot.writeFieldBegin(DEFINITIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.definitions.size()));
            for (DasParameterDefinition _iter113 : struct.definitions)
            {
              _iter113.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.entityMeta != null) {
        if (struct.isSetEntityMeta()) {
          oprot.writeFieldBegin(ENTITY_META_FIELD_DESC);
          struct.entityMeta.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(NULLABLE_FIELD_DESC);
      oprot.writeBool(struct.nullable);
      oprot.writeFieldEnd();
      if (struct.entityType != null) {
        if (struct.isSetEntityType()) {
          oprot.writeFieldBegin(ENTITY_TYPE_FIELD_DESC);
          oprot.writeString(struct.entityType);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasSqlBuilderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasSqlBuilderTupleScheme getScheme() {
      return new DasSqlBuilderTupleScheme();
    }
  }

  private static class DasSqlBuilderTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasSqlBuilder> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasSqlBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.nullable);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartials()) {
        optionals.set(0);
      }
      if (struct.isSetParameters()) {
        optionals.set(1);
      }
      if (struct.isSetDefinitions()) {
        optionals.set(2);
      }
      if (struct.isSetEntityMeta()) {
        optionals.set(3);
      }
      if (struct.isSetEntityType()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPartials()) {
        oprot.writeString(struct.partials);
      }
      if (struct.isSetParameters()) {
        struct.parameters.write(oprot);
      }
      if (struct.isSetDefinitions()) {
        {
          oprot.writeI32(struct.definitions.size());
          for (DasParameterDefinition _iter114 : struct.definitions)
          {
            _iter114.write(oprot);
          }
        }
      }
      if (struct.isSetEntityMeta()) {
        struct.entityMeta.write(oprot);
      }
      if (struct.isSetEntityType()) {
        oprot.writeString(struct.entityType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasSqlBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.nullable = iprot.readBool();
      struct.setNullableIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.partials = iprot.readString();
        struct.setPartialsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.parameters = new DasParameters();
        struct.parameters.read(iprot);
        struct.setParametersIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list115 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.definitions = new java.util.ArrayList<DasParameterDefinition>(_list115.size);
          @org.apache.thrift.annotation.Nullable DasParameterDefinition _elem116;
          for (int _i117 = 0; _i117 < _list115.size; ++_i117)
          {
            _elem116 = new DasParameterDefinition();
            _elem116.read(iprot);
            struct.definitions.add(_elem116);
          }
        }
        struct.setDefinitionsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.entityMeta = new EntityMeta();
        struct.entityMeta.read(iprot);
        struct.setEntityMetaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.entityType = iprot.readString();
        struct.setEntityTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

