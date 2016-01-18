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

import com.google.common.base.Strings;

@Getter
@Setter
public final class JobServer implements Serializable {
    
    private static final long serialVersionUID = 4241736510750597679L;
    
    private String jobName;
    
    private String ip;
    
    private String hostName;
    
    private ServerStatus status;
    
    private int processSuccessCount;
    
    private int processFailureCount;
    
    private String sharding;
    
    private boolean leader;
    
    private boolean leaderStoped;
    
    public enum ServerStatus {
        READY, 
        RUNNING, 
        DISABLED, 
        STOPED, 
        CRASHED;
        
        public static ServerStatus getServerStatus(final String status, final boolean disabled, final boolean stoped) {
            if (Strings.isNullOrEmpty(status)) {
                return ServerStatus.CRASHED;
            }
            if (disabled) {
                return ServerStatus.DISABLED;
            }
            if (stoped) {
                return ServerStatus.STOPED;
            }
            return ServerStatus.valueOf(status);
        }
    }

	/**
	 * @return the jobName
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * @param jobName the jobName to set
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the status
	 */
	public ServerStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ServerStatus status) {
		this.status = status;
	}

	/**
	 * @return the processSuccessCount
	 */
	public int getProcessSuccessCount() {
		return processSuccessCount;
	}

	/**
	 * @param processSuccessCount the processSuccessCount to set
	 */
	public void setProcessSuccessCount(int processSuccessCount) {
		this.processSuccessCount = processSuccessCount;
	}

	/**
	 * @return the processFailureCount
	 */
	public int getProcessFailureCount() {
		return processFailureCount;
	}

	/**
	 * @param processFailureCount the processFailureCount to set
	 */
	public void setProcessFailureCount(int processFailureCount) {
		this.processFailureCount = processFailureCount;
	}

	/**
	 * @return the sharding
	 */
	public String getSharding() {
		return sharding;
	}

	/**
	 * @param sharding the sharding to set
	 */
	public void setSharding(String sharding) {
		this.sharding = sharding;
	}

	/**
	 * @return the leader
	 */
	public boolean isLeader() {
		return leader;
	}

	/**
	 * @param leader the leader to set
	 */
	public void setLeader(boolean leader) {
		this.leader = leader;
	}

	/**
	 * @return the leaderStoped
	 */
	public boolean isLeaderStoped() {
		return leaderStoped;
	}

	/**
	 * @param leaderStoped the leaderStoped to set
	 */
	public void setLeaderStoped(boolean leaderStoped) {
		this.leaderStoped = leaderStoped;
	}
    
    
}
