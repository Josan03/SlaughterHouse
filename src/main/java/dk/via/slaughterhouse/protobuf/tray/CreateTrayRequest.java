// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package dk.via.slaughterhouse.protobuf.tray;

/**
 * Protobuf type {@code dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest}
 */
public final class CreateTrayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)
    CreateTrayRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTrayRequest.newBuilder() to construct.
  private CreateTrayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTrayRequest() {
    description_ = "";
    animalPartsIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTrayRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateTrayRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            description_ = s;
            break;
          }
          case 17: {

            maxWeight_ = input.readDouble();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              animalPartsIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            animalPartsIds_.addLong(input.readInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              animalPartsIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              animalPartsIds_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        animalPartsIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.slaughterhouse.protobuf.tray.Tray.internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.slaughterhouse.protobuf.tray.Tray.internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.class, dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXWEIGHT_FIELD_NUMBER = 2;
  private double maxWeight_;
  /**
   * <code>double maxWeight = 2;</code>
   * @return The maxWeight.
   */
  @java.lang.Override
  public double getMaxWeight() {
    return maxWeight_;
  }

  public static final int ANIMALPARTSIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList animalPartsIds_;
  /**
   * <code>repeated int64 animalPartsIds = 3;</code>
   * @return A list containing the animalPartsIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAnimalPartsIdsList() {
    return animalPartsIds_;
  }
  /**
   * <code>repeated int64 animalPartsIds = 3;</code>
   * @return The count of animalPartsIds.
   */
  public int getAnimalPartsIdsCount() {
    return animalPartsIds_.size();
  }
  /**
   * <code>repeated int64 animalPartsIds = 3;</code>
   * @param index The index of the element to return.
   * @return The animalPartsIds at the given index.
   */
  public long getAnimalPartsIds(int index) {
    return animalPartsIds_.getLong(index);
  }
  private int animalPartsIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxWeight_) != 0) {
      output.writeDouble(2, maxWeight_);
    }
    if (getAnimalPartsIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(animalPartsIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < animalPartsIds_.size(); i++) {
      output.writeInt64NoTag(animalPartsIds_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxWeight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, maxWeight_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < animalPartsIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(animalPartsIds_.getLong(i));
      }
      size += dataSize;
      if (!getAnimalPartsIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      animalPartsIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)) {
      return super.equals(obj);
    }
    dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest other = (dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest) obj;

    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (java.lang.Double.doubleToLongBits(getMaxWeight())
        != java.lang.Double.doubleToLongBits(
            other.getMaxWeight())) return false;
    if (!getAnimalPartsIdsList()
        .equals(other.getAnimalPartsIdsList())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + MAXWEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxWeight()));
    if (getAnimalPartsIdsCount() > 0) {
      hash = (37 * hash) + ANIMALPARTSIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimalPartsIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parseFrom(
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
  public static Builder newBuilder(dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest prototype) {
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
   * Protobuf type {@code dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)
      dk.via.slaughterhouse.protobuf.tray.CreateTrayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.slaughterhouse.protobuf.tray.Tray.internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.slaughterhouse.protobuf.tray.Tray.internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.class, dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.Builder.class);
    }

    // Construct using dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.newBuilder()
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
      description_ = "";

      maxWeight_ = 0D;

      animalPartsIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.slaughterhouse.protobuf.tray.Tray.internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstanceForType() {
      return dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest build() {
      dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest buildPartial() {
      dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest result = new dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest(this);
      int from_bitField0_ = bitField0_;
      result.description_ = description_;
      result.maxWeight_ = maxWeight_;
      if (((bitField0_ & 0x00000001) != 0)) {
        animalPartsIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.animalPartsIds_ = animalPartsIds_;
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
      if (other instanceof dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest) {
        return mergeFrom((dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest other) {
      if (other == dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getMaxWeight() != 0D) {
        setMaxWeight(other.getMaxWeight());
      }
      if (!other.animalPartsIds_.isEmpty()) {
        if (animalPartsIds_.isEmpty()) {
          animalPartsIds_ = other.animalPartsIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnimalPartsIdsIsMutable();
          animalPartsIds_.addAll(other.animalPartsIds_);
        }
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
      dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 1;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 1;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 1;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private double maxWeight_ ;
    /**
     * <code>double maxWeight = 2;</code>
     * @return The maxWeight.
     */
    @java.lang.Override
    public double getMaxWeight() {
      return maxWeight_;
    }
    /**
     * <code>double maxWeight = 2;</code>
     * @param value The maxWeight to set.
     * @return This builder for chaining.
     */
    public Builder setMaxWeight(double value) {
      
      maxWeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double maxWeight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxWeight() {
      
      maxWeight_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList animalPartsIds_ = emptyLongList();
    private void ensureAnimalPartsIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        animalPartsIds_ = mutableCopy(animalPartsIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @return A list containing the animalPartsIds.
     */
    public java.util.List<java.lang.Long>
        getAnimalPartsIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(animalPartsIds_) : animalPartsIds_;
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @return The count of animalPartsIds.
     */
    public int getAnimalPartsIdsCount() {
      return animalPartsIds_.size();
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @param index The index of the element to return.
     * @return The animalPartsIds at the given index.
     */
    public long getAnimalPartsIds(int index) {
      return animalPartsIds_.getLong(index);
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @param index The index to set the value at.
     * @param value The animalPartsIds to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalPartsIds(
        int index, long value) {
      ensureAnimalPartsIdsIsMutable();
      animalPartsIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @param value The animalPartsIds to add.
     * @return This builder for chaining.
     */
    public Builder addAnimalPartsIds(long value) {
      ensureAnimalPartsIdsIsMutable();
      animalPartsIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @param values The animalPartsIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnimalPartsIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAnimalPartsIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, animalPartsIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 animalPartsIds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalPartsIds() {
      animalPartsIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)
  }

  // @@protoc_insertion_point(class_scope:dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest)
  private static final dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest();
  }

  public static dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTrayRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTrayRequest>() {
    @java.lang.Override
    public CreateTrayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateTrayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateTrayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTrayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

