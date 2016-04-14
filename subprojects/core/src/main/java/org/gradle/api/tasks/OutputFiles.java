/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.tasks;

import java.lang.annotation.*;

/**
 * <p>Marks a property as specifying one or more output files for a task.</p>
 *
 * <p>This annotation should be attached to the getter method or the field for the property.</p>
 *
 * <p>This will cause the task to be considered out-of-date when the file paths or contents
 * are different to when the task was last run.</p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface OutputFiles {
    FileOrderMode order() default FileOrderMode.UNORDERED;
    FilePathMode paths() default FilePathMode.ABSOLUTE;
    FileContentsMode contents() default FileContentsMode.USE;
}