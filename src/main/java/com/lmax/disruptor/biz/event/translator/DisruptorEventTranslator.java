/*
 * Copyright (c) 2010-2020, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.lmax.disruptor.biz.event.translator;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.biz.event.DisruptorBindEvent;
import com.lmax.disruptor.biz.event.DisruptorEvent;

public class DisruptorEventTranslator implements EventTranslatorOneArg<DisruptorEvent, Object> {

	@Override
	public void translateTo(DisruptorEvent event, long sequence, Object bind) {
		
		if(event instanceof DisruptorBindEvent){
			DisruptorBindEvent bindEvent = (DisruptorBindEvent)event;
			bindEvent.bind(bind);
		}
		
	}
	
}
