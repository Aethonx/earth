package io.shaded.earth.plugin.compress;

import com.github.luben.zstd.Zstd;

/**
 * Zstd is a compression algorithm developed by Facebook more information can be
 * found at https://facebook.github.io/zstd/. With the Java wrapper for Zstd
 * being found at https://github.com/luben/zstd-jni.
 */
/* package-private */ final class ZstdCompressor implements EarthCompressor {

  private static final int ZSTD_COMPRESSION_LEVEL = 6;
  private static final int DECOMPRESSED_MAXIMUM_ARRAY_LENGTH = 100000000;

  @Override
  public byte[] compress(byte[] in) {
    return Zstd.compress(in, ZSTD_COMPRESSION_LEVEL);
  }

  @Override
  public byte[] decompress(byte[] in) {
    byte[] dst = new byte[DECOMPRESSED_MAXIMUM_ARRAY_LENGTH];
    Zstd.decompress(dst, in);
    return dst;
  }
}
