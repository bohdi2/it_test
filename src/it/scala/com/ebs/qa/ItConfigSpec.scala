package com.ebs.qa

import org.scalatest.{FlatSpec, Matchers}
import com.typesafe.config.ConfigFactory


class ItConfigSpec extends FlatSpec with Matchers {

    "IT A Config" should "be accessible" in {

        val conf = ConfigFactory.load()
    }
}
