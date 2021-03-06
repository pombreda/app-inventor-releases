// Copyright 2008 Google Inc. All Rights Reserved.

package com.google.appinventor.components.runtime.errors;

import com.google.appinventor.components.annotations.SimpleObject;

/**
 * Runtime error indicating a failed attempt of converting a value of a type
 * into a value of another type, e.g. the String "foo" into an Integer, but
 * also converting from a base type to a derived type where there is no
 * relationship.
 *
 */
@SimpleObject
public class ConversionError extends RuntimeError {
}
