package io.shaded.earth.api;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/**
 * Tests to ensure that only valid namespaces can be created via {@link
 * EarthNamespace} of.
 */
final class EarthNamespaceTest {

  @Test
  void testOnlyCharactersNamespace() {
    assertThatThrownBy(
        () -> EarthNamespace.of("earth123::a123##$"))
        .hasMessage("Namespace must only contain characters.");
  }

  @Test
  void testEmptyStringNamespace() {
    assertThatThrownBy(() -> EarthNamespace.of(""))
        .hasMessage("Namespace must not be empty.");
  }

  @Test
  void testValidNamespace() {
    assertDoesNotThrow(() -> EarthNamespace.of("earth"));
  }
}