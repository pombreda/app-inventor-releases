package com.google.appinventor.common.testutils;

import java.io.File;

/**
 * Utility methods for testing
 * @author kerr@google.com (Debby Wallach)
 *
 */
public class TestUtils {
  public static final String APP_INVENTOR_ROOT_DIR = getAppInventorRootDir();

  protected TestUtils() {}

  private static String getAppInventorRootDir() {
    // Goal is to find appinventor directory, so we check current
    // directory, then keep backing up until we see appinventor.
    File dir = new File("");
    while (dir != null) {
      dir = dir.getAbsoluteFile();
      File appinventor = new File(dir, "appinventor");
      if (appinventor.exists()) {
        return appinventor.getAbsolutePath();
      }

      dir = dir.getParentFile();
    }

    assert false;
    return null;  //  to make compiler happy
  }

}