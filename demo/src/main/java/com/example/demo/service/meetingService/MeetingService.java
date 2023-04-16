// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meetingService.proto

package com.example.demo.service.meetingService;

public final class MeetingService {
  private MeetingService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MeetingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.demo.service.meetingService.Meeting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>int32 userId = 2;</code>
     */
    int getUserId();

    /**
     * <code>string userName = 3;</code>
     */
    java.lang.String getUserName();
    /**
     * <code>string userName = 3;</code>
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    boolean hasTime();
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    com.google.protobuf.Timestamp getTime();
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();
  }
  /**
   * Protobuf type {@code com.example.demo.service.meetingService.Meeting}
   */
  public  static final class Meeting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.demo.service.meetingService.Meeting)
      MeetingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Meeting.newBuilder() to construct.
    private Meeting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Meeting() {
      id_ = 0;
      userId_ = 0;
      userName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Meeting(
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 16: {

              userId_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              userName_ = s;
              break;
            }
            case 34: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (time_ != null) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return com.example.demo.service.meetingService.MeetingService.internal_static_com_example_demo_service_meetingService_Meeting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.service.meetingService.MeetingService.internal_static_com_example_demo_service_meetingService_Meeting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.service.meetingService.MeetingService.Meeting.class, com.example.demo.service.meetingService.MeetingService.Meeting.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private int userId_;
    /**
     * <code>int32 userId = 2;</code>
     */
    public int getUserId() {
      return userId_;
    }

    public static final int USERNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object userName_;
    /**
     * <code>string userName = 3;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      }
    }
    /**
     * <code>string userName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 4;
    private com.google.protobuf.Timestamp time_;
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public boolean hasTime() {
      return time_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.Timestamp getTime() {
      return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      return getTime();
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (userId_ != 0) {
        output.writeInt32(2, userId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userName_);
      }
      if (time_ != null) {
        output.writeMessage(4, getTime());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, userId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userName_);
      }
      if (time_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getTime());
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
      if (!(obj instanceof com.example.demo.service.meetingService.MeetingService.Meeting)) {
        return super.equals(obj);
      }
      com.example.demo.service.meetingService.MeetingService.Meeting other = (com.example.demo.service.meetingService.MeetingService.Meeting) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getUserId()
          == other.getUserId());
      result = result && getUserName()
          .equals(other.getUserName());
      result = result && (hasTime() == other.hasTime());
      if (hasTime()) {
        result = result && getTime()
            .equals(other.getTime());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUserName().hashCode();
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.service.meetingService.MeetingService.Meeting parseFrom(
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
    public static Builder newBuilder(com.example.demo.service.meetingService.MeetingService.Meeting prototype) {
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
     * Protobuf type {@code com.example.demo.service.meetingService.Meeting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.demo.service.meetingService.Meeting)
        com.example.demo.service.meetingService.MeetingService.MeetingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.demo.service.meetingService.MeetingService.internal_static_com_example_demo_service_meetingService_Meeting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.demo.service.meetingService.MeetingService.internal_static_com_example_demo_service_meetingService_Meeting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.demo.service.meetingService.MeetingService.Meeting.class, com.example.demo.service.meetingService.MeetingService.Meeting.Builder.class);
      }

      // Construct using com.example.demo.service.meetingService.MeetingService.Meeting.newBuilder()
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
        id_ = 0;

        userId_ = 0;

        userName_ = "";

        if (timeBuilder_ == null) {
          time_ = null;
        } else {
          time_ = null;
          timeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.demo.service.meetingService.MeetingService.internal_static_com_example_demo_service_meetingService_Meeting_descriptor;
      }

      @java.lang.Override
      public com.example.demo.service.meetingService.MeetingService.Meeting getDefaultInstanceForType() {
        return com.example.demo.service.meetingService.MeetingService.Meeting.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.demo.service.meetingService.MeetingService.Meeting build() {
        com.example.demo.service.meetingService.MeetingService.Meeting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.demo.service.meetingService.MeetingService.Meeting buildPartial() {
        com.example.demo.service.meetingService.MeetingService.Meeting result = new com.example.demo.service.meetingService.MeetingService.Meeting(this);
        result.id_ = id_;
        result.userId_ = userId_;
        result.userName_ = userName_;
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.demo.service.meetingService.MeetingService.Meeting) {
          return mergeFrom((com.example.demo.service.meetingService.MeetingService.Meeting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.demo.service.meetingService.MeetingService.Meeting other) {
        if (other == com.example.demo.service.meetingService.MeetingService.Meeting.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (!other.getUserName().isEmpty()) {
          userName_ = other.userName_;
          onChanged();
        }
        if (other.hasTime()) {
          mergeTime(other.getTime());
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
        com.example.demo.service.meetingService.MeetingService.Meeting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.demo.service.meetingService.MeetingService.Meeting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int userId_ ;
      /**
       * <code>int32 userId = 2;</code>
       */
      public int getUserId() {
        return userId_;
      }
      /**
       * <code>int32 userId = 2;</code>
       */
      public Builder setUserId(int value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 userId = 2;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object userName_ = "";
      /**
       * <code>string userName = 3;</code>
       */
      public java.lang.String getUserName() {
        java.lang.Object ref = userName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        java.lang.Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder setUserName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder clearUserName() {
        
        userName_ = getDefaultInstance().getUserName();
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp time_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public boolean hasTime() {
        return timeBuilder_ != null || time_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public com.google.protobuf.Timestamp getTime() {
        if (timeBuilder_ == null) {
          return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public Builder setTime(com.google.protobuf.Timestamp value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public Builder setTime(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public Builder mergeTime(com.google.protobuf.Timestamp value) {
        if (timeBuilder_ == null) {
          if (time_ != null) {
            time_ =
              com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = null;
          onChanged();
        } else {
          time_ = null;
          timeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
        
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : time_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp time = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.demo.service.meetingService.Meeting)
    }

    // @@protoc_insertion_point(class_scope:com.example.demo.service.meetingService.Meeting)
    private static final com.example.demo.service.meetingService.MeetingService.Meeting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.demo.service.meetingService.MeetingService.Meeting();
    }

    public static com.example.demo.service.meetingService.MeetingService.Meeting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Meeting>
        PARSER = new com.google.protobuf.AbstractParser<Meeting>() {
      @java.lang.Override
      public Meeting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Meeting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Meeting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Meeting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.demo.service.meetingService.MeetingService.Meeting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_service_meetingService_Meeting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_demo_service_meetingService_Meeting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024meetingService.proto\022\'com.example.demo" +
      ".service.meetingService\032\036google/protobuf" +
      "/wrappers.proto\032\037google/protobuf/timesta" +
      "mp.proto\"a\n\007Meeting\022\n\n\002id\030\001 \001(\005\022\016\n\006userI" +
      "d\030\002 \001(\005\022\020\n\010userName\030\003 \001(\t\022(\n\004time\030\004 \001(\0132" +
      "\032.google.protobuf.Timestamp2\264\002\n\016MeetingM" +
      "anager\022\\\n\013bookMeeting\0220.com.example.demo" +
      ".service.meetingService.Meeting\032\033.google" +
      ".protobuf.Int32Value\022b\n\017getUserMeetings\022" +
      "\033.google.protobuf.Int32Value\0320.com.examp" +
      "le.demo.service.meetingService.Meeting0\001" +
      "\022`\n\rcountMeetings\0220.com.example.demo.ser" +
      "vice.meetingService.Meeting\032\033.google.pro" +
      "tobuf.Int32Value(\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_com_example_demo_service_meetingService_Meeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_demo_service_meetingService_Meeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_demo_service_meetingService_Meeting_descriptor,
        new java.lang.String[] { "Id", "UserId", "UserName", "Time", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}