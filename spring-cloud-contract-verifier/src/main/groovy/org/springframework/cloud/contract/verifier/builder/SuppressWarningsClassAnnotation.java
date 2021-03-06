/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.contract.verifier.builder;

import java.util.Arrays;

class SuppressWarningsClassAnnotation implements ClassAnnotation {

	private final BlockBuilder blockBuilder;

	private static final String[] ANNOTATIONS = { "@SuppressWarnings(\"rawtypes\")" };

	SuppressWarningsClassAnnotation(BlockBuilder blockBuilder) {
		this.blockBuilder = blockBuilder;
	}

	@Override
	public ClassAnnotation call() {
		Arrays.stream(ANNOTATIONS).forEach(this.blockBuilder::addLine);
		return this;
	}

	@Override
	public boolean accept() {
		return true;
	}

}
