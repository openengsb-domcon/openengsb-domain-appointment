/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.domain.appointment.models;

import java.util.Date;

import org.openengsb.core.api.model.OpenEngSBModel;

/**
 * Represents an appointment with all necessary information
 */
public interface Appointment extends OpenEngSBModel {
    
    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getLocation();

    void setLocation(String location);

    Date getStart();

    void setStart(Date start);

    Date getEnd();

    void setEnd(Date end);

    void setFullDay(Boolean fullDay);

    Boolean getFullDay();
}
