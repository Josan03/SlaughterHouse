// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimalPart.proto

package dk.via.slaughterhouse.protobuf.animalpart;

public final class AnimalPart {
  private AnimalPart() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AnimalPart.proto\022)dk.via.slaughterhous" +
      "e.protobuf.animalpart\"x\n\027CreateAnimalPar" +
      "tRequest\022\016\n\006weight\030\001 \001(\001\022\020\n\010animalId\030\002 \001" +
      "(\003\022\030\n\020animalPartTypeId\030\003 \001(\003\022\016\n\006trayId\030\004" +
      " \001(\003\022\021\n\tproductId\030\005 \001(\003\"0\n\030CreateAnimalP" +
      "artResponse\022\024\n\014confirmation\030\001 \001(\t\"\"\n\024Get" +
      "AnimalPartRequest\022\n\n\002id\030\001 \001(\003\"E\n\025GetAnim" +
      "alPartResponse\022\n\n\002id\030\001 \001(\003\022\016\n\006weight\030\002 \001" +
      "(\001\022\020\n\010animalId\030\003 \001(\0032\306\002\n\021AnimalPartServi" +
      "ce\022\233\001\n\020createAnimalPart\022B.dk.via.slaught" +
      "erhouse.protobuf.animalpart.CreateAnimal" +
      "PartRequest\032C.dk.via.slaughterhouse.prot" +
      "obuf.animalpart.CreateAnimalPartResponse" +
      "\022\222\001\n\rgetAnimalPart\022?.dk.via.slaughterhou" +
      "se.protobuf.animalpart.GetAnimalPartRequ" +
      "est\032@.dk.via.slaughterhouse.protobuf.ani" +
      "malpart.GetAnimalPartResponseB\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartRequest_descriptor,
        new java.lang.String[] { "Weight", "AnimalId", "AnimalPartTypeId", "TrayId", "ProductId", });
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animalpart_CreateAnimalPartResponse_descriptor,
        new java.lang.String[] { "Confirmation", });
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dk_via_slaughterhouse_protobuf_animalpart_GetAnimalPartResponse_descriptor,
        new java.lang.String[] { "Id", "Weight", "AnimalId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}