package io.shaded.earth.plugin.compress;

/**
 * http://www.gzip.org/
 */
/* package-private */ final class GZipCompressor implements EarthCompressor {

  @Override
  public byte[] compress(byte[] in) {
    return new byte[0];
  }

  @Override
  public byte[] decompress(byte[] in) {
    return new byte[0];
  }
}
