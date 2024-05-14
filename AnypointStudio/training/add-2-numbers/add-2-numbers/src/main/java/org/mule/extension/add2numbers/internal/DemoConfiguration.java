package org.mule.extension.add2numbers.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(DemoOperations.class)
@ConnectionProviders(DemoConnectionProvider.class)
public class DemoConfiguration {

  @Parameter
  private String configId;

  public String getConfigId(){
    return configId;
  }
}
