package org.raniaia.poseidon.framework.exception;

/*
 * Copyright (C) 2020 Tiansheng All rights reserved.
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
 * Creates on 2019/11/12.
 */

/**
 * @author tiansheng
 */
public class PoseidonException extends RuntimeException {

    public PoseidonException() {
    }

    public PoseidonException(String message) {
        super(message);
    }

    public PoseidonException(String message, Throwable cause) {
        super(message, cause);
    }

    public PoseidonException(Throwable cause) {
        super(cause);
    }

    public PoseidonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}