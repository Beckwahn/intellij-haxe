/*
 * Copyright 2020 EricBishton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.build;

/**
 * Created by ebishton on 1/17/16.
 */
public class UnsupportedMethodException extends UnsupportedOperationException {
  public UnsupportedMethodException() {
    super();
  }

  public UnsupportedMethodException(String reason) {
    super(reason);
  }

  public UnsupportedMethodException(String reason, Throwable cause) {
    super(reason + ":" + cause.getMessage(), cause);
  }
}
