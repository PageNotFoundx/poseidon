package org.raniaia.minipika.framework.configuration.xmlbuilder;

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
 * Creates on 2020/6/2.
 */

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.raniaia.minipika.framework.configuration.FindStrategy;
import org.raniaia.minipika.framework.factory.Factorys;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取XML配置文件并解析
 *
 * @author tiansheng
 */
public class XMLConfigBuilder {

  public void read() throws JDOMException, IOException {
    InputStream stream = FindStrategy.getConfigInputStream();
    if(stream == null) {
      throw new IOException("未获取到minipika.xml配置文件");
    }
    read(stream);
  }

  public void read(InputStream inputStream) {
  }

}