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
package net.oneki.plugin.demo.libplugin.service;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import net.oneki.plugin.demo.application.service.DemoService;

@Component
public class LibService implements DemoService{

	public String getName() {
		String name = "Lib service";
		
		//call lib specific to plugin
		String base64Name = new String(Base64.encodeBase64(name.getBytes()));
		
		return "Lib service ("+base64Name+")";
	}

}
