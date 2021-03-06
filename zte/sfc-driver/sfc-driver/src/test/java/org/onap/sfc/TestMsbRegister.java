/**
 * Copyright 2017 ZTE Corporation.
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
package org.onap.sfc;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.onap.sfc.entity.MsbRegisterEntity;
import org.onap.sfc.service.ConfigInfo;
import org.onap.sfc.utils.SfcDriverUtil;

public class TestMsbRegister {
    @Ignore
    @Test
    public void test_registerMsb()
    {
        SfcDriverConfig sfcDriverConfig = new SfcDriverConfig();
        sfcDriverConfig.setServiceIp("127.0.0.1");
        ConfigInfo.setConfig(sfcDriverConfig);
        MsbRegisterEntity entity = SfcDriverUtil.getMsbRegisterInfo();
        assert entity.getUrl().equals("/api/ztesdncdriver/v1");
    }

    @Before
    public void setupBefore()
    {

    }
}
