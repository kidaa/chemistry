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
package org.apache.chemistry.test;

import org.apache.chemistry.Repository;

/**
 * Tests the simple implementation directly (no client/server).
 */
public class TestSimpleDirect extends BasicTestCase {

    @Override
    public Repository makeRepository() throws Exception {
        Repository repo = BasicHelper.makeSimpleRepository(null);
        BasicHelper.populateRepository(repo);
        return repo;
    }

}
