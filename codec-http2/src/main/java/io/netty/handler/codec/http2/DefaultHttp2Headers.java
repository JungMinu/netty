/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License, version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.netty.handler.codec.http2;

import io.netty.handler.codec.AsciiString;
import io.netty.handler.codec.BinaryHeaders;
import io.netty.handler.codec.DefaultBinaryHeaders;

public class DefaultHttp2Headers extends DefaultBinaryHeaders implements Http2Headers {

    public DefaultHttp2Headers() {
    }

    @Override
    public Http2Headers add(AsciiString name, AsciiString value) {
        super.add(name, value);
        return this;
    }

    @Override
    public Http2Headers add(AsciiString name, Iterable<AsciiString> values) {
        super.add(name, values);
        return this;
    }

    @Override
    public Http2Headers add(AsciiString name, AsciiString... values) {
        super.add(name, values);
        return this;
    }

    @Override
    public Http2Headers add(BinaryHeaders headers) {
        super.add(headers);
        return this;
    }

    @Override
    public Http2Headers set(AsciiString name, AsciiString value) {
        super.set(name, value);
        return this;
    }

    @Override
    public Http2Headers set(AsciiString name, Iterable<AsciiString> values) {
        super.set(name, values);
        return this;
    }

    @Override
    public Http2Headers set(AsciiString name, AsciiString... values) {
        super.set(name, values);
        return this;
    }

    @Override
    public Http2Headers set(BinaryHeaders headers) {
        super.set(headers);
        return this;
    }

    @Override
    public Http2Headers setAll(BinaryHeaders headers) {
        super.setAll(headers);
        return this;
    }

    @Override
    public Http2Headers clear() {
        super.clear();
        return this;
    }

    @Override
    public Http2Headers forEachEntry(final BinaryHeaders.BinaryHeaderVisitor visitor) {
        super.forEachEntry(visitor);
        return this;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Http2Headers)) {
            return false;
        }

        return super.equals((BinaryHeaders) o);
    }

    @Override
    public Http2Headers method(AsciiString value) {
        set(PseudoHeaderName.METHOD.value(), value);
        return this;
    }

    @Override
    public Http2Headers scheme(AsciiString value) {
        set(PseudoHeaderName.SCHEME.value(), value);
        return this;
    }

    @Override
    public Http2Headers authority(AsciiString value) {
        set(PseudoHeaderName.AUTHORITY.value(), value);
        return this;
    }

    @Override
    public Http2Headers path(AsciiString value) {
        set(PseudoHeaderName.PATH.value(), value);
        return this;
    }

    @Override
    public Http2Headers status(AsciiString value) {
        set(PseudoHeaderName.STATUS.value(), value);
        return this;
    }

    @Override
    public AsciiString method() {
        return get(PseudoHeaderName.METHOD.value());
    }

    @Override
    public AsciiString scheme() {
        return get(PseudoHeaderName.SCHEME.value());
    }

    @Override
    public AsciiString authority() {
        return get(PseudoHeaderName.AUTHORITY.value());
    }

    @Override
    public AsciiString path() {
        return get(PseudoHeaderName.PATH.value());
    }

    @Override
    public AsciiString status() {
        return get(PseudoHeaderName.STATUS.value());
    }
}
