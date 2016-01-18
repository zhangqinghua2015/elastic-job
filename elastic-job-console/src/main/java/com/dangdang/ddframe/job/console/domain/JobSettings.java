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
public final class JobSettings implements Serializable {
    
    private static final long serialVersionUID = -6532210090618686688L;
    
    private String jobName;
    
    private String jobClass;
    
    private int shardingTotalCount;
    
    private String cron;
    
    private String shardingItemParameters;
    
    private String jobParameter;
    
    private boolean monitorExecution;
    
    private int processCountIntervalSeconds;
    
    private int concurrentDataProcessThreadCount;
    
    private int fetchDataCount;
    
    private int maxTimeDiffSeconds;
    
    private int monitorPort = -1;
    
    private boolean failover;
    
    private boolean misfire;
    
    private String jobShardingStrategyClass;
    
    private String description;

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
	 * @return the jobClass
	 */
	public String getJobClass() {
		return jobClass;
	}

	/**
	 * @param jobClass the jobClass to set
	 */
	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	/**
	 * @return the shardingTotalCount
	 */
	public int getShardingTotalCount() {
		return shardingTotalCount;
	}

	/**
	 * @param shardingTotalCount the shardingTotalCount to set
	 */
	public void setShardingTotalCount(int shardingTotalCount) {
		this.shardingTotalCount = shardingTotalCount;
	}

	/**
	 * @return the cron
	 */
	public String getCron() {
		return cron;
	}

	/**
	 * @param cron the cron to set
	 */
	public void setCron(String cron) {
		this.cron = cron;
	}

	/**
	 * @return the shardingItemParameters
	 */
	public String getShardingItemParameters() {
		return shardingItemParameters;
	}

	/**
	 * @param shardingItemParameters the shardingItemParameters to set
	 */
	public void setShardingItemParameters(String shardingItemParameters) {
		this.shardingItemParameters = shardingItemParameters;
	}

	/**
	 * @return the jobParameter
	 */
	public String getJobParameter() {
		return jobParameter;
	}

	/**
	 * @param jobParameter the jobParameter to set
	 */
	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}

	/**
	 * @return the monitorExecution
	 */
	public boolean isMonitorExecution() {
		return monitorExecution;
	}

	/**
	 * @param monitorExecution the monitorExecution to set
	 */
	public void setMonitorExecution(boolean monitorExecution) {
		this.monitorExecution = monitorExecution;
	}

	/**
	 * @return the processCountIntervalSeconds
	 */
	public int getProcessCountIntervalSeconds() {
		return processCountIntervalSeconds;
	}

	/**
	 * @param processCountIntervalSeconds the processCountIntervalSeconds to set
	 */
	public void setProcessCountIntervalSeconds(int processCountIntervalSeconds) {
		this.processCountIntervalSeconds = processCountIntervalSeconds;
	}

	/**
	 * @return the concurrentDataProcessThreadCount
	 */
	public int getConcurrentDataProcessThreadCount() {
		return concurrentDataProcessThreadCount;
	}

	/**
	 * @param concurrentDataProcessThreadCount the concurrentDataProcessThreadCount to set
	 */
	public void setConcurrentDataProcessThreadCount(int concurrentDataProcessThreadCount) {
		this.concurrentDataProcessThreadCount = concurrentDataProcessThreadCount;
	}

	/**
	 * @return the fetchDataCount
	 */
	public int getFetchDataCount() {
		return fetchDataCount;
	}

	/**
	 * @param fetchDataCount the fetchDataCount to set
	 */
	public void setFetchDataCount(int fetchDataCount) {
		this.fetchDataCount = fetchDataCount;
	}

	/**
	 * @return the maxTimeDiffSeconds
	 */
	public int getMaxTimeDiffSeconds() {
		return maxTimeDiffSeconds;
	}

	/**
	 * @param maxTimeDiffSeconds the maxTimeDiffSeconds to set
	 */
	public void setMaxTimeDiffSeconds(int maxTimeDiffSeconds) {
		this.maxTimeDiffSeconds = maxTimeDiffSeconds;
	}

	/**
	 * @return the monitorPort
	 */
	public int getMonitorPort() {
		return monitorPort;
	}

	/**
	 * @param monitorPort the monitorPort to set
	 */
	public void setMonitorPort(int monitorPort) {
		this.monitorPort = monitorPort;
	}

	/**
	 * @return the failover
	 */
	public boolean isFailover() {
		return failover;
	}

	/**
	 * @param failover the failover to set
	 */
	public void setFailover(boolean failover) {
		this.failover = failover;
	}

	/**
	 * @return the misfire
	 */
	public boolean isMisfire() {
		return misfire;
	}

	/**
	 * @param misfire the misfire to set
	 */
	public void setMisfire(boolean misfire) {
		this.misfire = misfire;
	}

	/**
	 * @return the jobShardingStrategyClass
	 */
	public String getJobShardingStrategyClass() {
		return jobShardingStrategyClass;
	}

	/**
	 * @param jobShardingStrategyClass the jobShardingStrategyClass to set
	 */
	public void setJobShardingStrategyClass(String jobShardingStrategyClass) {
		this.jobShardingStrategyClass = jobShardingStrategyClass;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
