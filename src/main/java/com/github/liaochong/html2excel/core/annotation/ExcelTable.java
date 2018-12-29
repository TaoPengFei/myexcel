/*
 * Copyright 2017 the original author or authors.
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
package com.github.liaochong.html2excel.core.annotation;

import com.github.liaochong.html2excel.core.WorkbookType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liaochong
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface ExcelTable {

    /**
     * 是否忽略父类属性
     *
     * @return true/false
     */
    boolean excludeParent() default false;

    /**
     * 工作簿类型，.xls、.xlsx
     *
     * @return WorkbookType
     */
    WorkbookType workbookType() default WorkbookType.XLSX;

    /**
     * sheeName
     *
     * @return sheeName
     */
    String sheetName() default "";

    /**
     * 内存行数保有量，只在WorkbookType.SXLSX有效
     *
     * @return 行数
     */
    int rowAccessWindowSize() default -1;
}
