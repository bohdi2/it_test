package com.ebs.qa

import collection.mutable.Stack
import org.scalatest._

class SimpleItSpec extends FlatSpec with Matchers {

    "INTEGRATION TEST Stack" should "pop values in last-in-first-out order" in {
        val stack = new Stack[Int]
        stack.push(11)
        stack.push(22)
        stack.pop() should be (22)
        stack.pop() should be (11)
    }

    it should "throw NoSuchElementException if an empty stack is popped" in {
        val emptyStack = new Stack[Int]
        a [NoSuchElementException] should be thrownBy {
            emptyStack.pop()
        }
    }
}
