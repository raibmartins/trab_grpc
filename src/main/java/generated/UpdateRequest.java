// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: listaTelefonica.proto

package generated;

/**
 * Protobuf type {@code proto.UpdateRequest}
 */
public  final class UpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.UpdateRequest)
    UpdateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRequest.newBuilder() to construct.
  private UpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRequest() {
    numeroAntigo_ = "";
    novoNumero_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateRequest(
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

            numeroAntigo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            novoNumero_ = s;
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
    return generated.UserProtos.internal_static_proto_UpdateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.UserProtos.internal_static_proto_UpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.UpdateRequest.class, generated.UpdateRequest.Builder.class);
  }

  public static final int NUMEROANTIGO_FIELD_NUMBER = 1;
  private volatile java.lang.Object numeroAntigo_;
  /**
   * <code>string numeroAntigo = 1;</code>
   * @return The numeroAntigo.
   */
  public java.lang.String getNumeroAntigo() {
    java.lang.Object ref = numeroAntigo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numeroAntigo_ = s;
      return s;
    }
  }
  /**
   * <code>string numeroAntigo = 1;</code>
   * @return The bytes for numeroAntigo.
   */
  public com.google.protobuf.ByteString
      getNumeroAntigoBytes() {
    java.lang.Object ref = numeroAntigo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numeroAntigo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOVONUMERO_FIELD_NUMBER = 2;
  private volatile java.lang.Object novoNumero_;
  /**
   * <code>string novoNumero = 2;</code>
   * @return The novoNumero.
   */
  public java.lang.String getNovoNumero() {
    java.lang.Object ref = novoNumero_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      novoNumero_ = s;
      return s;
    }
  }
  /**
   * <code>string novoNumero = 2;</code>
   * @return The bytes for novoNumero.
   */
  public com.google.protobuf.ByteString
      getNovoNumeroBytes() {
    java.lang.Object ref = novoNumero_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      novoNumero_ = b;
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
    if (!getNumeroAntigoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, numeroAntigo_);
    }
    if (!getNovoNumeroBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, novoNumero_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNumeroAntigoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, numeroAntigo_);
    }
    if (!getNovoNumeroBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, novoNumero_);
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
    if (!(obj instanceof generated.UpdateRequest)) {
      return super.equals(obj);
    }
    generated.UpdateRequest other = (generated.UpdateRequest) obj;

    if (!getNumeroAntigo()
        .equals(other.getNumeroAntigo())) return false;
    if (!getNovoNumero()
        .equals(other.getNovoNumero())) return false;
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
    hash = (37 * hash) + NUMEROANTIGO_FIELD_NUMBER;
    hash = (53 * hash) + getNumeroAntigo().hashCode();
    hash = (37 * hash) + NOVONUMERO_FIELD_NUMBER;
    hash = (53 * hash) + getNovoNumero().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.UpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.UpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.UpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.UpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.UpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.UpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.UpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.UpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.UpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.UpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.UpdateRequest parseFrom(
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
  public static Builder newBuilder(generated.UpdateRequest prototype) {
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
   * Protobuf type {@code proto.UpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.UpdateRequest)
      generated.UpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.UserProtos.internal_static_proto_UpdateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.UserProtos.internal_static_proto_UpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.UpdateRequest.class, generated.UpdateRequest.Builder.class);
    }

    // Construct using generated.UpdateRequest.newBuilder()
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
      numeroAntigo_ = "";

      novoNumero_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.UserProtos.internal_static_proto_UpdateRequest_descriptor;
    }

    @java.lang.Override
    public generated.UpdateRequest getDefaultInstanceForType() {
      return generated.UpdateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.UpdateRequest build() {
      generated.UpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.UpdateRequest buildPartial() {
      generated.UpdateRequest result = new generated.UpdateRequest(this);
      result.numeroAntigo_ = numeroAntigo_;
      result.novoNumero_ = novoNumero_;
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
      if (other instanceof generated.UpdateRequest) {
        return mergeFrom((generated.UpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.UpdateRequest other) {
      if (other == generated.UpdateRequest.getDefaultInstance()) return this;
      if (!other.getNumeroAntigo().isEmpty()) {
        numeroAntigo_ = other.numeroAntigo_;
        onChanged();
      }
      if (!other.getNovoNumero().isEmpty()) {
        novoNumero_ = other.novoNumero_;
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
      generated.UpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.UpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object numeroAntigo_ = "";
    /**
     * <code>string numeroAntigo = 1;</code>
     * @return The numeroAntigo.
     */
    public java.lang.String getNumeroAntigo() {
      java.lang.Object ref = numeroAntigo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numeroAntigo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numeroAntigo = 1;</code>
     * @return The bytes for numeroAntigo.
     */
    public com.google.protobuf.ByteString
        getNumeroAntigoBytes() {
      java.lang.Object ref = numeroAntigo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numeroAntigo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numeroAntigo = 1;</code>
     * @param value The numeroAntigo to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroAntigo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      numeroAntigo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string numeroAntigo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumeroAntigo() {
      
      numeroAntigo_ = getDefaultInstance().getNumeroAntigo();
      onChanged();
      return this;
    }
    /**
     * <code>string numeroAntigo = 1;</code>
     * @param value The bytes for numeroAntigo to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroAntigoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      numeroAntigo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object novoNumero_ = "";
    /**
     * <code>string novoNumero = 2;</code>
     * @return The novoNumero.
     */
    public java.lang.String getNovoNumero() {
      java.lang.Object ref = novoNumero_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        novoNumero_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string novoNumero = 2;</code>
     * @return The bytes for novoNumero.
     */
    public com.google.protobuf.ByteString
        getNovoNumeroBytes() {
      java.lang.Object ref = novoNumero_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        novoNumero_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string novoNumero = 2;</code>
     * @param value The novoNumero to set.
     * @return This builder for chaining.
     */
    public Builder setNovoNumero(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      novoNumero_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string novoNumero = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNovoNumero() {
      
      novoNumero_ = getDefaultInstance().getNovoNumero();
      onChanged();
      return this;
    }
    /**
     * <code>string novoNumero = 2;</code>
     * @param value The bytes for novoNumero to set.
     * @return This builder for chaining.
     */
    public Builder setNovoNumeroBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      novoNumero_ = value;
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


    // @@protoc_insertion_point(builder_scope:proto.UpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.UpdateRequest)
  private static final generated.UpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.UpdateRequest();
  }

  public static generated.UpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRequest>() {
    @java.lang.Override
    public UpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.UpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

