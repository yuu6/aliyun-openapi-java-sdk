/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.SaveLinkeBahamutBuildconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SaveLinkeBahamutBuildconfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String defaultRegistryConfig;

		private String ossConfig;

		private Boolean useCustomProductOss;

		private List<String> registryConfigs;

		private List<String> settingsFiles;

		public String getDefaultRegistryConfig() {
			return this.defaultRegistryConfig;
		}

		public void setDefaultRegistryConfig(String defaultRegistryConfig) {
			this.defaultRegistryConfig = defaultRegistryConfig;
		}

		public String getOssConfig() {
			return this.ossConfig;
		}

		public void setOssConfig(String ossConfig) {
			this.ossConfig = ossConfig;
		}

		public Boolean getUseCustomProductOss() {
			return this.useCustomProductOss;
		}

		public void setUseCustomProductOss(Boolean useCustomProductOss) {
			this.useCustomProductOss = useCustomProductOss;
		}

		public List<String> getRegistryConfigs() {
			return this.registryConfigs;
		}

		public void setRegistryConfigs(List<String> registryConfigs) {
			this.registryConfigs = registryConfigs;
		}

		public List<String> getSettingsFiles() {
			return this.settingsFiles;
		}

		public void setSettingsFiles(List<String> settingsFiles) {
			this.settingsFiles = settingsFiles;
		}
	}

	@Override
	public SaveLinkeBahamutBuildconfigResponse getInstance(UnmarshallerContext context) {
		return	SaveLinkeBahamutBuildconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
