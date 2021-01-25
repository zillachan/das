/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2020-11-13")
public class DasBatchCallBuilder implements org.apache.thrift.TBase<DasBatchCallBuilder, DasBatchCallBuilder._Fields>, java.io.Serializable, Cloneable, Comparable<DasBatchCallBuilder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasBatchCallBuilder");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField VALUES_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("valuesList", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasBatchCallBuilderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasBatchCallBuilderTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<DasParameterDefinition> parameters; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<String>> valuesList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    PARAMETERS((short)2, "parameters"),
    VALUES_LIST((short)3, "valuesList");

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
        case 1: // NAME
          return NAME;
        case 2: // PARAMETERS
          return PARAMETERS;
        case 3: // VALUES_LIST
          return VALUES_LIST;
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
  private static final _Fields optionals[] = {_Fields.PARAMETERS,_Fields.VALUES_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "DasParameterDefinition"))));
    tmpMap.put(_Fields.VALUES_LIST, new org.apache.thrift.meta_data.FieldMetaData("valuesList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasBatchCallBuilder.class, metaDataMap);
  }

  public DasBatchCallBuilder() {
  }

  public DasBatchCallBuilder(
    String name)
  {
    this();
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasBatchCallBuilder(DasBatchCallBuilder other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetParameters()) {
      java.util.List<DasParameterDefinition> __this__parameters = new java.util.ArrayList<DasParameterDefinition>(other.parameters.size());
      for (DasParameterDefinition other_element : other.parameters) {
        __this__parameters.add(new DasParameterDefinition(other_element));
      }
      this.parameters = __this__parameters;
    }
    if (other.isSetValuesList()) {
      java.util.List<java.util.List<String>> __this__valuesList = new java.util.ArrayList<java.util.List<String>>(other.valuesList.size());
      for (java.util.List<String> other_element : other.valuesList) {
        java.util.List<String> __this__valuesList_copy = new java.util.ArrayList<String>(other_element);
        __this__valuesList.add(__this__valuesList_copy);
      }
      this.valuesList = __this__valuesList;
    }
  }

  public DasBatchCallBuilder deepCopy() {
    return new DasBatchCallBuilder(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.parameters = null;
    this.valuesList = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getName() {
    return this.name;
  }

  public DasBatchCallBuilder setName(@org.apache.thrift.annotation.Nullable String name) {
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

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<DasParameterDefinition> getParametersIterator() {
    return (this.parameters == null) ? null : this.parameters.iterator();
  }

  public void addToParameters(DasParameterDefinition elem) {
    if (this.parameters == null) {
      this.parameters = new java.util.ArrayList<DasParameterDefinition>();
    }
    this.parameters.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<DasParameterDefinition> getParameters() {
    return this.parameters;
  }

  public DasBatchCallBuilder setParameters(@org.apache.thrift.annotation.Nullable java.util.List<DasParameterDefinition> parameters) {
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

  public int getValuesListSize() {
    return (this.valuesList == null) ? 0 : this.valuesList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<String>> getValuesListIterator() {
    return (this.valuesList == null) ? null : this.valuesList.iterator();
  }

  public void addToValuesList(java.util.List<String> elem) {
    if (this.valuesList == null) {
      this.valuesList = new java.util.ArrayList<java.util.List<String>>();
    }
    this.valuesList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<String>> getValuesList() {
    return this.valuesList;
  }

  public DasBatchCallBuilder setValuesList(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<String>> valuesList) {
    this.valuesList = valuesList;
    return this;
  }

  public void unsetValuesList() {
    this.valuesList = null;
  }

  /** Returns true if field valuesList is set (has been assigned a value) and false otherwise */
  public boolean isSetValuesList() {
    return this.valuesList != null;
  }

  public void setValuesListIsSet(boolean value) {
    if (!value) {
      this.valuesList = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((java.util.List<DasParameterDefinition>)value);
      }
      break;

    case VALUES_LIST:
      if (value == null) {
        unsetValuesList();
      } else {
        setValuesList((java.util.List<java.util.List<String>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case PARAMETERS:
      return getParameters();

    case VALUES_LIST:
      return getValuesList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case PARAMETERS:
      return isSetParameters();
    case VALUES_LIST:
      return isSetValuesList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DasBatchCallBuilder)
      return this.equals((DasBatchCallBuilder)that);
    return false;
  }

  public boolean equals(DasBatchCallBuilder that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_valuesList = true && this.isSetValuesList();
    boolean that_present_valuesList = true && that.isSetValuesList();
    if (this_present_valuesList || that_present_valuesList) {
      if (!(this_present_valuesList && that_present_valuesList))
        return false;
      if (!this.valuesList.equals(that.valuesList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetParameters()) ? 131071 : 524287);
    if (isSetParameters())
      hashCode = hashCode * 8191 + parameters.hashCode();

    hashCode = hashCode * 8191 + ((isSetValuesList()) ? 131071 : 524287);
    if (isSetValuesList())
      hashCode = hashCode * 8191 + valuesList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasBatchCallBuilder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
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
    lastComparison = Boolean.valueOf(isSetValuesList()).compareTo(other.isSetValuesList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValuesList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valuesList, other.valuesList);
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
    StringBuilder sb = new StringBuilder("DasBatchCallBuilder(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetParameters()) {
      if (!first) sb.append(", ");
      sb.append("parameters:");
      if (this.parameters == null) {
        sb.append("null");
      } else {
        sb.append(this.parameters);
      }
      first = false;
    }
    if (isSetValuesList()) {
      if (!first) sb.append(", ");
      sb.append("valuesList:");
      if (this.valuesList == null) {
        sb.append("null");
      } else {
        sb.append(this.valuesList);
      }
      first = false;
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DasBatchCallBuilderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasBatchCallBuilderStandardScheme getScheme() {
      return new DasBatchCallBuilderStandardScheme();
    }
  }

  private static class DasBatchCallBuilderStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasBatchCallBuilder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasBatchCallBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list126 = iprot.readListBegin();
                struct.parameters = new java.util.ArrayList<DasParameterDefinition>(_list126.size);
                @org.apache.thrift.annotation.Nullable DasParameterDefinition _elem127;
                for (int _i128 = 0; _i128 < _list126.size; ++_i128)
                {
                  _elem127 = new DasParameterDefinition();
                  _elem127.read(iprot);
                  struct.parameters.add(_elem127);
                }
                iprot.readListEnd();
              }
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUES_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list129 = iprot.readListBegin();
                struct.valuesList = new java.util.ArrayList<java.util.List<String>>(_list129.size);
                @org.apache.thrift.annotation.Nullable java.util.List<String> _elem130;
                for (int _i131 = 0; _i131 < _list129.size; ++_i131)
                {
                  {
                    org.apache.thrift.protocol.TList _list132 = iprot.readListBegin();
                    _elem130 = new java.util.ArrayList<String>(_list132.size);
                    @org.apache.thrift.annotation.Nullable String _elem133;
                    for (int _i134 = 0; _i134 < _list132.size; ++_i134)
                    {
                      _elem133 = iprot.readString();
                      _elem130.add(_elem133);
                    }
                    iprot.readListEnd();
                  }
                  struct.valuesList.add(_elem130);
                }
                iprot.readListEnd();
              }
              struct.setValuesListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasBatchCallBuilder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        if (struct.isSetParameters()) {
          oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.parameters.size()));
            for (DasParameterDefinition _iter135 : struct.parameters)
            {
              _iter135.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.valuesList != null) {
        if (struct.isSetValuesList()) {
          oprot.writeFieldBegin(VALUES_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.valuesList.size()));
            for (java.util.List<String> _iter136 : struct.valuesList)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter136.size()));
                for (String _iter137 : _iter136)
                {
                  oprot.writeString(_iter137);
                }
                oprot.writeListEnd();
              }
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

  private static class DasBatchCallBuilderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasBatchCallBuilderTupleScheme getScheme() {
      return new DasBatchCallBuilderTupleScheme();
    }
  }

  private static class DasBatchCallBuilderTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasBatchCallBuilder> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasBatchCallBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetParameters()) {
        optionals.set(1);
      }
      if (struct.isSetValuesList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (DasParameterDefinition _iter138 : struct.parameters)
          {
            _iter138.write(oprot);
          }
        }
      }
      if (struct.isSetValuesList()) {
        {
          oprot.writeI32(struct.valuesList.size());
          for (java.util.List<String> _iter139 : struct.valuesList)
          {
            {
              oprot.writeI32(_iter139.size());
              for (String _iter140 : _iter139)
              {
                oprot.writeString(_iter140);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasBatchCallBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list141 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.parameters = new java.util.ArrayList<DasParameterDefinition>(_list141.size);
          @org.apache.thrift.annotation.Nullable DasParameterDefinition _elem142;
          for (int _i143 = 0; _i143 < _list141.size; ++_i143)
          {
            _elem142 = new DasParameterDefinition();
            _elem142.read(iprot);
            struct.parameters.add(_elem142);
          }
        }
        struct.setParametersIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list144 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.valuesList = new java.util.ArrayList<java.util.List<String>>(_list144.size);
          @org.apache.thrift.annotation.Nullable java.util.List<String> _elem145;
          for (int _i146 = 0; _i146 < _list144.size; ++_i146)
          {
            {
              org.apache.thrift.protocol.TList _list147 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _elem145 = new java.util.ArrayList<String>(_list147.size);
              @org.apache.thrift.annotation.Nullable String _elem148;
              for (int _i149 = 0; _i149 < _list147.size; ++_i149)
              {
                _elem148 = iprot.readString();
                _elem145.add(_elem148);
              }
            }
            struct.valuesList.add(_elem145);
          }
        }
        struct.setValuesListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

