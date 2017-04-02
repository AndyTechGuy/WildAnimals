/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.wildAnimals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.terasology.logic.behavior.tree.Node;
import org.terasology.logic.behavior.tree.Status;
import org.terasology.logic.behavior.tree.Task;
import org.terasology.logic.characters.CharacterMovementComponent;
import org.terasology.logic.health.HealthComponent;
import org.terasology.pathfinding.componentSystem.PathfinderSystem;
import org.terasology.registry.In;

public class InfiniteLoopNode extends Node {
    private static final Logger logger = LoggerFactory.getLogger(InfiniteLoopNode.class);

    public InfiniteLoopNode() {
    }

    public InfiniteLoopTask createTask() {
        return new InfiniteLoopTask(this);
    }

    public static class InfiniteLoopTask extends Task {
        public InfiniteLoopTask(Node node) {
            super(node);
        }

        public Status update(float dt) {
            return Status.RUNNING;
        }

        public void handle(Status result) {
        }

        public InfiniteLoopNode getNode() {
            return (InfiniteLoopNode) super.getNode();
        }
    }
}
