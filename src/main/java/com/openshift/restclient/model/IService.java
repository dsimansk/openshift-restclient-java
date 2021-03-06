/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package com.openshift.restclient.model;

import java.util.List;
import java.util.Map;

/**
 * Kubernetes Service to access a Pod
 * 
 * @author Jeff Cantrill
 */
public interface IService  extends IResource{

	/**
	 * Sets the container port exposed by the image  
	 * @param port
	 */
	void setContainerPort(int port);

	/**
	 * Sets the exposed port that is mapped to a
	 * running image
	 * @param port
	 */
	void setPort(int port);

	/**
	 * Returns the exposed port that is mapped to
	 * a running image
	 * @return
	 */
	int getPort();

	/**
	 * Sets the container name that the service
	 * routes traffic to. 
	 * @param selector
	 */
	void setSelector(Map<String, String> selector);
	
	/**
	 * Convenience method for setting a selector that has
	 * a singular key/value pair.
	 * @param key
	 * @param value
	 */
	void setSelector(String key, String value);
	
	/**
	 * Returns the selector used to find the Pod
	 * to which this service is routing
	 * @return
	 */
	Map<String, String> getSelector();

	/**
	 * Returns a port where the container is
	 * receiving traffic
	 * @return
	 */
	int getContainerPort();

	/**
	 * Returns the IP of the service.
	 * @return
	 */
	String getPortalIP();
	
	/**
	 * Retrieves the pods for this service
	 * @return
	 */
	List<IPod> getPods();

}
