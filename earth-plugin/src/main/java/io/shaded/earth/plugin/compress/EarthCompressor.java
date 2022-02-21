package io.shaded.earth.plugin.compress;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface EarthCompressor {

  /**
   * Types of compression alrogithams that are supported out of the box.
   */
  enum CompressorType {
    GZIP, ZSTD
  }

  /**
   * Creates a new implementation of the compressor that allows for compression
   * algorithms to be switch easy if needed.
   *
   * @param type type of compressor to use.
   * @return a compressor
   */
  static @NonNull EarthCompressor create(
      final @NonNull CompressorType type) {
    if (type == CompressorType.GZIP) {
      return new GZipCompressor();
    }
    return new ZstdCompressor();
  }

  /**
   * @param in the byte array to compress.
   * @return returns the compressed bytebuffer.
   */
  byte[] compress(byte[] in);

  /**
   * @param in the byte array to decompress.
   * @return the decompressed byte array.
   */
  byte[] decompress(byte[] in);
}
