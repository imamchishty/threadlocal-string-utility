# ThreadLocal String Utility

[![Build Status](https://travis-ci.org/imamchishty/threadlocal-string-utility.svg?branch=master "threadlocal-string-utility")](https://travis-ci.org/imamchishty/threadlocal-string-utility) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.shedhack.thread/threadlocal-string-utility/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.shedhack.thread/threadlocal-string-utility)

## Introduction

This utility library wraps up ThreadLocals (for String payloads) and makes it very easy to use them. The static class [ThreadLocalUtility](http://) contains three static methods:

    public static void set(String requestId) {
        local.set(requestId);
    }

    public static String get() {
        return local.get();
    }

    public static void clear(){
        local.remove();
    }

As they're static they can be easily be utilitised. The actual __ThreadLocal__ is a static member for a given Thread. It is not accessible by other threads.

## Dependencies

No dependencies, apart from Junit for testing.

## Java requirements

Project has been built using JDK 1.8, although earlier versions of Java 5+ should suffice.

## Maven central

This artifact is available in [Maven Central](https://maven-badges.herokuapp.com/maven-central/com.shedhack.thread/threadlocal-string-utility).
 
    <dependency>
        <groupId>com.shedhack.thread</groupId>
        <artifactId>threadlocal-string-utility</artifactId>
        <version>x.x.x</version>
    </dependency>    


Contact
-------

	Please feel free to contact me via email, imamchishty@gmail.com
