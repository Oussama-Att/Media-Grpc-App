// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package org.xproce.lab;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_VideoIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_VideoIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_Video_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_Video_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_UploadVideoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_UploadVideoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_Creator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_Creator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_CreatorIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_CreatorIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xproce_lab_VideoStream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_xproce_lab_VideoStream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022\016org.xproce.lab\"\034\n\016VideoI" +
      "dRequest\022\n\n\002id\030\001 \001(\t\"\210\001\n\005Video\022\n\n\002id\030\001 \001" +
      "(\t\022\r\n\005title\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\013" +
      "\n\003url\030\004 \001(\t\022\030\n\020duration_seconds\030\005 \001(\005\022(\n" +
      "\007creator\030\006 \001(\0132\027.org.xproce.lab.Creator\"" +
      "\211\001\n\022UploadVideoRequest\022\r\n\005title\030\001 \001(\t\022\023\n" +
      "\013description\030\002 \001(\t\022\013\n\003url\030\003 \001(\t\022\030\n\020durat" +
      "ion_seconds\030\004 \001(\005\022(\n\007creator\030\005 \001(\0132\027.org" +
      ".xproce.lab.Creator\"2\n\007Creator\022\n\n\002id\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\"\036\n\020Creat" +
      "orIdRequest\022\n\n\002id\030\001 \001(\t\"4\n\013VideoStream\022%" +
      "\n\006videos\030\001 \003(\0132\025.org.xproce.lab.Video2\254\001" +
      "\n\016CreatorService\022G\n\ngetCreator\022 .org.xpr" +
      "oce.lab.CreatorIdRequest\032\027.org.xproce.la" +
      "b.Creator\022Q\n\020getCreatorVideos\022 .org.xpro" +
      "ce.lab.CreatorIdRequest\032\033.org.xproce.lab" +
      ".VideoStream2\233\001\n\014VideoService\022H\n\013uploadV" +
      "ideo\022\".org.xproce.lab.UploadVideoRequest" +
      "\032\025.org.xproce.lab.Video\022A\n\010getVideo\022\036.or" +
      "g.xproce.lab.VideoIdRequest\032\025.org.xproce" +
      ".lab.VideoB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_xproce_lab_VideoIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_xproce_lab_VideoIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_VideoIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_org_xproce_lab_Video_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_xproce_lab_Video_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_Video_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", "Url", "DurationSeconds", "Creator", });
    internal_static_org_xproce_lab_UploadVideoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_xproce_lab_UploadVideoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_UploadVideoRequest_descriptor,
        new java.lang.String[] { "Title", "Description", "Url", "DurationSeconds", "Creator", });
    internal_static_org_xproce_lab_Creator_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_xproce_lab_Creator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_Creator_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", });
    internal_static_org_xproce_lab_CreatorIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_xproce_lab_CreatorIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_CreatorIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_org_xproce_lab_VideoStream_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_xproce_lab_VideoStream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_xproce_lab_VideoStream_descriptor,
        new java.lang.String[] { "Videos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}