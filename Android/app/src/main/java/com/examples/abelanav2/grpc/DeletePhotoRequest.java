/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.examples.abelanav2.grpc;

@SuppressWarnings("hiding")
public final class DeletePhotoRequest extends
    com.google.protobuf.nano.MessageNano {

  private static volatile DeletePhotoRequest[] _emptyArray;
  public static DeletePhotoRequest[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new DeletePhotoRequest[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional int64 photo_id = 1;
  public long photoId;

  public DeletePhotoRequest() {
    clear();
  }

  public DeletePhotoRequest clear() {
    photoId = 0L;
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (this.photoId != 0L) {
      output.writeInt64(1, this.photoId);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (this.photoId != 0L) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt64Size(1, this.photoId);
    }
    return size;
  }

  @Override
  public DeletePhotoRequest mergeFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 8: {
          this.photoId = input.readInt64();
          break;
        }
      }
    }
  }

  public static DeletePhotoRequest parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new DeletePhotoRequest(), data);
  }

  public static DeletePhotoRequest parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new DeletePhotoRequest().mergeFrom(input);
  }
}
