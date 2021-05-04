/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.consumoalimentar;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2021-05-04")
public class PerguntaQuestionarioCriancasComMaisDoisAnosThrift implements org.apache.thrift.TBase<PerguntaQuestionarioCriancasComMaisDoisAnosThrift, PerguntaQuestionarioCriancasComMaisDoisAnosThrift._Fields>, java.io.Serializable, Cloneable, Comparable<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PerguntaQuestionarioCriancasComMaisDoisAnosThrift");

  private static final org.apache.thrift.protocol.TField PERGUNTA_FIELD_DESC = new org.apache.thrift.protocol.TField("pergunta", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESPOSTA_UNICA_ESCOLHA_FIELD_DESC = new org.apache.thrift.protocol.TField("respostaUnicaEscolha", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESPOSTA_MULTIPLA_ESCOLHA_FIELD_DESC = new org.apache.thrift.protocol.TField("respostaMultiplaEscolha", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PerguntaQuestionarioCriancasComMaisDoisAnosThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PerguntaQuestionarioCriancasComMaisDoisAnosThriftTupleSchemeFactory());
  }

  private PerguntaCriancasComMaisDoisAnosEnumThrift pergunta; // optional
  private RespostaUnicaEscolhaEnumThrift respostaUnicaEscolha; // optional
  private List<RespostaMultiplaEscolhaEnumThrift> respostaMultiplaEscolha; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PerguntaCriancasComMaisDoisAnosEnumThrift
     */
    PERGUNTA((short)1, "pergunta"),
    /**
     * 
     * @see RespostaUnicaEscolhaEnumThrift
     */
    RESPOSTA_UNICA_ESCOLHA((short)2, "respostaUnicaEscolha"),
    RESPOSTA_MULTIPLA_ESCOLHA((short)3, "respostaMultiplaEscolha");

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
        case 1: // PERGUNTA
          return PERGUNTA;
        case 2: // RESPOSTA_UNICA_ESCOLHA
          return RESPOSTA_UNICA_ESCOLHA;
        case 3: // RESPOSTA_MULTIPLA_ESCOLHA
          return RESPOSTA_MULTIPLA_ESCOLHA;
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
  private static final _Fields optionals[] = {_Fields.PERGUNTA,_Fields.RESPOSTA_UNICA_ESCOLHA,_Fields.RESPOSTA_MULTIPLA_ESCOLHA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERGUNTA, new org.apache.thrift.meta_data.FieldMetaData("pergunta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PerguntaCriancasComMaisDoisAnosEnumThrift.class)));
    tmpMap.put(_Fields.RESPOSTA_UNICA_ESCOLHA, new org.apache.thrift.meta_data.FieldMetaData("respostaUnicaEscolha", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RespostaUnicaEscolhaEnumThrift.class)));
    tmpMap.put(_Fields.RESPOSTA_MULTIPLA_ESCOLHA, new org.apache.thrift.meta_data.FieldMetaData("respostaMultiplaEscolha", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RespostaMultiplaEscolhaEnumThrift.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PerguntaQuestionarioCriancasComMaisDoisAnosThrift.class, metaDataMap);
  }

  public PerguntaQuestionarioCriancasComMaisDoisAnosThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PerguntaQuestionarioCriancasComMaisDoisAnosThrift(PerguntaQuestionarioCriancasComMaisDoisAnosThrift other) {
    if (other.isSetPergunta()) {
      this.pergunta = other.pergunta;
    }
    if (other.isSetRespostaUnicaEscolha()) {
      this.respostaUnicaEscolha = other.respostaUnicaEscolha;
    }
    if (other.isSetRespostaMultiplaEscolha()) {
      List<RespostaMultiplaEscolhaEnumThrift> __this__respostaMultiplaEscolha = new ArrayList<RespostaMultiplaEscolhaEnumThrift>(other.respostaMultiplaEscolha.size());
      for (RespostaMultiplaEscolhaEnumThrift other_element : other.respostaMultiplaEscolha) {
        __this__respostaMultiplaEscolha.add(other_element);
      }
      this.respostaMultiplaEscolha = __this__respostaMultiplaEscolha;
    }
  }

  public PerguntaQuestionarioCriancasComMaisDoisAnosThrift deepCopy() {
    return new PerguntaQuestionarioCriancasComMaisDoisAnosThrift(this);
  }

  @Override
  public void clear() {
    this.pergunta = null;
    this.respostaUnicaEscolha = null;
    this.respostaMultiplaEscolha = null;
  }

  /**
   * 
   * @see PerguntaCriancasComMaisDoisAnosEnumThrift
   */
  public PerguntaCriancasComMaisDoisAnosEnumThrift getPergunta() {
    return this.pergunta;
  }

  /**
   * 
   * @see PerguntaCriancasComMaisDoisAnosEnumThrift
   */
  public void setPergunta(PerguntaCriancasComMaisDoisAnosEnumThrift pergunta) {
    this.pergunta = pergunta;
  }

  public void unsetPergunta() {
    this.pergunta = null;
  }

  /** Returns true if field pergunta is set (has been assigned a value) and false otherwise */
  public boolean isSetPergunta() {
    return this.pergunta != null;
  }

  public void setPerguntaIsSet(boolean value) {
    if (!value) {
      this.pergunta = null;
    }
  }

  /**
   * 
   * @see RespostaUnicaEscolhaEnumThrift
   */
  public RespostaUnicaEscolhaEnumThrift getRespostaUnicaEscolha() {
    return this.respostaUnicaEscolha;
  }

  /**
   * 
   * @see RespostaUnicaEscolhaEnumThrift
   */
  public void setRespostaUnicaEscolha(RespostaUnicaEscolhaEnumThrift respostaUnicaEscolha) {
    this.respostaUnicaEscolha = respostaUnicaEscolha;
  }

  public void unsetRespostaUnicaEscolha() {
    this.respostaUnicaEscolha = null;
  }

  /** Returns true if field respostaUnicaEscolha is set (has been assigned a value) and false otherwise */
  public boolean isSetRespostaUnicaEscolha() {
    return this.respostaUnicaEscolha != null;
  }

  public void setRespostaUnicaEscolhaIsSet(boolean value) {
    if (!value) {
      this.respostaUnicaEscolha = null;
    }
  }

  public int getRespostaMultiplaEscolhaSize() {
    return (this.respostaMultiplaEscolha == null) ? 0 : this.respostaMultiplaEscolha.size();
  }

  public java.util.Iterator<RespostaMultiplaEscolhaEnumThrift> getRespostaMultiplaEscolhaIterator() {
    return (this.respostaMultiplaEscolha == null) ? null : this.respostaMultiplaEscolha.iterator();
  }

  public void addToRespostaMultiplaEscolha(RespostaMultiplaEscolhaEnumThrift elem) {
    if (this.respostaMultiplaEscolha == null) {
      this.respostaMultiplaEscolha = new ArrayList<RespostaMultiplaEscolhaEnumThrift>();
    }
    this.respostaMultiplaEscolha.add(elem);
  }

  public List<RespostaMultiplaEscolhaEnumThrift> getRespostaMultiplaEscolha() {
    return this.respostaMultiplaEscolha;
  }

  public void setRespostaMultiplaEscolha(List<RespostaMultiplaEscolhaEnumThrift> respostaMultiplaEscolha) {
    this.respostaMultiplaEscolha = respostaMultiplaEscolha;
  }

  public void unsetRespostaMultiplaEscolha() {
    this.respostaMultiplaEscolha = null;
  }

  /** Returns true if field respostaMultiplaEscolha is set (has been assigned a value) and false otherwise */
  public boolean isSetRespostaMultiplaEscolha() {
    return this.respostaMultiplaEscolha != null;
  }

  public void setRespostaMultiplaEscolhaIsSet(boolean value) {
    if (!value) {
      this.respostaMultiplaEscolha = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERGUNTA:
      if (value == null) {
        unsetPergunta();
      } else {
        setPergunta((PerguntaCriancasComMaisDoisAnosEnumThrift)value);
      }
      break;

    case RESPOSTA_UNICA_ESCOLHA:
      if (value == null) {
        unsetRespostaUnicaEscolha();
      } else {
        setRespostaUnicaEscolha((RespostaUnicaEscolhaEnumThrift)value);
      }
      break;

    case RESPOSTA_MULTIPLA_ESCOLHA:
      if (value == null) {
        unsetRespostaMultiplaEscolha();
      } else {
        setRespostaMultiplaEscolha((List<RespostaMultiplaEscolhaEnumThrift>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERGUNTA:
      return getPergunta();

    case RESPOSTA_UNICA_ESCOLHA:
      return getRespostaUnicaEscolha();

    case RESPOSTA_MULTIPLA_ESCOLHA:
      return getRespostaMultiplaEscolha();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERGUNTA:
      return isSetPergunta();
    case RESPOSTA_UNICA_ESCOLHA:
      return isSetRespostaUnicaEscolha();
    case RESPOSTA_MULTIPLA_ESCOLHA:
      return isSetRespostaMultiplaEscolha();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PerguntaQuestionarioCriancasComMaisDoisAnosThrift)
      return this.equals((PerguntaQuestionarioCriancasComMaisDoisAnosThrift)that);
    return false;
  }

  public boolean equals(PerguntaQuestionarioCriancasComMaisDoisAnosThrift that) {
    if (that == null)
      return false;

    boolean this_present_pergunta = true && this.isSetPergunta();
    boolean that_present_pergunta = true && that.isSetPergunta();
    if (this_present_pergunta || that_present_pergunta) {
      if (!(this_present_pergunta && that_present_pergunta))
        return false;
      if (!this.pergunta.equals(that.pergunta))
        return false;
    }

    boolean this_present_respostaUnicaEscolha = true && this.isSetRespostaUnicaEscolha();
    boolean that_present_respostaUnicaEscolha = true && that.isSetRespostaUnicaEscolha();
    if (this_present_respostaUnicaEscolha || that_present_respostaUnicaEscolha) {
      if (!(this_present_respostaUnicaEscolha && that_present_respostaUnicaEscolha))
        return false;
      if (!this.respostaUnicaEscolha.equals(that.respostaUnicaEscolha))
        return false;
    }

    boolean this_present_respostaMultiplaEscolha = true && this.isSetRespostaMultiplaEscolha();
    boolean that_present_respostaMultiplaEscolha = true && that.isSetRespostaMultiplaEscolha();
    if (this_present_respostaMultiplaEscolha || that_present_respostaMultiplaEscolha) {
      if (!(this_present_respostaMultiplaEscolha && that_present_respostaMultiplaEscolha))
        return false;
      if (!this.respostaMultiplaEscolha.equals(that.respostaMultiplaEscolha))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pergunta = true && (isSetPergunta());
    list.add(present_pergunta);
    if (present_pergunta)
      list.add(pergunta.getValue());

    boolean present_respostaUnicaEscolha = true && (isSetRespostaUnicaEscolha());
    list.add(present_respostaUnicaEscolha);
    if (present_respostaUnicaEscolha)
      list.add(respostaUnicaEscolha.getValue());

    boolean present_respostaMultiplaEscolha = true && (isSetRespostaMultiplaEscolha());
    list.add(present_respostaMultiplaEscolha);
    if (present_respostaMultiplaEscolha)
      list.add(respostaMultiplaEscolha);

    return list.hashCode();
  }

  @Override
  public int compareTo(PerguntaQuestionarioCriancasComMaisDoisAnosThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPergunta()).compareTo(other.isSetPergunta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPergunta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pergunta, other.pergunta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRespostaUnicaEscolha()).compareTo(other.isSetRespostaUnicaEscolha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRespostaUnicaEscolha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.respostaUnicaEscolha, other.respostaUnicaEscolha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRespostaMultiplaEscolha()).compareTo(other.isSetRespostaMultiplaEscolha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRespostaMultiplaEscolha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.respostaMultiplaEscolha, other.respostaMultiplaEscolha);
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
    StringBuilder sb = new StringBuilder("PerguntaQuestionarioCriancasComMaisDoisAnosThrift(");
    boolean first = true;

    if (isSetPergunta()) {
      sb.append("pergunta:");
      if (this.pergunta == null) {
        sb.append("null");
      } else {
        sb.append(this.pergunta);
      }
      first = false;
    }
    if (isSetRespostaUnicaEscolha()) {
      if (!first) sb.append(", ");
      sb.append("respostaUnicaEscolha:");
      if (this.respostaUnicaEscolha == null) {
        sb.append("null");
      } else {
        sb.append(this.respostaUnicaEscolha);
      }
      first = false;
    }
    if (isSetRespostaMultiplaEscolha()) {
      if (!first) sb.append(", ");
      sb.append("respostaMultiplaEscolha:");
      if (this.respostaMultiplaEscolha == null) {
        sb.append("null");
      } else {
        sb.append(this.respostaMultiplaEscolha);
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

  private static class PerguntaQuestionarioCriancasComMaisDoisAnosThriftStandardSchemeFactory implements SchemeFactory {
    public PerguntaQuestionarioCriancasComMaisDoisAnosThriftStandardScheme getScheme() {
      return new PerguntaQuestionarioCriancasComMaisDoisAnosThriftStandardScheme();
    }
  }

  private static class PerguntaQuestionarioCriancasComMaisDoisAnosThriftStandardScheme extends StandardScheme<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PerguntaQuestionarioCriancasComMaisDoisAnosThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERGUNTA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pergunta = br.gov.saude.esusab.ras.consumoalimentar.PerguntaCriancasComMaisDoisAnosEnumThrift.findByValue(iprot.readI32());
              struct.setPerguntaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESPOSTA_UNICA_ESCOLHA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.respostaUnicaEscolha = br.gov.saude.esusab.ras.consumoalimentar.RespostaUnicaEscolhaEnumThrift.findByValue(iprot.readI32());
              struct.setRespostaUnicaEscolhaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESPOSTA_MULTIPLA_ESCOLHA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.respostaMultiplaEscolha = new ArrayList<RespostaMultiplaEscolhaEnumThrift>(_list0.size);
                RespostaMultiplaEscolhaEnumThrift _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = br.gov.saude.esusab.ras.consumoalimentar.RespostaMultiplaEscolhaEnumThrift.findByValue(iprot.readI32());
                  struct.respostaMultiplaEscolha.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRespostaMultiplaEscolhaIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PerguntaQuestionarioCriancasComMaisDoisAnosThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pergunta != null) {
        if (struct.isSetPergunta()) {
          oprot.writeFieldBegin(PERGUNTA_FIELD_DESC);
          oprot.writeI32(struct.pergunta.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.respostaUnicaEscolha != null) {
        if (struct.isSetRespostaUnicaEscolha()) {
          oprot.writeFieldBegin(RESPOSTA_UNICA_ESCOLHA_FIELD_DESC);
          oprot.writeI32(struct.respostaUnicaEscolha.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.respostaMultiplaEscolha != null) {
        if (struct.isSetRespostaMultiplaEscolha()) {
          oprot.writeFieldBegin(RESPOSTA_MULTIPLA_ESCOLHA_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.respostaMultiplaEscolha.size()));
            for (RespostaMultiplaEscolhaEnumThrift _iter3 : struct.respostaMultiplaEscolha)
            {
              oprot.writeI32(_iter3.getValue());
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

  private static class PerguntaQuestionarioCriancasComMaisDoisAnosThriftTupleSchemeFactory implements SchemeFactory {
    public PerguntaQuestionarioCriancasComMaisDoisAnosThriftTupleScheme getScheme() {
      return new PerguntaQuestionarioCriancasComMaisDoisAnosThriftTupleScheme();
    }
  }

  private static class PerguntaQuestionarioCriancasComMaisDoisAnosThriftTupleScheme extends TupleScheme<PerguntaQuestionarioCriancasComMaisDoisAnosThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PerguntaQuestionarioCriancasComMaisDoisAnosThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPergunta()) {
        optionals.set(0);
      }
      if (struct.isSetRespostaUnicaEscolha()) {
        optionals.set(1);
      }
      if (struct.isSetRespostaMultiplaEscolha()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPergunta()) {
        oprot.writeI32(struct.pergunta.getValue());
      }
      if (struct.isSetRespostaUnicaEscolha()) {
        oprot.writeI32(struct.respostaUnicaEscolha.getValue());
      }
      if (struct.isSetRespostaMultiplaEscolha()) {
        {
          oprot.writeI32(struct.respostaMultiplaEscolha.size());
          for (RespostaMultiplaEscolhaEnumThrift _iter4 : struct.respostaMultiplaEscolha)
          {
            oprot.writeI32(_iter4.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PerguntaQuestionarioCriancasComMaisDoisAnosThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.pergunta = br.gov.saude.esusab.ras.consumoalimentar.PerguntaCriancasComMaisDoisAnosEnumThrift.findByValue(iprot.readI32());
        struct.setPerguntaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.respostaUnicaEscolha = br.gov.saude.esusab.ras.consumoalimentar.RespostaUnicaEscolhaEnumThrift.findByValue(iprot.readI32());
        struct.setRespostaUnicaEscolhaIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.respostaMultiplaEscolha = new ArrayList<RespostaMultiplaEscolhaEnumThrift>(_list5.size);
          RespostaMultiplaEscolhaEnumThrift _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = br.gov.saude.esusab.ras.consumoalimentar.RespostaMultiplaEscolhaEnumThrift.findByValue(iprot.readI32());
            struct.respostaMultiplaEscolha.add(_elem6);
          }
        }
        struct.setRespostaMultiplaEscolhaIsSet(true);
      }
    }
  }

}

