/**
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.job.console.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ServerBriefInfo implements Serializable, Comparable<ServerBriefInfo> {
    
    private static final long serialVersionUID = 1133149706443681483L;
    
    private String serverIp;
    
    private String serverHostName;
    
    private ServerBriefStatus status;
    
    @Override
    public int compareTo(final ServerBriefInfo o) {
        return getServerIp().compareTo(o.getServerIp());
    }
    
    public enum ServerBriefStatus {
        OK, 
        PARTIAL_ALIVE, 
        ALL_CRASHED
    }

	/**
	 * @return the serverIp
	 */
	public String getServerIp() {
		return serverIp;
	}

	/**
	 * @param serverIp the serverIp to set
	 */
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	/**
	 * @return the serverHostName
	 */
	public String getServerHostName() {
		return serverHostName;
	}

	/**
	 * @param serverHostName the serverHostName to set
	 */
	public void setServerHostName(String serverHostName) {
		this.serverHostName = serverHostName;
	}

	/**
	 * @return the status
	 */
	public ServerBriefStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ServerBriefStatus status) {
		this.status = status;
	}
    
    
}
