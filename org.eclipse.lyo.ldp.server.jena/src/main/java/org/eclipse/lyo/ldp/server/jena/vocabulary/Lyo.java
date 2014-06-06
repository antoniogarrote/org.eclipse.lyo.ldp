/*******************************************************************************
 * Copyright (c) 2013, 2014 IBM Corporation.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *  
 *  Contributors:
 *  
 *     Steve Speicher - initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.ldp.server.jena.vocabulary;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class Lyo {
	/**
	 * The namespace of the vocabulary as a resource
	 */
	public static final String NS = "http://eclipse.org/lyo/ns#";
	
	// RDF Property names both namespace and local
	public static final String PROP_DESCRIBES = "describes";
	public static final String PROP_DESCRIBES_RESOURCE = nsName(PROP_DESCRIBES);
	public static final Property describes = property(PROP_DESCRIBES_RESOURCE);
	public static final String PROP_DELETED = "deleted";
	public static final String PROP_DELETED_RESOURCE = nsName(PROP_DELETED);
	public static final Property deleted = property(PROP_DELETED_RESOURCE);
	public static String nsName(String local) {
		return NS + local;
	}
	
    protected static final Property property(String name)
    { 
    	return ResourceFactory.createProperty(name);
    }
}