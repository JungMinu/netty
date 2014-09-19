/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.netty.resolver;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;

import java.net.SocketAddress;

/**
 * A {@link NameResolver} that does not perform any resolution but always reports successful resolution.
 * This resolver is useful when name resolution is performed by a handler in a pipeline, such as a proxy handler.
 */
public class NoopNameResolver extends SimpleNameResolver<SocketAddress> {

    public NoopNameResolver(EventExecutor executor) {
        super(executor);
    }

    @Override
    protected boolean doIsResolved(SocketAddress address) {
        return true;
    }

    @Override
    protected Future<SocketAddress> doResolve(SocketAddress unresolvedAddress) {
        return executor().newSucceededFuture(unresolvedAddress);
    }
}
