/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.rest.client.impl;

import org.springframework.xd.rest.client.ContainerOperations;
import org.springframework.xd.rest.client.domain.ContainerResource;


/**
 * Implementation of the Container related part of the API.
 * 
 * @author Ilayaperumal Gopinathan
 */
public class ContainerTemplate extends AbstractTemplate implements ContainerOperations {

	ContainerTemplate(AbstractTemplate source) {
		super(source);
	}

	@Override
	public ContainerResource.Page list() {
		String uriTemplate = resources.get("runtime/containers").toString();
		uriTemplate = uriTemplate + "?size=10000";
		return restTemplate.getForObject(uriTemplate, ContainerResource.Page.class);
	}

}