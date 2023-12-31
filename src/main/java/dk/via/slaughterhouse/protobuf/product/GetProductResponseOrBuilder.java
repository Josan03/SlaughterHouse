// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package dk.via.slaughterhouse.protobuf.product;

public interface GetProductResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.slaughterhouse.protobuf.product.GetProductResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated int64 animalPartsIds = 4;</code>
   * @return A list containing the animalPartsIds.
   */
  java.util.List<java.lang.Long> getAnimalPartsIdsList();
  /**
   * <code>repeated int64 animalPartsIds = 4;</code>
   * @return The count of animalPartsIds.
   */
  int getAnimalPartsIdsCount();
  /**
   * <code>repeated int64 animalPartsIds = 4;</code>
   * @param index The index of the element to return.
   * @return The animalPartsIds at the given index.
   */
  long getAnimalPartsIds(int index);

  /**
   * <code>int64 trayId = 5;</code>
   * @return The trayId.
   */
  long getTrayId();
}
