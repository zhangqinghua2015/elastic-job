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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"zkAddressList", "namespace", "digest", "activated"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
public class RegistryCenterConfiguration implements Serializable {
    
    private static final long serialVersionUID = -5996257770767863699L;
    
    @XmlAttribute(required = true)
    private String name;
    
    @XmlAttribute(required = true)
    private String zkAddressList;
    
    @XmlAttribute
    private String namespace;
    
    @XmlAttribute
    private String digest;
    
    @XmlAttribute
    private boolean activated;
    
    public RegistryCenterConfiguration() {
    }
    
    public RegistryCenterConfiguration(final String name) {
        this.name = name;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the zkAddressList
	 */
	public String getZkAddressList() {
		return zkAddressList;
	}

	/**
	 * @param zkAddressList the zkAddressList to set
	 */
	public void setZkAddressList(String zkAddressList) {
		this.zkAddressList = zkAddressList;
	}

	/**
	 * @return the namespace
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * @param namespace the namespace to set
	 */
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * @return the digest
	 */
	public String getDigest() {
		return digest;
	}

	/**
	 * @param digest the digest to set
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}

	/**
	 * @return the activated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * @param activated the activated to set
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
    
    
}
