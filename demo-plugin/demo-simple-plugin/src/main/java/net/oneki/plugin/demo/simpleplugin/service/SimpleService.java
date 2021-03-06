/**
 * Copyright (C) 2015 Oneki (http://www.oneki.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.oneki.plugin.demo.simpleplugin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import net.oneki.plugin.demo.application.service.DemoService;

@Component
public class SimpleService implements DemoService{
	//value defined in application.properties of main app
	@Value("${demo.application.prop}")
	private String prop; 
	
	public String getName() {
		return "Plugin 1 simple service (prop=" + prop + ")";
	}

}
