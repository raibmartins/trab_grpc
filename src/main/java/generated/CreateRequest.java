// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: listaTelefonica.proto

package generated;

/**
 * Protobuf type {@code proto.CreateRequest}
 */
public  final class CreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CreateRequest)
    CreateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRequest.newBuilder() to construct.
  private CreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRequest() {
    nomePessoa_ = "";
    numero_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nomePessoa_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            numero_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.UserProtos.internal_static_proto_CreateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UserProtos.internal_static_proto_CreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.CreateRequest.class, generated.CreateRequest.Builder.class);
  }

  public static final int NOMEPESSOA_FIELD_NUMBER = 1;
  private volatile java.lang.Object nomePessoa_;
  /**
   * <code>string nomePessoa = 1;</code>
   * @return The nomePessoa.
   */
  public java.lang.String getNomePessoa() {
    java.lang.Object ref = nomePessoa_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nomePessoa_ = s;
      return s;
    }
  }
  /**
   * <code>string nomePessoa = 1;</code>
   * @return The bytes for nomePessoa.
   */
  public com.google.protobuf.ByteString
      getNomePessoaBytes() {
    java.lang.Object ref = nomePessoa_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nomePessoa_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMERO_FIELD_NUMBER = 2;
  private volatile java.lang.Object numero_;
  /**
   * <code>string numero = 2;</code>
   * @return The numero.
   */
  public java.lang.String getNumero() {
    java.lang.Object ref = numero_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numero_ = s;
      return s;
    }
  }
  /**
   * <code>string numero = 2;</code>
   * @return The bytes for numero.
   */
  public com.google.protobuf.ByteString
      getNumeroBytes() {
    java.lang.Object ref = numero_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numero_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNomePessoaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nomePessoa_);
    }
    if (!getNumeroBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, numero_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNomePessoaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nomePessoa_);
    }
    if (!getNumeroBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, numero_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.CreateRequest)) {
      return super.equals(obj);
    }
    generated.CreateRequest other = (generated.CreateRequest) obj;

    if (!getNomePessoa()
        .equals(other.getNomePessoa())) return false;
    if (!getNumero()
        .equals(other.getNumero())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NOMEPESSOA_FIELD_NUMBER;
    hash = (53 * hash) + getNomePessoa().hashCode();
    hash = (37 * hash) + NUMERO_FIELD_NUMBER;
    hash = (53 * hash) + getNumero().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.CreateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CreateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.CreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.CreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.CreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.CreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.CreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.CreateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.CreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CreateRequest)
      generated.CreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UserProtos.internal_static_proto_CreateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UserProtos.internal_static_proto_CreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.CreateRequest.class, generated.CreateRequest.Builder.class);
    }

    // Construct using generated.CreateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nomePessoa_ = "";

      numero_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UserProtos.internal_static_proto_CreateRequest_descriptor;
    }

    @java.lang.Override
    public generated.CreateRequest getDefaultInstanceForType() {
      return generated.CreateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.CreateRequest build() {
      generated.CreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.CreateRequest buildPartial() {
      generated.CreateRequest result = new generated.CreateRequest(this);
      result.nomePessoa_ = nomePessoa_;
      result.numero_ = numero_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.CreateRequest) {
        return mergeFrom((generated.CreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.CreateRequest other) {
      if (other == generated.CreateRequest.getDefaultInstance()) return this;
      if (!other.getNomePessoa().isEmpty()) {
        nomePessoa_ = other.nomePessoa_;
        onChanged();
      }
      if (!other.getNumero().isEmpty()) {
        numero_ = other.numero_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.CreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.CreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nomePessoa_ = "";
    /**
     * <code>string nomePessoa = 1;</code>
     * @return The nomePessoa.
     */
    public java.lang.String getNomePessoa() {
      java.lang.Object ref = nomePessoa_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nomePessoa_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nomePessoa = 1;</code>
     * @return The bytes for nomePessoa.
     */
    public com.google.protobuf.ByteString
        getNomePessoaBytes() {
      java.lang.Object ref = nomePessoa_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nomePessoa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nomePessoa = 1;</code>
     * @param value The nomePessoa to set.
     * @return This builder for chaining.
     */
    public Builder setNomePessoa(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nomePessoa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nomePessoa = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNomePessoa() {
      
      nomePessoa_ = getDefaultInstance().getNomePessoa();
      onChanged();
      return this;
    }
    /**
     * <code>string nomePessoa = 1;</code>
     * @param value The bytes for nomePessoa to set.
     * @return This builder for chaining.
     */
    public Builder setNomePessoaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nomePessoa_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object numero_ = "";
    /**
     * <code>string numero = 2;</code>
     * @return The numero.
     */
    public java.lang.String getNumero() {
      java.lang.Object ref = numero_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numero_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numero = 2;</code>
     * @return The bytes for numero.
     */
    public com.google.protobuf.ByteString
        getNumeroBytes() {
      java.lang.Object ref = numero_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numero_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numero = 2;</code>
     * @param value The numero to set.
     * @return This builder for chaining.
     */
    public Builder setNumero(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      numero_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string numero = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumero() {
      
      numero_ = getDefaultInstance().getNumero();
      onChanged();
      return this;
    }
    /**
     * <code>string numero = 2;</code>
     * @param value The bytes for numero to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      numero_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.CreateRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.CreateRequest)
  private static final generated.CreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.CreateRequest();
  }

  public static generated.CreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRequest>() {
    @java.lang.Override
    public CreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.CreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

