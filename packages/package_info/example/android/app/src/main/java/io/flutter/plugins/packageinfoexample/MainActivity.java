// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.packageinfoexample;

import dev.flutter.plugins.e2e.E2EPlugin;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.packageinfo.PackageInfoPlugin;

public class MainActivity extends FlutterActivity {
  // TODO(jackson): Remove this once v2 of GeneratedPluginRegistrant rolls to stable.
  // https://github.com/flutter/flutter/issues/42694
  @Override
  public void configureFlutterEngine(FlutterEngine flutterEngine) {
    flutterEngine.getPlugins().add(new PackageInfoPlugin());
    flutterEngine.getPlugins().add(new E2EPlugin());
  }
}
