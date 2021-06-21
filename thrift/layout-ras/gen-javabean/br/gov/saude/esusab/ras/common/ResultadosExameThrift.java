/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.common;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-06-21")
public class ResultadosExameThrift implements org.apache.thrift.TBase<ResultadosExameThrift, ResultadosExameThrift._Fields>, java.io.Serializable, Cloneable, Comparable<ResultadosExameThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultadosExameThrift");

  private static final org.apache.thrift.protocol.TField EXAME_FIELD_DESC = new org.apache.thrift.protocol.TField("exame", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_SOLICITACAO_FIELD_DESC = new org.apache.thrift.protocol.TField("dataSolicitacao", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_REALIZACAO_FIELD_DESC = new org.apache.thrift.protocol.TField("dataRealizacao", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_RESULTADO_FIELD_DESC = new org.apache.thrift.protocol.TField("dataResultado", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RESULTADO_EXAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resultadoExame", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultadosExameThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultadosExameThriftTupleSchemeFactory());
  }

  private String exame; // optional
  private long dataSolicitacao; // optional
  private long dataRealizacao; // optional
  private long dataResultado; // optional
  private List<ResultadoExameThrift> resultadoExame; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXAME((short)1, "exame"),
    DATA_SOLICITACAO((short)2, "dataSolicitacao"),
    DATA_REALIZACAO((short)3, "dataRealizacao"),
    DATA_RESULTADO((short)4, "dataResultado"),
    RESULTADO_EXAME((short)6, "resultadoExame");

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
        case 1: // EXAME
          return EXAME;
        case 2: // DATA_SOLICITACAO
          return DATA_SOLICITACAO;
        case 3: // DATA_REALIZACAO
          return DATA_REALIZACAO;
        case 4: // DATA_RESULTADO
          return DATA_RESULTADO;
        case 6: // RESULTADO_EXAME
          return RESULTADO_EXAME;
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
  private static final int __DATASOLICITACAO_ISSET_ID = 0;
  private static final int __DATAREALIZACAO_ISSET_ID = 1;
  private static final int __DATARESULTADO_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXAME,_Fields.DATA_SOLICITACAO,_Fields.DATA_REALIZACAO,_Fields.DATA_RESULTADO,_Fields.RESULTADO_EXAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXAME, new org.apache.thrift.meta_data.FieldMetaData("exame", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA_SOLICITACAO, new org.apache.thrift.meta_data.FieldMetaData("dataSolicitacao", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA_REALIZACAO, new org.apache.thrift.meta_data.FieldMetaData("dataRealizacao", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA_RESULTADO, new org.apache.thrift.meta_data.FieldMetaData("dataResultado", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RESULTADO_EXAME, new org.apache.thrift.meta_data.FieldMetaData("resultadoExame", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResultadoExameThrift.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultadosExameThrift.class, metaDataMap);
  }

  public ResultadosExameThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResultadosExameThrift(ResultadosExameThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExame()) {
      this.exame = other.exame;
    }
    this.dataSolicitacao = other.dataSolicitacao;
    this.dataRealizacao = other.dataRealizacao;
    this.dataResultado = other.dataResultado;
    if (other.isSetResultadoExame()) {
      List<ResultadoExameThrift> __this__resultadoExame = new ArrayList<ResultadoExameThrift>(other.resultadoExame.size());
      for (ResultadoExameThrift other_element : other.resultadoExame) {
        __this__resultadoExame.add(new ResultadoExameThrift(other_element));
      }
      this.resultadoExame = __this__resultadoExame;
    }
  }

  public ResultadosExameThrift deepCopy() {
    return new ResultadosExameThrift(this);
  }

  @Override
  public void clear() {
    this.exame = null;
    setDataSolicitacaoIsSet(false);
    this.dataSolicitacao = 0;
    setDataRealizacaoIsSet(false);
    this.dataRealizacao = 0;
    setDataResultadoIsSet(false);
    this.dataResultado = 0;
    this.resultadoExame = null;
  }

  public String getExame() {
    return this.exame;
  }

  public void setExame(String exame) {
    this.exame = exame;
  }

  public void unsetExame() {
    this.exame = null;
  }

  /** Returns true if field exame is set (has been assigned a value) and false otherwise */
  public boolean isSetExame() {
    return this.exame != null;
  }

  public void setExameIsSet(boolean value) {
    if (!value) {
      this.exame = null;
    }
  }

  public long getDataSolicitacao() {
    return this.dataSolicitacao;
  }

  public void setDataSolicitacao(long dataSolicitacao) {
    this.dataSolicitacao = dataSolicitacao;
    setDataSolicitacaoIsSet(true);
  }

  public void unsetDataSolicitacao() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATASOLICITACAO_ISSET_ID);
  }

  /** Returns true if field dataSolicitacao is set (has been assigned a value) and false otherwise */
  public boolean isSetDataSolicitacao() {
    return EncodingUtils.testBit(__isset_bitfield, __DATASOLICITACAO_ISSET_ID);
  }

  public void setDataSolicitacaoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATASOLICITACAO_ISSET_ID, value);
  }

  public long getDataRealizacao() {
    return this.dataRealizacao;
  }

  public void setDataRealizacao(long dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
    setDataRealizacaoIsSet(true);
  }

  public void unsetDataRealizacao() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATAREALIZACAO_ISSET_ID);
  }

  /** Returns true if field dataRealizacao is set (has been assigned a value) and false otherwise */
  public boolean isSetDataRealizacao() {
    return EncodingUtils.testBit(__isset_bitfield, __DATAREALIZACAO_ISSET_ID);
  }

  public void setDataRealizacaoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATAREALIZACAO_ISSET_ID, value);
  }

  public long getDataResultado() {
    return this.dataResultado;
  }

  public void setDataResultado(long dataResultado) {
    this.dataResultado = dataResultado;
    setDataResultadoIsSet(true);
  }

  public void unsetDataResultado() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATARESULTADO_ISSET_ID);
  }

  /** Returns true if field dataResultado is set (has been assigned a value) and false otherwise */
  public boolean isSetDataResultado() {
    return EncodingUtils.testBit(__isset_bitfield, __DATARESULTADO_ISSET_ID);
  }

  public void setDataResultadoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATARESULTADO_ISSET_ID, value);
  }

  public int getResultadoExameSize() {
    return (this.resultadoExame == null) ? 0 : this.resultadoExame.size();
  }

  public java.util.Iterator<ResultadoExameThrift> getResultadoExameIterator() {
    return (this.resultadoExame == null) ? null : this.resultadoExame.iterator();
  }

  public void addToResultadoExame(ResultadoExameThrift elem) {
    if (this.resultadoExame == null) {
      this.resultadoExame = new ArrayList<ResultadoExameThrift>();
    }
    this.resultadoExame.add(elem);
  }

  public List<ResultadoExameThrift> getResultadoExame() {
    return this.resultadoExame;
  }

  public void setResultadoExame(List<ResultadoExameThrift> resultadoExame) {
    this.resultadoExame = resultadoExame;
  }

  public void unsetResultadoExame() {
    this.resultadoExame = null;
  }

  /** Returns true if field resultadoExame is set (has been assigned a value) and false otherwise */
  public boolean isSetResultadoExame() {
    return this.resultadoExame != null;
  }

  public void setResultadoExameIsSet(boolean value) {
    if (!value) {
      this.resultadoExame = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXAME:
      if (value == null) {
        unsetExame();
      } else {
        setExame((String)value);
      }
      break;

    case DATA_SOLICITACAO:
      if (value == null) {
        unsetDataSolicitacao();
      } else {
        setDataSolicitacao((Long)value);
      }
      break;

    case DATA_REALIZACAO:
      if (value == null) {
        unsetDataRealizacao();
      } else {
        setDataRealizacao((Long)value);
      }
      break;

    case DATA_RESULTADO:
      if (value == null) {
        unsetDataResultado();
      } else {
        setDataResultado((Long)value);
      }
      break;

    case RESULTADO_EXAME:
      if (value == null) {
        unsetResultadoExame();
      } else {
        setResultadoExame((List<ResultadoExameThrift>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXAME:
      return getExame();

    case DATA_SOLICITACAO:
      return getDataSolicitacao();

    case DATA_REALIZACAO:
      return getDataRealizacao();

    case DATA_RESULTADO:
      return getDataResultado();

    case RESULTADO_EXAME:
      return getResultadoExame();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXAME:
      return isSetExame();
    case DATA_SOLICITACAO:
      return isSetDataSolicitacao();
    case DATA_REALIZACAO:
      return isSetDataRealizacao();
    case DATA_RESULTADO:
      return isSetDataResultado();
    case RESULTADO_EXAME:
      return isSetResultadoExame();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResultadosExameThrift)
      return this.equals((ResultadosExameThrift)that);
    return false;
  }

  public boolean equals(ResultadosExameThrift that) {
    if (that == null)
      return false;

    boolean this_present_exame = true && this.isSetExame();
    boolean that_present_exame = true && that.isSetExame();
    if (this_present_exame || that_present_exame) {
      if (!(this_present_exame && that_present_exame))
        return false;
      if (!this.exame.equals(that.exame))
        return false;
    }

    boolean this_present_dataSolicitacao = true && this.isSetDataSolicitacao();
    boolean that_present_dataSolicitacao = true && that.isSetDataSolicitacao();
    if (this_present_dataSolicitacao || that_present_dataSolicitacao) {
      if (!(this_present_dataSolicitacao && that_present_dataSolicitacao))
        return false;
      if (this.dataSolicitacao != that.dataSolicitacao)
        return false;
    }

    boolean this_present_dataRealizacao = true && this.isSetDataRealizacao();
    boolean that_present_dataRealizacao = true && that.isSetDataRealizacao();
    if (this_present_dataRealizacao || that_present_dataRealizacao) {
      if (!(this_present_dataRealizacao && that_present_dataRealizacao))
        return false;
      if (this.dataRealizacao != that.dataRealizacao)
        return false;
    }

    boolean this_present_dataResultado = true && this.isSetDataResultado();
    boolean that_present_dataResultado = true && that.isSetDataResultado();
    if (this_present_dataResultado || that_present_dataResultado) {
      if (!(this_present_dataResultado && that_present_dataResultado))
        return false;
      if (this.dataResultado != that.dataResultado)
        return false;
    }

    boolean this_present_resultadoExame = true && this.isSetResultadoExame();
    boolean that_present_resultadoExame = true && that.isSetResultadoExame();
    if (this_present_resultadoExame || that_present_resultadoExame) {
      if (!(this_present_resultadoExame && that_present_resultadoExame))
        return false;
      if (!this.resultadoExame.equals(that.resultadoExame))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exame = true && (isSetExame());
    list.add(present_exame);
    if (present_exame)
      list.add(exame);

    boolean present_dataSolicitacao = true && (isSetDataSolicitacao());
    list.add(present_dataSolicitacao);
    if (present_dataSolicitacao)
      list.add(dataSolicitacao);

    boolean present_dataRealizacao = true && (isSetDataRealizacao());
    list.add(present_dataRealizacao);
    if (present_dataRealizacao)
      list.add(dataRealizacao);

    boolean present_dataResultado = true && (isSetDataResultado());
    list.add(present_dataResultado);
    if (present_dataResultado)
      list.add(dataResultado);

    boolean present_resultadoExame = true && (isSetResultadoExame());
    list.add(present_resultadoExame);
    if (present_resultadoExame)
      list.add(resultadoExame);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResultadosExameThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExame()).compareTo(other.isSetExame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exame, other.exame);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataSolicitacao()).compareTo(other.isSetDataSolicitacao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataSolicitacao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataSolicitacao, other.dataSolicitacao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataRealizacao()).compareTo(other.isSetDataRealizacao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataRealizacao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataRealizacao, other.dataRealizacao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataResultado()).compareTo(other.isSetDataResultado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataResultado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataResultado, other.dataResultado);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResultadoExame()).compareTo(other.isSetResultadoExame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultadoExame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultadoExame, other.resultadoExame);
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
    StringBuilder sb = new StringBuilder("ResultadosExameThrift(");
    boolean first = true;

    if (isSetExame()) {
      sb.append("exame:");
      if (this.exame == null) {
        sb.append("null");
      } else {
        sb.append(this.exame);
      }
      first = false;
    }
    if (isSetDataSolicitacao()) {
      if (!first) sb.append(", ");
      sb.append("dataSolicitacao:");
      sb.append(this.dataSolicitacao);
      first = false;
    }
    if (isSetDataRealizacao()) {
      if (!first) sb.append(", ");
      sb.append("dataRealizacao:");
      sb.append(this.dataRealizacao);
      first = false;
    }
    if (isSetDataResultado()) {
      if (!first) sb.append(", ");
      sb.append("dataResultado:");
      sb.append(this.dataResultado);
      first = false;
    }
    if (isSetResultadoExame()) {
      if (!first) sb.append(", ");
      sb.append("resultadoExame:");
      if (this.resultadoExame == null) {
        sb.append("null");
      } else {
        sb.append(this.resultadoExame);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultadosExameThriftStandardSchemeFactory implements SchemeFactory {
    public ResultadosExameThriftStandardScheme getScheme() {
      return new ResultadosExameThriftStandardScheme();
    }
  }

  private static class ResultadosExameThriftStandardScheme extends StandardScheme<ResultadosExameThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResultadosExameThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exame = iprot.readString();
              struct.setExameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_SOLICITACAO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dataSolicitacao = iprot.readI64();
              struct.setDataSolicitacaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_REALIZACAO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dataRealizacao = iprot.readI64();
              struct.setDataRealizacaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_RESULTADO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dataResultado = iprot.readI64();
              struct.setDataResultadoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RESULTADO_EXAME
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.resultadoExame = new ArrayList<ResultadoExameThrift>(_list0.size);
                ResultadoExameThrift _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ResultadoExameThrift();
                  _elem1.read(iprot);
                  struct.resultadoExame.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setResultadoExameIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResultadosExameThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exame != null) {
        if (struct.isSetExame()) {
          oprot.writeFieldBegin(EXAME_FIELD_DESC);
          oprot.writeString(struct.exame);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDataSolicitacao()) {
        oprot.writeFieldBegin(DATA_SOLICITACAO_FIELD_DESC);
        oprot.writeI64(struct.dataSolicitacao);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDataRealizacao()) {
        oprot.writeFieldBegin(DATA_REALIZACAO_FIELD_DESC);
        oprot.writeI64(struct.dataRealizacao);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDataResultado()) {
        oprot.writeFieldBegin(DATA_RESULTADO_FIELD_DESC);
        oprot.writeI64(struct.dataResultado);
        oprot.writeFieldEnd();
      }
      if (struct.resultadoExame != null) {
        if (struct.isSetResultadoExame()) {
          oprot.writeFieldBegin(RESULTADO_EXAME_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.resultadoExame.size()));
            for (ResultadoExameThrift _iter3 : struct.resultadoExame)
            {
              _iter3.write(oprot);
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

  private static class ResultadosExameThriftTupleSchemeFactory implements SchemeFactory {
    public ResultadosExameThriftTupleScheme getScheme() {
      return new ResultadosExameThriftTupleScheme();
    }
  }

  private static class ResultadosExameThriftTupleScheme extends TupleScheme<ResultadosExameThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResultadosExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExame()) {
        optionals.set(0);
      }
      if (struct.isSetDataSolicitacao()) {
        optionals.set(1);
      }
      if (struct.isSetDataRealizacao()) {
        optionals.set(2);
      }
      if (struct.isSetDataResultado()) {
        optionals.set(3);
      }
      if (struct.isSetResultadoExame()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetExame()) {
        oprot.writeString(struct.exame);
      }
      if (struct.isSetDataSolicitacao()) {
        oprot.writeI64(struct.dataSolicitacao);
      }
      if (struct.isSetDataRealizacao()) {
        oprot.writeI64(struct.dataRealizacao);
      }
      if (struct.isSetDataResultado()) {
        oprot.writeI64(struct.dataResultado);
      }
      if (struct.isSetResultadoExame()) {
        {
          oprot.writeI32(struct.resultadoExame.size());
          for (ResultadoExameThrift _iter4 : struct.resultadoExame)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResultadosExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.exame = iprot.readString();
        struct.setExameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dataSolicitacao = iprot.readI64();
        struct.setDataSolicitacaoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dataRealizacao = iprot.readI64();
        struct.setDataRealizacaoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dataResultado = iprot.readI64();
        struct.setDataResultadoIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.resultadoExame = new ArrayList<ResultadoExameThrift>(_list5.size);
          ResultadoExameThrift _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ResultadoExameThrift();
            _elem6.read(iprot);
            struct.resultadoExame.add(_elem6);
          }
        }
        struct.setResultadoExameIsSet(true);
      }
    }
  }

}

