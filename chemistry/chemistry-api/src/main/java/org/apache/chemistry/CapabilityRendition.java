/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors:
 *     Florent Guillaume, Nuxeo
 */
package org.apache.chemistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Support for renditions.
 */
public enum CapabilityRendition {

    /**
     * The repository does not expose renditions at all.
     */
    NONE("none"),

    /**
     * Renditions are provided by the repository and readable by the client.
     */
    READ("read");

    private final String value;

    private CapabilityRendition(String value) {
        this.value = value;
    }

    private static final Map<String, CapabilityRendition> all = new HashMap<String, CapabilityRendition>();
    static {
        for (CapabilityRendition o : values()) {
            all.put(o.value, o);
        }
    }

    public static CapabilityRendition get(String value) {
        CapabilityRendition o = all.get(value);
        if (o == null) {
            throw new IllegalArgumentException(value);
        }
        return o;
    }

    public static CapabilityRendition get(String value, CapabilityRendition def) {
        CapabilityRendition o = all.get(value);
        if (o == null) {
            o = def;
        }
        return o;
    }

    @Override
    public String toString() {
        return value;
    }
}
