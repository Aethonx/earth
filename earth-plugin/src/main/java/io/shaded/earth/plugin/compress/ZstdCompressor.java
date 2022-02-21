package io.shaded.earth.plugin.compress;

/**
 * Zstd is a compression algorithm developed by Facebook more information can be
 * found at https://facebook.github.io/zstd/. With the Java wrapper for Zstd
 * being found at https://github.com/luben/zstd-jni.
 */
/* package-private */ final class ZstdCompressor implements EarthCompressor {

  @Override
  public byte[] compress(byte[] in) {
    return new byte[0];
  }

  @Override
  public byte[] decompress(byte[] in) {
    return new byte[0];
  }
}
