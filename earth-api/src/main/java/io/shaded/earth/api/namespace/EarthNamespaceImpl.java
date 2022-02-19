package io.shaded.earth.api.namespace;

import org.checkerframework.checker.nullness.qual.NonNull;

/*package-private*/ final class EarthNamespaceImpl implements EarthNamespace {

  private final @NonNull String namespace;

  EarthNamespaceImpl(@NonNull String namespace) {
    namespace = namespace.toLowerCase(); // namespaces should be all lower case
    this.namespace = namespace;
  }

  public @NonNull String namespace() {
    return this.namespace;
  }
}
