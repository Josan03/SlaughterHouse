// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package dk.via.slaughterhouse.protobuf.tray;

public final class Tray {
  private Tray() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nTray.proto\022#dk.via.slaughterhouse.prot" +
      "obuf.tray\"S\n\021CreateTrayRequest\022\023\n\013descri" +
      "ption\030\001 \001(\t\022\021\n\tmaxWeight\030\002 \001(\001\022\026\n\016animal" +
      "PartsIds\030\003 \003(\003\"*\n\022CreateTrayResponse\022\024\n\014" +
      "confirmation\030\001 \001(\t\"\034\n\016GetTrayRequest\022\n\n\002" +
      "id\030\001 \001(\003\"]\n\017GetTrayResponse\022\n\n\002id\030\001 \001(\003\022" +
      "\023\n\013description\030\002 \001(\t\022\021\n\tmaxWeight\030\003 \001(\001\022" +
      "\026\n\016animalPartsIds\030\004 \003(\0032\202\002\n\013TrayService\022" +
      "}\n\ncreateTray\0226.dk.via.slaughterhouse.pr" +
      "otobuf.tray.CreateTrayRequest\0327.dk.via.s" +
      "laughterhouse.protobuf.tray.CreateTrayRe" +
      "sponse\022t\n\007getTray\0223.dk.via.slaughterhous" +
      "e.protobuf.tray.GetTrayRequest\0324.dk.via." +
      "slaughterhouse.protobuf.tray.GetTrayResp" +
      "onseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayRequest_descriptor,
        new java.lang.String[] { "Description", "MaxWeight", "AnimalPartsIds", });
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor,
        new java.lang.String[] { "Confirmation", });
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_tray_GetTrayResponse_descriptor,
        new java.lang.String[] { "Id", "Description", "MaxWeight", "AnimalPartsIds", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
