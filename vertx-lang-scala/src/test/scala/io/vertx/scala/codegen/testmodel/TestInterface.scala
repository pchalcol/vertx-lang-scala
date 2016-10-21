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

package io.vertx.scala.codegen.testmodel

import io.vertx.lang.scala.HandlerOps._
import scala.compat.java8.FunctionConverters._
import scala.collection.JavaConverters._
import io.vertx.codegen.testmodel.TestDataObject
import io.vertx.codegen.testmodel.TestEnum
import io.vertx.core.json.JsonObject
import io.vertx.codegen.testmodel.TestGenEnum
import io.vertx.core.json.JsonArray
import io.vertx.core.Handler

/**
  */
class TestInterface(private val _asJava: io.vertx.codegen.testmodel.TestInterface) 
    extends io.vertx.scala.codegen.testmodel.SuperInterface2 {

  def asJava: io.vertx.codegen.testmodel.TestInterface = _asJava

  def otherSuperMethodWithBasicParams(b: Byte, s: Short, i: Int, l: Long, f: Float, d: Double, bool: Boolean, ch: Char, str: String): Unit = {
    _asJava.otherSuperMethodWithBasicParams(b, s, i, l, f, d, bool, ch, str)
  }

  def methodWithBasicParams(b: Byte, s: Short, i: Int, l: Long, f: Float, d: Double, bool: Boolean, ch: Char, str: String): Unit = {
    _asJava.methodWithBasicParams(b, s, i, l, f, d, bool, ch, str)
  }

  def methodWithBasicBoxedParams(b: Byte, s: Short, i: Int, l: Long, f: Float, d: Double, bool: Boolean, ch: Char): Unit = {
    _asJava.methodWithBasicBoxedParams(b, s, i, l, f, d, bool, ch)
  }

  def methodWithHandlerBasicTypes(byteHandler: Byte => Unit, shortHandler: Short => Unit, intHandler: Int => Unit, longHandler: Long => Unit, floatHandler: Float => Unit, doubleHandler: Double => Unit, booleanHandler: Boolean => Unit, charHandler: Char => Unit, stringHandler: String => Unit): Unit = {
    _asJava.methodWithHandlerBasicTypes(funcToMappedHandler[java.lang.Byte, Byte](x => x)(byteHandler), funcToMappedHandler[java.lang.Short, Short](x => x)(shortHandler), funcToMappedHandler[java.lang.Integer, Int](x => x)(intHandler), funcToMappedHandler[java.lang.Long, Long](x => x)(longHandler), funcToMappedHandler[java.lang.Float, Float](x => x)(floatHandler), funcToMappedHandler[java.lang.Double, Double](x => x)(doubleHandler), funcToMappedHandler[java.lang.Boolean, Boolean](x => x)(booleanHandler), funcToMappedHandler[java.lang.Character, Char](x => x)(charHandler), funcToHandler[java.lang.String](stringHandler))
  }

  def methodWithHandlerStringReturn(expected: String): String => Unit = {
    handlerToFunc[String](_asJava.methodWithHandlerStringReturn(expected))
  }

  def methodWithHandlerGenericReturn[T](handler: T => Unit): T => Unit = {
    handlerToFunc[T](_asJava.methodWithHandlerGenericReturn(funcToHandler(handler)))
  }

  def methodWithHandlerVertxGenReturn(expected: String): io.vertx.scala.codegen.testmodel.RefedInterface1 => Unit = {
    handlerToMappedFunction[io.vertx.codegen.testmodel.RefedInterface1, io.vertx.scala.codegen.testmodel.RefedInterface1](x => x.asJava)(_asJava.methodWithHandlerVertxGenReturn(expected))
  }

  def methodWithHandlerAsyncResultByteFuture(sendFailure: Boolean): concurrent.Future[Byte] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Byte,Byte]((x => x))
    _asJava.methodWithHandlerAsyncResultByte(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultShortFuture(sendFailure: Boolean): concurrent.Future[Short] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Short,Short]((x => x))
    _asJava.methodWithHandlerAsyncResultShort(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultIntegerFuture(sendFailure: Boolean): concurrent.Future[Int] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Integer,Int]((x => x))
    _asJava.methodWithHandlerAsyncResultInteger(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultLongFuture(sendFailure: Boolean): concurrent.Future[Long] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Long,Long]((x => x))
    _asJava.methodWithHandlerAsyncResultLong(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultFloatFuture(sendFailure: Boolean): concurrent.Future[Float] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Float,Float]((x => x))
    _asJava.methodWithHandlerAsyncResultFloat(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultDoubleFuture(sendFailure: Boolean): concurrent.Future[Double] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Double,Double]((x => x))
    _asJava.methodWithHandlerAsyncResultDouble(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultBooleanFuture(sendFailure: Boolean): concurrent.Future[Boolean] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Boolean,Boolean]((x => x))
    _asJava.methodWithHandlerAsyncResultBoolean(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultCharacterFuture(sendFailure: Boolean): concurrent.Future[Char] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Character,Char]((x => x))
    _asJava.methodWithHandlerAsyncResultCharacter(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultStringFuture(sendFailure: Boolean): concurrent.Future[String] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.String,String]((x => x))
    _asJava.methodWithHandlerAsyncResultString(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultDataObjectFuture(sendFailure: Boolean): concurrent.Future[io.vertx.scala.codegen.testmodel.TestDataObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.codegen.testmodel.TestDataObject,io.vertx.scala.codegen.testmodel.TestDataObject]((x => io.vertx.scala.codegen.testmodel.TestDataObject(x)))
    _asJava.methodWithHandlerAsyncResultDataObject(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultStringReturn(expected: String, fail: Boolean): io.vertx.core.AsyncResult [String] => Unit = {
    handlerToFunc[io.vertx.core.AsyncResult[java.lang.String]](_asJava.methodWithHandlerAsyncResultStringReturn(expected, fail))
  }

  def methodWithHandlerAsyncResultGenericReturn[T](handler: io.vertx.core.AsyncResult [T] => Unit): io.vertx.core.AsyncResult [T] => Unit = {
    handlerToFunc[io.vertx.core.AsyncResult[T]](_asJava.methodWithHandlerAsyncResultGenericReturn(funcToHandler[io.vertx.core.AsyncResult[T]](handler)))
  }

  def methodWithHandlerAsyncResultVertxGenReturn(expected: String, fail: Boolean): io.vertx.core.AsyncResult [io.vertx.scala.codegen.testmodel.RefedInterface1] => Unit = {
    handlerToMappedFunction[io.vertx.core.AsyncResult[io.vertx.codegen.testmodel.RefedInterface1], io.vertx.core.AsyncResult[io.vertx.scala.codegen.testmodel.RefedInterface1]](s => if (s.failed()) io.vertx.lang.scala.ScalaAsyncResult(cause = s.cause()) else io.vertx.lang.scala.ScalaAsyncResult(result = s.result.asJava)) (_asJava.methodWithHandlerAsyncResultVertxGenReturn(expected, fail))
  }

  def methodWithUserTypes(refed: io.vertx.scala.codegen.testmodel.RefedInterface1): Unit = {
    _asJava.methodWithUserTypes(refed.asJava.asInstanceOf[io.vertx.codegen.testmodel.RefedInterface1])
  }

  def methodWithObjectParam(str: String, obj: AnyRef): Unit = {
    _asJava.methodWithObjectParam(str, obj)
  }

  def methodWithDataObjectParam(dataObject: io.vertx.scala.codegen.testmodel.TestDataObject): Unit = {
    _asJava.methodWithDataObjectParam(dataObject.asJava)
  }

  def methodWithHandlerUserTypes(handler: io.vertx.scala.codegen.testmodel.RefedInterface1 => Unit): Unit = {
    _asJava.methodWithHandlerUserTypes(funcToMappedHandler(RefedInterface1.apply)(handler))
  }

  def methodWithHandlerAsyncResultUserTypesFuture(): concurrent.Future[io.vertx.scala.codegen.testmodel.RefedInterface1] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.codegen.testmodel.RefedInterface1,io.vertx.scala.codegen.testmodel.RefedInterface1]((x => if (x == null) null else RefedInterface1.apply(x)))
    _asJava.methodWithHandlerAsyncResultUserTypes(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithConcreteHandlerUserTypeSubtype(handler: io.vertx.scala.codegen.testmodel.ConcreteHandlerUserType): Unit = {
    _asJava.methodWithConcreteHandlerUserTypeSubtype(handler.asJava.asInstanceOf[io.vertx.codegen.testmodel.ConcreteHandlerUserType])
  }

  def methodWithAbstractHandlerUserTypeSubtype(handler: io.vertx.scala.codegen.testmodel.AbstractHandlerUserType): Unit = {
    _asJava.methodWithAbstractHandlerUserTypeSubtype(handler.asJava.asInstanceOf[io.vertx.codegen.testmodel.AbstractHandlerUserType])
  }

  def methodWithConcreteHandlerUserTypeSubtypeExtension(handler: io.vertx.scala.codegen.testmodel.ConcreteHandlerUserTypeExtension): Unit = {
    _asJava.methodWithConcreteHandlerUserTypeSubtypeExtension(handler.asJava.asInstanceOf[io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension])
  }

  def methodWithHandlerVoid(handler: () => Unit): Unit = {
    _asJava.methodWithHandlerVoid(funcToMappedHandler[java.lang.Void, Unit](x => x.asInstanceOf[Unit])(_ => handler()))
  }

  def methodWithHandlerAsyncResultVoidFuture(sendFailure: Boolean): concurrent.Future[Unit] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Void,Unit]((x => ()))
    _asJava.methodWithHandlerAsyncResultVoid(sendFailure, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerThrowable(handler: Throwable => Unit): Unit = {
    _asJava.methodWithHandlerThrowable(funcToMappedHandler[java.lang.Throwable, Throwable](x => x)(handler))
  }

  def methodWithHandlerDataObject(handler: io.vertx.scala.codegen.testmodel.TestDataObject => Unit): Unit = {
    _asJava.methodWithHandlerDataObject(funcToMappedHandler[io.vertx.codegen.testmodel.TestDataObject, io.vertx.scala.codegen.testmodel.TestDataObject](a => TestDataObject(a))(handler))
  }

  def methodWithHandlerGenericUserType[U](value: U, handler: io.vertx.scala.codegen.testmodel.GenericRefedInterface[U] => Unit): Unit = {
    _asJava.methodWithHandlerGenericUserType(value, funcToMappedHandler(GenericRefedInterface.apply[U])(handler))
  }

  def methodWithHandlerAsyncResultGenericUserTypeFuture[U](value: U): concurrent.Future[io.vertx.scala.codegen.testmodel.GenericRefedInterface[U]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.codegen.testmodel.GenericRefedInterface[U],io.vertx.scala.codegen.testmodel.GenericRefedInterface[U]]((x => if (x == null) null else GenericRefedInterface.apply[U](x)))
    _asJava.methodWithHandlerAsyncResultGenericUserType(value, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithByteReturn(): Byte = {
    _asJava.methodWithByteReturn()
  }

  def methodWithShortReturn(): Short = {
    _asJava.methodWithShortReturn()
  }

  def methodWithIntReturn(): Int = {
    _asJava.methodWithIntReturn()
  }

  def methodWithLongReturn(): Long = {
    _asJava.methodWithLongReturn()
  }

  def methodWithFloatReturn(): Float = {
    _asJava.methodWithFloatReturn()
  }

  def methodWithDoubleReturn(): Double = {
    _asJava.methodWithDoubleReturn()
  }

  def methodWithBooleanReturn(): Boolean = {
    _asJava.methodWithBooleanReturn()
  }

  def methodWithCharReturn(): Char = {
    _asJava.methodWithCharReturn()
  }

  def methodWithStringReturn(): String = {
    _asJava.methodWithStringReturn()
  }

  def methodWithVertxGenReturn(): io.vertx.scala.codegen.testmodel.RefedInterface1 = {
    RefedInterface1.apply(_asJava.methodWithVertxGenReturn())
  }

  def methodWithVertxGenNullReturn(): io.vertx.scala.codegen.testmodel.RefedInterface1 = {
    RefedInterface1.apply(_asJava.methodWithVertxGenNullReturn())
  }

  def methodWithAbstractVertxGenReturn(): io.vertx.scala.codegen.testmodel.RefedInterface2 = {
    RefedInterface2.apply(_asJava.methodWithAbstractVertxGenReturn())
  }

  def methodWithDataObjectReturn(): io.vertx.scala.codegen.testmodel.TestDataObject = {
    io.vertx.scala.codegen.testmodel.TestDataObject(_asJava.methodWithDataObjectReturn())
  }

  def methodWithDataObjectNullReturn(): io.vertx.scala.codegen.testmodel.TestDataObject = {
    io.vertx.scala.codegen.testmodel.TestDataObject(_asJava.methodWithDataObjectNullReturn())
  }

  def overloadedMethod(str: String, handler: String => Unit): String = {
    _asJava.overloadedMethod(str, funcToHandler[java.lang.String](handler))
  }

  def overloadedMethod(str: String, refed: io.vertx.scala.codegen.testmodel.RefedInterface1): String = {
    _asJava.overloadedMethod(str, refed.asJava.asInstanceOf[io.vertx.codegen.testmodel.RefedInterface1])
  }

  def overloadedMethod(str: String, refed: io.vertx.scala.codegen.testmodel.RefedInterface1, handler: String => Unit): String = {
    _asJava.overloadedMethod(str, refed.asJava.asInstanceOf[io.vertx.codegen.testmodel.RefedInterface1], funcToHandler[java.lang.String](handler))
  }

  def overloadedMethod(str: String, refed: io.vertx.scala.codegen.testmodel.RefedInterface1, period: Long, handler: String => Unit): String = {
    _asJava.overloadedMethod(str, refed.asJava.asInstanceOf[io.vertx.codegen.testmodel.RefedInterface1], period, funcToHandler[java.lang.String](handler))
  }

  def methodWithGenericReturn[U](`type`: String): U = {
    _asJava.methodWithGenericReturn(`type`)
  }

  def methodWithGenericParam[U](`type`: String, u: U): Unit = {
    _asJava.methodWithGenericParam(`type`, u)
  }

  def methodWithGenericHandler[U](`type`: String, handler: U => Unit): Unit = {
    _asJava.methodWithGenericHandler(`type`, funcToHandler(handler))
  }

  def methodWithGenericHandlerAsyncResultFuture[U](`type`: String): concurrent.Future[U] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[U,U]((x => x))
    _asJava.methodWithGenericHandlerAsyncResult(`type`, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def fluentMethod(str: String): io.vertx.scala.codegen.testmodel.TestInterface = {
    _asJava.fluentMethod(str)
    this
  }

  def methodWithCachedReturn(foo: String): io.vertx.scala.codegen.testmodel.RefedInterface1 = {
    if (cached_0 == null) {
      cached_0=    RefedInterface1.apply(_asJava.methodWithCachedReturn(foo))
    }
    cached_0
  }

  def methodWithCachedReturnPrimitive(arg: Int): Int = {
    if (cached_1 == null) {
      cached_1=    _asJava.methodWithCachedReturnPrimitive(arg)
    }
    cached_1
  }

  def methodWithCachedListReturn(): scala.collection.mutable.Buffer[io.vertx.scala.codegen.testmodel.RefedInterface1] = {
    if (cached_2 == null) {
      cached_2=    _asJava.methodWithCachedListReturn().asScala.map(RefedInterface1.apply)
    }
    cached_2
  }

  def methodWithJsonObjectReturn(): io.vertx.core.json.JsonObject = {
    _asJava.methodWithJsonObjectReturn()
  }

  def methodWithNullJsonObjectReturn(): io.vertx.core.json.JsonObject = {
    _asJava.methodWithNullJsonObjectReturn()
  }

  def methodWithComplexJsonObjectReturn(): io.vertx.core.json.JsonObject = {
    _asJava.methodWithComplexJsonObjectReturn()
  }

  def methodWithJsonArrayReturn(): io.vertx.core.json.JsonArray = {
    _asJava.methodWithJsonArrayReturn()
  }

  def methodWithNullJsonArrayReturn(): io.vertx.core.json.JsonArray = {
    _asJava.methodWithNullJsonArrayReturn()
  }

  def methodWithComplexJsonArrayReturn(): io.vertx.core.json.JsonArray = {
    _asJava.methodWithComplexJsonArrayReturn()
  }

  def methodWithJsonParams(jsonObject: io.vertx.core.json.JsonObject, jsonArray: io.vertx.core.json.JsonArray): Unit = {
    _asJava.methodWithJsonParams(jsonObject, jsonArray)
  }

  def methodWithNullJsonParams(jsonObject: io.vertx.core.json.JsonObject, jsonArray: io.vertx.core.json.JsonArray): Unit = {
    _asJava.methodWithNullJsonParams(jsonObject, jsonArray)
  }

  def methodWithHandlerJson(jsonObjectHandler: io.vertx.core.json.JsonObject => Unit, jsonArrayHandler: io.vertx.core.json.JsonArray => Unit): Unit = {
    _asJava.methodWithHandlerJson(funcToHandler[io.vertx.core.json.JsonObject](jsonObjectHandler), funcToHandler[io.vertx.core.json.JsonArray](jsonArrayHandler))
  }

  def methodWithHandlerComplexJson(jsonObjectHandler: io.vertx.core.json.JsonObject => Unit, jsonArrayHandler: io.vertx.core.json.JsonArray => Unit): Unit = {
    _asJava.methodWithHandlerComplexJson(funcToHandler[io.vertx.core.json.JsonObject](jsonObjectHandler), funcToHandler[io.vertx.core.json.JsonArray](jsonArrayHandler))
  }

  def methodWithHandlerAsyncResultJsonObjectFuture(): concurrent.Future[io.vertx.core.json.JsonObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonObject,io.vertx.core.json.JsonObject]((x => x))
    _asJava.methodWithHandlerAsyncResultJsonObject(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultNullJsonObjectFuture(): concurrent.Future[io.vertx.core.json.JsonObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonObject,io.vertx.core.json.JsonObject]((x => x))
    _asJava.methodWithHandlerAsyncResultNullJsonObject(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultComplexJsonObjectFuture(): concurrent.Future[io.vertx.core.json.JsonObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonObject,io.vertx.core.json.JsonObject]((x => x))
    _asJava.methodWithHandlerAsyncResultComplexJsonObject(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultJsonArrayFuture(): concurrent.Future[io.vertx.core.json.JsonArray] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonArray,io.vertx.core.json.JsonArray]((x => x))
    _asJava.methodWithHandlerAsyncResultJsonArray(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultNullJsonArrayFuture(): concurrent.Future[io.vertx.core.json.JsonArray] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonArray,io.vertx.core.json.JsonArray]((x => x))
    _asJava.methodWithHandlerAsyncResultNullJsonArray(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithHandlerAsyncResultComplexJsonArrayFuture(): concurrent.Future[io.vertx.core.json.JsonArray] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[io.vertx.core.json.JsonArray,io.vertx.core.json.JsonArray]((x => x))
    _asJava.methodWithHandlerAsyncResultComplexJsonArray(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithEnumParam(strVal: String, weirdo: io.vertx.codegen.testmodel.TestEnum): String = {
    _asJava.methodWithEnumParam(strVal, weirdo)
  }

  def methodWithEnumReturn(strVal: String): io.vertx.codegen.testmodel.TestEnum = {
    _asJava.methodWithEnumReturn(strVal)
  }

  def methodWithGenEnumParam(strVal: String, weirdo: io.vertx.codegen.testmodel.TestGenEnum): String = {
    _asJava.methodWithGenEnumParam(strVal, weirdo)
  }

  def methodWithGenEnumReturn(strVal: String): io.vertx.codegen.testmodel.TestGenEnum = {
    _asJava.methodWithGenEnumReturn(strVal)
  }

  def methodWithThrowableReturn(strVal: String): Throwable = {
    _asJava.methodWithThrowableReturn(strVal)
  }

  def methodWithThrowableParam(t: Throwable): String = {
    _asJava.methodWithThrowableParam(t)
  }

  def superMethodOverloadedBySubclass(s: String): Int = {
    _asJava.superMethodOverloadedBySubclass(s)
  }

  private var cached_0: io.vertx.scala.codegen.testmodel.RefedInterface1 = _
  private var cached_1: Int = _
  private var cached_2: scala.collection.mutable.Buffer[io.vertx.scala.codegen.testmodel.RefedInterface1] = _
}

object TestInterface {

  def apply(_asJava: io.vertx.codegen.testmodel.TestInterface): io.vertx.scala.codegen.testmodel.TestInterface =
    new io.vertx.scala.codegen.testmodel.TestInterface(_asJava)

  def staticFactoryMethod(foo: String): io.vertx.scala.codegen.testmodel.RefedInterface1 = {
    RefedInterface1.apply(io.vertx.codegen.testmodel.TestInterface.staticFactoryMethod(foo))
  }

}