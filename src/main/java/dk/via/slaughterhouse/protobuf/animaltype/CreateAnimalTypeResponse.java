// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimalType.proto

package dk.via.slaughterhouse.protobuf.animaltype;

/**
 * Protobuf type {@code dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse}
 */
public final class CreateAnimalTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)
    CreateAnimalTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAnimalTypeResponse.newBuilder() to construct.
  private CreateAnimalTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAnimalTypeResponse() {
    confirmation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAnimalTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAnimalTypeResponse(
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

            confirmation_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.class, dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.Builder.class);
  }

  public static final int CONFIRMATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object confirmation_;
  /**
   * <code>string confirmation = 1;</code>
   * @return The confirmation.
   */
  @java.lang.Override
  public java.lang.String getConfirmation() {
    java.lang.Object ref = confirmation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confirmation_ = s;
      return s;
    }
  }
  /**
   * <code>string confirmation = 1;</code>
   * @return The bytes for confirmation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfirmationBytes() {
    java.lang.Object ref = confirmation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confirmation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confirmation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, confirmation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confirmation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, confirmation_);
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
    if (!(obj instanceof dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)) {
      return super.equals(obj);
    }
    dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse other = (dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse) obj;

    if (!getConfirmation()
        .equals(other.getConfirmation())) return false;
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
    hash = (37 * hash) + CONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + getConfirmation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parseFrom(
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
  public static Builder newBuilder(dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse prototype) {
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
   * Protobuf type {@code dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.class, dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.Builder.class);
    }

    // Construct using dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.newBuilder()
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
      confirmation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.internal_static_dk_via_slaughterhouse_protobuf_animaltype_CreateAnimalTypeResponse_descriptor;
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse getDefaultInstanceForType() {
      return dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse build() {
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse buildPartial() {
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse result = new dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse(this);
      result.confirmation_ = confirmation_;
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
      if (other instanceof dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse) {
        return mergeFrom((dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse other) {
      if (other == dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.getDefaultInstance()) return this;
      if (!other.getConfirmation().isEmpty()) {
        confirmation_ = other.confirmation_;
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
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object confirmation_ = "";
    /**
     * <code>string confirmation = 1;</code>
     * @return The confirmation.
     */
    public java.lang.String getConfirmation() {
      java.lang.Object ref = confirmation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confirmation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string confirmation = 1;</code>
     * @return The bytes for confirmation.
     */
    public com.google.protobuf.ByteString
        getConfirmationBytes() {
      java.lang.Object ref = confirmation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confirmation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string confirmation = 1;</code>
     * @param value The confirmation to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confirmation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfirmation() {
      
      confirmation_ = getDefaultInstance().getConfirmation();
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation = 1;</code>
     * @param value The bytes for confirmation to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confirmation_ = value;
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


    // @@protoc_insertion_point(builder_scope:dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse)
  private static final dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse();
  }

  public static dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAnimalTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateAnimalTypeResponse>() {
    @java.lang.Override
    public CreateAnimalTypeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAnimalTypeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAnimalTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAnimalTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

