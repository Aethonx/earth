package io.shaded.earth.api.namespace;

import io.shaded.earth.api.util.Assert;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Namespace primarily used for worlds that are generated/used for a specific
 * plugin should be the namespace of the project.
 */
public interface EarthNamespace {

  EarthNamespace DEFAULT_NAMESPACE = EarthNamespace.of("earth");

  /**
   * Factory method to create a new namespace instance.
   *
   * @param namespace the namespace that must only contain characters and is not
   *                  empty.
   * @return a new namespace.
   */
  static @NonNull EarthNamespace of(final @NonNull String namespace) {
    Assert.requireAlpha(namespace, "Namespace must only contain characters.");
    Assert.requireNonEmpty(namespace, "Namespace must not be empty.");
    return new EarthNamespaceImpl(namespace);
  }

  /**
   * @return the namespace of the will always be lowercase.
   */
  @NonNull String namespace();
}
