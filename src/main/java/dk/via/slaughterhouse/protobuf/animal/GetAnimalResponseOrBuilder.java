// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package dk.via.slaughterhouse.protobuf.animal;

public interface GetAnimalResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 animalId = 1;</code>
   * @return The animalId.
   */
  long getAnimalId();

  /**
   * <code>int64 animalTypeId = 2;</code>
   * @return The animalTypeId.
   */
  long getAnimalTypeId();

  /**
   * <code>double weight = 3;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>string registrationDate = 4;</code>
   * @return The registrationDate.
   */
  java.lang.String getRegistrationDate();
  /**
   * <code>string registrationDate = 4;</code>
   * @return The bytes for registrationDate.
   */
  com.google.protobuf.ByteString
      getRegistrationDateBytes();
}