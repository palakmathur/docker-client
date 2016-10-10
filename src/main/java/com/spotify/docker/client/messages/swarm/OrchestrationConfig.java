/*
 * Copyright (c) 2015 Spotify AB.
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

package com.spotify.docker.client.messages.swarm;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE)
public class OrchestrationConfig {

  @JsonProperty("TaskHistoryRetentionLimit")
  private Integer taskHistoryRetentionLimit;

  public Integer taskHistoryRetentionLimit() {
    return taskHistoryRetentionLimit;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    final OrchestrationConfig that = (OrchestrationConfig) obj;

    return Objects.equals(this.taskHistoryRetentionLimit, that.taskHistoryRetentionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskHistoryRetentionLimit);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("taskHistoryRetentionLimit", taskHistoryRetentionLimit)
        .toString();
  }
}
