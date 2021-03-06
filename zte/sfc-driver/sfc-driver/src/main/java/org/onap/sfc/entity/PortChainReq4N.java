/**
 * Copyright 2016 ZTE Corporation.
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

package org.onap.sfc.entity;

import java.util.ArrayList;
import java.util.List;

public class PortChainReq4N {
    private String sdnControllerId;
    private String url;
    private String name;
    private String description;
    private List<String> flowClassifiers;
    private List<String> portPairGroups;
    private boolean symmetric;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSdnControllerId() {
        return sdnControllerId;
    }

    public void setSdnControllerId(String sdnControllerId) {
        this.sdnControllerId = sdnControllerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFlowClassifiers() {
        return flowClassifiers;
    }

    public void setFlowClassifiers(List<String> flowClassifiers) {
        this.flowClassifiers = flowClassifiers;
    }

    public List<String> getPortPairGroups() {
        return portPairGroups;
    }

    public void setPortPairGroups(List<String> portPairGroups) {
        this.portPairGroups = portPairGroups;
    }

    public boolean isSymmetric() {
        return symmetric;
    }

    public void setSymmetric(boolean symmetric) {
        this.symmetric = symmetric;
    }
}
