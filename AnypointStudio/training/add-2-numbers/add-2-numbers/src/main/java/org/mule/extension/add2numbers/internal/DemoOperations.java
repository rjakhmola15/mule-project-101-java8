package org.mule.extension.add2numbers.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import java.math.BigDecimal;

/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class DemoOperations {

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config DemoConfiguration configuration, @Connection DemoConnection connection){
    return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
  }

  /**
   * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  public Integer addition(Integer number1, Integer number2) {
	  Integer i = new Integer(number1);
	  Integer j = new Integer(number2);
    return add2Numbers(i, j);
  }

  /**
   * Private Methods are not exposed as operations
   */
  private Integer add2Numbers(Integer number1, Integer number2) {
    return (number1 + number2);
  }
}
