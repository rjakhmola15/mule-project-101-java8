package org.mule.extension.add2numbers.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.SubTypeMapping;

//java 17nmigration changes
//import org.mule.sdk.api.annotation.JavaVersionSupport;
//import org.mule.sdk.api.meta.JavaVersion;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "demo")
@Extension(name = "Demo")
@Configurations(DemoConfiguration.class)
//java 17nmigration changes
//@JavaVersionSupport({JavaVersion.JAVA_8, JavaVersion.JAVA_11, JavaVersion.JAVA_17})
public class DemoExtension {

}
