package io.shaded.earth.plugin.compress;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Defines an abstract compression to allow various compression algorithms to be
 * implemented.
 * <p>
 * The type of compression is denoted as an integer as most SQL databases do not
 * support `ENUM` type out of the box.
 * <p>
 * Type mappings:
 * <p>
 * Zstandard -> 0
 */
public interface EarthCompressor {

  /**
   * Zstandard compression type.
   */
  int Z_STANDARD_COMPRESS_TYPE = 0;

  /**
   * Creates a new implementation of the compressor that allows for compression
   * algorithms to be switch easy if needed.
   *
   * @param type type of compressor to use see {@link EarthCompressor} for type
   *             to integer mapping. At the moment the number for compression
   *             has no effect on compression type.
   * @return a compressor
   */
  static @NonNull EarthCompressor create(final int type) {
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
