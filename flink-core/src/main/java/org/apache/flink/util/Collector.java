/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.util;

import org.apache.flink.annotation.Public;

/**
 * Collects a record and forwards it. The collector is the "push" counterpart(对应方) of the {@link
 * java.util.Iterator}, which "pulls" data in.
 */
// 为什么在这里又有一个collector？org/apache/flink/datastream/api/common/Collector.java
@Public
public interface Collector<T> {

    /**
     * Emits a record.
     *
     * @param record The record to collect.
     */
    void collect(T record);

    /** Closes the collector. If any data was buffered, that data will be flushed（刷新）. */
    void close();
}
