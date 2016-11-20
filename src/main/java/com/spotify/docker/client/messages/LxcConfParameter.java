/*
 * Copyright (c) 2014 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.docker.client.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("WeakerAccess")
@AutoValue
public abstract class LxcConfParameter {

  LxcConfParameter() {
    // Prevent outside instantiation
  }

  @NotNull
  @JsonProperty("Key")
  public abstract String key();

  @NotNull
  @JsonProperty("Value")
  public abstract String value();

  @JsonCreator
  static LxcConfParameter create(
      @JsonProperty("Key") final String key,
      @JsonProperty("Value") final String value) {
    return new AutoValue_LxcConfParameter(key, value);
  }
}
