/*
 * Copyright (C) 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.node;

import org.ros.namespace.GraphName;

/**
 * Builds new {@link Node}s.
 * 
 * @author damonkohler@google.com (Damon Kohler)
 */
public interface NodeFactory {

  /**
   * Build a new {@link Node} with the given and {@link NodeConfiguration} and
   * default name.
   * 
   * @param defaultNodeName
   *          the name of the {@link Node} if the name is not already specified
   *          in the {@link NodeConfiguration}
   * @param configuration
   *          the {@link NodeConfiguration} for the new {@link Node}
   * @return a new {@link Node}
   */
  Node newNode(GraphName defaultNodeName, NodeConfiguration configuration);

  /**
   * Build a new {@link Node} with the given and {@link NodeConfiguration} and
   * default name.
   * 
   * @param defaultNodeName
   *          the name of the {@link Node} if the name is not already specified
   *          in the {@link NodeConfiguration}
   * @param configuration
   *          the {@link NodeConfiguration} for the new {@link Node}
   * @return a new {@link Node}
   */
  Node newNode(String defaultNodeName, NodeConfiguration configuration);

}
