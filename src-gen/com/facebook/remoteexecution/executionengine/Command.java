/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class Command implements org.apache.thrift.TBase<Command, Command._Fields>, java.io.Serializable, Cloneable, Comparable<Command> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Command");

  private static final org.apache.thrift.protocol.TField ARGUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("arguments", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ENVIRONMENT_VARIABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("environment_variables", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CommandStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CommandTupleSchemeFactory();

  public java.util.List<java.lang.String> arguments; // required
  public java.util.List<EnvironmentVariable> environment_variables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ARGUMENTS((short)1, "arguments"),
    ENVIRONMENT_VARIABLES((short)2, "environment_variables");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ARGUMENTS
          return ARGUMENTS;
        case 2: // ENVIRONMENT_VARIABLES
          return ENVIRONMENT_VARIABLES;
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
    tmpMap.put(_Fields.ARGUMENTS, new org.apache.thrift.meta_data.FieldMetaData("arguments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ENVIRONMENT_VARIABLES, new org.apache.thrift.meta_data.FieldMetaData("environment_variables", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EnvironmentVariable.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Command.class, metaDataMap);
  }

  public Command() {
  }

  public Command(
    java.util.List<java.lang.String> arguments,
    java.util.List<EnvironmentVariable> environment_variables)
  {
    this();
    this.arguments = arguments;
    this.environment_variables = environment_variables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Command(Command other) {
    if (other.isSetArguments()) {
      java.util.List<java.lang.String> __this__arguments = new java.util.ArrayList<java.lang.String>(other.arguments);
      this.arguments = __this__arguments;
    }
    if (other.isSetEnvironment_variables()) {
      java.util.List<EnvironmentVariable> __this__environment_variables = new java.util.ArrayList<EnvironmentVariable>(other.environment_variables.size());
      for (EnvironmentVariable other_element : other.environment_variables) {
        __this__environment_variables.add(new EnvironmentVariable(other_element));
      }
      this.environment_variables = __this__environment_variables;
    }
  }

  public Command deepCopy() {
    return new Command(this);
  }

  @Override
  public void clear() {
    this.arguments = null;
    this.environment_variables = null;
  }

  public int getArgumentsSize() {
    return (this.arguments == null) ? 0 : this.arguments.size();
  }

  public java.util.Iterator<java.lang.String> getArgumentsIterator() {
    return (this.arguments == null) ? null : this.arguments.iterator();
  }

  public void addToArguments(java.lang.String elem) {
    if (this.arguments == null) {
      this.arguments = new java.util.ArrayList<java.lang.String>();
    }
    this.arguments.add(elem);
  }

  public java.util.List<java.lang.String> getArguments() {
    return this.arguments;
  }

  public Command setArguments(java.util.List<java.lang.String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public void unsetArguments() {
    this.arguments = null;
  }

  /** Returns true if field arguments is set (has been assigned a value) and false otherwise */
  public boolean isSetArguments() {
    return this.arguments != null;
  }

  public void setArgumentsIsSet(boolean value) {
    if (!value) {
      this.arguments = null;
    }
  }

  public int getEnvironment_variablesSize() {
    return (this.environment_variables == null) ? 0 : this.environment_variables.size();
  }

  public java.util.Iterator<EnvironmentVariable> getEnvironment_variablesIterator() {
    return (this.environment_variables == null) ? null : this.environment_variables.iterator();
  }

  public void addToEnvironment_variables(EnvironmentVariable elem) {
    if (this.environment_variables == null) {
      this.environment_variables = new java.util.ArrayList<EnvironmentVariable>();
    }
    this.environment_variables.add(elem);
  }

  public java.util.List<EnvironmentVariable> getEnvironment_variables() {
    return this.environment_variables;
  }

  public Command setEnvironment_variables(java.util.List<EnvironmentVariable> environment_variables) {
    this.environment_variables = environment_variables;
    return this;
  }

  public void unsetEnvironment_variables() {
    this.environment_variables = null;
  }

  /** Returns true if field environment_variables is set (has been assigned a value) and false otherwise */
  public boolean isSetEnvironment_variables() {
    return this.environment_variables != null;
  }

  public void setEnvironment_variablesIsSet(boolean value) {
    if (!value) {
      this.environment_variables = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ARGUMENTS:
      if (value == null) {
        unsetArguments();
      } else {
        setArguments((java.util.List<java.lang.String>)value);
      }
      break;

    case ENVIRONMENT_VARIABLES:
      if (value == null) {
        unsetEnvironment_variables();
      } else {
        setEnvironment_variables((java.util.List<EnvironmentVariable>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ARGUMENTS:
      return getArguments();

    case ENVIRONMENT_VARIABLES:
      return getEnvironment_variables();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ARGUMENTS:
      return isSetArguments();
    case ENVIRONMENT_VARIABLES:
      return isSetEnvironment_variables();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Command)
      return this.equals((Command)that);
    return false;
  }

  public boolean equals(Command that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_arguments = true && this.isSetArguments();
    boolean that_present_arguments = true && that.isSetArguments();
    if (this_present_arguments || that_present_arguments) {
      if (!(this_present_arguments && that_present_arguments))
        return false;
      if (!this.arguments.equals(that.arguments))
        return false;
    }

    boolean this_present_environment_variables = true && this.isSetEnvironment_variables();
    boolean that_present_environment_variables = true && that.isSetEnvironment_variables();
    if (this_present_environment_variables || that_present_environment_variables) {
      if (!(this_present_environment_variables && that_present_environment_variables))
        return false;
      if (!this.environment_variables.equals(that.environment_variables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetArguments()) ? 131071 : 524287);
    if (isSetArguments())
      hashCode = hashCode * 8191 + arguments.hashCode();

    hashCode = hashCode * 8191 + ((isSetEnvironment_variables()) ? 131071 : 524287);
    if (isSetEnvironment_variables())
      hashCode = hashCode * 8191 + environment_variables.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Command other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetArguments()).compareTo(other.isSetArguments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArguments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arguments, other.arguments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEnvironment_variables()).compareTo(other.isSetEnvironment_variables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnvironment_variables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.environment_variables, other.environment_variables);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Command(");
    boolean first = true;

    sb.append("arguments:");
    if (this.arguments == null) {
      sb.append("null");
    } else {
      sb.append(this.arguments);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("environment_variables:");
    if (this.environment_variables == null) {
      sb.append("null");
    } else {
      sb.append(this.environment_variables);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommandStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommandStandardScheme getScheme() {
      return new CommandStandardScheme();
    }
  }

  private static class CommandStandardScheme extends org.apache.thrift.scheme.StandardScheme<Command> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Command struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ARGUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.arguments = new java.util.ArrayList<java.lang.String>(_list64.size);
                java.lang.String _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = iprot.readString();
                  struct.arguments.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setArgumentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENVIRONMENT_VARIABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list67 = iprot.readListBegin();
                struct.environment_variables = new java.util.ArrayList<EnvironmentVariable>(_list67.size);
                EnvironmentVariable _elem68;
                for (int _i69 = 0; _i69 < _list67.size; ++_i69)
                {
                  _elem68 = new EnvironmentVariable();
                  _elem68.read(iprot);
                  struct.environment_variables.add(_elem68);
                }
                iprot.readListEnd();
              }
              struct.setEnvironment_variablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Command struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.arguments != null) {
        oprot.writeFieldBegin(ARGUMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.arguments.size()));
          for (java.lang.String _iter70 : struct.arguments)
          {
            oprot.writeString(_iter70);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.environment_variables != null) {
        oprot.writeFieldBegin(ENVIRONMENT_VARIABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.environment_variables.size()));
          for (EnvironmentVariable _iter71 : struct.environment_variables)
          {
            _iter71.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommandTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommandTupleScheme getScheme() {
      return new CommandTupleScheme();
    }
  }

  private static class CommandTupleScheme extends org.apache.thrift.scheme.TupleScheme<Command> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetArguments()) {
        optionals.set(0);
      }
      if (struct.isSetEnvironment_variables()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetArguments()) {
        {
          oprot.writeI32(struct.arguments.size());
          for (java.lang.String _iter72 : struct.arguments)
          {
            oprot.writeString(_iter72);
          }
        }
      }
      if (struct.isSetEnvironment_variables()) {
        {
          oprot.writeI32(struct.environment_variables.size());
          for (EnvironmentVariable _iter73 : struct.environment_variables)
          {
            _iter73.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Command struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list74 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.arguments = new java.util.ArrayList<java.lang.String>(_list74.size);
          java.lang.String _elem75;
          for (int _i76 = 0; _i76 < _list74.size; ++_i76)
          {
            _elem75 = iprot.readString();
            struct.arguments.add(_elem75);
          }
        }
        struct.setArgumentsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list77 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.environment_variables = new java.util.ArrayList<EnvironmentVariable>(_list77.size);
          EnvironmentVariable _elem78;
          for (int _i79 = 0; _i79 < _list77.size; ++_i79)
          {
            _elem78 = new EnvironmentVariable();
            _elem78.read(iprot);
            struct.environment_variables.add(_elem78);
          }
        }
        struct.setEnvironment_variablesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

