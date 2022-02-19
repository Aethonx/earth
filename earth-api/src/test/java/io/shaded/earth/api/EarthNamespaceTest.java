package io.shaded.earth.api;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.shaded.earth.api.namespace.EarthNamespace;
import org.junit.jupiter.api.Test;

/**
 * Tests to ensure that only valid namespaces can be created via {@link
 * EarthNamespace} of.
 */
final class EarthNamespaceTest {

  @Test
  void testOnlyCharactersNamespace() {
    assertThrows(IllegalArgumentException.class,
        () -> EarthNamespace.of("earth123::a123##$"),
        "Namespace must only contain characters.");
  }

  @Test
  void testEmptyStringNamespace() {
    assertThrows(IllegalArgumentException.class,
        () -> EarthNamespace.of(""),
        "Namespace must not be empty."
    );
  }

  @Test
  void testValidNamespace() {
    assertDoesNotThrow(() -> EarthNamespace.of("earth"));
  }
}