// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notificationService.proto

package com.example.demo.serviceImpl.notificationService;

public final class NotificationService {
  private NotificationService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NotificationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.demo.serviceImpl.notificationService.Notification)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>int32 userID = 2;</code>
     */
    int getUserID();

    /**
     * <code>string userEmail = 3;</code>
     */
    java.lang.String getUserEmail();
    /**
     * <code>string userEmail = 3;</code>
     */
    com.google.protobuf.ByteString
        getUserEmailBytes();

    /**
     * <code>string subject = 4;</code>
     */
    java.lang.String getSubject();
    /**
     * <code>string subject = 4;</code>
     */
    com.google.protobuf.ByteString
        getSubjectBytes();

    /**
     * <code>string msg = 5;</code>
     */
    java.lang.String getMsg();
    /**
     * <code>string msg = 5;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code com.example.demo.serviceImpl.notificationService.Notification}
   */
  public  static final class Notification extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.demo.serviceImpl.notificationService.Notification)
      NotificationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Notification.newBuilder() to construct.
    private Notification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Notification() {
      id_ = 0;
      userID_ = 0;
      userEmail_ = "";
      subject_ = "";
      msg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Notification(
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

              userID_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              userEmail_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              subject_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              msg_ = s;
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
      return com.example.demo.serviceImpl.notificationService.NotificationService.internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.serviceImpl.notificationService.NotificationService.internal_static_com_example_demo_serviceImpl_notificationService_Notification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.serviceImpl.notificationService.NotificationService.Notification.class, com.example.demo.serviceImpl.notificationService.NotificationService.Notification.Builder.class);
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
    private int userID_;
    /**
     * <code>int32 userID = 2;</code>
     */
    public int getUserID() {
      return userID_;
    }

    public static final int USEREMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object userEmail_;
    /**
     * <code>string userEmail = 3;</code>
     */
    public java.lang.String getUserEmail() {
      java.lang.Object ref = userEmail_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEmail_ = s;
        return s;
      }
    }
    /**
     * <code>string userEmail = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserEmailBytes() {
      java.lang.Object ref = userEmail_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUBJECT_FIELD_NUMBER = 4;
    private volatile java.lang.Object subject_;
    /**
     * <code>string subject = 4;</code>
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      }
    }
    /**
     * <code>string subject = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSG_FIELD_NUMBER = 5;
    private volatile java.lang.Object msg_;
    /**
     * <code>string msg = 5;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>string msg = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (userID_ != 0) {
        output.writeInt32(2, userID_);
      }
      if (!getUserEmailBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userEmail_);
      }
      if (!getSubjectBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, subject_);
      }
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msg_);
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
      if (userID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, userID_);
      }
      if (!getUserEmailBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userEmail_);
      }
      if (!getSubjectBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, subject_);
      }
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msg_);
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
      if (!(obj instanceof com.example.demo.serviceImpl.notificationService.NotificationService.Notification)) {
        return super.equals(obj);
      }
      com.example.demo.serviceImpl.notificationService.NotificationService.Notification other = (com.example.demo.serviceImpl.notificationService.NotificationService.Notification) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getUserID()
          == other.getUserID());
      result = result && getUserEmail()
          .equals(other.getUserEmail());
      result = result && getSubject()
          .equals(other.getSubject());
      result = result && getMsg()
          .equals(other.getMsg());
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
      hash = (53 * hash) + getUserID();
      hash = (37 * hash) + USEREMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getUserEmail().hashCode();
      hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
      hash = (53 * hash) + getSubject().hashCode();
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification parseFrom(
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
    public static Builder newBuilder(com.example.demo.serviceImpl.notificationService.NotificationService.Notification prototype) {
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
     * Protobuf type {@code com.example.demo.serviceImpl.notificationService.Notification}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.demo.serviceImpl.notificationService.Notification)
        com.example.demo.serviceImpl.notificationService.NotificationService.NotificationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.demo.serviceImpl.notificationService.NotificationService.internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.demo.serviceImpl.notificationService.NotificationService.internal_static_com_example_demo_serviceImpl_notificationService_Notification_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.demo.serviceImpl.notificationService.NotificationService.Notification.class, com.example.demo.serviceImpl.notificationService.NotificationService.Notification.Builder.class);
      }

      // Construct using com.example.demo.serviceImpl.notificationService.NotificationService.Notification.newBuilder()
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

        userID_ = 0;

        userEmail_ = "";

        subject_ = "";

        msg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.demo.serviceImpl.notificationService.NotificationService.internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor;
      }

      @java.lang.Override
      public com.example.demo.serviceImpl.notificationService.NotificationService.Notification getDefaultInstanceForType() {
        return com.example.demo.serviceImpl.notificationService.NotificationService.Notification.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.demo.serviceImpl.notificationService.NotificationService.Notification build() {
        com.example.demo.serviceImpl.notificationService.NotificationService.Notification result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.demo.serviceImpl.notificationService.NotificationService.Notification buildPartial() {
        com.example.demo.serviceImpl.notificationService.NotificationService.Notification result = new com.example.demo.serviceImpl.notificationService.NotificationService.Notification(this);
        result.id_ = id_;
        result.userID_ = userID_;
        result.userEmail_ = userEmail_;
        result.subject_ = subject_;
        result.msg_ = msg_;
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
        if (other instanceof com.example.demo.serviceImpl.notificationService.NotificationService.Notification) {
          return mergeFrom((com.example.demo.serviceImpl.notificationService.NotificationService.Notification)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.demo.serviceImpl.notificationService.NotificationService.Notification other) {
        if (other == com.example.demo.serviceImpl.notificationService.NotificationService.Notification.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUserID() != 0) {
          setUserID(other.getUserID());
        }
        if (!other.getUserEmail().isEmpty()) {
          userEmail_ = other.userEmail_;
          onChanged();
        }
        if (!other.getSubject().isEmpty()) {
          subject_ = other.subject_;
          onChanged();
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
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
        com.example.demo.serviceImpl.notificationService.NotificationService.Notification parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.demo.serviceImpl.notificationService.NotificationService.Notification) e.getUnfinishedMessage();
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

      private int userID_ ;
      /**
       * <code>int32 userID = 2;</code>
       */
      public int getUserID() {
        return userID_;
      }
      /**
       * <code>int32 userID = 2;</code>
       */
      public Builder setUserID(int value) {
        
        userID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 userID = 2;</code>
       */
      public Builder clearUserID() {
        
        userID_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object userEmail_ = "";
      /**
       * <code>string userEmail = 3;</code>
       */
      public java.lang.String getUserEmail() {
        java.lang.Object ref = userEmail_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userEmail_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userEmail = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUserEmailBytes() {
        java.lang.Object ref = userEmail_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userEmail_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userEmail = 3;</code>
       */
      public Builder setUserEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userEmail_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string userEmail = 3;</code>
       */
      public Builder clearUserEmail() {
        
        userEmail_ = getDefaultInstance().getUserEmail();
        onChanged();
        return this;
      }
      /**
       * <code>string userEmail = 3;</code>
       */
      public Builder setUserEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userEmail_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object subject_ = "";
      /**
       * <code>string subject = 4;</code>
       */
      public java.lang.String getSubject() {
        java.lang.Object ref = subject_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          subject_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string subject = 4;</code>
       */
      public com.google.protobuf.ByteString
          getSubjectBytes() {
        java.lang.Object ref = subject_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          subject_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string subject = 4;</code>
       */
      public Builder setSubject(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        subject_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string subject = 4;</code>
       */
      public Builder clearSubject() {
        
        subject_ = getDefaultInstance().getSubject();
        onChanged();
        return this;
      }
      /**
       * <code>string subject = 4;</code>
       */
      public Builder setSubjectBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        subject_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>string msg = 5;</code>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string msg = 5;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg = 5;</code>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 5;</code>
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 5;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:com.example.demo.serviceImpl.notificationService.Notification)
    }

    // @@protoc_insertion_point(class_scope:com.example.demo.serviceImpl.notificationService.Notification)
    private static final com.example.demo.serviceImpl.notificationService.NotificationService.Notification DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.demo.serviceImpl.notificationService.NotificationService.Notification();
    }

    public static com.example.demo.serviceImpl.notificationService.NotificationService.Notification getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Notification>
        PARSER = new com.google.protobuf.AbstractParser<Notification>() {
      @java.lang.Override
      public Notification parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Notification(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Notification> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Notification> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.demo.serviceImpl.notificationService.NotificationService.Notification getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_demo_serviceImpl_notificationService_Notification_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031notificationService.proto\0220com.example" +
      ".demo.serviceImpl.notificationService\032\036g" +
      "oogle/protobuf/wrappers.proto\"[\n\014Notific" +
      "ation\022\n\n\002id\030\001 \001(\005\022\016\n\006userID\030\002 \001(\005\022\021\n\tuse" +
      "rEmail\030\003 \001(\t\022\017\n\007subject\030\004 \001(\t\022\013\n\003msg\030\005 \001" +
      "(\t2\254\002\n\023NotificationManager\022r\n\020sendNotifi" +
      "cation\022>.com.example.demo.serviceImpl.no" +
      "tificationService.Notification\032\032.google." +
      "protobuf.BoolValue(\0010\001\022O\n\023turnOnNotifica" +
      "tions\022\033.google.protobuf.Int32Value\032\033.goo" +
      "gle.protobuf.Int32Value\022P\n\024turnOffNotifi" +
      "cations\022\033.google.protobuf.Int32Value\032\033.g" +
      "oogle.protobuf.Int32Valueb\006proto3"
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
        }, assigner);
    internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_demo_serviceImpl_notificationService_Notification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_demo_serviceImpl_notificationService_Notification_descriptor,
        new java.lang.String[] { "Id", "UserID", "UserEmail", "Subject", "Msg", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
