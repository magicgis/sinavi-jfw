/*
 * Copyright (c) 2013 ITOCHU Techno-Solutions Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.ctc_g.jse.core.validation.constraints.feature.number;

import jp.co.ctc_g.jse.core.validation.constraints.Number;

/**
 * <p>
 * このクラスは、{@link Number}バリデータに関するユーティリティを提供します。
 * </p>
 * @author ITOCHU Techno-Solutions Corporation.
 */
public final class Numbers {

    private Numbers() {
    }

    protected static void validateParameters(Number constraint) {
        if (constraint.precision() <= 0) { throw new IllegalArgumentException(); }
    }
}
