package org.raniaia.poseidon.framework.provide.component;

/*
 * Copyright (C) 2020 tiansheng All rights reserved.
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

/*
 * Creates on 2020/3/21.
 */

import java.lang.annotation.*;

/**
 * Class annotated with {@code Component} means a poseidon component.
 * It is recommended that each component implement a interface
 *
 * @author tiansheng
 * @since 1.1.7.STAR
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    /**
     * component type.
     *
     * @see org.raniaia.poseidon.AbstractContainer#loadComponents
     */
    ComponentType type() default ComponentType.DEFAULT;

    /**
     * component name.
     * 
     * @see org.raniaia.poseidon.AbstractContainer#loadComponents
     */
    String name() default "";

}