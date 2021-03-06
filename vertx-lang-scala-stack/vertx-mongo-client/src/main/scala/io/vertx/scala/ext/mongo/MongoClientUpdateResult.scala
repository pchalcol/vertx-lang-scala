/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.scala.ext.mongo

import io.vertx.lang.scala.json.Json._
import io.vertx.core.json.JsonObject
import scala.collection.JavaConverters._
import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.{MongoClientUpdateResult => JMongoClientUpdateResult}

/**
  * Result propagated from mongodb driver update result.
  */
class MongoClientUpdateResult(private val _asJava: JMongoClientUpdateResult) {

  def asJava = _asJava

  /**
    * Get the number of documents that're matched
    */

  /**
    * Get the number of documents that're modified
    */

  /**
    * Get the document id that's upserted
    */
}

object MongoClientUpdateResult {
  
  def apply() = {
    new MongoClientUpdateResult(new JMongoClientUpdateResult(emptyObj()))
  }
  
  def apply(t: JMongoClientUpdateResult) = {
    if (t != null) {
      new MongoClientUpdateResult(t)
    } else {
      null
    }
  }
  
  def fromJson(json: JsonObject): MongoClientUpdateResult = {
    if (json != null) {
      new MongoClientUpdateResult(new JMongoClientUpdateResult(json))
    } else {
      null
    }
  }
}
