// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package br.com;

public final class UserServiceOuterClass {
  private UserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_UserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_UserRequestStream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_UserRequestStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_UserResponseStream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_UserResponseStream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021UserService.proto\022\006br.com\"T\n\014UserRespo" +
      "nse\022\021\n\004name\030\001 \001(\tH\000\210\001\001\022\030\n\013description\030\002 " +
      "\001(\tH\001\210\001\001B\007\n\005_nameB\016\n\014_description\"S\n\013Use" +
      "rRequest\022\021\n\004name\030\001 \001(\tH\000\210\001\001\022\030\n\013descripti" +
      "on\030\002 \001(\tH\001\210\001\001B\007\n\005_nameB\016\n\014_description\"!" +
      "\n\021UserRequestStream\022\014\n\004name\030\001 \001(\t\".\n\022Use" +
      "rResponseStream\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(" +
      "\t2\311\002\n\013UserService\0221\n\004user\022\023.br.com.UserR" +
      "equest\032\024.br.com.UserResponse\022W\n\034userStre" +
      "amServerSideStreamin\022\031.br.com.UserReques" +
      "tStream\032\032.br.com.UserResponseStream0\001\022X\n" +
      "\035userStreamClientSideStreaming\022\031.br.com." +
      "UserRequestStream\032\032.br.com.UserResponseS" +
      "tream(\001\022T\n\027userStreamBidirectional\022\031.br." +
      "com.UserRequestStream\032\032.br.com.UserRespo" +
      "nseStream(\0010\001B\n\n\006br.comP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_UserResponse_descriptor,
        new java.lang.String[] { "Name", "Description", "Name", "Description", });
    internal_static_br_com_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_UserRequest_descriptor,
        new java.lang.String[] { "Name", "Description", "Name", "Description", });
    internal_static_br_com_UserRequestStream_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_br_com_UserRequestStream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_UserRequestStream_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_br_com_UserResponseStream_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_br_com_UserResponseStream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_UserResponseStream_descriptor,
        new java.lang.String[] { "Name", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
