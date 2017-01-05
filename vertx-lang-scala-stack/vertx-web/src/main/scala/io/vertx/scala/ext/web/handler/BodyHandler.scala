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

package io.vertx.scala.ext.web.handler

import scala.compat.java8.FunctionConverters._
import io.vertx.lang.scala.HandlerOps._
import io.vertx.lang.scala.Converter._
import scala.reflect.runtime.universe._
import io.vertx.lang.scala.Converter._
import io.vertx.ext.web.{RoutingContext => JRoutingContext}
import io.vertx.ext.web.handler.{BodyHandler => JBodyHandler}
import io.vertx.scala.ext.web.RoutingContext
import io.vertx.core.Handler

/**
  * A handler which gathers the entire request body and sets it on the .
  * 
  * It also handles HTTP file uploads and can be used to limit body sizes.
  */
class BodyHandler(private val _asJava: Object) 
    extends io.vertx.core.Handler[RoutingContext] {

  def asJava = _asJava

//cached methods
//fluent methods
  def setBodyLimit(bodyLimit: Long):BodyHandler = {
    asJava.asInstanceOf[JBodyHandler].setBodyLimit(bodyLimit.asInstanceOf[java.lang.Long])
    this
  }

  def setUploadsDirectory(uploadsDirectory: String):BodyHandler = {
    asJava.asInstanceOf[JBodyHandler].setUploadsDirectory(uploadsDirectory.asInstanceOf[java.lang.String])
    this
  }

  def setMergeFormAttributes(mergeFormAttributes: Boolean):BodyHandler = {
    asJava.asInstanceOf[JBodyHandler].setMergeFormAttributes(mergeFormAttributes.asInstanceOf[java.lang.Boolean])
    this
  }

  def setDeleteUploadedFilesOnEnd(deleteUploadedFilesOnEnd: Boolean):BodyHandler = {
    asJava.asInstanceOf[JBodyHandler].setDeleteUploadedFilesOnEnd(deleteUploadedFilesOnEnd.asInstanceOf[java.lang.Boolean])
    this
  }

//default methods
//basic methods
  override def handle(arg0: RoutingContext):Unit = {
    asJava.asInstanceOf[JBodyHandler].handle(arg0.asJava.asInstanceOf[JRoutingContext])
  }

//future methods
}

  object BodyHandler{
    def apply(asJava: JBodyHandler) = new BodyHandler(asJava)  
  //static methods
    def create():BodyHandler = {
      BodyHandler(JBodyHandler.create())
    }

    def create(uploadDirectory: String):BodyHandler = {
      BodyHandler(JBodyHandler.create(uploadDirectory.asInstanceOf[java.lang.String]))
    }

  }
