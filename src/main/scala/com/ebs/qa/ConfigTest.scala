package com.ebs.qa

import org.scalatest.{FlatSpec, Matchers}
import com.typesafe.config.ConfigFactory

class ConfigfTest extends FlatSpec with Matchers {

    "Test: A Config" should "be accessible" in {

        val conf = ConfigFactory.load()
    }
}
